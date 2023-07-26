
// FordFusion class
 class FordFusion extends Model {
   public FordFusion(int year, EngineType engineType, int doorCount, String color) {
      super("Fusion", MakeType.FORD, year, doorCount, engineType, color);
   }
}
