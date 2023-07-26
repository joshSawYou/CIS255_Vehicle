// enum for vehicle type
enum VehicleType {
   SEDAN, COUPE, TRUCK
}
// Type class
class Type extends Vehicle {
   protected VehicleType vehicleType;

   public Type(VehicleType vehicleType, int doorCount, EngineType engineType, String color) {
      super(doorCount, engineType, color);
      this.vehicleType = vehicleType;
   }

   public void displayInfo() {
      super.displayInfo();
      System.out.println("Type: " + vehicleType);
   }
}
