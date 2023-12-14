package final_folder;

public class Node {
    //Here I am creating the node constructors and methods for the planet class.
    public Planet planetData;//the data of the planet itself
    public Node next;
    public Node previous;

        public Node(Planet planetData) {//base planet node
           this.planetData = planetData;
           next = null;
           previous = null;
        
     }

        public Node(Planet planetData, Node nextNode, Node previousNode){//planet node with previous and next link
            this.planetData = planetData;
            next = null;
            previous = null; 
        }

        public Planet getPlanet(){
            return planetData;
        }

        public void setPlanet(Planet newPlanet){
            planetData = newPlanet;
        }

        public Node getNext(){
            return next;
        }

        public Node getPrevious(){
            return previous;
        }

        public void setNext(Node planet){
            next = planet;
        }

        public void setPrevious(Node planet){
            previous = planet;
        }
        
}
