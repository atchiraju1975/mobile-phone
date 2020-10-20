package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {

    private static ArrayList<Contact> myContacts = new ArrayList<>();

    public MobilePhone(ArrayList<Contact> contacts) {
        this.myContacts = contacts;
    }

    public ArrayList<Contact> getContacts() {
        return myContacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.myContacts = contacts;
    }




}
