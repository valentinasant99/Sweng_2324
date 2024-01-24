package com.example.sweng.server.services;

import com.example.sweng.client.services.login.LoginService;
import com.example.sweng.client.services.register.RegisterService;
import com.example.sweng.server.database.d.UserD;
import com.example.sweng.server.database.d.UserDImpl;
import com.example.sweng.shared.utente.User;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class RegisterServiceImpl extends RemoteServiceServlet implements RegisterService {

    private UserD userDAO = new UserDImpl();

    @Override
    public boolean registerUser(String email, String password) {
        return this.userDAO.addUser(new User(email, password));
    }
}
