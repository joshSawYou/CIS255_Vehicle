import java.util.Scanner;

public class FordModels extends Make{
   public FordModels(MakeType makeType, VehicleType vehicleType, int doorCount, EngineType engineType, String color, int year) {
      super(makeType, vehicleType, doorCount, engineType, color, year);
   
   }
   public static Vehicle promptForModel(Scanner scanner, MakeType makeType, int typeChoice, int doorCount, EngineType engineType, String color, int year) {
      VehicleType vehicleType = null; // Initialize with null
      Vehicle vehicle = null;
      switch (typeChoice) {
         case 1:
            System.out.println("Select Ford Truck Model by number:");
            vehicleType = VehicleType.TRUCK;
            System.out.println("1. Ranger");
            System.out.println("2. F-150");
            System.out.println("3. F-250");
            System.out.print("Enter your choice: ");
            int fordTruckModelChoice = scanner.nextInt();
         
            switch (fordTruckModelChoice) {
               case 1:
                  
                  return vehicle = new FordRanger("Ranger", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
            
               case 2:
                  return vehicle = new FordF150("F150", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
            
               case 3:
                  return vehicle = new FordF250("F250", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
            
            
               default:
                  System.out.println("Invalid choice. Vehicle model selection failed.");
                  return null;//break;   
                              }
         
            
         case 2:
            System.out.println("Select Ford Sedan Model by number:");
            vehicleType = VehicleType.SEDAN;
            System.out.println("1. Taurus");
            System.out.println("2. Fusion");
            System.out.println("3. Fiesta");
            System.out.print("Enter your choice: ");
            int fordSedanModelChoice = scanner.nextInt();
         
            switch (fordSedanModelChoice) {
               case 1:  
                  return vehicle = new FordTaurus("Taurus", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
               case 2:
                  return vehicle = new FordFusion("Fusion", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
            
               case 3:
                  return vehicle = new FordFiesta("Fiesta", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
            
               default:
                  System.out.println("Invalid choice. Vehicle model selection failed.");
                  return null;               }
         
          
         case 3:
            System.out.println("Select Ford Coupe Model:");
            vehicleType =VehicleType.COUPE;
            System.out.println("1. Mustang");
            System.out.print("Enter your choice: ");
            int fordModelChoice = scanner.nextInt();
         
            switch (fordModelChoice) {
               case 1:  
                  return vehicle = new FordMustang("Mustang", makeType, vehicleType, doorCount, engineType, color, year);
                  
               default:
                  System.out.println("Invalid choice. Vehicle model selection failed.");
                  return null;
            }
         default:
            System.out.println("Invalid Ford vehicle type. Vehicle creation failed.");
            return null;
      
      }
         
      
   }
}
