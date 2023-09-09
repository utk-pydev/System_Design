package org.example;

import java.util.Date;
import java.util.HashMap;

class DatabaseManager {
    private HashMap<String, Database>databaseHashMap;

    private static DatabaseManager dbmanager = null;
    private DatabaseManager(){
        this.databaseHashMap = new HashMap<>();
    }
    
    public static DatabaseManager getInstance(){
        if(dbmanager == null){
            dbmanager = new DatabaseManager();   
        }
        return dbmanager;
    }    
    
    public Database createDatabase(String name, String createdAt, String updatedAt){
        if(databaseHashMap.containsKey(name)){
            System.out.println("Database already present");
        }
        else {
            System.out.println("New Database created");
            databaseHashMap.put(name, new Database(name, createdAt, updatedAt));
        }
        return  databaseHashMap.get(name);
    }

    public Database getDatabase(String name){
        Database db = null;
        if(databaseHashMap.containsKey(name)){
            db = databaseHashMap.get(name);
        }
        return  db;
    }
    public boolean deleteDatabase(String name){
        if(databaseHashMap.containsKey(name)){
            databaseHashMap.remove(name);
            return true;
        }
        return false;
    }
}
