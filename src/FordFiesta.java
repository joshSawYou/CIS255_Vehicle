// FordFiesta class
 class FordFiesta extends Model {
   public FordFiesta(int year, EngineType engineType, int doorCount, String color) {
      super("Fiesta", MakeType.FORD, year, doorCount, engineType, color);
   }
}