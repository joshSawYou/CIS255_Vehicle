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
           
    // Prompt user for door count
      System.out.print("Enter door count: ");
      int doorCount = scanner.nextInt();
    // Prompt user for year
      System.out.print("Enter year: ");
      int year = scanner.nextInt();
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
    // Prompt user for vehicle type
      System.out.println("Select Vehicle Type:");
      System.out.println("1. Truck");
      System.out.println("2. Sedan");
      System.out.println("3. Coupe");
      System.out.print("Enter your choice: ");
      int typeChoice = scanner.nextInt();
   
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
      Vehicle vehicle = null;
      switch (makeChoice) {
         case 1:
            makeType = MakeType.FORD;
            vehicle = Make.sendToModel(scanner, makeChoice, makeType, typeChoice, doorCount, engineType, color, year);
            break;
         case 2:
            makeType = MakeType.TOYOTA;
            vehicle = Make.sendToModel(scanner, makeChoice, makeType, typeChoice, doorCount, engineType, color, year);
            break;
         case 3:
            makeType = MakeType.DODGE;
            vehicle = Make.sendToModel(scanner, makeChoice, makeType, typeChoice, doorCount, engineType, color, year);
            break;
         case 4:
            makeType = MakeType.HONDA;
           vehicle = Make.sendToModel(scanner, makeChoice, makeType, typeChoice, doorCount, engineType, color, year);
            break;
         case 5:
            makeType = MakeType.TESLA;
            vehicle = Make.sendToModel(scanner, makeChoice, makeType, typeChoice, doorCount, engineType, color, year);
            break;
         default:
            System.out.println("Invalid choice. Vehicle creation failed.");
            break;
      }
   
   
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
