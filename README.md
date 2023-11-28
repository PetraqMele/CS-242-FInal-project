# CS-242-FInal-project(not apart of the code)

Create Final project (not apart of the code)
import java.util.Arrays;
import java.util.Scanner;
public class Main {


	public void disInitial() {
		System.out.print("~--------------------------------------------~");
		System.out.print("|---Welcome to the space activity database---|");
		System.out.print("~--------------------------------------------~");
	}
	public void disUser() {
		System.out.print("~-------Choose options below-----~");
		System.out.print("|[1]-----Space questions---------|");
		System.out.print("|[2]-----Rocket ship simulation--|");
		System.out.print("|[3]-----weight in other planets-|");
		System.out.print("|[4]-----------Exit--------------|");
		System.out.print("~--------------------------------~");
	}


 
	public static int[] distance(int a, int oriSpace[], int v) {
		int b;
		
	
int tempArr[] = new int[a+1];
for(b = 0; b < a; b++) {
	tempArr[b] = oriSpace[b];
	tempArr[a] = b;
}


return tempArr;
		
	}

	public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);
	//Original distance from the sun of the planets array in our solar system
	int[] oriSpace = {29, 66, 91, 127, 460, 839, 1710, 2770}; 
	int a = 8;
	//input of distance of planet
	int tempDistance = myObj.nextInt(); 
	int v = tempDistance;
	//string of planet name
	String tempPlanets = myObj.nextLine();
	
	
	//calling method 
	
	oriSpace = distance(a, oriSpace, v);
	
	
	//printing user commands
	System.out.println("type the name of the planet and the distance of the planet to the sun");
	System.out.print(v + "millions of miles");
	System.out.print(tempPlanets);
	
	//printing int method
	System.out.print(oriSpace);
	System.out.println("new array\n" + Arrays.toString(oriSpace));

 
	Menu menu = new Menu();
	menu.printdisIntial();
	menu.printdisUser();
	}
}
