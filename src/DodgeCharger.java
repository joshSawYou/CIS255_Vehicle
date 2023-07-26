// DodgeCharger class
 class DodgeCharger extends Model {
   public DodgeCharger(int year, EngineType engineType, int doorCount, String color) {
      super("Charger", MakeType.DODGE, year, doorCount, engineType, color);
   }
}
