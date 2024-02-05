package com.example.sweng.client.services.register;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface RegisterServiceAsync {

    void register(String email, String password, AsyncCallback<Boolean> callback);

}
