package com.example.sweng.server.services;

import com.example.sweng.client.services.addStory.AddStoryService;
import com.example.sweng.server.database.d.StoryD;
import com.example.sweng.server.database.d.StoryDImpl;
import com.example.sweng.shared.storia.Story;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class AddStoryServiceImpl extends RemoteServiceServlet implements AddStoryService {

    private StoryD storyDAO = new StoryDImpl();

    @Override
    public boolean addStory(Story newStory) {
        return this.storyDAO.addStory(newStory);
    }
}
