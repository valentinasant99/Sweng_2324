package com.example.sweng.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CercaPage extends Composite {

    private VerticalPanel mainPanel = new VerticalPanel();
    private FlexTable resultsTable = new FlexTable();

    public CercaPage() {
        initWidget(mainPanel);

        // Titolo della pagina
        Label titleLabel = new Label("Catalogo di Storie");
        titleLabel.addStyleName("ricercaTitle");
        mainPanel.add(titleLabel);

        // Pannello di ricerca
        HorizontalPanel searchPanel = new HorizontalPanel();
        final TextBox searchBox = new TextBox();
        Button searchButton = new Button("Cerca");
        searchButton.addStyleName("searchButton");
        searchPanel.add(searchBox);
        searchPanel.add(searchButton);
        mainPanel.add(searchPanel);

        // Risultati della ricerca
        mainPanel.add(resultsTable);

        // Aggiungi stili CSS
        mainPanel.setStyleName("mainPanel");
        resultsTable.setStyleName("resultsTable");

        // Simulazione di risultati di ricerca
        simulateSearchResults();
    }

    private void simulateSearchResults() {
        // Simulazione di risultati di ricerca
        resultsTable.setText(0, 0, "Titolo");
        resultsTable.setText(0, 1, "Autore");
        resultsTable.setText(0, 2, "Genere");

        // Aggiungi stili alle righe dei risultati
        resultsTable.getRowFormatter().setStyleName(0, "resultsTableHeader");
        for (int i = 1; i <= 10; i++) {
            resultsTable.setText(i, 0, "Titolo storia " + i);
            resultsTable.setText(i, 1, "Autore " + i);
            resultsTable.setText(i, 2, "Genere " + i);
            resultsTable.getRowFormatter().setStyleName(i, "resultsTableRow");
        }
    }
}
