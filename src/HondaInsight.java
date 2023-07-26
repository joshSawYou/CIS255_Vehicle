// HondaInsight class
 public class HondaInsight extends Model {
   public HondaInsight(int year, EngineType engineType, int doorCount, String color) {
      super("Insight", MakeType.HONDA, year, doorCount, engineType, color);
   }
}