Step by Step Source Code Explanation: 

      First in my code are the Enumerations:
      
      EngineType: Represents the engine types of a vehicle (GASOLINE, DIESEL, ELECTRIC).
      MakeType: Represents the make of a vehicle (FORD, TOYOTA, DODGE, HONDA, TESLA).
      VehicleType: Represents the type of a vehicle (SEDAN, COUPE, TRUCK).
      
      Next in my code is the Vehicle Class:
      
      This is the base class for all vehicles in the system.
      It contains attributes such as doorCount, engineType, and color.
      In this class there is a displayInfo() method which prints the vehicle's information.
      
      The next class in my code is the Make Class:
      
      It Inherits from the Vehicle class. This means it inheritance all of the Vehicle's class's attriubtes and methods. Additionally, 
      the make class has its own attribute, makeType, which represents the make of the vehicle, as mentioned above.
      Also, this make class has its own displayInfo() method which overrides the displayInfo() from the vehicle class method to include the make information.
      
      Next in my code is the Type Class:
      
      It also inherits from the Vehicle class. This means it inheritance all of the Vehicle's class's attriubtes and methods. Additionally, 
      the make class has its own attribute, vehicleType, which represents the type of the vehicle, as mentioned above.
      This Type class also has its own displayInfo() method that also overrides the displayInfo() method in the vehicle class to include the vehicle type information.
      
      
      Next in my code is the Model Class:
      
      It inherits the Make class. This means it inheritance all of the Make class's attributes and methods.
      The model class has its own attributes, modelName and year, to represent the model name and year of the vehicle.
      This model class also has its own displayInfo() method that overrides the displayInfo() method from the make class to include the model name and year information.
      
      Next in my code is the VehicleStorage Class:
      
      This class manages a list of vehicles using the List interface.
      This class has methods to add vehicles to the list (addVehicle()), display vehicle information (displayVehicles()), and save vehicle details to a file (saveToFile()).
      The saveToFile() method writes the vehicle details in CSV format to a file.
      
      There is also an abstract class for each Unique Model from my Worksheet. These classes inherite the Model class and represent specific vehicle models from different makes.
      
      The "main" method in the program is in the "CIS255_Vehicle Class:"
      
      It creates an instance of VehicleStorage to store vehicles.
      It provides a menu-based user interface to perform actions like creating vehicles, displaying vehicles, saving vehicles to a file, and exiting the program, per the instructure's instructions. 
      The createVehicle() method allows the user to input details of a vehicle and adds it to the VehicleStorage.
      The saveToFile() method prompts the user for a filename and saves the vehicle details to a CSV file using the VehicleStorage class.
      
      
      Overall, this program modelw vehicles, their makes, types, and models, and provides functionality to create, display, and save vehicle information and export to a file. This is done via class inhertances and associations described above. 

Folder Structure(s): There are no subfolders inside this src folder.

Java SDK Version: java 20

IDE: I used JGrasp. The specific version was jGRASP version 2.0.6_11 Beta 5.

Class Diagram UML:
 
