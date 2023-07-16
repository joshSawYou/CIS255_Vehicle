import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Enum for Engine Type
enum EngineType {
   GASOLINE, DIESEL, ELECTRIC
}
// enum for make
enum MakeType {
   FORD, TOYOTA, DODGE, HONDA, TESLA
}
// enum for vehicle type
enum VehicleType {
   SEDAN, COUPE, TRUCK
}

// Vehicle class
class Vehicle {
   protected int doorCount;
   protected EngineType engineType;
   protected String color;

   public Vehicle(int doorCount, EngineType engineType, String color) {
      this.doorCount = doorCount;
      this.engineType = engineType;
      this.color = color;
   }

   public void displayInfo() {
      System.out.println("Vehicle:");
      System.out.println("Door Count: " + doorCount);
      System.out.println("Engine Type: " + engineType);
      System.out.println("Color: " + color);
   }
}

// Make class
class Make extends Vehicle {
   protected MakeType makeType;

   public Make(MakeType makeType, int doorCount, EngineType engineType, String color) {
      super(doorCount, engineType, color);
      this.makeType = makeType;
   }

   public void displayInfo() {
      super.displayInfo();
      System.out.println("Make: " + makeType);
   }
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

// Model class
class Model extends Make {
   private String modelName;
   protected int year;

   public Model(String modelName, MakeType makeType, int year, int doorCount, EngineType engineType, String color) {
      super(makeType, doorCount, engineType, color);
      this.modelName = modelName;
      this.year = year;
   }

   public void displayInfo() {
      super.displayInfo();
      System.out.println("Model: " + modelName);
      System.out.println("Year: " + year);
   }
}


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
     // adds ".csv" to filename if it doesnt exist
      if (!fileName.endsWith(".csv")) {
         fileName += ".csv";
      }
      // Creates file to save to
      File file = new File(fileName);
      FileWriter writer = new FileWriter(file);
   
      // Writes header
      writer.write("Type|DoorCount|EngineType|Color\n");
   
      // Write vehicle details
      for (Vehicle vehicle : vehicles) {
         // gets type
         String vehicleType = vehicle.getClass().getSimpleName();
         // gets door count
         String doorCount = String.valueOf(vehicle.doorCount);
         // gets engine type
         String engineType = vehicle.engineType.toString();
         // gets color
         String color = vehicle.color;
         // writes all above info into file
         // Each row will be terminated with New-Line character
         writer.write(vehicleType + "|" + doorCount + "|" + engineType + "|" + color + "\n");
      }
      // closes file
      writer.close();
      //prints file name for dev purposes
      System.out.println("Vehicles saved to file: " + fileName);
   }
}
// FordRanger class
abstract class FordRanger extends Model {
   public FordRanger(int year, EngineType engineType, int doorCount, String color) {
      super("Ranger", MakeType.FORD, year, doorCount, engineType, color);
   }
}

// FordF150 class
abstract class FordF150 extends Model {
   public FordF150(int year, EngineType engineType, int doorCount, String color) {
      super("F-150", MakeType.FORD, year, doorCount, engineType, color);
   }
}

// FordF250 class
abstract class FordF250 extends Model {
   public FordF250(int year, EngineType engineType, int doorCount, String color) {
      super("F-250", MakeType.FORD, year, doorCount, engineType, color);
   }
}

// FordTaurus class
abstract class FordTaurus extends Model {
   public FordTaurus(int year, EngineType engineType, int doorCount, String color) {
      super("Taurus", MakeType.FORD, year, doorCount, engineType, color);
   }
}

// FordFusion class
abstract class FordFusion extends Model {
   public FordFusion(int year, EngineType engineType, int doorCount, String color) {
      super("Fusion", MakeType.FORD, year, doorCount, engineType, color);
   }
}

// FordFiesta class
abstract class FordFiesta extends Model {
   public FordFiesta(int year, EngineType engineType, int doorCount, String color) {
      super("Fiesta", MakeType.FORD, year, doorCount, engineType, color);
   }
}

// FordMustang class
abstract class FordMustang extends Model {
   public FordMustang(int year, EngineType engineType, int doorCount, String color) {
      super("Mustang", MakeType.FORD, year, doorCount, engineType, color);
   }
}

// DodgeRam1500 class
abstract class DodgeRam1500 extends Model {
   public DodgeRam1500(int year, EngineType engineType, int doorCount, String color) {
      super("Ram 1500", MakeType.DODGE, year, doorCount, engineType, color);
   }
}

// DodgeRam2500 class
abstract class DodgeRam2500 extends Model {
   public DodgeRam2500(int year, EngineType engineType, int doorCount, String color) {
      super("Ram 2500", MakeType.DODGE, year, doorCount, engineType, color);
   }
}

// DodgeCharger class
abstract class DodgeCharger extends Model {
   public DodgeCharger(int year, EngineType engineType, int doorCount, String color) {
      super("Charger", MakeType.DODGE, year, doorCount, engineType, color);
   }
}

// DodgeDart class
abstract class DodgeDart extends Model {
   public DodgeDart(int year, EngineType engineType, int doorCount, String color) {
      super("Dart", MakeType.DODGE, year, doorCount, engineType, color);
   }
}

// DodgeChallenger class
abstract class DodgeChallenger extends Model {
   public DodgeChallenger(int year, EngineType engineType, int doorCount, String color) {
      super("Challenger", MakeType.DODGE, year, doorCount, engineType, color);
   }
}

// ToyotaTundra class
abstract class ToyotaTundra extends Model {
   public ToyotaTundra(int year, EngineType engineType, int doorCount, String color) {
      super("Tundra", MakeType.TOYOTA, year, doorCount, engineType, color);
   }
}

// ToyotaTacoma class
abstract class ToyotaTacoma extends Model {
   public ToyotaTacoma(int year, EngineType engineType, int doorCount, String color) {
      super("Tacoma", MakeType.TOYOTA, year, doorCount, engineType, color);
   }
}

// ToyotaCorolla class
abstract class ToyotaCorolla extends Model {
   public ToyotaCorolla(int year, EngineType engineType, int doorCount, String color) {
      super("Corolla", MakeType.TOYOTA, year, doorCount, engineType, color);
   }
}

// ToyotaCamry class
abstract class ToyotaCamry extends Model {
   public ToyotaCamry(int year, EngineType engineType, int doorCount, String color) {
      super("Camry", MakeType.TOYOTA, year, doorCount, engineType, color);
   }
}

// ToyotaAvalon class
abstract class ToyotaAvalon extends Model {
   public ToyotaAvalon(int year, EngineType engineType, int doorCount, String color) {
      super("Avalon", MakeType.TOYOTA, year, doorCount, engineType, color);
   }
}

// HondaRidgeline class
abstract class HondaRidgeline extends Model {
   public HondaRidgeline(int year, EngineType engineType, int doorCount, String color) {
      super("Ridgeline", MakeType.HONDA, year, doorCount, engineType, color);
   }
}

// HondaInsight class
abstract class HondaInsight extends Model {
   public HondaInsight(int year, EngineType engineType, int doorCount, String color) {
      super("Insight", MakeType.HONDA, year, doorCount, engineType, color);
   }
}

// HondaAccord class
abstract class HondaAccord extends Model {
   public HondaAccord(int year, EngineType engineType, int doorCount, String color) {
      super("Accord", MakeType.HONDA, year, doorCount, engineType, color);
   }
}

// HondaCivic class
abstract class HondaCivic extends Model {
   public HondaCivic(int year, EngineType engineType, int doorCount, String color) {
      super("Civic", MakeType.HONDA, year, doorCount, engineType, color);
   }
}

// TeslaModelS class
abstract class TeslaModelS extends Model {
   public TeslaModelS(int year, EngineType engineType, int doorCount, String color) {
      super("Model S", MakeType.TESLA, year, doorCount, engineType, color);
   }
}

// TeslaModel3 class
abstract class TeslaModel3 extends Model {
   public TeslaModel3(int year, EngineType engineType, int doorCount, String color) {
      super("Model 3", MakeType.TESLA, year, doorCount, engineType, color);
   }
}

public class CIS255_Vehicle {
   public static void main(String[] args) throws IOException {
      // creates instance of the vehicle storage list
      VehicleStorage vehicleStorage = new VehicleStorage();
      // creates instance of the scanner for input
      Scanner scanner = new Scanner(System.in);
      
      boolean exit = false;
      // while loop to print the options and prompt user to enter their choice
      while (!exit) {
         System.out.println("Main Menu");
         System.out.println("1. Create Vehicle");
         System.out.println("2. Show Vehicles");
         System.out.println("3. Save to File");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         // saves users input/choice
         int choice = scanner.nextInt();
         //switch case for wihch option they chose and the corresponding action
         switch (choice) {
            // creates vehicle
            case 1:
               createVehicle(vehicleStorage, scanner);
               break;
            // displays the vehicles in the current list
            case 2:
               vehicleStorage.displayVehicles();
               break;
            // saves the file
            case 3:
               saveToFile(vehicleStorage, scanner);
               break;
            // exits
            // This case is the only Exception for leading to a full Exit from the App
            case 4:
               exit = true;
               break;
            // prints for invalid input
            default:
               System.out.println("Invalid choice. Please try again.");
         }
         
         System.out.println();
      }
   }
   // method for creating the vehicle
   private static void createVehicle(VehicleStorage vehicleStorage, Scanner scanner) {
      // prints options for type and prompts user for choice
      System.out.println("Select Vehicle Type:");
      System.out.println("1. Sedan");
      System.out.println("2. Coupe");
      System.out.println("3. Truck");
      System.out.print("Enter your choice: ");
      // saves users choice
      int typeChoice = scanner.nextInt();
      // prompts user for door count
      System.out.print("Enter door count: ");
      //saves users input for door count
      int doorCount = scanner.nextInt();
      
      // prints options for engine type and prompts user for choice
      System.out.println("Select Engine Type:");
      System.out.println("1. Gasoline");
      System.out.println("2. Diesel");
      System.out.println("3. Electric");
      
      System.out.print("Enter your choice: ");
      // saves users choice
      int engineChoice = scanner.nextInt();
      // saves users input as the engine type according to the int they chose (-1 for indexing in the enum)
      EngineType engineType = EngineType.values()[engineChoice - 1];
      // prompts user for choice of color
      System.out.print("Enter color: ");
      // saves users choice
      String color = scanner.next();
      // creates instance of vehicle
      Vehicle vehicle;
      //switch case for wihch type they chose and saves the corresponding vehicle
      switch (typeChoice) {
         // saves as sedan
         case 1:
            vehicle = new Type(VehicleType.SEDAN, doorCount, engineType, color);
            break;
         // saves as Coupe
         case 2:
            vehicle = new Type(VehicleType.COUPE, doorCount, engineType, color);
            break;
         // saves as Truck
         case 3:
            vehicle = new Type(VehicleType.TRUCK, doorCount, engineType, color);
            break;
         // for invalid input
         default:
            System.out.println("Invalid choice. Vehicle creation failed.");
            return;
      }
      // saves this vehicle to the vehicle storage list
      vehicleStorage.addVehicle(vehicle);
      System.out.println("Vehicle created successfully.");
   }
   // method for saving vehicle to file
   private static void saveToFile(VehicleStorage vehicleStorage, Scanner scanner) throws IOException {
      // prompts user for the filename
      System.out.print("Enter the file name: ");
      // saves and users input
      String fileName = scanner.next();
      // saves list to file
      vehicleStorage.saveToFile(fileName);
   }
}

