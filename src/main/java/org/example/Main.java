package org.example;

import javax.print.Doc;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
        const user1: User = new User('Shyam');
        const user2: User = new User('Ram');
        user1.createDocument('myfirstDoc');
        user1.createDocument('mysecondDoc')
        console.log(doc1.getContent(user1.getId()));
        console.log(doc2.getContent(user2.getId()));

        console.log('Adding access for the user2')
        user1.grantReadAccess(user2.getId(), doc1.getId());
    */
        User user1 = new User("Shyam");
        User user2 = new User("Ram");

        Document doc1 = user1.createDocument("First Document");
        Document doc2 = user1.createDocument("Second Document");

    }
}