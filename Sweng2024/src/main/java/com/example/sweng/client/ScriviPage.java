package com.example.sweng.client;

import com.example.sweng.client.services.addStory.AddStoryService;
import com.example.sweng.client.services.addStory.AddStoryServiceAsync;
import com.example.sweng.shared.storia.Story;
import com.example.sweng.shared.storia.scenario.Scenario;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScriviPage extends Composite {

    private VerticalPanel vPanel = new VerticalPanel();
    private CellTable<Scenario> table = new CellTable<Scenario>();
    private int numScenari;
    private Story storia;

    private AddStoryServiceAsync addStoryService = GWT.create(AddStoryService.class);

    public ScriviPage() {
        initWidget(this.vPanel);

        // Aggiungi i componenti della pagina di ricerca
        Label titleLabel = new Label("Pagina di Scrivi Storia");
        vPanel.add(titleLabel);

        // Aggiungi altri widget o elementi della tua pagina di ricerca secondo
        // necessità

        TextBox inputNumScenari = new TextBox();
        Button confirmNumScenari = new Button("Conferma numero scenari");


        FlowPanel storyPanel = new FlowPanel();
        VerticalPanel namePanel = new VerticalPanel();
        VerticalPanel descPanel = new VerticalPanel();

        Label nomeStoriaLabel = new Label("Nome Storia");
        TextBox nomeStoria = new TextBox();
        nomeStoria.setText("Storia Nome Esempio");
        namePanel.add(nomeStoriaLabel);
        namePanel.add(nomeStoria);

        Label descStoriaLabel = new Label("Descrizione Storia");
        TextBox descrizioneStoria = new TextBox();
        descrizioneStoria.setText("Storia Descrizione Esempio");
        descPanel.add(descStoriaLabel);
        descPanel.add(descrizioneStoria);

        storyPanel.add(namePanel);
        storyPanel.add(descPanel);

        RootPanel.get().add(storyPanel);


        confirmNumScenari.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                if(!inputNumScenari.getText().isEmpty()) {
                    numScenari = Integer.valueOf(inputNumScenari.getText());
                    FlowPanel mainPanel = new FlowPanel();

                    HorizontalPanel horPanelColumns = new HorizontalPanel();
                    Label idColumn = new Label("ID");
                    Label descColumn = new Label("Descrizione");
                    Label azioneColumn = new Label("Azione");
                    Label parentColumn = new Label("Scenario Precedente");
                    Label oggettoColumn = new Label("Oggetto da raccogliere");

                    horPanelColumns.add(idColumn);
                    horPanelColumns.add(descColumn);
                    horPanelColumns.add(azioneColumn);
                    horPanelColumns.add(parentColumn);
                    horPanelColumns.add(oggettoColumn);

                    mainPanel.add(horPanelColumns);

                    List<Quintuplet<Label, TextBox, TextBox, ListBox, TextBox>> scenarios = new ArrayList<>();

                    for(int i = 0; i < numScenari; i++) {
                        HorizontalPanel horPanel = new HorizontalPanel();

                        Label id = new Label(String.valueOf(i));
                        TextBox desc = new TextBox();
                        desc.setText("Descrizione " + i);
                        TextBox azione = new TextBox();
                        azione.setText("Azione " + i);
                        ListBox parent = new ListBox();
                        for(int j = 0; j < numScenari; j++) {
                            parent.addItem(Integer.toString(j));
                        }
                        TextBox oggetto = new TextBox();

                        if (i == 0){
                            azione.setEnabled(false);
                            parent.setEnabled(false);
                        }

                        horPanel.add(id);
                        horPanel.add(desc);
                        horPanel.add(azione);
                        horPanel.add(parent);
                        horPanel.add(oggetto);

                        scenarios.add(new Quintuplet<>(id, desc, azione, parent, oggetto));

                        mainPanel.add(horPanel);
                    }

                    Button createStory = new Button("Crea Storia");

                    createStory.addClickHandler(new ClickHandler() {
                        @Override
                        public void onClick(ClickEvent event) {
                            Map<Integer, Integer> tmp = new HashMap<>();

                            scenarios.forEach(s -> tmp.put(Integer.valueOf(s.getA().getText()), Integer.valueOf(s.getD().getSelectedItemText())));

                            List<Scenario> storyScenarios = new ArrayList<>();

                            scenarios.forEach(s -> {
                                storyScenarios.add(new Scenario(
                                        Integer.valueOf(s.getA().getText()),
                                        s.getB().getText(),
                                        s.getC().getText(),
                                        s.getE().getText()
                                        ));
                            });

                            List<Integer> keys = new ArrayList<>();
                            for(int i = 0; i < storyScenarios.size(); i++){
                                Scenario s = storyScenarios.get(i);

                                tmp.entrySet().forEach(e -> {
                                    if (e.getValue() == s.getId()) {
                                        keys.add(e.getKey());
                                    }
                                });

                                keys.forEach(elem -> {
                                    if(s.getId() != elem)
                                        s.getProseguimento().put(elem, storyScenarios.get(elem));
                                });
                                keys.clear();
                            }

                            Scenario.printStory(storyScenarios.get(0));

                            storia = new Story(nomeStoria.getText(), descrizioneStoria.getText(), storyScenarios.get(0));

                            addStoryService.addStory(storia, new AsyncCallback<Boolean>() {
                                @Override
                                public void onFailure(Throwable caught) {
                                    Window.alert("error");
                                }

                                @Override
                                public void onSuccess(Boolean result) {
                                    Window.alert("Inserimento avvenuto correttamente");
                                    History.newItem("home");
                                }
                            });
                        }
                    });

                    RootPanel.get().add(mainPanel);
                    RootPanel.get().add(createStory);
                }
            }
        });

        RootPanel.get().add(inputNumScenari);
        RootPanel.get().add(confirmNumScenari);

    }
}
