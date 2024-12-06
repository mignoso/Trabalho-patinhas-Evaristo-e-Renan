// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdocaoFormBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText adotanteEndereco;

  @NonNull
  public final EditText adotanteNome;

  @NonNull
  public final EditText adotanteTelefone;

  @NonNull
  public final Button enviarAdocaoButton;

  private ActivityAdocaoFormBinding(@NonNull LinearLayout rootView,
      @NonNull EditText adotanteEndereco, @NonNull EditText adotanteNome,
      @NonNull EditText adotanteTelefone, @NonNull Button enviarAdocaoButton) {
    this.rootView = rootView;
    this.adotanteEndereco = adotanteEndereco;
    this.adotanteNome = adotanteNome;
    this.adotanteTelefone = adotanteTelefone;
    this.enviarAdocaoButton = enviarAdocaoButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdocaoFormBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdocaoFormBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_adocao_form, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdocaoFormBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adotante_endereco;
      EditText adotanteEndereco = ViewBindings.findChildViewById(rootView, id);
      if (adotanteEndereco == null) {
        break missingId;
      }

      id = R.id.adotante_nome;
      EditText adotanteNome = ViewBindings.findChildViewById(rootView, id);
      if (adotanteNome == null) {
        break missingId;
      }

      id = R.id.adotante_telefone;
      EditText adotanteTelefone = ViewBindings.findChildViewById(rootView, id);
      if (adotanteTelefone == null) {
        break missingId;
      }

      id = R.id.enviar_adocao_button;
      Button enviarAdocaoButton = ViewBindings.findChildViewById(rootView, id);
      if (enviarAdocaoButton == null) {
        break missingId;
      }

      return new ActivityAdocaoFormBinding((LinearLayout) rootView, adotanteEndereco, adotanteNome,
          adotanteTelefone, enviarAdocaoButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
