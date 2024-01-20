package com.example.sweng.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Storia2024 implements EntryPoint {

  public void onModuleLoad() {

    LoginPage loginPage = new LoginPage(this);
    RootPanel.get().add(loginPage);

  }

  public void goToHomePage() {
    RootPanel.get().clear();
  }


}
