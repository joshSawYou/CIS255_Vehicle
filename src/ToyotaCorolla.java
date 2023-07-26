// ToyotaCorolla class
 public class ToyotaCorolla extends Model {
   public ToyotaCorolla(int year, EngineType engineType, int doorCount, String color) {
      super("Corolla", MakeType.TOYOTA, year, doorCount, engineType, color);
   }
}