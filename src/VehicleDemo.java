public class VehicleDemo {
    public static void main(String[] args) {
        // Create multiple Truck class objects
        Truck semiTrailer = new Truck(2, 200, 7, 44000);
        Truck pickupTruck = new Truck(3, 28, 15, 2000);
        // Create SportsCar class object
        SportsCar sportsCar = new SportsCar(2, 27, 6, 186);

        System.out.println("*** TRUCKS ***");
        double gallons;
        int distance = 252;
        gallons = semiTrailer.fuelVolume(distance);
        System.out.println("The semi-trailer can carry " + semiTrailer.getCargoCapacity()
                + " pounds");
        System.out.println("A semi-trailer requires " + gallons + " gallons of fuel to travel "
                + distance + " miles");
        gallons = pickupTruck.fuelVolume(distance);
        System.out.println("The pickup truck can carry " + pickupTruck.getCargoCapacity()
                + " pounds");
        System.out.println("A pickup truck requires " + gallons + " gallons of fuel to travel "
                + distance + " miles");
        System.out.println("*** SPORTS CAR ***");
        gallons = sportsCar.fuelVolume(distance);
        System.out.println("The sports car's top speed is " + sportsCar.maxSpeed + "mph.");
        System.out.println("To carry " + sportsCar.getPassengers() + " passengers " + distance
                + " miles, the sports car requires " + gallons + " gallons of fuel.");
    }
}