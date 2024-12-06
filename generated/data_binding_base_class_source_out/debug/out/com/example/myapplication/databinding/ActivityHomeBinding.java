// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final GridView animaisGrid;

  @NonNull
  public final EditText buscarAnimal;

  @NonNull
  public final Button caesButton;

  @NonNull
  public final Button gatosButton;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final ImageView user;

  @NonNull
  public final TextView usuarioBemVindo;

  private ActivityHomeBinding(@NonNull ConstraintLayout rootView, @NonNull GridView animaisGrid,
      @NonNull EditText buscarAnimal, @NonNull Button caesButton, @NonNull Button gatosButton,
      @NonNull ConstraintLayout main, @NonNull ImageView user, @NonNull TextView usuarioBemVindo) {
    this.rootView = rootView;
    this.animaisGrid = animaisGrid;
    this.buscarAnimal = buscarAnimal;
    this.caesButton = caesButton;
    this.gatosButton = gatosButton;
    this.main = main;
    this.user = user;
    this.usuarioBemVindo = usuarioBemVindo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.animais_grid;
      GridView animaisGrid = ViewBindings.findChildViewById(rootView, id);
      if (animaisGrid == null) {
        break missingId;
      }

      id = R.id.buscar_animal;
      EditText buscarAnimal = ViewBindings.findChildViewById(rootView, id);
      if (buscarAnimal == null) {
        break missingId;
      }

      id = R.id.caes_button;
      Button caesButton = ViewBindings.findChildViewById(rootView, id);
      if (caesButton == null) {
        break missingId;
      }

      id = R.id.gatos_button;
      Button gatosButton = ViewBindings.findChildViewById(rootView, id);
      if (gatosButton == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.user;
      ImageView user = ViewBindings.findChildViewById(rootView, id);
      if (user == null) {
        break missingId;
      }

      id = R.id.usuario_bem_vindo;
      TextView usuarioBemVindo = ViewBindings.findChildViewById(rootView, id);
      if (usuarioBemVindo == null) {
        break missingId;
      }

      return new ActivityHomeBinding((ConstraintLayout) rootView, animaisGrid, buscarAnimal,
          caesButton, gatosButton, main, user, usuarioBemVindo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
