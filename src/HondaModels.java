import java.util.Scanner;
public class HondaModels extends Make{
 public HondaModels(MakeType makeType, VehicleType vehicleType, int doorCount, EngineType engineType, String color, int year) {
      super(makeType, vehicleType, doorCount, engineType, color, year);
   }
   public static Vehicle promptForModel(Scanner scanner, MakeType makeType, int typeChoice,  int doorCount, EngineType engineType, String color, int year) {
      
      VehicleType vehicleType = null; // Initialize with null
      Vehicle vehicle = null;
      switch (typeChoice) {
         case 1:
            System.out.println("Select Honda Truck Model by number:");
            vehicleType = VehicleType.TRUCK;
            System.out.println("1. Ridgeline");
           
          
            System.out.print("Enter your choice: ");
            int hondaTruckModelChoice = scanner.nextInt();
         
            switch (hondaTruckModelChoice) {
               case 1:
                  return vehicle = new HondaRidgeline("Ridgeline",makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
              
                              
               default:
                  System.out.println("Invalid choice. Vehicle model selection failed.");
                  return null;//break;
            }
         
         case 2:
            System.out.println("Select Honda Sedan Model by number:");
            vehicleType = VehicleType.SEDAN;
            System.out.println("1. Insight");
            System.out.println("2. Accord");
            System.out.println("3. Civic");
            System.out.print("Enter your choice: ");
            int hondaSedanModelChoice = scanner.nextInt();
         
            switch (hondaSedanModelChoice) {
               case 1:  
                  return vehicle = new HondaInsight("Insight", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
               case 2:
                  return vehicle = new HondaAccord("Accord", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
               case 3:
                  return vehicle = new HondaCivic("Civic", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
               default:
                  System.out.println("Invalid choice. Vehicle model selection failed.");
                  return null;//break;
            }
         
            
         case 3:
            System.out.println("Select Honda Coupe Model by number:");
            vehicleType = VehicleType.COUPE;
            System.out.println("1. Accord");
            System.out.println("2. Civic");
            System.out.print("Enter your choice: ");
            int hondaModelChoice = scanner.nextInt();
         
            switch (hondaModelChoice) {
               case 1:  
                  return vehicle = new HondaAccord("Accord", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
               case 2:  
                  return vehicle = new HondaCivic("Civic", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
               default:
                  System.out.println("Invalid choice. Vehicle model selection failed.");
                  return null;//break;
            }
            
         default:
            System.out.println("Invalid Ford vehicle type. Vehicle creation failed.");
            return null;//break;
      }
             }
   
}