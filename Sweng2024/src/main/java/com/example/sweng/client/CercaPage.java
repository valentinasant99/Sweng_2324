package com.example.sweng.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CercaPage extends Composite {

    private VerticalPanel vPanel = new VerticalPanel();

    public CercaPage() {
        initWidget(this.vPanel);

        // Aggiungi i componenti della pagina di ricerca
        Label titleLabel = new Label("Pagina di Ricerca Storia");
        vPanel.add(titleLabel);

        // Aggiungi altri widget o elementi della tua pagina di ricerca secondo
        // necessità
    }
}
