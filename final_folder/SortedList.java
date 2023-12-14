package final_folder;

public class SortedList {
   public Node head;
   public Node tail;

   public SortedList(){
      head = null;
      tail = null;
   }

   public void append(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
   }

   

   public void printList() {
      Node node = head;
      while (node != null) {
         System.out.print(node.getPlanet() + " ");
         node = node.next;
      }
      System.out.println();
   }

   public void printPlanetData(Node currentPlanet){
      System.out.println("Current Planet: " + currentPlanet.getPlanet().toString());
      System.out.println("Radius: " + currentPlanet.getPlanet().getRadius());
      System.out.println("Mass: " + currentPlanet.getPlanet().getMass() + " x 10^24");
      System.out.println("Distance from the Sun: " + currentPlanet.getPlanet().getDistanceFromSun());
      System.out.println("Color of the Planet: " + currentPlanet.getPlanet().getColor());
      System.out.println("Temperature of the Planet: " + currentPlanet.getPlanet().getTemperature());
      System.out.println("Does this planet contain water? " + currentPlanet.getPlanet().getContainsWater());
  }

   }
