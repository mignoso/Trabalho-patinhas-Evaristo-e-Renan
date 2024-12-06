// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdocaoStatusBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView adocaoStatusText;

  @NonNull
  public final TextView adotanteEnderecoText;

  @NonNull
  public final TextView adotanteNomeText;

  @NonNull
  public final TextView adotanteTelefoneText;

  private ActivityAdocaoStatusBinding(@NonNull LinearLayout rootView,
      @NonNull TextView adocaoStatusText, @NonNull TextView adotanteEnderecoText,
      @NonNull TextView adotanteNomeText, @NonNull TextView adotanteTelefoneText) {
    this.rootView = rootView;
    this.adocaoStatusText = adocaoStatusText;
    this.adotanteEnderecoText = adotanteEnderecoText;
    this.adotanteNomeText = adotanteNomeText;
    this.adotanteTelefoneText = adotanteTelefoneText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdocaoStatusBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdocaoStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_adocao_status, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdocaoStatusBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adocao_status_text;
      TextView adocaoStatusText = ViewBindings.findChildViewById(rootView, id);
      if (adocaoStatusText == null) {
        break missingId;
      }

      id = R.id.adotante_endereco_text;
      TextView adotanteEnderecoText = ViewBindings.findChildViewById(rootView, id);
      if (adotanteEnderecoText == null) {
        break missingId;
      }

      id = R.id.adotante_nome_text;
      TextView adotanteNomeText = ViewBindings.findChildViewById(rootView, id);
      if (adotanteNomeText == null) {
        break missingId;
      }

      id = R.id.adotante_telefone_text;
      TextView adotanteTelefoneText = ViewBindings.findChildViewById(rootView, id);
      if (adotanteTelefoneText == null) {
        break missingId;
      }

      return new ActivityAdocaoStatusBinding((LinearLayout) rootView, adocaoStatusText,
          adotanteEnderecoText, adotanteNomeText, adotanteTelefoneText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}