package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        DatabaseManager dbManager = DatabaseManager.getInstance();

        boolean isValid = true;
        while(isValid){
            String cur = myObj.nextLine();

            switch (cur) {
                case "create-database":
                    String name = myObj.nextLine();
                    String createdAt = myObj.nextLine();
                    String updatedAt = myObj.nextLine();
                    dbManager.createDatabase(name, createdAt, updatedAt);
                    break;
                case "delete-database":
                    String db = myObj.nextLine();
                    if(dbManager.deleteDatabase(db)){
                        System.out.println("Successful Deletion");
                    }
                    else{
                        System.out.println("Db Not Found");
                    }
                    break;
                case "create-table":
                    String dbName = myObj.nextLine();
                    String table = myObj.nextLine();
                    String ca = myObj.nextLine();
                    String ua = myObj.nextLine();
                    Database curDb = dbManager.getDatabase(dbName);
                    if(curDb != null){
                        curDb.createTable(table, ca, ua);
                    }
                    break;
                case "delete-table":
                    break;

                case "create-row":
                    break;
            }
        }
    }
}