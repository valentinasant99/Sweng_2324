package com.example.sweng.shared.storia;


import com.example.sweng.shared.storia.scenario.Scenario;
import com.example.sweng.shared.storia.scenario.tipoScenario.Iniziale;

public class Story {
    Iniziale inizio = new Iniziale();
    public Iniziale getInizio() {
        return inizio;
    }
    public void setInizio(Iniziale inizio) {
        this.inizio = inizio;
    }
}
