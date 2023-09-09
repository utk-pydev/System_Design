package org.example;

import java.util.Date;
import java.util.HashMap;

public class Row {
    private String row_id;
    private HashMap<String, String>columnValuesMap;
    private Date createdAt, updatedAt;

    public Row(String row_id, HashMap<String, String>columnValue, Date createdAt, Date updatedAt){
        this.row_id = row_id;
        this.columnValuesMap = columnValue;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public HashMap<String, String>getColumnValuesMap(){
        return columnValuesMap;
    }
    public void setColumnValueMap(HashMap<String, String>columnValueMap){
        this.columnValuesMap = columnValueMap;
    }
    public void setUpdatedAt(Date updatedAt){
        this.updatedAt = updatedAt;
    }

}
