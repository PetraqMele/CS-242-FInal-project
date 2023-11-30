package final_folder;
import java.util.Scanner;
public class main {

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
        
        
	}

}
