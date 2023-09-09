package org.example;

import java.util.Date;
import java.util.HashMap;

public class Database {
    private String name;
    private HashMap<String, Table>tableHashMap;
    private String createdAt;
    private String updatedAt;

    public Database(String name, String createdAt, String updatedAt){
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        tableHashMap = new HashMap<>();
    }

    public Table createTable(String name, String createdAt, String updatedAt){
        if(tableHashMap.containsKey(name)){
            System.out.println("Table Already Present");
        }
        else{
            tableHashMap.put(name, new Table(name, createdAt, updatedAt));
        }
        return tableHashMap.get(name);
    }
    public boolean deleteTable(String name){
        if(tableHashMap.containsKey(name)){
            tableHashMap.remove(name);
            return true;
        }
        return false;
    }
    public Table getTable(String name){
        Table curObj = null;
        if(tableHashMap.containsKey(name)){
            curObj = tableHashMap.get(name);
        }
        return curObj;
    }
}
