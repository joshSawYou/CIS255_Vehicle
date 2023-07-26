// FordF150 class
 class FordF150 extends Model {
   public FordF150(int year, EngineType engineType, int doorCount, String color) {
      super("F-150", MakeType.FORD, year, doorCount, engineType, color);
   }
}