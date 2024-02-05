package com.example.sweng.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HomePage extends Composite{

    VerticalPanel vPanel = new VerticalPanel();

    public HomePage(Storia2024 app) {

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

        cercaButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent click) {
                app.goToSearchStory();
            }
        
        });

        scriviButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent click) {
                app.goToWriteStory();
            }
            
        });
    }
    
}