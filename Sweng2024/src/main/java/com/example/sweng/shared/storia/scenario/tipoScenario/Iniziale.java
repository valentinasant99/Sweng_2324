package com.example.sweng.shared.storia.scenario.tipoScenario;


import com.example.sweng.shared.storia.scenario.Scenario;

import java.util.ArrayList;
import java.util.List;

public class Iniziale extends Scenario {
    private List<Intermedio> proseguimento;
    public Iniziale() {
        super(); // Super server per chiamare il costruttore della classe "parente", in questo caso 'Storia.Scenario'
        proseguimento = new ArrayList<>();
    }
    public Iniziale(final String descrizione) {
        super(descrizione);
        proseguimento = new ArrayList<>();
    }

    public List<Intermedio> getProseguimento() {
        return this.proseguimento;
    }
    public void addScenarioSuccessivo(final Intermedio intermedio) {
        this.proseguimento.add(intermedio);
    }
    public void addScenarioSuccessivo(final List<Intermedio> intermedio) {
        this.proseguimento.addAll(intermedio);
    }
}
