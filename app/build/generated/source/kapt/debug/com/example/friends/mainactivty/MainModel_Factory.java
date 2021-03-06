// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.example.friends.mainactivty;

import com.example.friends.firebase.MyFirebase;
import com.example.friends.savedata.MySheradPreferans;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MainModel_Factory implements Factory<MainModel> {
  private final Provider<MyFirebase> firebaseProvider;

  private final Provider<MySheradPreferans> msPrefProvider;

  public MainModel_Factory(
      Provider<MyFirebase> firebaseProvider, Provider<MySheradPreferans> msPrefProvider) {
    assert firebaseProvider != null;
    this.firebaseProvider = firebaseProvider;
    assert msPrefProvider != null;
    this.msPrefProvider = msPrefProvider;
  }

  @Override
  public MainModel get() {
    return new MainModel(firebaseProvider.get(), msPrefProvider.get());
  }

  public static Factory<MainModel> create(
      Provider<MyFirebase> firebaseProvider, Provider<MySheradPreferans> msPrefProvider) {
    return new MainModel_Factory(firebaseProvider, msPrefProvider);
  }
}
