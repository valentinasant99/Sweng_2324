package com.example.sweng.shared.storia.scenario.tipoScenario;


import com.example.sweng.shared.storia.scenario.Scenario;

import java.util.ArrayList;
import java.util.List;

public class Finale extends Scenario {
    private String azione;
    public Finale(final String descrizione, final String azione) {
        super(descrizione);
        this.azione = azione;
    }
    public String getAzione() {
        return azione;
    }
}
