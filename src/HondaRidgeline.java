// HondaRidgeline class
 public class HondaRidgeline extends Model {
   public HondaRidgeline(int year, EngineType engineType, int doorCount, String color) {
      super("Ridgeline", MakeType.HONDA, year, doorCount, engineType, color);
   }
}