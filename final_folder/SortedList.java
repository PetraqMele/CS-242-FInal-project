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

   public void insertionSortDoublyLinked() {
      Node currentNode = head.next;
      while (currentNode != null) {
         Node nextNode = currentNode.next;
         Node searchNode = currentNode.previous;
            
         while (searchNode != null && searchNode.getPlanet().getDistanceFromSun() > currentNode.getPlanet().getDistanceFromSun())
            searchNode = searchNode.previous;
         
         // Remove and re-insert currentNode
         remove(currentNode);
         if (searchNode == null) {
            currentNode.previous = null;
            prepend(currentNode);
         }
         else {
            insertAfter(searchNode, currentNode);
         }
   
         // Advance to next node
         currentNode = nextNode;
      }
   }

   public void prepend(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         newNode.next = head;
         head.previous = newNode;
         head = newNode;
      }
   }

   public void insertAfter(Node currentNode, Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else if (currentNode == tail) {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      else {
         Node successor = currentNode.next;
         newNode.next = successor;
         newNode.previous = currentNode;
         currentNode.next = newNode;
         successor.previous = newNode;
      }
   }
   
   public void remove(Node currentNode) {
      Node successor = currentNode.next;
      Node predecessor = currentNode.previous;
         
      if (successor != null)
         successor.previous = predecessor;
            
      if (predecessor != null)
         predecessor.next = successor;
            
      if (currentNode == head)
         head = successor;
            
      if (currentNode == tail)
         tail = predecessor;
   }

   
   

   public void printList() {
      Node node = head;
      while (node != null) {
         System.out.print(node.getPlanet() + " ");
         node = node.next;
      }
      System.out.println();
   }

   public void printDetailedList(){
      Node node = head;
      int position = 1;
      while (node != null) {
         System.out.print(position + ". ");
         printPlanetData(node);
         System.out.println();
         position++;
         node = node.next;
      }
      System.out.println();
   }


   public void printPlanetData(Node currentPlanet){
      System.out.println("Current Planet: " + currentPlanet.getPlanet().toString());
      System.out.println("Radius: " + currentPlanet.getPlanet().getRadius() + " Kilometers");
      System.out.println("Mass: " + currentPlanet.getPlanet().getMass() + " x 10^24");
      System.out.println("Distance from the Sun: " + currentPlanet.getPlanet().getDistanceFromSun() + " Kilometers");
      System.out.println("Color of the Planet: " + currentPlanet.getPlanet().getColor());
      System.out.println("Temperature of the Planet: " + currentPlanet.getPlanet().getTemperature() + " Degrees Celcius");
      System.out.println("Does this planet contain water? " + currentPlanet.getPlanet().getContainsWater());
  }

   }
