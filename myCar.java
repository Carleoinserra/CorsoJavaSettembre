public class myCar {


public static void main(String[] args) {
    Car myFastCar = new Car("Renault");
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    Car MyAuto = new Car("Renalut");
    MyAuto.modelName = "Megane";
    System.out.println(MyAuto.brand + " " + MyAuto.modelName);
    
  }}
