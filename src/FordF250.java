// FordF250 class
 class FordF250 extends Model {
   public FordF250(int year, EngineType engineType, int doorCount, String color) {
      super("F-250", MakeType.FORD, year, doorCount, engineType, color);
   }
}
