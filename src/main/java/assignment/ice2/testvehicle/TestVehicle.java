/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package assignment.ice2.testvehicle;

/**
 *
 * @author Admin
 */
public class TestVehicle {

    
    //This is a comment, lmao
    
    public static void main(String[] args) {
        System.out.println("Starting...");
        
        Vehicle vehicle1 =  new Vehicle("test", "diesel", "blue");
        Car car1 =  new Car("test1", "diesel", "green");
        Bus bus1 =  new Bus("test2", "diesel", "yellow");
        Truck truck1 =  new Truck("test", "diesel", "blue", 100);
        
        System.out.println(vehicle1.toString());
        System.out.println(car1.toString());
        System.out.println(bus1.toString());
        System.out.println(truck1.toString());
        
    }
}
