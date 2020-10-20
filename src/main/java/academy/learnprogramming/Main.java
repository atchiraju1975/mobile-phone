package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Contact> contacts = new ArrayList<>();
    public static void main(String[] args) {

       Contact tempContact1 = new Contact("Srinivas","1212341234");
       contacts.add(tempContact1);
       boolean verifyContacts = true;

       // MobilePhone srinisMobile = new MobilePhone();

        while(verifyContacts){

            int enteredChoice = 0;
            System.out.println("Welcome To Your Mobile Phone");
            System.out.println("1. List All Contacts");
            System.out.println("2. Add New Contact");
            System.out.println("3. Modify Existing Contact");
            System.out.println("4. Delete A Contact");
            System.out.println("5. Search A Contact");
            System.out.println("0. Quit The Application");
            System.out.println("Enter Your Choice : ");

            boolean isNumberEntered = scanner.hasNextInt();
            if(isNumberEntered){
            enteredChoice = scanner.nextInt();
            scanner.nextLine();
            }
            else{
                System.out.println("Incorrect Choice Entered, So Quitting the Application");
                verifyContacts = false;
                break;
            }

            switch (enteredChoice){

                case 2:
                    System.out.println("Enter Name : ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Mobile Number : ");
                    String number = scanner.nextLine();
                    Contact tempContact = new Contact(name,number);
                        contacts.add(tempContact);
                    break;
                case 1:

//                    for(int i=0;i<contacts.size();i++){
//                        System.out.println("Name : "+contacts.get(i).getName());
//                        System.out.println(" Mobile Number : "+contacts.get(i).getMobileNumber());
//                    }

                    for(Contact c : contacts){
                        System.out.println("Name : "+c.getName());
                        System.out.println("Mobile Number : "+c.getMobileNumber());
                    }

                    break;
                case 3:
                    boolean modifyContactFound = false;
                    int index = 0;
                    System.out.println("Enter Name To Modify : ");
                    String nameToModify = scanner.nextLine();
                    for (Contact d : contacts){
                        if (d.getName().equals(nameToModify)){
                        index = contacts.indexOf(d);
                        modifyContactFound = true;
                        }
                    }
                    if(modifyContactFound) {
                        System.out.println("Enter New Name : ");
                        String newName = scanner.nextLine();
                        System.out.println("Enter New Mobile Number : ");
                        String newNumber = scanner.nextLine();
                        Contact modifiedContact = new Contact(newName, newNumber);
                        contacts.set(index, modifiedContact);
                        System.out.println("contact "+nameToModify+" Modified Successfully");
                    }
                    if(!modifyContactFound){
                        System.out.println("Apologies Contact "+nameToModify+" not found");
                    }
                    break;
                case 4:
                    int indexToDelete = 0;
                    boolean contactFound = false;
                    System.out.println("Enter Contact to Delete : ");
                    String nameToDelete = scanner.nextLine();
                    for(Contact e: contacts){
                        if (e.getName().equals(nameToDelete)){
                            indexToDelete = contacts.indexOf(e);
                            contactFound = true;
                        }
                    }
                    if(contactFound) {
                        contacts.remove(indexToDelete);
                        System.out.println("Contact "+nameToDelete+" is deleted successfully");
                    }
                    if(!contactFound){
                        System.out.println("Sorry Contact "+nameToDelete+" not found");
                    }
                    break;
                case 5:

               //     int indexToSearch = 0;
                    boolean contactToDeleteFound = false;
                    System.out.println("Enter the Name to Search : ");
                    String nameToSearch = scanner.nextLine();

                    for(Contact f: contacts){
                        if(f.getName().equals(nameToSearch)){
                    //        indexToSearch= contacts.indexOf(f);
                            contactToDeleteFound = true;
                            System.out.println("Name of Contact : "+f.getName());
                            System.out.println("Number of Contact :"+f.getMobileNumber());
                        }
                    }

                    if (!contactToDeleteFound){
                        System.out.println("Sorry Contact " +nameToSearch+" not found");
                    }

                    break;
                case 0:
                    verifyContacts = false;
                    break;

            }

        }


    }

}
