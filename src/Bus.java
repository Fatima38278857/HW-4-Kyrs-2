public class Bus  extends Transport <GroupC> implements Competing{


    public Bus() {

    }

    public Bus(String make, String model, double engineCapacity, GroupC driver) {
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
        System.out.println("Пит-стоп");
    }

    @Override
    public void bestTimeLap() {
        System.out.println("Лучшие время из тех кто учавствовал");
    }

    @Override
    public void maxSpeed() {

    }

    @Override
    public String toString() {
        return "Транспортным средством " + super.toString();
    }



}

