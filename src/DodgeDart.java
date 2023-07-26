// DodgeDart class
 public class DodgeDart extends Model {
   public DodgeDart(int year, EngineType engineType, int doorCount, String color) {
      super("Dart", MakeType.DODGE, year, doorCount, engineType, color);
   }
}