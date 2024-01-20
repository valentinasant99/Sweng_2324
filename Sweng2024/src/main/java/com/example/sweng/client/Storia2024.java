package com.example.sweng.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;


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
    HomePage homePage = new HomePage(this);
    RootPanel.get().add(homePage);
  }

  public void goToWriteStory() {
    RootPanel.get().clear();
    WritePage writePage = new WritePage();
    RootPanel.get().add(writePage);

  }


}
