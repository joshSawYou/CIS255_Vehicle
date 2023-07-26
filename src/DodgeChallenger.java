// DodgeChallenger class
 public class DodgeChallenger extends Model {
   public DodgeChallenger(int year, EngineType engineType, int doorCount, String color) {
      super("Challenger", MakeType.DODGE, year, doorCount, engineType, color);
   }
}