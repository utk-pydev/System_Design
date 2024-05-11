package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Document {

    private static int curId = 1;
    private int id;
    private int totalCountUsed ;
    private String name, content;
    private User owner;
    private HashMap<Integer, Integer>readAccess;
    private HashMap<Integer, Integer>writeAccess;
    public Document(String name, User user){
        this.owner = user;
        this.readAccess = new HashMap<>();
        this.writeAccess = new HashMap<>();
        readAccess.put(this.owner.getId(), 1);
        writeAccess.put(this.owner.getId(), 1);
        this.name = name;
        id = curId++;
        content = "";
    }
    public boolean addReadAccess(User user){
        readAccess.put(user.getId(), 1);
        return true;
    }
    public String addContent(String content, User user){
        if(writeAccess.containsKey(user.getId())) {
            this.content += content;
            return "Content added to file";
        }
        else{
            return "Unauthorized Access";
        }
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
    public void printMap(){
        readAccess.forEach((k, v)->System.out.println(k+v));
    }
}
