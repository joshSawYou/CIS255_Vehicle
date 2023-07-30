import java.util.Scanner;
public class DodgeModels extends Make{
   public DodgeModels(MakeType makeType, VehicleType vehicleType, int doorCount, EngineType engineType, String color, int year) {
      super(makeType, vehicleType, doorCount, engineType, color, year);
   }
   public static Vehicle promptForModel(Scanner scanner, MakeType makeType, int typeChoice, int doorCount, EngineType engineType, String color, int year) {
      
      
      VehicleType vehicleType = null; // Initialize with null
      Vehicle vehicle = null;
      
      switch (typeChoice) {
         case 1:
            System.out.println("Select Dodge Truck Model by number:");
            vehicleType = VehicleType.TRUCK;
            System.out.println("1. RAM 1500");
            System.out.println("2. RAM 1500");
          
            System.out.print("Enter your choice: ");
            int dodgeTruckModelChoice = scanner.nextInt();
         
            switch (dodgeTruckModelChoice) {
               case 1:
                  return vehicle = new DodgeRam1500("Ram 1500", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
               case 2:
                  return vehicle = new DodgeRam2500("Ram 2500", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
                              
               default:
                  System.out.println("Invalid choice. Vehicle model selection failed.");
                  return null;//break;               
            }
         
          
         case 2:
            System.out.println("Select Dodge Sedan Model by number:");
            vehicleType = VehicleType.SEDAN;
            System.out.println("1. Charger");
            System.out.println("2. Dart");
           
            System.out.print("Enter your choice: ");
            int dodgeSedanModelChoice = scanner.nextInt();
         
            switch (dodgeSedanModelChoice) {
               case 1:  
                  return vehicle = new DodgeCharger("Charger", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
               case 2:
                  return vehicle = new DodgeDart("Dart", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
               
               default:
                  System.out.println("Invalid choice. Vehicle model selection failed.");
                  return null;//break;
            }
         
            
         case 3:
            System.out.println("Select Dodge Coupe Model by number:");
            vehicleType = VehicleType.COUPE;
            System.out.println("1. Challenger");
            System.out.println("2. Hornet");
            System.out.print("Enter your choice: ");
            int dodgeModelChoice = scanner.nextInt();
         
            switch (dodgeModelChoice) {
               case 1:  
                  return vehicle = new DodgeChallenger("Challenger", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
               case 2:  
                  return vehicle = new DodgeHornet("Hornet", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
               default:
                  System.out.println("Invalid choice. Vehicle model selection failed.");
                  return null; //break;
            }
            
         default:
            System.out.println("Invalid Ford vehicle type. Vehicle creation failed.");
            return null;//break;
      }
      
     
   }
   
}