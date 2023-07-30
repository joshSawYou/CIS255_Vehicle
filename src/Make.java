import java.util.Scanner;
// enum for make
enum MakeType {
   FORD, TOYOTA, DODGE, HONDA, TESLA
}
// Make class
class Make extends Type {
   protected MakeType makeType;

   public Make(MakeType makeType, VehicleType vehicleType, int doorCount, EngineType engineType, String color, int year) {
      super(vehicleType, doorCount, engineType, color, year);
      this.makeType = makeType;
   }
   public static Vehicle sendToModel(Scanner scanner, int makeChoice, MakeType makeType, int typeChoice, int doorCount, EngineType engineType, String color, int year){
      
      switch(makeChoice) {
         case 1:
            return FordModels.promptForModel(scanner, makeType, typeChoice, doorCount, engineType, color, year);
            //break;
         case 2:
            return ToyotaModels.promptForModel(scanner, makeType, typeChoice, doorCount, engineType, color, year);
           // break;
         case 3:
            return DodgeModels.promptForModel(scanner, makeType, typeChoice, doorCount, engineType, color, year);
            //break;
         case 4:
            return HondaModels.promptForModel(scanner, makeType, typeChoice, doorCount, engineType, color, year);
           // break;
         case 5:
            return TeslaModels.promptForModel(scanner, makeType, typeChoice, doorCount, engineType, color, year);
           // break;
           default:
           System.out.println("You have entered an incorrect choice.");
           return null;
      }
   }

   public void displayInfo() {
      super.displayInfo();
      System.out.println("Make: " + makeType);
   }
}