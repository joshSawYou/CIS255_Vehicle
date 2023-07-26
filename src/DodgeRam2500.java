// DodgeRam2500 class
 class DodgeRam2500 extends Model {
   public DodgeRam2500(int year, EngineType engineType, int doorCount, String color) {
      super("Ram 2500", MakeType.DODGE, year, doorCount, engineType, color);
   }
}