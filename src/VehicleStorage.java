import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field; 

// Storage class for vehicles to be saved to file
class VehicleStorage {
   private List<Vehicle> vehicles;

   public VehicleStorage() {
      vehicles = new ArrayList<>();
   }

   public void addVehicle(Vehicle vehicle) {
      vehicles.add(vehicle);
   }

   public void displayVehicles() {
      for (Vehicle vehicle : vehicles) {
         vehicle.displayInfo();
         System.out.println();
      }
   }

   public void saveToFile(String fileName) throws IOException {
      if (!fileName.endsWith(".csv")) {
         fileName += ".csv";
      }
      File file = new File(fileName);
      FileWriter writer = new FileWriter(file);
   
      writer.write("Make|Type|Model|Year|Engine|Type|Door Count|Color\n");
   
   
      for (Vehicle vehicle : vehicles) {
         Class<? extends Vehicle> vehicleClass = vehicle.getClass();
         //String vehicleType = vehicleClass.getSimpleName();
         String vehicleType = "";
         String doorCount = String.valueOf(vehicle.doorCount);
         String engineType = vehicle.engineType.toString();
         String color = vehicle.color;
         String make = "";
         String model= "";
         int year = 0;
         
      if (vehicle instanceof Type) {
            Type typeVehicle = (Type) vehicle;
            vehicleType = typeVehicle.vehicleType.toString();
           
        }
        if (vehicle instanceof Make) {
                Make makeVehicle = (Make) vehicle;
                make = makeVehicle.makeType.toString();
            }
         
         if (vehicle instanceof FordF150) {
            FordF150 fordF150 = (FordF150) vehicle;
            model = fordF150.modelName;
            year = fordF150.year;
         } else if (vehicle instanceof FordF250) {
            FordF250 fordF250 = (FordF250) vehicle;
            model = fordF250.modelName;
            year = fordF250.year;
         } else if (vehicle instanceof FordTaurus) {
            FordTaurus fordTaurus = (FordTaurus) vehicle;
            model = fordTaurus.modelName;
            year = fordTaurus.year;
         } else if (vehicle instanceof FordFusion) {
            FordFusion fordFusion = (FordFusion) vehicle;
            model = fordFusion.modelName;
            year = fordFusion.year;
         } else if (vehicle instanceof FordFiesta) {
            FordFiesta fordFiesta = (FordFiesta) vehicle;
            model = fordFiesta.modelName;
            year = fordFiesta.year;
         } else if (vehicle instanceof FordMustang) {
            FordMustang m = (FordMustang) vehicle;
            model = m.modelName;
            year = m.year;
         } else if (vehicle instanceof ToyotaTacoma) {
            ToyotaTacoma toyotaTacoma = (ToyotaTacoma) vehicle;
            model = toyotaTacoma.modelName;
            year = toyotaTacoma.year;
         } else if (vehicle instanceof ToyotaTundra) {
            ToyotaTundra toyotaTundra = (ToyotaTundra) vehicle;
            model = toyotaTundra.modelName;
            year = toyotaTundra.year;
         } else if (vehicle instanceof ToyotaCorolla) {
            ToyotaCorolla toyotaCorolla = (ToyotaCorolla) vehicle;
            model = toyotaCorolla.modelName;
            year = toyotaCorolla.year;
         } else if (vehicle instanceof ToyotaCamry) {
            ToyotaCamry toyotaCamry = (ToyotaCamry) vehicle;
            model = toyotaCamry.modelName;
            year = toyotaCamry.year;
          } else if (vehicle instanceof ToyotaAvalon) {
            ToyotaAvalon a = (ToyotaAvalon) vehicle;
            model = a.modelName;
            year = a.year;
         } else if (vehicle instanceof ToyotaSupra) {
            ToyotaSupra s = (ToyotaSupra) vehicle;
            model = s.modelName;
            year = s.year;
         } else if (vehicle instanceof DodgeCharger) {
            DodgeCharger dodgeCharger = (DodgeCharger) vehicle;
            model = dodgeCharger.modelName;
            year = dodgeCharger.year;
         } else if (vehicle instanceof DodgeDart) {
            DodgeDart dodgeDart = (DodgeDart) vehicle;
            model = dodgeDart.modelName;
            year = dodgeDart.year;
         } else if (vehicle instanceof DodgeChallenger) {
            DodgeChallenger dodgeChallenger = (DodgeChallenger) vehicle;
            model = dodgeChallenger.modelName;
            year = dodgeChallenger.year;
         } else if (vehicle instanceof DodgeRam1500) {
            DodgeRam1500 r1500 = (DodgeRam1500) vehicle;
            model = r1500.modelName;
            year = r1500.year;
         } else if (vehicle instanceof DodgeRam2500) {
            DodgeRam2500 r2500 = (DodgeRam2500) vehicle;
            model = r2500.modelName;
            year = r2500.year;
         } else if (vehicle instanceof DodgeHornet) {
            DodgeHornet h = (DodgeHornet) vehicle;
            model = h.modelName;
            year =h.year;
         } else if (vehicle instanceof HondaInsight) {
            HondaInsight hondaInsight = (HondaInsight) vehicle;
            model = hondaInsight.modelName;
            year = hondaInsight.year;
         } else if (vehicle instanceof HondaAccord) {
            HondaAccord hondaAccord = (HondaAccord) vehicle;
            model = hondaAccord.modelName;
            year = hondaAccord.year;
         } else if (vehicle instanceof HondaCivic) {
            HondaCivic hondaCivic = (HondaCivic) vehicle;
            model = hondaCivic.modelName;
            year = hondaCivic.year;
         }
         else if (vehicle instanceof HondaRidgeline) {
            HondaRidgeline r = (HondaRidgeline) vehicle;
            model = r.modelName;
            year = r.year;
         }
         else if (vehicle instanceof TeslaModel_S) {
            TeslaModel_S teslaModelS = (TeslaModel_S) vehicle;
            model = teslaModelS.modelName;
            year = teslaModelS.year;
         } else if (vehicle instanceof TeslaModel3) {
            TeslaModel3 teslaModel3 = (TeslaModel3) vehicle;
            model = teslaModel3.modelName;
            year = teslaModel3.year;
         }
         String row = make + "|" + vehicleType + "|" + model + "|" + year + "|" + engineType + "|" + doorCount + "|" + color + "\n";
         writer.write(row);
      }
   
   
      writer.close();
      System.out.println("Vehicles saved to file: " + fileName);
   }
}
