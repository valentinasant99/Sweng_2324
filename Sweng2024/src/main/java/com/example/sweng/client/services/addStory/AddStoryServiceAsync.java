package com.example.sweng.client.services.addStory;

import com.example.sweng.shared.storia.Story;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AddStoryServiceAsync {
    void addStory(Story newStory, AsyncCallback<Boolean> callback);
}
