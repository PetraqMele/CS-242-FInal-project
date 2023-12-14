package final_folder;
import java.util.Scanner;

public class main {
    
    

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
        System.out.println("[1]5 Question quiz");
        System.out.println("[2] 10 Question quiz");
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
