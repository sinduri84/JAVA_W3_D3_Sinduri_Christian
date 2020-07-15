package Sinduri.A2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Long> phoneBook = new HashMap<String, Long>();

        phoneBook.put("Minerva", 1234567890L);
        phoneBook.put("Hella", 7534567890L);
        phoneBook.put("Ahalya", 8934567890L);

        Scanner inputNumber = new Scanner(System.in);
        Scanner inputLongNumber = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        boolean input = true;
        while (input) {
            System.out.print("\nPress 1 to add a new contact" +
                    "\nPress 2 to find the phone number of a person" +
                    "\nPress 3 to update a person name or phone number" +
                    "\nPress 4 to delete a contact" +
                    "\nPress 5 to print all contacts" +
                    "\nOption: ");

            int inputOption = inputNumber.nextInt();
            switch(inputOption) {
                case 1:
                    System.out.print("Enter the name of the person: ");
                    String inputName1 = inputText.nextLine();
                    System.out.print("Enter the number of the person: ");
                    Long inputValue1 = inputLongNumber.nextLong();
                    if(phoneBook.containsKey(inputName1)) {
                        System.out.println("Contact already exists. Do you want to update the number? Yes/No?");
                        String inputTextOption = inputText.nextLine();
                        if(inputTextOption.equals("Yes")) {
                            phoneBook.put(inputName1, inputValue1);
                            System.out.println("Contact Updated!");
                        }
                    } else {
                        phoneBook.put(inputName1, inputValue1);
                        System.out.println("New Contact Added!");
                    }
                    break;
                case 2:
                    System.out.print("Enter the name of the contact you want to find: ");
                    String inputName2 = inputText.nextLine();
                    Long numberName2 = phoneBook.get(inputName2);
                    String recrodValue = (numberName2 != null) ? ("The number of the contact, " + inputName2 +  " is " + numberName2) : ("Cannot find the contact " + inputName2 + ".");
                    System.out.println(recrodValue);
                    break;
                case 3:
                    System.out.print("Enter the name of the person to update: ");
                    String inputName3 = inputText.nextLine();
                    if(phoneBook.get(inputName3) != null) {
                        System.out.print("Do you want to update the name or number of the contact? \nPress 1 to update the name or Press 2 to update the number or Press 3 to update both: ");
                        int inputUpdateOption = inputNumber.nextInt();
                        switch(inputUpdateOption) {
                            case 1:
                                System.out.print("Enter the new name of the contact: ");
                                String inputNewName31 = inputText.nextLine();
                                Long phoneContact = phoneBook.remove(inputName3);
                                phoneBook.put(inputNewName31, phoneContact);
                                System.out.println("Contact Updated!");
                                break;
                            case 2:
                                System.out.print("Enter the new number of the person: ");
                                Long inputValue32 = inputNumber.nextLong();
                                phoneBook.replace(inputName3, inputValue32);
                                System.out.println("Contact Updated!");
                                break;
                            case 3:
                                System.out.print("Enter the new name of the contact: ");
                                String inputNewName3 = inputText.nextLine();
                                System.out.print("Enter the new number of the person: ");
                                Long inputValue33 = inputNumber.nextLong();
                                phoneBook.remove(inputName3);
                                phoneBook.put(inputNewName3, inputValue33);
                                System.out.println("Contact Updated!");
                                break;
                            default:
                                System.out.println("Wrong option selected");
                                break;
                        }
                    } else {
                        System.out.println("No contact found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter the name of the contact to delete: ");
                    String inputName4 = inputText.nextLine();
                    if(phoneBook.get(inputName4) != null) {
                        phoneBook.remove(inputName4);
                        System.out.println("Contact Deleted!");
                    } else {
                        System.out.println("No contact found!");
                    }

                    break;
                case 5:
                    Iterator iterate = phoneBook.entrySet().iterator();
                    System.out.printf("%n%n%-32s %-32s %n", "Person Name", "Phone Number");
                    while (iterate.hasNext()) {
                        Map.Entry phonePair = (Map.Entry) iterate.next();
                        System.out.printf("%-32s %-32d %n", phonePair.getKey(), phonePair.getValue());
                    }
                    break;
                default:
                    System.out.println("We are done!");
                    input = false;
                    break;
            }
         }


    }
}
