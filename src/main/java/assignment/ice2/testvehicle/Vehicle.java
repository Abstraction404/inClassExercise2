/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.ice2.testvehicle;

/**
 *
 * @author Admin
 */
public class Vehicle 
{
    public String make;
    public String fuel;
    public String colour;
    
    public Vehicle(String vehicleMake,
                   String vehicleFuel, 
                   String vehicleColour)
    {
        this.make = vehicleMake;
        this.fuel = vehicleFuel;
        this.colour = vehicleColour;
    }
    
    @Override
    public String toString() 
    {
        return "Make: " + make + 
                ", Fuel: " + fuel + 
                ", Colour: " + colour;
    }
}
