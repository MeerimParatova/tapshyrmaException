public class Main {
public static void main(String[ ] args) {
    try {
        Car car = new Car();
        car.drive();
        car.close();
    }
    catch (Exception e){
        System.out.println("tuura emes");
    }

}
}