package com.example.sweng.shared.storia.scenario;

public class Scenario implements ScenarioGenerale {
    private String descrizione;
    public Scenario() {
    }
    public Scenario(final String descrizione) {
        this.descrizione = descrizione;
    }
    @Override
    public String getDescrizione() {
        return this.descrizione;
    }
    @Override
    public void setDescrizione(final String descrizione) {
        this.descrizione = descrizione;
    }
}
