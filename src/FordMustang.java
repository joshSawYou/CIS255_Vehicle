// FordMustang class
 class FordMustang extends Model {
   public FordMustang(int year, EngineType engineType, int doorCount, String color) {
      super("Mustang", MakeType.FORD, year, doorCount, engineType, color);
   }
}