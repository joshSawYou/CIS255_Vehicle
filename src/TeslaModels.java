import java.util.Scanner;
public class TeslaModels extends Make{
   public TeslaModels(MakeType makeType, VehicleType vehicleType, int doorCount, EngineType engineType, String color, int year) {
      super(makeType, vehicleType, doorCount, engineType, color, year);
   }
   public static Vehicle promptForModel(Scanner scanner, MakeType makeType, int typeChoice, int doorCount,  EngineType engineType, String color, int year) {
       
      VehicleType vehicleType = null; // Initialize with null
      Vehicle vehicle = null;
      switch (typeChoice) {
         case 1:
            System.out.println("There are no Tesla Trucks in this database.");
             return null;//break;
         case 2:
            System.out.println("Select Tesla Sedan Model by number:");
            vehicleType = VehicleType.SEDAN;
            System.out.println("1. Model S");
            System.out.println("2. Model 3");
           
            System.out.print("Enter your choice: ");
            int teslaSedanModelChoice = scanner.nextInt();
         
            switch (teslaSedanModelChoice) {
               case 1:  
                  return vehicle = new TeslaModel_S("Model S", makeType.TESLA, vehicleType, doorCount, engineType, color, year);
                  //break;
               case 2:
                  return vehicle = new TeslaModel3("Model 3", makeType.TESLA, vehicleType, doorCount, engineType, color, year);
                  //break;
              
               default:
                  System.out.println("Invalid choice. Vehicle model selection failed.");
                  return null;//break;
            }
         
            
         case 3:
            System.out.println("There are no Tesla Coupes in this database.");
            return null;//break;           
                           
         default:
            System.out.println("Invalid Ford vehicle type. Vehicle creation failed.");
            return null;//break;
      }
        
   }
   
}