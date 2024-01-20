package com.example.sweng.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class WritePage extends Composite {

    VerticalPanel vPanel1 = new VerticalPanel();

    public WritePage(){
        HorizontalPanel titolo = new HorizontalPanel();

        Label testoTitolo = new Label("Scrivi la storia che desideri creare!");
        titolo.add(testoTitolo);

        HorizontalPanel scenario1 = new HorizontalPanel();

        Label testoScen1 = new Label("inserisci il testo del primo scenario");
        scenario1.add(testoScen1);
        Button sendButton = new Button("InviaScenario");
        sendButton.addStyleName("sendButton");
        

        vPanel1.add(titolo);
        vPanel1.add(scenario1);
        vPanel1.add(sendButton);

        initWidget(vPanel1);

        sendButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent click) {
                        Window.alert("hai cliccato invia");}
        
        });



    }
    
}
