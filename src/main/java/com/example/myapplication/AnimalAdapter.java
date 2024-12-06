package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {

    private Context context;
    private List<Animal> animalList;

    // Construtor do adapter
    public AnimalAdapter(Context context, List<Animal> animalList) {
        this.context = context;
        this.animalList = animalList;
    }

    @Override
    public int getCount() {
        return animalList.size(); // Retorna o número de itens na lista
    }

    @Override
    public Object getItem(int position) {
        return animalList.get(position); // Retorna o item na posição especificada
    }

    @Override
    public long getItemId(int position) {
        return position; // Retorna a posição do item
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflar o layout para cada item
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_animal, parent, false);
        }

        // Configurar os dados para cada item
        ImageView animalImage = convertView.findViewById(R.id.dog_image); // Usando o id correto
        TextView animalName = convertView.findViewById(R.id.dog_name);
        TextView animalBreed = convertView.findViewById(R.id.dog_breed);

        // Obter o animal da lista
        Animal animal = animalList.get(position);

        // Definir os dados nos componentes
        animalImage.setImageResource(animal.getImagemResId());
        animalName.setText(animal.getNome());
        animalBreed.setText(animal.getRaca());

        // Configurar o clique para ir para a tela de detalhes do animal
        convertView.setOnClickListener(v -> {
            // Criar uma intent para abrir a DogDetailsActivity
            Intent intent = new Intent(context, DogDetailsActivity.class);
            intent.putExtra("dog_name", animal.getNome());
            intent.putExtra("dog_age", animal.getIdade());
            intent.putExtra("dog_breed", animal.getRaca());
            intent.putExtra("dog_descricao", animal.getDescricao());
            intent.putExtra("dog_image", animal.getImagemResId());

            // Iniciar a activity
            context.startActivity(intent);
        });

        return convertView;
    }
}
