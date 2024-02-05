package com.example.sweng.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Storia2024 implements EntryPoint {

  public void onModuleLoad() {
    // Configura il gestore di cambiamento della cronologia
    History.addValueChangeHandler(event -> handleHistoryChange(event.getValue()));

    // Inizialmente mostra la pagina di login
    showLoginPage();
  }

  private void showLoginPage() {
    RootPanel.get().clear();
    LoginPage loginPage = new LoginPage(this);
    RootPanel.get().add(loginPage);
  }

/*   public void goToHomePage() {
    // Quando si desidera andare alla pagina principale, aggiorna la cronologia
    History.newItem("home");
  } */

  private void handleHistoryChange(String historyToken) {
    if ("home".equals(historyToken)) {
      goToHomePage();
    } else if ("cercaPage".equals(historyToken)) {
      showCercaPage();
    } else if ("writePage".equals(historyToken)) {
      goToWriteStory();
    } else if ("giocaPage".equals(historyToken)) {
      showGiocaPage();
    } else if ("pagaPage".equals(historyToken)) {
      showPagaPage();
    } else {
      showLoginPage();
    }
  }

  public void goToHomePage() {
    RootPanel.get().clear();
    HomePage homePage = new HomePage(this);
    RootPanel.get().add(homePage);
  }

  private void showCercaPage() {
    RootPanel.get().clear();
    CercaPage cercaPage = new CercaPage(); // Assumi che tu abbia una classe CercaPage
    RootPanel.get().add(cercaPage);
  }

  public void goToWriteStory() {
    RootPanel.get().clear();
    WritePage writePage = new WritePage();
    RootPanel.get().add(writePage);

  }

  private void showGiocaPage() {
    RootPanel.get().clear();
    GiocaPage giocaPage = new GiocaPage(); // Assumi che tu abbia una classe GiocaPage
    RootPanel.get().add(giocaPage);
  }

  private void showPagaPage() {
    RootPanel.get().clear();
    PagaPage pagaPage = new PagaPage(); // Assumi che tu abbia una classe PagaPage
    RootPanel.get().add(pagaPage);
  }

  public void goToSearchStory() {
    RootPanel.get().clear();
    CercaPage cercaPage = new CercaPage();
    RootPanel.get().add(cercaPage);

  }

}
