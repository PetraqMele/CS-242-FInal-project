package final_folder;
import java.util.Scanner;
public class main {

    public static void printList(SortedList list){
        Node node = list.head;
		while (null != node) {
			System.out.print(node.getPlanet() + " ");
			node = node.getNext();
		}
		System.out.println();
    }

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
    }

    public static void printSpaceQuizOptions(){
        
    }

    public static void printRocketShipGameOptions(){

    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        //Creating all the planets
        Planet Sun = new Planet();
        Planet Mercury = new Planet();
        Planet Venus = new Planet();
        Planet Earth = new Planet();
        Planet Mars = new Planet();
        Planet Jupiter = new Planet();
        Planet Saturn = new Planet();
        Planet Uranus = new Planet();
        Planet Neptune = new Planet();
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
        
        printList(solarSystem);
        initialMenu();
        printMenu();

        while()
	}

}
