// Enum for Engine Type
enum EngineType {
   GASOLINE, DIESEL, ELECTRIC
}
//Vehicle Class
public class Vehicle {
   protected int doorCount;
   protected EngineType engineType;
   protected String color;
   public int year;

   public Vehicle(int doorCount, EngineType engineType, String color, int year) {
      this.doorCount = doorCount;
      this.engineType = engineType;
      this.color = color;
      this.year = year;
   }
   
   public void displayInfo() {
      System.out.println("Vehicle:");
      System.out.println("Door Count: " + doorCount);
      System.out.println("Engine Type: " + engineType);
      System.out.println("Color: " + color);
       System.out.println("Year: " + year);
   }
}