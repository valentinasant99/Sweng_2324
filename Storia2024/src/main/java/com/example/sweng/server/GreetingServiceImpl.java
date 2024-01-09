package com.example.sweng.server;

import com.example.sweng.client.GreetingService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import java.lang.SuppressWarnings;


/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
    GreetingService {
      


  @Override
  public String greetServer(String name) throws IllegalArgumentException {
    return null;
  }
}
