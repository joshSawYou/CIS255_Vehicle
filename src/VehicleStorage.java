import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List; 

// Storage class for vehicles to be saved to file
class VehicleStorage {
   private List<Vehicle> vehicles;

   public VehicleStorage() {
      vehicles = new ArrayList<>();
   }

   public void addVehicle(Vehicle vehicle) {
      vehicles.add(vehicle);
   }

   public void displayVehicles() {
      for (Vehicle vehicle : vehicles) {
         vehicle.displayInfo();
         System.out.println();
      }
   }

   public void saveToFile(String fileName) throws IOException {
      if (!fileName.endsWith(".csv")) {
         fileName += ".csv";
      }
      File file = new File(fileName);
      FileWriter writer = new FileWriter(file);
   
      writer.write("Type|DoorCount|EngineType|Color|Make|Model|Year\n");
   
      for (Vehicle vehicle : vehicles) {
         String vehicleType = vehicle.getClass().getSimpleName();
         String doorCount = String.valueOf(vehicle.doorCount);
         String engineType = vehicle.engineType.toString();
         String color = vehicle.color;
         String make = "";
         String model = "";
         int year = 0;
      
         if (vehicle instanceof Make) {
            Make makeVehicle = (Make) vehicle;
            make = makeVehicle.makeType.toString();
         }
      
         if (vehicle instanceof Model) {
            Model modelVehicle = (Model) vehicle;
            model = modelVehicle.modelName;
            year = modelVehicle.year;
         }
      
         String row = vehicleType + "|" + doorCount + "|" + engineType + "|" + color + "|" + make + "|" + model + "|" + year + "\n";
         writer.write(row);
      }
   
      writer.close();
      System.out.println("Vehicles saved to file: " + fileName);
   }
}
