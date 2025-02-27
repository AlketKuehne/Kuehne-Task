import java.util.ArrayList;                 // Imports Arraylist class; dynamic list
import java.util.Collections;               // Imports Collections class; contains methods of sorting and modifying collections
import java.util.HashMap;
import java.util.Iterator;                  // Imports Iterator interface; allows to iterate over collections such as lists and sets
import java.util.regex.Matcher;             // Imports Matcher class; which is used to perform matching operations on strings
import java.util.regex.Pattern;             // Imports Pattern class; creates Matcher for matching strings
import java.util.Scanner;                   // Imports Scanner class; to get user input from the console
import java.time.LocalDateTime;             // Imports LocalDateTime class; that can track your local time
import java.time.format.DateTimeFormatter;  // Imports DateTimeFormatter class; that formats ur date & time output
import java.util.HashMap;                   // Imports HashMap class; 

@SuppressWarnings("unused")

public class Main {

    public static void outputExample() {
    /* Introduction and my goal
    lines below print out the */
        System.out.println("        Hello!");
        System.out.println("      I'm Alket."); 
        System.out.println("   I'm 17 years old");
        System.out.println("   and I'm going to");
        System.out.println("  be 18 at 10th January.");
        System.out.println("  Right now im trying to");
        System.out.println(" learn java from scratch.");
    }

    public static void variablesExample() {
        // Data about me
        String name = "Alket";
        String surname = "Rrushi";
        String fullName = name + " " + surname;
        String adress = "Eleonorastraße 12";
        int age = 18;
        float balance = 4578.21f;
        char currency = '€';
        // Table like execution format
        System.out.println("Name:         " + fullName);       
        System.out.println("Age:          " + age);
        System.out.println("Adress:       " + adress);
        System.out.println("Bank-Balance: " + balance + " " + currency);
    }

    public static void operatorExample() {
        // Some math with different operators
        int sum1 = 100 * 5;                     // 500 (100 * 5)
        int sum2 = sum1 / 2;                    // 250 (500 / 2)
        int sum3 = sum2 + sum1;                 // 750 (250 + 500)
        System.out.println("Sum1= " + sum1 );   // Sum1 = 500
        System.out.println("Sum2= " + sum2 );   // Sum2 = 250
        System.out.println("Sum3= " + sum3 );   // Sum3 = 750 
    }

    public static void mathExample() {
        // "Math." commands
        System.out.println(Math.max(200, 201));     // Picks the higher number                 (201)
        System.out.println(Math.min(200,201));      // Picks the lower number                  (200)
        System.out.println(Math.sqrt(81));            // Calculates the squareroot               (9)
        System.out.println(Math.abs(-322));             // Returns the number positive             (322)
        System.out.println(Math.random() * 101);        // Picks a random number between 0 - 100   (???)
    }

    public static void booleansExample() {
        // Boolean command can be used for quizzes
        boolean javaIsFun = true;            // Sets "javaIsFun" as true
        boolean spinachIsTasty = false;      // Sets "spinachIsTasty" as false
        System.out.println(javaIsFun);       // Outprints true
        System.out.println(spinachIsTasty);  // Outprints false
    }

    public static void ifElseExample() {
        // This machine checks ur age if you are allowed to drink
        int age = 18;    
        if (age < 18) {                                   // If you are below the age of 18 you are only allowed to drink beer
            System.out.println("You can only drink beer!");      
        }    
        else if (age > 64) {                              // If you are over the age of 64 it tells you to not drink too much
            System.out.println("Not too much grandpa!");
        }
        else if (age < 16) {                              // If you are below the age of 16 it tells you that you arent allowed to drink anything 
            System.out.println("You are not allowed to drink!!");
        }
        else if (age < 6) {                               // If you are below the age oh 6 it tells you that you are a baby
            System.out.println("You are a baby!!!");
        }
        else {                                            // If You are above the age of 18 you are allowed to drink freely
            System.out.println("You can drink.");
        }    
    }

    public static void switchExample() {
        // Enter a day and it tells you what weekday it is in January 2025
        int day = 78;
        switch (day) {
            case 6, 13, 20, 27:                                   // Any of these cases are monday's
            System.out.println("Monday");
            break;
            case 7, 14, 21, 28:                                   // Any of these cases are Tuesday's
            System.out.println("Tuesday");
            break; 
            case 1, 8, 15, 22, 29:                                // Any of these cases are Wednesday's
            System.out.println("Wednesday");
            break;
            case 2, 9, 16, 23, 30:                                // Any of these cases are Thursday's
            System.out.println("Thursday");
            break;
            case 3, 10, 17, 24, 31:                               // Any of these cases are Friday's
            System.out.println("Friday");
            break;
            case 4, 11, 18, 25:                                   // Any of these cases are Saturday's
            System.out.println("Saturday");
            break;
            case 5, 12, 19, 26:                                   // Any of these cases are Sunday's
            System.out.println("Sunday");
            break;
            default: System.out.println("Not a valid day!");    // Any Date that is not listed are invalid days
        }
  
    }
    
    public static void loopExample() {
        // Countdown for my birthday
        int countdown = 10;                          // Counts down from 10
        while (countdown > 0) {                      // Until it hits 0
            System.out.println(countdown);           // This prints out the numbers from 10 to 0
            countdown--;
        }
        System.out.println("Happy Birthday!!!");   
        /** When the timer reaches 1 instead of 
        zero it prints out "Happy Birthday" */
    }
    
    public static void breakContinueExample() {
    /* Continue: Breaks the selected number (for this case 4) and continues with the rest
    while break just breaks the code from an selected case and doesnt continue*/
        for (int i = 0; i < 10; i++) {     // Code counts to from 0 to 10
            if (i == 4) {                  // Selected number that is selected to break is 4
                continue;                  // Command "breaks" the number 4 and continues from 5
            }
            System.out.println(i);         // Prints out the numbers except 4 because of the "continue" command
        }  
    }
      
    public static void arraysExample() {
    // Lists car brands that are given
        String[] cars = {"Ferrari", "Mercedes-Benz", "Lamborghini", "Porsche", "BMW", "Audi"};  // Cars that are being listed
        for(int i = 0; i < cars.length; i++) {  
            System.out.println(cars[i]);                                                        // Writes down the car brands
        }
    }

    public static void listSortingExample() {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();    // Creates the Arraylist "myNumbers" and stores only Integers
        // Code below adds six numbers to the "myNumbers" List
        myNumbers.add(1000);
        myNumbers.add(256);
        myNumbers.add(160);
        myNumbers.add(20);
        myNumbers.add(4);
        myNumbers.add(0);
    
        Collections.sort(myNumbers, Collections.reverseOrder());    // Sorts the numbers in the list in descending order
    
        for (int i : myNumbers) {   // Scans the numbers that will be in the list
            System.out.println(i);  // The scanned valid numbers are being printed
        }
    }

    public static void iteratorExample() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();  // Creates Arraylist that only stores Integers
        // Code below are the given values
        numbers.add(10);
        numbers.add(8);
        numbers.add(9);
        numbers.add(100);
        
        // Creates an iterator to iterate through the list
        Iterator<Integer> it = numbers.iterator();
        
        // Loops through the list and iterates
        while (it.hasNext()) {
            Integer i = it.next();
            // Removes values less than 10
            if (i < 10) {
                it.remove();
            }
        }
        
        // Prints the edited list
        System.out.println(numbers); 
    }

    public static void regExExample() {
        Pattern pattern = Pattern.compile("P", Pattern.CASE_INSENSITIVE); // Type anything you want between the ""
        Matcher matcher = pattern.matcher("Password"); // The word that is to match
        // Check if the "P" matches with "Password"
        boolean matchFound = matcher.find();
        // Print result
        if (matchFound) {
            System.out.println("Match found");  // If it matches with password it prints out "Match found"
        } else {
            System.out.println("Match not found");  // If it matches with password it prints out "Match not found"
        }
    }

    public static void scannerExample() {
        try (Scanner myObj = new Scanner(System.in)) {  // Creates an scanner that gets users input from the console
            // Code below is simply just to print out text
            System.out.println("Im going to show you a magic trick now!");
            System.out.println("Think of any comination:");
            String userName = myObj.nextLine(); // Except this, this is for reading your input and saving it
            System.out.println("You are thinking of the combination " + userName + " am I correct?");
        }
    }

    public static void enumsExample() {
        enum Level {    // "Level" is the name of the enum
        // Code below are the values of this enum
            LOW,
            MEDIUM,
            HIGH
        }
        Level myVar = Level.HIGH;   // Decides what message is going to be shown when you adjust the "Level.HIGH" part
        switch(myVar) {
            // Different cases for the values
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }

    public static void dateTimeExample() {
        // Gets the current Date and Time using LocalDateTime import
        LocalDateTime myDateObj = LocalDateTime.now();  // Gets Date and Time from System clock
        // Format of the Date and Time pattern
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // "dd--MM-yyyy" = day-month-year and "HH:mm:ss" = hour:minute:secound
        String formattedDate = myDateObj.format(myFormatObj);   
        System.out.println("Todays Date and Time: " + formattedDate); // Prints out the Message and always the current time when printed out
    }

    public static void hashMapExample() {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
    
        for (String i : people.keySet()) {
            System.out.println("Name: " + i + " Age: " + people.get(i));
        }
    }
    
    public static void main(String[] args) {
    // Executes every method that is given in this code below
        System.out.println("### First Example ###");
        Main.outputExample();
        
        System.out.println(" ");
        System.out.println("### Second Example ###");
        Main.variablesExample();

        System.out.println(" ");
        System.out.println("### Third Example ###");
        Main.operatorExample();

        System.out.println(" ");
        System.out.println("### Fourth Example ###");
        Main.mathExample(); 

        System.out.println(" ");
        System.out.println("### Fifth Example ###");
        Main.booleansExample();

        System.out.println(" ");
        System.out.println("### Sixth Example ###");
        Main.ifElseExample();

        System.out.println(" ");
        System.out.println("### Seventh Example ###");
        Main.switchExample();

        System.out.println(" ");
        System.out.println("### Eighth Example ###");
        Main.loopExample();

        System.out.println(" ");
        System.out.println("### Ninth Example ###");
        Main.breakContinueExample();

        System.out.println(" ");
        System.out.println("### Tenth Example ###");
        Main.arraysExample();
        
        System.out.println(" ");
        System.out.println("### Eleventh Example ###");
        Main.listSortingExample();

        System.out.println(" ");
        System.out.println("### Twelfth Example ###");
        Main.iteratorExample();

        System.out.println(" ");
        System.out.println("### Thirteenth Example ###");
        Main.regExExample();

        System.out.println(" ");
        System.out.println("### Fourteenth Example ###");
        Main.scannerExample();

        System.out.println(" ");
        System.out.println("### Fifteenth Example ###");
        Main.enumsExample();

        System.out.println(" ");
        System.out.println("### Sixteenth Example ###");
        Main.dateTimeExample();

        System.out.println(" ");
        System.out.println("### Seventeenth Example ###");
        Main.hashMapExample();
    }
}