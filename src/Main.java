public class Main {
    public static void main(String[] args) {

        Car toyota =  new Car("Toyota", "SA",3.5, new GroupB("Sasha", true, 12.));

        Bus gaz = new Bus("Gazel", "PA1", 3.4, new GroupC("Dasha", true, 10.));

        Trucks kama = new Trucks("Камаз","BH",5.5, new GroupD("Vova", true, 25.));

        toyota.pitStop();
        toyota.maxSpeed(179);
        kama.maxSpeed(180);
        gaz.startMoving();
        kama.bestTimeLap(" 6,39 секунд");

        System.out.println(toyota.getDriver().toString() + " " + " Управляет" + " " + toyota + " " + "и будет учавствовать в гонке");
        System.out.println(gaz.getDriver().toString() + " " + " Управляет" + " " + gaz + " " + "и будет учавствовать в гонке");
        System.out.println(kama.getDriver().toString() + " " + " Управляет" + " " + kama + " " + "и будет учавствовать в гонке");


    }
}