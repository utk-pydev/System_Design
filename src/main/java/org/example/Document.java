package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Document {

    private static int curId = 1;
    private int id;
    private String name, content;
    private User owner;
    private HashMap<Integer, Integer>readAccess;
    private HashMap<Integer, Integer>writeAccess;
    public Document(String name, User user){
        this.owner = user;
        this.readAccess = new HashMap<>();
        this.writeAccess = new HashMap<>();
        this.name = name;
        id = curId++;
        content = "";
    }
    public boolean addReadAccess(User user){
        readAccess.put(user.getId(), 1);
        return true;
    }
    public void addContent(String content, User user){
        if(writeAccess.containsKey(user.getId()))
            this.content += content;
    }
    public String getContent(User user){
        if(readAccess.containsKey(user.getId())){
            return this.content;
        }
        return "Unauthorized Access";
    }
    public void deleteContent(){
        this.content = "";
    }
    public int getId(){
        return id;
    }
}
