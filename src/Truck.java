class Truck extends Vehicle {
    int cargoCapacity; // truck load capacity.

    //Truck class constructor
    Truck(int p, int f, int c, int cargo) {
        super(p, f, c); // Initializing members of the Truck class via superclass constructor
        cargoCapacity = cargo;
    }

    // Access methods for variable cargoCapacity
    int getCargoCapacity(){
        return cargoCapacity;
    }
    void putCargoCapacity(int cargo){
        cargoCapacity = cargo;
    }
}
