/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.ice2.testvehicle;

/**
 *
 * @author Admin
 */
public class Truck extends Vehicle 
{
    public int bedSize;
    
    public Truck(String truckMake, 
                String truckFuel, 
                String truckColour,
                int truckBedSize)
    {
        super(truckMake, truckFuel, truckColour);
        this.bedSize = truckBedSize;
    }
    
    @Override
    public String toString() 
    {
        return "Make: " + make + 
                ", Fuel: " + fuel + 
                ", Colour: " + colour +
                ", Bed size: " + bedSize;
    }
}
