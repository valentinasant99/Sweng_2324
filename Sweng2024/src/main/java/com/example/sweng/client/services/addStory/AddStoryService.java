package com.example.sweng.client.services.addStory;

import com.example.sweng.shared.storia.Story;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("addStory")
public interface AddStoryService extends RemoteService {
    boolean addStory(Story newStory);
}
