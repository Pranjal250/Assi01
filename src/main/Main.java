package main;

import defination.SinglyLinkedList;
import person.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        SinglyLinkedList<Person> list = new SinglyLinkedList<>();
        boolean flag = true;
       /* do{
            System.out.println(" Welcome to Pranjal jain's Contact list App\n +" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contact\n"+
                    "Press 3 to search for a contact\n"+
                    "Press 4 to delete a contact\n"+
                    "Press 5 to exit program");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:

                    break;
            }
        }*/
    }

    public static SinglyLinkedList addContact(SinglyLinkedList list, ArrayList list1, ArrayList list2) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        String s;
        System.out.println("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person\n" +
                "First Name:");
        String fName = sc.nextLine();
        person.setfName(fName);
        list2.add(fName);
        System.out.println("Last Name");
        String lName = sc.nextLine();
        person.setlName(lName);
        list1.add(fName + " " + lName);
        System.out.println("Contact Number: ");
        long phoneNumber = sc.nextLong();
        person.setPhoneNumber(phoneNumber);
        sc.nextLine();
        do {
            System.out.print("Would you like to add another contact number? (y/n):");
            s = sc.next();
            if (s.equalsIgnoreCase("y")) {
                System.out.println("Contact Number: ");
                long phoneNumber1 = sc.nextLong();
                person.setPhoneNumber(phoneNumber1);
            }
        } while (s.equalsIgnoreCase("y"));
        sc.nextLine();
        System.out.println("Would you like to add email address? (y/n):");
        s = sc.next();
        sc.nextLine();
        if (s.equalsIgnoreCase("y")) {
            System.out.println("Email Address: ");
            String email = sc.nextLine();
            person.setEmail(email);
        }
        list.add(person);
        Collections.sort(list1);
        Collections.sort(list2);
        return list;
    }
}
