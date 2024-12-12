class Vehicle {
    private int passengers; // number of passengers
    private int fuelCapacity; // fuel capacity in gallons
    private int fuelConsumption; // fuel consumption in miles and gallons

    // Class constructor
    Vehicle(int p, int f, int c) {
        passengers = p;
        fuelCapacity = f;
        fuelConsumption = c;
    }

    // Method that returns the travel distance
    int range(){
        return  fuelConsumption * fuelCapacity;
    }

    /*
    Method for calculating the amount of fuel required
    to travel a given distance
     */
    double fuelVolume(int miles){
        return (double) miles / fuelConsumption;
    }

    //Methods for accessing instance variables
    int getPassengers(){
        return passengers;
    }
    void setPassengers(int p){
        passengers = p;
    }
    int getFuelCapacity(){
        return fuelCapacity;
    }
    void setFuelCapacity(int f){
        fuelCapacity = f;
    }
    int getFuelConsumption(){
        return fuelConsumption;
    }
    void setFuelConsumption(int c){
        fuelConsumption = c;
    }
}
