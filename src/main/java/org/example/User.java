package org.example;

import javax.print.Doc;
import java.util.HashMap;

public class User {

    private static int curId = 1;
    private int id;
    private String name;
    private HashMap<String, Document>documentHashMap;
    public User(String name){
        this.name = name;
        id = curId++;
        documentHashMap = new HashMap<>();
    }

    public int getId(){
        return this.id;
    }
    public Document createDocument(String name){
        Document doc = new Document(name, this);
        documentHashMap.put(name, doc);
        return doc;
    }
    public boolean deleteDocument(String name){
        if(documentHashMap.containsKey(name)){
            Document doc = documentHashMap.get(name);
            documentHashMap.remove(name);
            doc = null;
            return true;
        }
        return false;
    }
}
