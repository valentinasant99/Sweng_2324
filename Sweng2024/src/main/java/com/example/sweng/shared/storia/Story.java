package com.example.sweng.shared.storia;


import com.example.sweng.shared.storia.scenario.Scenario;
import com.google.gwt.user.client.rpc.IsSerializable;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Story implements Serializable, Comparable<Story> {
    private String nome;
    private String descrizione;
    private Scenario inizio;
    private List<String> inventario;
    public Story(final String nome, final String descrizione, final Scenario inizio) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.inizio = inizio;
        this.inventario = new ArrayList<>();
    }

    public Story() {
    }



    public List<String> getInventario() {
        return inventario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Story story = (Story) o;
        return Objects.equals(nome, story.nome) && Objects.equals(descrizione, story.descrizione) && Objects.equals(inizio, story.inizio) && Objects.equals(inventario, story.inventario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descrizione, inizio, inventario);
    }

    public String getNome() {
        return nome;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public Scenario getInizio() {
        return inizio;
    }

    @Override
    public int compareTo(@NotNull Story o) {
        int nomeComparison = this.nome.compareTo(o.getNome());
        int descComparison = this.descrizione.compareTo(o.getDescrizione());
        if (nomeComparison != 0) {
            return nomeComparison;
        } else if (descComparison != 0) {
            return descComparison;
        }
        return this.inizio.compareTo(o.inizio);
    }
}
