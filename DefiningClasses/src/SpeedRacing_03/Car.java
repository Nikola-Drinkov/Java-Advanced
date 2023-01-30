package SpeedRacing_03;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostFor1;
    private int distance;

    public Car(String model, double fuelAmount, double fuelCostFor1) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1 = fuelCostFor1;
        this.distance = 0;
    }
    public void Drive(String CarModel, int amountOfKm){
        double neededFuel = amountOfKm*fuelCostFor1;
        if(neededFuel<=fuelAmount){
            fuelAmount-=neededFuel;
            distance+=amountOfKm;
        }
        else System.out.println("Insufficient fuel for the drive");
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d",model,fuelAmount,distance);
    }
}
