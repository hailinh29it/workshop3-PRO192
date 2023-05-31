
package carmanager_Part1;

/**
 *
 * @author Nguyen Hai Linh
 */
public class Car {
    // tao attribute
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;

    public Car() {
    }
 // khoi tao constructor
    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake) {
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }
// getter va setter
    public String getColour() {
        return Colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public boolean isParkingBrake() {
        return ParkingBrake;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }
    // tao phuong thuc 
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    public void pressAcceleratorButton(){
     System.out.println("You have pressed the Accelerator button");
    }
    // tao phuong thuc in ra tat ca gia tri of field
    public void output(){
        System.out.println("The Colour: "+getColour());
        System.out.println("The Engine Power: "+getEnginePower());
        System.out.println("The Convertible: "+ isConvertible());
        System.out.println("the ParkingBrake: "+isParkingBrake());
    
    }
}
