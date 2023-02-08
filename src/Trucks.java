public class Trucks  extends Transport <GroupD> implements Competing {
    public Trucks() {
    }

    public Trucks(String make, String model, double engineCapacity, GroupD driver) {
        super(make, model, engineCapacity, driver);
    }


    public void startMoving() {
        System.out.println("Hачать движение");
    }

    public void finishMovement() {
        System.out.println("Остановить движение");
    }

    @Override
    public void pitStop() {
        System.out.println();
    }

    @Override
    public void bestTimeLap() {

    }

    @Override
    public void maxSpeed() {

    }

    @Override
    public String toString() {
        return "Транспортным средством " + super.toString();
    }


}
