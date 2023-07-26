
// FordTaurus class
 class FordTaurus extends Model {
   public FordTaurus(int year, EngineType engineType, int doorCount, String color) {
      super("Taurus", MakeType.FORD, year, doorCount, engineType, color);
   }
}
