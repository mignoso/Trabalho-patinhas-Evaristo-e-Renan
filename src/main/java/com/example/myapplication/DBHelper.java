package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "adocao_animais.db";
    private static final int DATABASE_VERSION = 1;

    // Tabelas
    private static final String CREATE_TABLE_ANIMAIS = "CREATE TABLE animais (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "nome TEXT, " +
            "idade TEXT, " +
            "raca TEXT, " +
            "descricao TEXT, " +
            "imagem TEXT);";

    private static final String CREATE_TABLE_ADOTANTES = "CREATE TABLE adotantes (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "nome TEXT, " +
            "endereco TEXT, " +
            "telefone TEXT);";

    private static final String CREATE_TABLE_ADOCAO = "CREATE TABLE adocoes (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "adotante_id INTEGER, " +
            "animal_id INTEGER, " +
            "data_adoção TEXT, " +
            "FOREIGN KEY(adotante_id) REFERENCES adotantes(id), " +
            "FOREIGN KEY(animal_id) REFERENCES animais(id));";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_ANIMAIS);
        db.execSQL(CREATE_TABLE_ADOTANTES);
        db.execSQL(CREATE_TABLE_ADOCAO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS animais");
        db.execSQL("DROP TABLE IF EXISTS adotantes");
        db.execSQL("DROP TABLE IF EXISTS adocoes");
        onCreate(db);
    }

    // Método para listar os animais
    public Cursor listarAnimais() {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("SELECT * FROM animais", null);
    }

    // Método para inserir um animal
    public long inserirAnimal(String nome, String idade, String raca, String descricao, String imagem) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("nome", nome);
        values.put("idade", idade);
        values.put("raca", raca);
        values.put("descricao", descricao);
        values.put("imagem", imagem);

        return db.insert("animais", null, values);
    }

    // Método para inserir um adotante
    public long inserirAdotante(String nome, String endereco, String telefone) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("nome", nome);
        values.put("endereco", endereco);
        values.put("telefone", telefone);

        return db.insert("adotantes", null, values);
    }

    // Método para registrar uma adoção
    public long registrarAdocao(int adotanteId, int animalId, String dataAdocao) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("adotante_id", adotanteId);
        values.put("animal_id", animalId);
        values.put("data_adoção", dataAdocao);

        return db.insert("adocoes", null, values);
    }
}
