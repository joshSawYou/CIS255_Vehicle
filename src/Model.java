// Model class
class Model extends Make {
   public String modelName;
   protected int year;

   public Model(String modelName, MakeType makeType, int year, int doorCount, EngineType engineType, String color) {
      super(makeType, doorCount, engineType, color);
      this.modelName = modelName;
      this.year = year;
   }

   public void displayInfo() {
      super.displayInfo();
      System.out.println("Model: " + modelName);
      System.out.println("Year: " + year);
   }
}

