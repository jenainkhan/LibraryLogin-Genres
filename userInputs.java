public class userInputs {

    //initialize vars
    String firstName;
    String lastName;
    String userID;
    String libraryID;

    int year;

    //create get method
    public void getData(String fName, String lName, String uID, String lID, int yr) {
        firstName = fName;
        lastName = lName;
        userID = uID;
        libraryID = lID;
        year = yr;

    }

    //set data method to print all vars
    public void setData() {

        System.out.println("User's First Name: " + firstName);
        System.out.println("User's Last Name: " + lastName);
        System.out.println("User's ID: " + userID);
        System.out.println("User's Library ID: " + libraryID);
        System.out.println("Current Year: " + year);

    }
}
