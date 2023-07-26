// HondaAccord class
 public class HondaAccord extends Model {
   public HondaAccord(int year, EngineType engineType, int doorCount, String color) {
      super("Accord", MakeType.HONDA, year, doorCount, engineType, color);
   }
}