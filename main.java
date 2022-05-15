//Created by Jenain Khan
//Library login and genre system that allows users to login and see subgenres of the main 5 genres.

import java.util.Scanner;


public class main {


    public static void main(String[] args) {
        //create object of scanner class
        Scanner obj = new Scanner(System.in);

        //user menu
        int userChoice = 0;


        while (!(userChoice >= 3)) {

            System.out.println("\n Enter 1 to login, Enter 2 to go to book catalog: \n");
            userChoice = obj.nextInt();

            if (userChoice == 1) {
                userInputs obj1 = new userInputs();

                System.out.println("Enter first name: ");
                obj1.firstName = obj.nextLine();
                obj1.firstName = obj.nextLine();

                System.out.println("Enter last name: ");
                obj1.lastName = obj.nextLine();

                System.out.println("Enter User ID: ");
                obj1.userID = obj.nextLine();

                System.out.println("Enter Library ID: ");
                obj1.libraryID = obj.nextLine();

                System.out.println("Enter current year: ");
                obj1.year = obj.nextInt();

                obj1.getData(obj1.firstName, obj1.lastName, obj1.userID, obj1.libraryID, obj1.year);
                obj1.setData();
            } else if (userChoice == 2) {
                departments obj2 = new departments();

                obj2.Fiction();
                obj2.Nonfiction();
                obj2.Drama();
                obj2.Poetry();
                obj2.Folktale();

            }

        }

    }
}

