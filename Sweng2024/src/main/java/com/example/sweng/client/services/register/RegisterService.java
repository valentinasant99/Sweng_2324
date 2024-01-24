package com.example.sweng.client.services.register;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("register")
public interface RegisterService extends RemoteService{

    boolean registerUser(String email, String password);
    
}
