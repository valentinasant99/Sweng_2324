package com.example.sweng.shared.storia.scenario;

import com.google.gwt.user.client.rpc.IsSerializable;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Scenario implements ScenarioGenerale, Serializable, Comparable<Scenario> {
    private int id;
    private String descrizione;
    private String azione;
    private String oggetto;
    private Map<Integer, Scenario> proseguimento;

    public Scenario(final int id, final String descrizione, final String azione, final String oggetto) {
        this.id = id;
        this.descrizione = descrizione;
        this.azione = azione;
        this.oggetto = oggetto;
        proseguimento = new HashMap<>();
    }

    public Scenario() {
    }

    @Override
    public String getDescrizione() {
        return this.descrizione;
    }

    public String getOggetto() {
        return oggetto;
    }

    @Override
    public void setDescrizione(final String descrizione) {
        this.descrizione = descrizione;
    }
    @Override
    public int getId() {
        return id;
    }
    public void setAzione(String azione) {
        this.azione = azione;
    }
    @Override
    public void setId(final int id) {
        this.id = id;
    }
    @Override
    public String getAzione() {
        return this.azione;
    }
    @Override
    public Map<Integer, Scenario> getProseguimento() {
        return this.proseguimento;
    }

    public static void printStory(Scenario scenario) {
        console(scenario.descrizione);
        console(scenario.azione);
        scenario.getProseguimento().entrySet().forEach(e -> console(scenario.getId() + " " + e.getKey()));
        scenario.getProseguimento().forEach((key, value) -> printStory(value));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scenario scenario = (Scenario) o;
        return id == scenario.id && Objects.equals(descrizione, scenario.descrizione) && Objects.equals(azione, scenario.azione) && Objects.equals(oggetto, scenario.oggetto) && Objects.equals(proseguimento, scenario.proseguimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descrizione, azione, oggetto, proseguimento);
    }

    @Override
    public int compareTo(@NotNull Scenario o) {
        int descComparison = this.descrizione.compareTo(o.descrizione);
        int azioneComparison = this.azione.compareTo(o.azione);

        if(this.id != o.id) {
            return this.id - o.id;
        } else if (descComparison != 0) {
            return descComparison;
        }
        return azioneComparison;
    }

    public static native void console(String text)
    /*-{
        console.log(text);
    }-*/;

}
