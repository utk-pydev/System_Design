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

    public void insertEntry(String rowId, HashMap<String, String>columnsMap){
        if(rowHashMap.containsKey(rowId)){
            System.out.println("Duplicate primary key : Insertion Failed");
        }
        else{
            Row row = new Row(rowId, columnsMap, new Date(), new Date());
            rowHashMap.put(rowId, row);
        }
    }
    public void deleteEntry(String rowId){
        System.out.println("Row successfully deleted");
        rowHashMap.remove(rowId);
    }
    public void updateEntry(String rowId, HashMap<String, String>valuesMap){
        Row row = rowHashMap.get(rowId);
        valuesMap.forEach((k, v)->{
            row.getColumnValuesMap().put(k, v);
        });
        row.setUpdatedAt(new Date());
    }
}
