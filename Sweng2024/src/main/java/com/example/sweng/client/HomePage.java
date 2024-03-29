package com.example.sweng.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.History;
//import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HomePage extends Composite {

    VerticalPanel vPanel = new VerticalPanel();

    public HomePage() {
        this.vPanel.addStyleName("wrapper");

        HorizontalPanel menu = new HorizontalPanel();
        menu.addStyleName("homeMenu");

        Label homeLabel = new Label("Home");
        homeLabel.addStyleName("homeMenuLabel");

        Label userLabel = new Label("Area utente");
        userLabel.addStyleName("homeMenuLabel");

        menu.add(homeLabel);
        menu.add(userLabel);

        this.vPanel.add(menu);

        Button scriviButton = new Button("Scrivi Storia");
        scriviButton.addStyleName("homeButton");
        vPanel.add(scriviButton);

        Button cercaButton = new Button("Ricerca Storia");
        cercaButton.addStyleName("homeButton");
        vPanel.add(cercaButton);

        Button giocaButton = new Button("Gioca Storia");
        giocaButton.addStyleName("homeButton");
        vPanel.add(giocaButton);

        Button pagaButton = new Button("Paga Abbonamento");
        pagaButton.addStyleName("homeButton");
        vPanel.add(pagaButton);

        initWidget(this.vPanel);

        // Aggiunta di gestori di eventi ai pulsanti per gestire la navigazione
        cercaButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent click) {
                // Naviga alla nuova pagina quando il pulsante "Ricerca Storia" viene cliccato
                History.newItem("cercaPage");
            }
        });

        scriviButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent click) {
                // Naviga alla nuova pagina quando il pulsante "Scrivi Storia" viene cliccato
                History.newItem("scriviPage");
            }
        });

        giocaButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent click) {
                // Naviga alla nuova pagina quando il pulsante "Gioca Storia" viene cliccato
                History.newItem("giocaPage");
            }
        });

        pagaButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent click) {
                // Naviga alla nuova pagina quando il pulsante "Paga Abbonamento" viene cliccato
                History.newItem("pagaPage");
            }
        });
    }
}
