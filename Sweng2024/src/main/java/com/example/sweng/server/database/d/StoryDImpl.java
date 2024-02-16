package com.example.sweng.server.database.d;

import com.example.sweng.server.database.Database;
import com.example.sweng.shared.storia.Story;

import java.util.NavigableSet;
import java.util.Optional;

public class StoryDImpl implements StoryD {


    @Override
    public boolean addStory(Story newStory) {
        NavigableSet<Story> storySet = Database.getInstance().getStorySet();
        for (Story s : storySet) {
            if (s.getNome().equals(newStory.getNome()))
                return false;
        }
        storySet.add(newStory);
        return true;
    }

    @Override
    public Story getStory(String nome) {
        // L'insieme di stories qui è un SET, non un arraylist
        NavigableSet<Story> storySet = Database.getInstance().getStorySet();
        // Lo stream è un meccanismo attraverso il quale possiamo cercare all'interno del set, e l'operazioen filter permette
        // di filtrare i dati in base a un criterio che deciamo noi (in questo caso stiamo cercando una story che abbia
        // lo stesso nome di quello che abbiamo passato al metodo)

        // Findfirst ritorna il primo risultato ottenuto dal filtraggio, che ritorna un Optional
        Optional<Story> newStory = storySet.stream().filter(s -> s.getNome().equals(nome)).findFirst();
        // L'Optional è una struttura dati attraverso la quale possiamo vedere se un risultato è null oppure no,
        // qui sotto controlliamo se il valore è presente (la story) oppure null
        return newStory.orElse(null);
    }
}
