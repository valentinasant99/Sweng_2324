package com.example.sweng.server.database.DAO;

import com.example.sweng.server.database.Database;
import com.example.sweng.shared.utente.User;
import java.util.Iterator;
import java.util.NavigableSet;


public class UserDAOImpl implements UserDAO{

        @Override
        public User getUser(String email, String password) {
            NavigableSet<User> userSet = Database.getInstance().getUsersSet();
            userSet.add(new User("ciao", "ciao"));
            User newUser = new User(email, password);
            if (userSet.contains(newUser)) return newUser;
            else return null;
        }
    
    
        public User getUserByEmail(String email) {
            Iterator<User> itUser = Database.getInstance().getUsersSet().iterator();
            while (itUser.hasNext()) {
                User tmp = itUser.next();
                if (tmp.getEmail().equals(email)) return tmp;
            }
            return null;
        }
    
        @Override
        public boolean addUser(User newUser) {
            NavigableSet<User> userSet = Database.getInstance().getUsersSet();
            for (User u : userSet) {
                if (u.getEmail().equals(newUser.getEmail()))
                    return false;
            }
            userSet.add(newUser);
            return true;
        }
    
    
        
    }


