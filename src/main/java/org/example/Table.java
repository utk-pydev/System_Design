package org.example;

import java.util.Date;
import java.util.HashMap;

public class Table {
    private String name;
    private HashMap<String, Row>rowHashMap;
    private String createdAt, updatedAt;

    public Table(String name, String createdAt, String updatedAt){
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        rowHashMap = new HashMap<>();
    }

}
