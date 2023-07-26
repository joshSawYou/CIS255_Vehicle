// FordRanger class
class FordRanger extends Model {
   public FordRanger(int year, EngineType engineType, int doorCount, String color) {
      super("Ranger", MakeType.FORD, year, doorCount, engineType, color);
   }
}