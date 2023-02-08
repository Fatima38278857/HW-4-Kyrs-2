public class Car  extends Transport <GroupB> implements Competing{


    public Car() {

    }

    public Car(String make, String model, double engineCapacity, GroupB driver) {
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
        System.out.println( getMake()+ " Заехал на пит-стоп");
    }

    @Override
    public void bestTimeLap() {
        System.out.println( getMake()+ "Лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " );
    }

    @Override
    public String toString() {
        return "Транспортным средством " + super.toString();
    }
}






