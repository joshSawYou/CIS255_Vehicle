import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    // Prompt user for vehicle type
      System.out.println("Select Vehicle Type:");
      System.out.println("1. Sedan");
      System.out.println("2. Coupe");
      System.out.println("3. Truck");
      System.out.print("Enter your choice: ");
      int typeChoice = scanner.nextInt();
    
    // Prompt user for door count
      System.out.print("Enter door count: ");
      int doorCount = scanner.nextInt();
    
    // Prompt user for engine type
      System.out.println("Select Engine Type:");
      System.out.println("1. Gasoline");
      System.out.println("2. Diesel");
      System.out.println("3. Electric");
      System.out.print("Enter your choice: ");
      int engineChoice = scanner.nextInt();
      EngineType engineType;
   
    // Validate engine type choice
      switch (engineChoice) {
         case 1:
            engineType = EngineType.GASOLINE;
            break;
         case 2:
            engineType = EngineType.DIESEL;
            break;
         case 3:
            engineType = EngineType.ELECTRIC;
            break;
         default:
            System.out.println("Invalid choice. Vehicle creation failed.");
            return;
      }
    
    // Prompt user for color
      System.out.print("Enter color: ");
      String color = scanner.next();
    
    // Prompt user for make type
      System.out.println("Select Make Type:");
      System.out.println("1. FORD");
      System.out.println("2. TOYOTA");
      System.out.println("3. DODGE");
      System.out.println("4. HONDA");
      System.out.println("5. TESLA");
      System.out.print("Enter your choice: ");
      int makeChoice = scanner.nextInt();
      MakeType makeType;
   
    // Validate make type choice
      switch (makeChoice) {
         case 1:
            makeType = MakeType.FORD;
            break;
         case 2:
            makeType = MakeType.TOYOTA;
            break;
         case 3:
            makeType = MakeType.DODGE;
            break;
         case 4:
            makeType = MakeType.HONDA;
            break;
         case 5:
            makeType = MakeType.TESLA;
            break;
         default:
            System.out.println("Invalid choice. Vehicle creation failed.");
            return;
      }
    
    // Prompt user for model name based on the selected make type
      String modelName;
    
      switch (makeType) {
         case FORD:
            System.out.println("Select Ford Model:");
            System.out.println("1. Ranger");
            System.out.println("2. F-150");
            System.out.println("3. F-250");
            System.out.println("4. Taurus");
            System.out.println("5. Fusion");
            System.out.println("6. Fiesta");
            System.out.println("7. Mustang");
            System.out.print("Enter your choice: ");
            int fordModelChoice = scanner.nextInt();
         
            switch (fordModelChoice) {
               case 1:
                  modelName = "Ranger";
                  break;
               case 2:
                  modelName = "F-150";
                  break;
               case 3:
                  modelName = "F-250";
                  break;
               case 4:
                  modelName = "Taurus";
                  break;
               case 5:
                  modelName = "Fusion";
                  break;
               case 6:
                  modelName = "Fiesta";
                  break;
               case 7:
                  modelName = "Mustang";
                  break;
               default:
                  System.out.println("Invalid choice. Vehicle creation failed.");
                  return;
            }
            break;
         case TOYOTA:
            System.out.println("Select Toyota Model:");
            System.out.println("1. Tundra");
            System.out.println("2. Tacoma");
            System.out.println("3. Corolla");
            System.out.println("4. Camry");
            System.out.println("5. Avalon");
            System.out.print("Enter your choice: ");
            int toyotaModelChoice = scanner.nextInt();
         
            switch (toyotaModelChoice) {
               case 1:
                  modelName = "Tundra";
                  break;
               case 2:
                  modelName = "Tacoma";
                  break;
               case 3:
                  modelName = "Corolla";
                  break;
               case 4:
                  modelName = "Camry";
                  break;
               case 5:
                  modelName = "Avalon";
                  break;
               default:
                  System.out.println("Invalid choice. Vehicle creation failed.");
                  return;
            }
            break;
      
         case DODGE:
            System.out.println("Select Dodge Model:");
            System.out.println("1. Ram 1500");
            System.out.println("2. Ram 2500");
            System.out.println("3. Charger");
            System.out.println("4. Dart");
            System.out.println("5. Challenger");
            System.out.print("Enter your choice: ");
            int dodgeModelChoice = scanner.nextInt();
         
            switch (dodgeModelChoice) {
               case 1:
                  modelName = "Ram 1500";
                  break;
               case 2:
                  modelName = "Ram 2500";
                  break;
               case 3:
                  modelName = "Charger";
                  break;
               case 4:
                  modelName = "Dart";
                  break;
               case 5:
                  modelName = "Challenger";
                  break;
               default:
                  System.out.println("Invalid choice. Vehicle creation failed.");
                  return;
            }
            break;
      
         case HONDA:
            System.out.println("Select Honda Model:");
            System.out.println("1. Ridgeline");
            System.out.println("2. Insight");
            System.out.println("3. Accord");
            System.out.println("4. Civic");
            System.out.print("Enter your choice: ");
            int hondaModelChoice = scanner.nextInt();
         
            switch (hondaModelChoice) {
               case 1:
                  modelName = "Ridgeline";
                  break;
               case 2:
                  modelName = "Insight";
                  break;
               case 3:
                  modelName = "Accord";
                  break;
               case 4:
                  modelName = "Civic";
                  break;
               default:
                  System.out.println("Invalid choice. Vehicle creation failed.");
                  return;
            }
            break;
      
         case TESLA:
            System.out.println("Select Tesla Model:");
            System.out.println("1. Model S");
            System.out.println("2. Model 3");
            System.out.print("Enter your choice: ");
            int teslaModelChoice = scanner.nextInt();
         
            switch (teslaModelChoice) {
               case 1:
                  modelName = "Model S";
                  break;
               case 2:
                  modelName = "Model 3";
                  break;
               default:
                  System.out.println("Invalid choice. Vehicle creation failed.");
                  return;
            }
            break;
         default:
            System.out.println("Invalid choice. Vehicle creation failed.");
            return;
      }
    
    // Prompt user for year
      System.out.print("Enter year: ");
      int year = scanner.nextInt();
    
    // Create the vehicle based on the user's choices
      Vehicle vehicle;
    
      switch (typeChoice) {
         case 1:
            vehicle = new Type(VehicleType.SEDAN, doorCount, engineType, color);
            break;
         case 2:
            vehicle = new Type(VehicleType.COUPE, doorCount, engineType, color);
            break;
         case 3:
            vehicle = new Type(VehicleType.TRUCK, doorCount, engineType, color);
            break;
         default:
            System.out.println("Invalid choice. Vehicle creation failed.");
            return;
      }
    
    // Set the make and model
      vehicle = new Model(modelName, makeType, year, doorCount, engineType, color);
    
    // Add the vehicle to the storage
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

