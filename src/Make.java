// enum for make
enum MakeType {
   FORD, TOYOTA, DODGE, HONDA, TESLA
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
