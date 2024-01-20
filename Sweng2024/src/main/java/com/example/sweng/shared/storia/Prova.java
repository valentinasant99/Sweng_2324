package com.example.sweng.shared.storia;// Esempio creazione nuova Storia


import com.example.sweng.shared.storia.scenario.Scenario;
import com.example.sweng.shared.storia.scenario.tipoScenario.Finale;
import com.example.sweng.shared.storia.scenario.tipoScenario.Iniziale;
import com.example.sweng.shared.storia.scenario.tipoScenario.Intermedio;

public class Prova {
    public static void main(String[] args) {

        Story storyEsempio = new Story();


        Iniziale iniziale = new Iniziale("Questa è una descrizione per l'inizio");


        Intermedio intermedio = new Intermedio("Questo è uno scenario intermedio", "Azione 1");

        Finale finale = new Finale("Questo è uno scenario finale", "Azione 1");

        storyEsempio.setInizio(iniziale);
        storyEsempio.getInizio().addScenarioSuccessivo(intermedio);

        storyEsempio.getInizio().getProseguimento().get(0).addScenarioFinale(finale);

        System.out.println(storyEsempio.getInizio().getDescrizione());

        System.out.println(storyEsempio.getInizio().getProseguimento().get(0).getDescrizione());
        System.out.println(storyEsempio.getInizio().getProseguimento().get(0).getAzione());

        System.out.println(storyEsempio.getInizio().getProseguimento().get(0).getFinale().get(0).getDescrizione());
        System.out.println(storyEsempio.getInizio().getProseguimento().get(0).getFinale().get(0).getAzione());

    }
}
