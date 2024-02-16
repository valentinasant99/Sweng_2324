package com.example.sweng.server.database.d;

import com.example.sweng.shared.storia.Story;
import com.example.sweng.shared.utente.User;

public interface StoryD {

    public boolean addStory(Story storyUser);

    public Story getStory(String nome);

}
