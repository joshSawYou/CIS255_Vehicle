// Model class
class FordF250 extends FordModels {
    protected String modelName;



   public FordF250(String modelName, MakeType makeType, VehicleType vehicleType, int doorCount, EngineType engineType, String color, int year) {
      super(makeType, vehicleType, doorCount, engineType, color, year);
      this.modelName = modelName;
   }

   public void displayInfo() {
   String make = this.makeType.toString();
        String vehicleType = this.vehicleType.toString();
        String model = this.modelName;
        String year = String.valueOf(this.year);
        String engineType = this.engineType.toString();
        String doorCount = String.valueOf(this.doorCount);
        String color = this.color;

        String row = make + "|" + vehicleType + "|" + model + "|" + year + "|" + engineType + "|" + doorCount + "|" + color;
        System.out.println(row);

   }
}
