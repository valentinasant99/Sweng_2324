package com.example.sweng.shared.storia.scenario.tipoScenario;


import com.example.sweng.shared.storia.scenario.Scenario;

import java.util.ArrayList;
import java.util.List;

public class Intermedio extends Scenario {
    private String azione;
    private List<Intermedio> proseguimento;
    private List<Finale> finale;
    public Intermedio(final String descrizione, final String azione) {
        super(descrizione);
        this.azione = azione;
        proseguimento = new ArrayList<>();
        finale = new ArrayList<>();
    }
    public String getAzione() {
        return azione;
    }
    public List<Intermedio> getProseguimento() {
        return proseguimento;
    }
    public List<Finale> getFinale() {
        return finale;
    }
    public void addScenarioIntermedio(final Intermedio scenario) {
        this.proseguimento.add(scenario);
    }
    public void addScenarioIntermedio(final List<Intermedio> scenario) {
        this.proseguimento.addAll(scenario);
    }
    public void addScenarioFinale(final Finale scenario) {
        this.finale.add(scenario);
    }
    public void addScenarioFinale(final List<Finale> scenario) {
        this.finale.addAll(scenario);
    }
}
