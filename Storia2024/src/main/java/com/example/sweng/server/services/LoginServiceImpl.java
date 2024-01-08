package com.example.sweng.server.services;

import com.example.sweng.client.services.login.LoginService;
import com.example.sweng.client.services.register.RegisterService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {


    @Override
    public boolean login(String email, String password) {
        return false;
    }
}
