package exam;
/**
 *
 * @author Nisanthan Kathirkamanathan
 */
abstract class Vehicle{
    
    int numberOfWheels;
    String serialNumber;
    
    public Vehicle(int numberOfWheels, String serialNumber){
        this.numberOfWheels = numberOfWheels;
        this.serialNumber = serialNumber;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    abstract public void accelerate();    
    abstract public void breaking();
}

class Car extends Vehicle{

    public Car(int numberOfWheels, String serialNumber) {
        super(numberOfWheels, serialNumber);
    }

    @Override
    public void accelerate() {
        System.out.println("Car Acceleration activated");
    }

    @Override
    public void breaking() {
        System.out.println("Car break activated");
    }
    
}

class Motorbike extends Vehicle{
    public Motorbike(int numberOfWheels, String serialNumber) {
        super(numberOfWheels, serialNumber);
    }

    @Override
    public void accelerate() {
        System.out.println("Motorbike Acceleration activated");
    }

    @Override
    public void breaking() {
        System.out.println("Motorbike break activated");
    }
}

class TestVehicle{
    public static void main(String[] args) {
        Car benz = new Car(4,"LLL-1010");
        Motorbike heroHonda = new Motorbike(2,"MMM-2010");
        benz.accelerate();
        heroHonda.accelerate();
        benz.breaking();
        heroHonda.breaking();
        
    }
}
