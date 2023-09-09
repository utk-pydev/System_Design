package org.example;

import java.util.Date;
import java.util.HashMap;

public class Row {
    private int row_id;
    private HashMap<String, String>columnValue;
    private Date createdAt, updatedAt;

    public Row(int row_id, HashMap<String, String>columnValue, Date createdAt, Date updatedAt){
        this.row_id = row_id;
        this.columnValue = columnValue;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


}
