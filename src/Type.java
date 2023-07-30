import java.util.Scanner;
// enum for vehicle type

enum VehicleType {
   SEDAN, COUPE, TRUCK
}
// Type class
class Type extends Vehicle {
   public VehicleType vehicleType;

   public Type(VehicleType vehicleType, int doorCount, EngineType engineType, String color, int year) {
      super(doorCount, engineType, color, year);
      this.vehicleType = vehicleType;
   }

   public void displayInfo() {
      super.displayInfo();
      System.out.println("Type: " + vehicleType);
   }
}