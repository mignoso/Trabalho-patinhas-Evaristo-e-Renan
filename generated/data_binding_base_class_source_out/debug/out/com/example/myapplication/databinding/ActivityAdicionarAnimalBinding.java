// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdicionarAnimalBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText animalAge;

  @NonNull
  public final EditText animalBreed;

  @NonNull
  public final EditText animalDescription;

  @NonNull
  public final EditText animalName;

  @NonNull
  public final Button submitAnimalButton;

  private ActivityAdicionarAnimalBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText animalAge, @NonNull EditText animalBreed,
      @NonNull EditText animalDescription, @NonNull EditText animalName,
      @NonNull Button submitAnimalButton) {
    this.rootView = rootView;
    this.animalAge = animalAge;
    this.animalBreed = animalBreed;
    this.animalDescription = animalDescription;
    this.animalName = animalName;
    this.submitAnimalButton = submitAnimalButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdicionarAnimalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdicionarAnimalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_adicionar_animal, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdicionarAnimalBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.animalAge;
      EditText animalAge = ViewBindings.findChildViewById(rootView, id);
      if (animalAge == null) {
        break missingId;
      }

      id = R.id.animalBreed;
      EditText animalBreed = ViewBindings.findChildViewById(rootView, id);
      if (animalBreed == null) {
        break missingId;
      }

      id = R.id.animalDescription;
      EditText animalDescription = ViewBindings.findChildViewById(rootView, id);
      if (animalDescription == null) {
        break missingId;
      }

      id = R.id.animalName;
      EditText animalName = ViewBindings.findChildViewById(rootView, id);
      if (animalName == null) {
        break missingId;
      }

      id = R.id.submitAnimalButton;
      Button submitAnimalButton = ViewBindings.findChildViewById(rootView, id);
      if (submitAnimalButton == null) {
        break missingId;
      }

      return new ActivityAdicionarAnimalBinding((ConstraintLayout) rootView, animalAge, animalBreed,
          animalDescription, animalName, submitAnimalButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}