// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCadastroBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView Cadastrese;

  @NonNull
  public final EditText Nome;

  @NonNull
  public final EditText confirmSenha;

  @NonNull
  public final View containercomponentes;

  @NonNull
  public final EditText editEmail;

  @NonNull
  public final EditText editSenha;

  @NonNull
  public final EditText editTelefone;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final AppCompatButton voltarParaLoginButton;

  private ActivityCadastroBinding(@NonNull ConstraintLayout rootView, @NonNull TextView Cadastrese,
      @NonNull EditText Nome, @NonNull EditText confirmSenha, @NonNull View containercomponentes,
      @NonNull EditText editEmail, @NonNull EditText editSenha, @NonNull EditText editTelefone,
      @NonNull ConstraintLayout main, @NonNull AppCompatButton voltarParaLoginButton) {
    this.rootView = rootView;
    this.Cadastrese = Cadastrese;
    this.Nome = Nome;
    this.confirmSenha = confirmSenha;
    this.containercomponentes = containercomponentes;
    this.editEmail = editEmail;
    this.editSenha = editSenha;
    this.editTelefone = editTelefone;
    this.main = main;
    this.voltarParaLoginButton = voltarParaLoginButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCadastroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCadastroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_cadastro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCadastroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Cadastrese;
      TextView Cadastrese = ViewBindings.findChildViewById(rootView, id);
      if (Cadastrese == null) {
        break missingId;
      }

      id = R.id.Nome;
      EditText Nome = ViewBindings.findChildViewById(rootView, id);
      if (Nome == null) {
        break missingId;
      }

      id = R.id.confirm_senha;
      EditText confirmSenha = ViewBindings.findChildViewById(rootView, id);
      if (confirmSenha == null) {
        break missingId;
      }

      id = R.id.containercomponentes;
      View containercomponentes = ViewBindings.findChildViewById(rootView, id);
      if (containercomponentes == null) {
        break missingId;
      }

      id = R.id.edit_email;
      EditText editEmail = ViewBindings.findChildViewById(rootView, id);
      if (editEmail == null) {
        break missingId;
      }

      id = R.id.edit_senha;
      EditText editSenha = ViewBindings.findChildViewById(rootView, id);
      if (editSenha == null) {
        break missingId;
      }

      id = R.id.edit_Telefone;
      EditText editTelefone = ViewBindings.findChildViewById(rootView, id);
      if (editTelefone == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.voltar_para_login_button;
      AppCompatButton voltarParaLoginButton = ViewBindings.findChildViewById(rootView, id);
      if (voltarParaLoginButton == null) {
        break missingId;
      }

      return new ActivityCadastroBinding((ConstraintLayout) rootView, Cadastrese, Nome,
          confirmSenha, containercomponentes, editEmail, editSenha, editTelefone, main,
          voltarParaLoginButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
