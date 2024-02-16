package com.example.sweng.client.services.addStory;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class AddStoryService_Proxy extends RemoteServiceProxy implements com.example.sweng.client.services.addStory.AddStoryServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.example.sweng.client.services.addStory.AddStoryService";
  private static final String SERIALIZATION_POLICY ="8AEC74494F5BB10C5EE29E25DC3ACCE7";
  private static final com.example.sweng.client.services.addStory.AddStoryService_TypeSerializer SERIALIZER = new com.example.sweng.client.services.addStory.AddStoryService_TypeSerializer();
  
  public AddStoryService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "addStory", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void addStory(com.example.sweng.shared.storia.Story newStory, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("AddStoryService_Proxy", "addStory");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("com.example.sweng.shared.storia.Story/2379246213");
      streamWriter.writeObject(newStory);
      helper.finish(callback, ResponseReader.BOOLEAN);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
