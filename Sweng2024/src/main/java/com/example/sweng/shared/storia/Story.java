<<<<<<< HEAD
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
=======
package com.example.sweng.shared.storia;


import com.example.sweng.shared.storia.scenario.Scenario;
import com.example.sweng.shared.storia.scenario.tipoScenario.Iniziale;

public class Story {
    private String nome;
    private String descrizione;
    public Story(final String nome, final String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }
    Iniziale inizio = new Iniziale();

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Iniziale getInizio() {
        return inizio;
    }
    public void setInizio(Iniziale inizio) {
        this.inizio = inizio;
    }
}
>>>>>>> bdf3228fd463350eb9c75c2b353e7b74de493dfa
