package final_folder;
import java.math.BigInteger;
import java.util.Scanner;

public class main {
    
    
    static boolean exit = false;

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
        System.out.println("[3]~~~~~Exit~~~~~~~~~~~~~~~~~");
    
    }

    public static void printSpaceOptionMenu(){
        System.out.println("\n~~~~Welcome to the data base~~~");
        System.out.println("[1]Manage Planets");
        System.out.println("[2]Add Planets");
        System.out.println("[3]Remove Planets");
        System.out.println("[4]Back");
    }
 
        public static void printSpaceQuizOptions(){
            System.out.println("\n~~~~Quiz Yourself!~~~");
            
            Scanner responses = new Scanner(System.in); 
            int numOfQuestions = 0;
            String resultA;
            int finalScore = 0;
            
            while (numOfQuestions < 5) {
                
            int astral = (int)(Math.random() * 10);        

            switch(astral) {
               case 0:
                exit = true;
        break; 
            case 1:
                    System.out.println("Question 1: Is the suns gravity greater than Jupiter");
                    System.out.println("\n True or false: ");
                    System.out.println("\n (a) - true"); 
                    System.out.println("\n (b) - false"); 

                    resultA = responses.nextLine();
                    if (resultA == "a") {
                        System.out.println("\n -false");}
                        else {
                            System.out.println("\n -true"); 
                            numOfQuestions++;
                            finalScore++;
                        }
                break; 
                
            case 2:
                System.out.println("Question 2: Is Mercury the hottest planet in our Solar System");
                    System.out.println("\n True or false: ");
                    System.out.println("\n (a) - false"); 
                    System.out.println("\n (b) - true"); 
                    resultA = responses.nextLine();
                    if (resultA == "a") {
                        System.out.println("\n - false");}
                        else {
                            System.out.println("\n - true");
                            numOfQuestions++;
                            finalScore++; 
                        }
                     break; 
                
            case 3:
                System.out.println("Question 3: Is Venus the hottest planet in the Solar System ");
                    System.out.println("\n True or false: ");
                    System.out.println("\n (a) - true"); 
                    System.out.println("\n (b) - false"); 
                    resultA = responses.nextLine();
                    if (resultA == "a") {
                        System.out.println("\n - false");}
                        else {
                            System.out.println("\n - true");
                            numOfQuestions++;
                            finalScore++;
                        } 
                     break; 
                
            case 4:
                System.out.println("Question 4: Does the Moon affect the Earth's tide");
                    System.out.println("\n True or false: ");
                    System.out.println("\n (a) - false"); 
                    System.out.println("\n (b) - true"); 
                    resultA = responses.nextLine();
                    if (resultA == "a") {
                        numOfQuestions++;
                        finalScore++;
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
                    resultA = responses.nextLine();
                    if (resultA == "b") {
                        System.out.println("\n - true");
                        numOfQuestions++;
                            finalScore++;}
                        else {
                            System.out.println("\n - false"); 
                        }
                     break; 
                
            case 6:
                System.out.println("Question 5: How many sattelites does Mars have ");
                    System.out.println("\n True or false: ");
                    System.out.println("\n (a) - 3"); 
                    System.out.println("\n (b) - 8"); 
                    resultA = responses.nextLine();
                    if (resultA == "b") {
                        System.out.println("\n - true it is 8 stattelites");
                    numOfQuestions++;
                            finalScore++;}
                        else {
                            System.out.println("\n - incorrect"); 
                        }
                     break; 
                
            case 7:
                System.out.println("Question 6: Since Jupiter 10 hours a earth day but is a year on Jupiter 12 years Earth years?");
                    System.out.println("\n True or false: ");
                    System.out.println("\n (a) - Yes 1 year on Jupiter is 12 Earth years"); 
                    System.out.println("\n (b) - No 1 year on Jupiter is actually 16 Earth years"); 
                    resultA = responses.nextLine();
                    if (resultA == "a") {
                        System.out.println("\n - correct");
                    numOfQuestions++;
                            finalScore++;}
                        else {
                            System.out.println("\n - incorrect"); 
                        }
                     break; 
                
            case 8:
                System.out.println("Question 7: Does Saturn have a surface 'not including its core'");
                    System.out.println("\n True or false: ");
                    System.out.println("\n (a) - true"); 
                    System.out.println("\n (b) - false"); 
                    resultA = responses.nextLine();
                    if (resultA == "a") {
                        System.out.println("\n - correct");
                    numOfQuestions++;
                            finalScore++;}
                        else {
                            System.out.println("\n - incorrect"); 
                        }
                     break; 
                
            case 9:
                System.out.println("Question 8: Is Oberon the furthest moon from Uranus");
                    System.out.println("\n True or false: ");
                    System.out.println("\n (a) - false"); 
                    System.out.println("\n (b) - true"); 
                    resultA = responses.nextLine();
                    if (resultA == "b") {
                        System.out.println("\n - correct Oberon is the furthest moon from Uranus");
                    numOfQuestions++;
                            finalScore++;}
                        else {
                            System.out.println("\n - incorrect"); 
                        }
                     break; 
            case 10:
                System.out.println("Question 9: Can Neptune support human life");
                    System.out.println("\n True or false: ");
                    System.out.println("\n (a) - true, Neptune can support human life"); 
                    System.out.println("\n (b) - false, it can not support human life"); 
                    resultA = responses.nextLine();
                    if (resultA == "b") {
                        System.out.println("\n - correct, Neptune can not support human life ");
                    numOfQuestions++;
                            finalScore++;}
                        else {
                            System.out.println("\n - incorrect, Neptune can not support human life"); 
                        }
                     break;
                default: 
                System.out.println("try again"); 
            }
        }
            System.out.println("Final Score: " + finalScore + "/" + numOfQuestions);
        }


    

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        //Creating all the planets
        Planet Sun = new Planet(700000,1988500,0,"Sun","White",10000,false);
        Sun.setMass(1988501);
        Planet Mercury = new Planet(2440, 0.33, 58000000, "Mercury", "Grey", 333, false);
        Mercury.setMass(0.33);
        Planet Venus = new Planet(6051, 4.87, 108000000, "Venus", "Red", 867, false);
        Venus.setMass(4.87);

        Planet Earth = new Planet();
        Earth.setDistanceFromSun(150000000);
        Earth.setRadius(6371);
        Earth.setName("Earth");
        Earth.setTemperature(59);
        Earth.setContainswater(true);
        Earth.setColor("Green and Blue");
        Earth.setMass(5.97);

        Planet Mars = new Planet();
        Mars.setDistanceFromSun(228000000);
        Mars.setRadius(3390);
        Mars.setName("Mars");
        Mars.setColor("Red");
        Mars.setContainswater(true);
        Mars.setMass(0.642);
        Mars.setTemperature(-85);

        Planet Jupiter = new Planet();
        Jupiter.setDistanceFromSun(778000000);
        Jupiter.setRadius(69911);
        Jupiter.setName("Jupiter");
        Jupiter.setColor("Brown");
        Jupiter.setContainswater(true);
        Jupiter.setMass(1898);
        Jupiter.setTemperature(-166);

        Planet Saturn = new Planet();
        Saturn.setDistanceFromSun(1400000000);
        Saturn.setRadius(58232);
        Saturn.setName("Saturn");
        Saturn.setColor("Brown");
        Saturn.setContainswater(false);
        Saturn.setMass(568);
        Saturn.setTemperature(-220);

        Planet Uranus = new Planet();
        Uranus.setDistanceFromSun(2900000000L);
        Uranus.setRadius(25362);
        Uranus.setName("Uranus");
        Uranus.setColor("Blue");
        Uranus.setContainswater(true);
        Uranus.setMass(86.8);
        Uranus.setTemperature(-320);

        Planet Neptune = new Planet();
        Neptune.setDistanceFromSun(4500000000L);
        Neptune.setRadius(24622);
        Neptune.setName("Neptune");
        Neptune.setColor("Blue");
        Neptune.setContainswater(true);
        Neptune.setMass(102);
        Neptune.setTemperature(-330);


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
        
        
        solarSystem.printList();
        
        int topLevelChoice;

        do {
            
            initialMenu();
            printMenu();

            System.out.print("Enter your choice: ");

            topLevelChoice = scan.nextInt();

            switch (topLevelChoice) {
                case 1:
                    
                    printSpaceOptionMenu();
                    int secondlevelChoice;
                    do{
                        secondlevelChoice = scan.nextInt();
                        switch (secondlevelChoice) {
                            case 1:
                            
                                solarSystem.printDetailedList();
                                printSpaceOptionMenu();
                                break;
                            case 2:

                                System.out.println("Before we add this planet there is some information we need: ");
                                System.out.println("What is the planets approximate distance from the sun in Kilometers: ");
                                long tempDistFromSun = scan.nextLong();
                                System.out.println("What is the planets radius?");
                                int tempRadius = scan.nextInt();
                                System.out.println("What is the name of this planet?");
                                String tempName = scan.next();
                                System.out.println("What is the color(s) of this planet?");
                                String tempColor = scan.next();
                                System.out.println("Does this planet contain water? (true or false)");
                                boolean tempContainsWater = scan.nextBoolean();
                                System.out.println("What is the mass of this planet? (This is in 10^24)");
                                int tempMass = scan.nextInt();
                                System.out.println("What is the average temperature of this planet?");
                                int tempTemperature = scan.nextInt();

                                Planet tempPlanet = new Planet(tempRadius, tempMass, tempDistFromSun, tempName, tempColor, tempTemperature, tempContainsWater);
                                Node tempNode = new Node(tempPlanet);
                                solarSystem.append(tempNode);
                                solarSystem.insertionSortDoublyLinked();
                                solarSystem.printList();
                                printSpaceOptionMenu();
                                break;
                            case 3:

                                System.out.println("Which planet would you like to remove?");
                                solarSystem.printList();
                                String planetToRemove = scan.next();
                                
                                solarSystem.remove(findPlanet(n1, planetToRemove));
                                solarSystem.printList();
                                printSpaceOptionMenu();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid choice. PLease try again.");
                        }
                    }while(secondlevelChoice != 4);
                    break;
                    //end of main menu case 1
                    //start of case 2
                case 2:
                    printSpaceQuizOptions();
                    break;
                    //end of main menu case 2
                    //start of case 3
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                    //end of case 3
                    //default
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (topLevelChoice != 3);

        scan.close();
    }
    
    private static Node findPlanet(Node current, String planetToRemove) {
        if (current == null){
            return null;
         }
         if (current.getPlanet().getName().equals(planetToRemove)){
            return current;
         }
            return findPlanet(current.next, planetToRemove);
      }
    }
    



    
       

