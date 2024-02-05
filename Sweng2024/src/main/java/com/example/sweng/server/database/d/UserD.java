package com.example.sweng.server.database.d;

import com.example.sweng.shared.utente.User;

// Il DAO è un tramite tra la classe User e il database quando ad esempio
// registriamo un utente, o il database e l'utente quando richede dei dati

// Qui i metodi sono solo menzionati, sono implementati in UserDAOImpl
public interface UserD {

    public User getUser(String email, String password);

    public boolean addUser(User newUser);

    public User getUserByEmail(String email);
    
}

