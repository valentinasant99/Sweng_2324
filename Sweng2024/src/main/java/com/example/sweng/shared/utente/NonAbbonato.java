package com.example.sweng.shared.utente;

public class NonAbbonato extends User {

    public NonAbbonato(String email, String password) {
        super(email, password);
    }

    public void scriviStoria(String storia) {
        // Qui inserisci la logica per permettere all'utente di scrivere una storia
        System.out.println("Utente non abbonato ha scritto la storia: \"" + storia + "\"");
    }
}
