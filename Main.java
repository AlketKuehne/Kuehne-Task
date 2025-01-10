public class Main {

    public static void outputExample() {
    // Introduction and my goal
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
        int sum1 = 100 * 5; // 500 (100 * 5)
        int sum2 = sum1 / 2; // 250 (500 / 2)
        int sum3 = sum2 + sum1; // 750 (250 + 500)
        System.out.println("Sum1= " + sum1 ); // Sum1 = 500
        System.out.println("Sum2= " + sum2 ); // Sum2 = 250
        System.out.println("Sum3= " + sum3 ); // Sum3 = 750 
    }

    public static void mathExample() {
        // "Math." commands
        System.out.println(Math.max(200, 201)); // Picks the higher number                 (201)
        System.out.println(Math.min(200,201));  // Picks the lower number                  (200)
        System.out.println(Math.sqrt(81));        // Calculates the squareroot               (9)
        System.out.println(Math.abs(-322));         // Returns the number positive             (322)
        System.out.println(Math.random() * 101);    // Picks a random number between 0 - 100   (???)
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
        int age = 29;    
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
        String[] cars = {"Ferrari", "Mercedes-Benz", "Lamborghini", "Porsche", "BMW", "Audi"}; 
        for(int i = 0; i < cars.length; i++) { // 
            System.out.println(cars[i]);
        }
    }

    public static void main(String[] args) {
    // Runs everything 
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
    }
}