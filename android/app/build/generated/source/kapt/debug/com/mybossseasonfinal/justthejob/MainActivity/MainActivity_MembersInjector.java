// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.mybossseasonfinal.justthejob.MainActivity;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MainPresenter> mainPresenterProvider;

  public MainActivity_MembersInjector(Provider<MainPresenter> mainPresenterProvider) {
    this.mainPresenterProvider = mainPresenterProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<MainPresenter> mainPresenterProvider) {
    return new MainActivity_MembersInjector(mainPresenterProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectMainPresenter(instance, mainPresenterProvider.get());
  }

  public static void injectMainPresenter(MainActivity instance, MainPresenter mainPresenter) {
    instance.mainPresenter = mainPresenter;
  }
}
