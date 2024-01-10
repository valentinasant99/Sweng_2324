package com.example.sweng.server.database.DAO;

import com.example.sweng.shared.utente.User;

public interface UserDAO {

    public User getUser(String email, String password);

    public boolean addUser(User newUser);

    public User getUserByEmail(String email);
    
} 
