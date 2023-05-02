public class Main {
public static void main(String[ ] args) {
    try ( Car car = new Car()){ //трайв ресурс трайдын ичине жазуу керек
        car.drive();
    }
    catch (Exception e){
        System.out.println("tuura emes");
    }

}
}