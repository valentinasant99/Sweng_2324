package com.example.sweng.shared.utente;

public class Abbonato extends User {

    private boolean abbonato;

    public Abbonato(String email, String password) {
        super(email, password);
        this.abbonato = false; // All'inizio l'utente abbonato non è ancora abbonato
    }

    public void scriviStoria(String storia) {
        System.out.println("Utente abbonato ha scritto la storia: \"" + storia + "\"");
    }

    public void giocaStoria(String storia) {
        System.out.println("Utente abbonato sta giocando la storia: \"" + storia + "\"");
    }

    public void pagaAbbonamento(boolean successo) {
        if (successo) {
            this.abbonato = true;
            System.out.println("Pagamento abbonamento avvenuto con successo!");
        } else {
            this.abbonato = false;
            System.out.println("Pagamento abbonamento non riuscito. Si prega di riprovare.");
        }
    }

    public boolean isAbbonato() {
        return abbonato;
    }
}
