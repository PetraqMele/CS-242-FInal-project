package final_folder;
import java.util.Scanner;

public class main {
    
    boolean exit = false; 

    public static void initialMenu() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("   Welcome to Space database ");
        System.out.println("            menu             ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static void printMenu() {
        System.out.println("\n~~~~Choose options below~~~");
        System.out.println("[1]~~~~Planets~~~~~~~~~~~~~~~");
        System.out.println("[2]~~~~~Space quiz~~~~~~~~~~~");
        System.out.println("[3]~~~~~rocket ship game~~~~~");
        System.out.println("[4]~~~~~Exit~~~~~~~~~~~~~~~~~");
    
    }

    public static void printSpaceOptionMenu(){
        System.out.println("\n~~~~Welcome to the data base~~~");
        System.out.println("[1]Planets");
        System.out.println("[2]Random Fact");
        System.out.println("[3]Add Planets");
        System.out.println("[4]Remove Planets");
    }

    public static void printSpaceQuizOptions(){
        System.out.println("\n~~~~Quiz Yourself!~~~");
	     int astral = (int)(Math.random() * 10); 
        Scanner responses = new Scanner(System.in); 
        String resultA = responses.nextLine();
       
        
        
        switch(astral) {
           case 0:
	   exit = true;
	break; 
		case 1:
                System.out.println("Question 1: Is the suns gravity greater than Jupiter");
                System.out.println("\n True or false: ");
                System.out.println("\n (a) - true"); 
                System.out.println("\n (b) - false"); 
                if (resultA == "a") {
                    System.out.println("\n -false");}
                    else {
                        System.out.println("\n -true"); 
                    }
            break; 
            
             case 2:
            System.out.println("Question 2: Is Mercury the hottest planet in our Solar System");
                System.out.println("\n True or false: ");
                System.out.println("\n (a) - false"); 
                System.out.println("\n (b) - true"); 
                if (resultA == "a") {
                    System.out.println("\n - false");}
                    else {
                        System.out.println("\n - true"); 
                    }
                 break; 
            
             case 3:
            System.out.println("Question 3: Is Venus the hottest planet in the Solar System ");
                System.out.println("\n True or false: ");
                System.out.println("\n (a) - true"); 
                System.out.println("\n (b) - false"); 
                if (resultA == "a") {
                    System.out.println("\n - false");}
                    else {
                        System.out.println("\n - true"); 
                 break; 
            
             case 4:
            System.out.println("Question 4: Does the Moon affect the Earth's tide");
                System.out.println("\n True or false: ");
                System.out.println("\n (a) - false"); 
                System.out.println("\n (b) - true"); 
                if (resultA == "a") {
                    System.out.println("\n - true");}
                    else {
                        System.out.println("\n - false"); 
                    }
                 break; 
            
             case 5:
            System.out.println("Question 5: How many sattelites does Mars have ");
                System.out.println("\n True or false: ");
                System.out.println("\n (a) - 3"); 
                System.out.println("\n (b) - 8"); 
                if (resultA == "b") {
                    System.out.println("\n - true");}
                    else {
                        System.out.println("\n - false"); 
                    }
                 break; 
            
             case 6:
            System.out.println("Question 5: How many sattelites does Mars have ");
                System.out.println("\n True or false: ");
                System.out.println("\n (a) - 3"); 
                System.out.println("\n (b) - 8"); 
                if (resultA == "b") {
                    System.out.println("\n - true it is 8 stattelites");}
                    else {
                        System.out.println("\n - incorrect"); 
                    }
                 break; 
            
             case 7:
            System.out.println("Question 6: Since Jupiter 10 hours a earth day but is a year on Jupiter 12 years Earth years?");
                System.out.println("\n True or false: ");
                System.out.println("\n (a) - Yes 1 year on Jupiter is 12 Earth years"); 
                System.out.println("\n (b) - No 1 year on Jupiter is actually 16 Earth years"); 
                if (resultA == "a") {
                    System.out.println("\n - correct");}
                    else {
                        System.out.println("\n - incorrect"); 
                    }
                 break; 
            
             case 8:
            System.out.println("Question 7: Does Saturn have a surface 'not including its core'");
                System.out.println("\n True or false: ");
                System.out.println("\n (a) - true"); 
                System.out.println("\n (b) - false"); 
                if (resultA == "a") {
                    System.out.println("\n - correct");}
                    else {
                        System.out.println("\n - incorrect"); 
                    }
                 break; 
            
             case 9:
            System.out.println("Question 8: Is Oberon the furthest moon from Uranus");
                System.out.println("\n True or false: ");
                System.out.println("\n (a) - false"); 
                System.out.println("\n (b) - true"); 
                if (resultA == "b") {
                    System.out.println("\n - correct Oberon is the furthest moon from Uranus");}
                    else {
                        System.out.println("\n - incorrect"); 
                    }
                 break; 
              case 10:
            System.out.println("Question 9: Can Neptune support human life");
                System.out.println("\n True or false: ");
                System.out.println("\n (a) - true, Neptune can support human life"); 
                System.out.println("\n (b) - false, it can not support human life"); 
                if (resultA == "b") {
                    System.out.println("\n - correct, Neptune can not support human life ");}
                    else {
                        System.out.println("\n - incorrect, Neptune can not support human life"); 
                    }
                 break;
            defualt: 
            System.out.println("try again"); 
        }
    }


    public static void printRocketShipGameOptions(){
        System.out.print("Welcome to the Rocket Ship!");
    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        //Creating all the planets
        Planet Sun = new Planet();
        Sun.setDistanceFromSun(0);
        Sun.setRadius(0);
        Sun.setName("Sun");
        Planet Mercury = new Planet();
        Mercury.setDistanceFromSun(58000000);
        Mercury.setRadius(2440);
        Mercury.setName("Mercury");
        Planet Venus = new Planet();
        Venus.setDistanceFromSun(108000000);
        Venus.setRadius(6051);
        Venus.setName("venus");
        Planet Earth = new Planet();
        Earth.setDistanceFromSun(150000000);
        Earth.setRadius(6371);
        Earth.setName("Earth");
        Planet Mars = new Planet();
        Mars.setDistanceFromSun(228000000);
        Mars.setRadius(3390);
        Mars.setName("Mars");
        Planet Jupiter = new Planet();
        Jupiter.setDistanceFromSun(778000000);
        Jupiter.setRadius(69911);
        Jupiter.setName("Jupiter");
        Planet Saturn = new Planet();
        Saturn.setDistanceFromSun(1400000000);
        Saturn.setRadius(58232);
        Saturn.setName("Saturn");
        Planet Uranus = new Planet();
        Uranus.setDistanceFromSun(2900000000L);
        Uranus.setRadius(25362);
        Uranus.setName("Uranus");
        Planet Neptune = new Planet();
        Neptune.setDistanceFromSun(4500000000L);
        Neptune.setRadius(24622);
        Neptune.setName("Neptune");
        System.out.println(Earth.getGravity());
        
        Node n1 = new Node(Sun);
        Node n2 = new Node(Mercury);
        Node n3 = new Node(Venus);
        Node n4 = new Node(Earth);
        Node n5 = new Node(Mars);
        Node n6 = new Node(Jupiter);
        Node n7 = new Node(Saturn);
        Node n8 = new Node(Uranus);
        Node n9 = new Node(Neptune);

        SortedList solarSystem = new SortedList();
        solarSystem.append(n1);
        solarSystem.append(n2);
        solarSystem.append(n3);
        solarSystem.append(n4);
        solarSystem.append(n5);
        solarSystem.append(n6);
        solarSystem.append(n7);
        solarSystem.append(n8);
        solarSystem.append(n9);
        System.out.println(Earth.getDistanceFromSun());
        
        solarSystem.printList();
        initialMenu();
        printMenu();
        int userChoice = -1;
        while(userChoice != 4){
            if (userChoice == 1){
                printSpaceOptionMenu();
                int secondUserChoice = scan.nextInt();
                    if (secondUserChoice == 1){
                        System.out.println(1);
                    }

                    
                
            }

            else if (userChoice == 2){
                printSpaceQuizOptions();
            }

            else if (userChoice == 3){
                printRocketShipGameOptions();
            }
        }

        if (userChoice == 4){
            System.out.println("Application closed Successfully!");
        }
	}

}
