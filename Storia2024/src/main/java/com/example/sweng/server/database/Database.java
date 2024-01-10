package com.example.sweng.server.database;

import org.mapdb.DB;
import org.mapdb.DBMaker;
import com.example.sweng.shared.utente.User;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentMap;


public class Database {
    private static Database instance;
    private static DB dbFile;


    public static void main(String args[]) {
        // Creazione di un database embedded su file
        dbFile = DBMaker.fileDB("file.db").make();

        // Ottenere o creare una mappa (ConcurrentMap) chiamata "mapFile"
        ConcurrentMap<Object, Object> mapFile = dbFile.hashMap("mapFile").createOrOpen();

        // Inserire una coppia chiave-valore nella mappa
        mapFile.put("tipo", "file");

        // Chiudere il database
        dbFile.close();
    }

    public static Database getInstance(){
        if (instance==null) {
            synchronized(Database.class) {
                if (instance==null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }

    
    public NavigableSet<User> getUsersSet() {
        return dbFile.treeSet("users", User.class).createOrOpen();
    }

}

