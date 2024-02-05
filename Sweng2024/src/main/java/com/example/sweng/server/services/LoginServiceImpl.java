package com.example.sweng.server.services;

import com.example.sweng.client.services.login.LoginService;
import com.example.sweng.server.database.d.UserD;
import com.example.sweng.server.database.d.UserDImpl;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {
    private UserD userDAO = new UserDImpl();

    @Override
    public boolean login(String email, String password) {
        return this.userDAO.getUser(email, password)!=null;
    }
}
