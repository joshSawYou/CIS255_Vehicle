// DodgeRam1500 class
 class DodgeRam1500 extends Model {
   public DodgeRam1500(int year, EngineType engineType, int doorCount, String color) {
      super("Ram 1500", MakeType.DODGE, year, doorCount, engineType, color);
   }
}
