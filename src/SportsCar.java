class SportsCar extends Vehicle{
    int maxSpeed; // the maximum speed of a sports car.
    SportsCar(int p, int f, int c, int speed) {
        super(p, f, c);
        maxSpeed = speed;
    }

    //Access methods for variable maxSpeed
    int getMaxSpeed(){
        return maxSpeed;
    }
    void setMaxSpeed(int speed){
        maxSpeed = speed;
    }
}
