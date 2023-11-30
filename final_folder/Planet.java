package final_folder;
import java.lang.Math;
public class Planet {
    //planet attributes
    private double size;//This will be in Kilometers
    private double mass;//This will be in Kilograms
    private double radius = size/2;

    //planet constructor
    public Planet(){
        size = 6378.1;
        mass = 5.97219 * Math.pow(10,24);
    }

    //Setter method for size
    public void setSize(double size){
        this.size = size;
    }

    //getter method for size
    public double getSize(){
        return size;
    }

    //getting the Gravity of a planet
    public double getGravity(){
        double gravity = (6.67430 * Math.pow(10,-11))*(mass/Math.pow(radius,2));//formula for gravity G(Mass/Radius^2)
        return gravity;
    }
}
