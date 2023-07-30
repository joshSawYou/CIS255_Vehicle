import java.util.Scanner;
public class ToyotaModels extends Make{
   public ToyotaModels(MakeType makeType, VehicleType vehicleType, int doorCount, EngineType engineType, String color, int year) {
      super(makeType, vehicleType, doorCount, engineType, color, year);
   }
   public static Vehicle promptForModel(Scanner scanner, MakeType makeType, int typeChoice, int doorCount, EngineType engineType, String color, int year) {
     
      VehicleType vehicleType = null; // Initialize with null
      Vehicle vehicle = null;
   
      switch (typeChoice) {
      
         case 1:
            System.out.println("Select Toyota Truck Model by number:");
            vehicleType = VehicleType.TRUCK;
            System.out.println("1. Tundra");
            System.out.println("2. Tacoma");
          
            System.out.print("Enter your choice: ");
            int toyotaTruckModelChoice = scanner.nextInt();
            //Vehicle vehicle;
            switch (toyotaTruckModelChoice) {
               case 1:
                  return new ToyotaTundra("Tundra", makeType, vehicleType, doorCount, engineType, color, year);
                 // break;
               case 2:
                  return vehicle = new ToyotaTacoma("Tacoma", makeType, vehicleType, doorCount, engineType, color, year);
                //  break;
                              
               default:
                  System.out.println("Invalid choice. Vehicle model selection failed.");
                  return vehicle = null;
                 // break;
            }
         
           // break;
         case 2:
            System.out.println("Select Toyota Sedan Model by number:");
            vehicleType = VehicleType.SEDAN;
            System.out.println("1. Corolla");
            System.out.println("2. Camry");
            System.out.println("3. Avalon");
            System.out.print("Enter your choice: ");
            int toyotaSedanModelChoice = scanner.nextInt();
         
            switch (toyotaSedanModelChoice) {
               case 1:  
                  return vehicle = new ToyotaCorolla("Corolla", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
               case 2:
                  return vehicle = new ToyotaCamry("Camry", makeType, vehicleType, doorCount, engineType, color, year);
                 // break;
               case 3:
                  return vehicle = new ToyotaAvalon("Avalon", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
            
               default:
                  System.out.println("Invalid choice. Vehicle model selection failed.");
                  return vehicle = null;
                  //break;
            }
         
            
         case 3:
            System.out.println("Select Toyota Coupe Model by number:");
            vehicleType = VehicleType.COUPE;
            System.out.println("1. Supra");
            System.out.print("Enter your choice: ");
            int toyotaModelChoice = scanner.nextInt();
         
            switch (toyotaModelChoice) {
               case 1:  
                  return vehicle = new ToyotaSupra("Supra", makeType, vehicleType, doorCount, engineType, color, year);
                  //break;
               default:
                  System.out.println("Invalid choice. Vehicle model selection failed.");
                  return vehicle = null;
                  //break;
            }
            
         default:
            System.out.println("Invalid Ford vehicle type. Vehicle creation failed.");
         
            return null;
       
      }
   }
}
