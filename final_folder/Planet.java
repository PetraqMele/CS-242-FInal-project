package final_folder;
import java.lang.Math;
public class Planet {
    //planet attributes
    private double radius;
    private double mass;//This will be in Kilograms
    private long distanceFromSun;
    private String name;
    private String color;
    private double temperature;
    private boolean containsWater;
    //planet constructor
    public Planet(){
        radius = -1;
        mass = -1;
        distanceFromSun = -1;
        name = "";
        color = "";
        temperature = -1;
        containsWater = false;

    }

    public Planet(double radius, double mass, long distanceFromSun, String name, String color,  double temperature,  boolean containsWater){
        this.radius = radius;
        this.distanceFromSun = distanceFromSun;
        this.name = name;
        this.color = color;
        this.temperature = temperature;
        this.containsWater = containsWater;
    }

    //Setter method for size
    public void setRadius(double radius){
        this.radius = radius;
    }

    //getter method for size
    public double getRadius(){
        return radius;
    }

    //getting the Gravity of a planet
    public double getGravity(){
        double gravity = (6.67430 * Math.pow(10,-11))*(mass/Math.pow(radius,2));//formula for gravity G(Mass/Radius^2)
        return gravity;
    }

    public double getDistanceFromSun(){
        return distanceFromSun;
    }

    public void setDistanceFromSun(long distance){
        distanceFromSun = distance;
    }

    public void setName(String planetName){
        name = planetName;
    }

    public String toString(){
        return name + "";
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
    }

    public double getTemperature(){
        return temperature;
    }

    public void setContainswater(boolean containsWater){
        this.containsWater = containsWater;
    }

    public boolean getContainsWater(){
        return containsWater;
    }
    
    public void setMass(double mass){
        this.mass = mass;
    }
    
    public double getMass(){
        return mass;
    }
    
}