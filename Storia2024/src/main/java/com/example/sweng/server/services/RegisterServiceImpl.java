package com.example.sweng.server.services;

import com.example.sweng.client.services.register.RegisterService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class RegisterServiceImpl extends RemoteServiceServlet implements RegisterService {

    @Override
    public boolean register(String email, String password) {
        return false;
    }
}
