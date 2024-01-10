package com.example.sweng.server.services;

import com.example.sweng.client.services.login.LoginService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.example.sweng.server.database.DAO.UserDAO;
import com.example.sweng.server.database.DAO.UserDAOImpl;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {

    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public boolean login(String email, String password) {
        return this.userDAO.getUser(email, password)!=null;
    }
}
