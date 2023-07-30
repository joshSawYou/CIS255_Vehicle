**Step by Step Source Code Explanation:** 

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


Overall, this program models vehicles, their makes, types, and models, and provides functionality to create, display, and save vehicle information and export to a file. This is done via class inhertances and associations described above. 

**Folder Structure(s):** There are no subfolders inside this src folder.

**Java SDK Version:** java 20

**IDE:** I used JGrasp. The specific version was jGRASP version 2.0.6_11 Beta 5.

**Class Diagram UML:**
 This is based on my observation of my the Workbook & previous UML, where I mapped out these Objects and/or Members. Using the previous UML file (UML Design), each Instantiable Object was mapped out with Members and Scope.

Here's an explanation of the reasoning behind the provided UML diagram and the relationships between the classes:

Vehicle Class:

The Vehicle class serves as the ROOT class or parent class for the other classes in the diagram. It represents a generic vehicle with common attributes - doorCount, engineType, and color. Vehicles next child classes are the classes Make and Type. First, I will describe the Type Class.

Type Class:

The Type class represents the different types of vehicles - Sedan, Coupe, or Truck. It inherites the Vehicle class; this indicates that a "Type" is a type of "Vehicle." The Type class adds the vehicleType attribute, specifying the type of the vehicle. NOTE: this means that "vehicleType" is not included in the Vehicle Class.

Next, I will describe the Make Class:

The Make class represents the different makes or brands of vehicles - Ford, Toyota, Dodge, Honda, and Tesla. It inherites the Vehicle class; this indicates that a "Make" is a type of "Vehicle." The Make class adds the makeType attribute, specifying the make or brand of the vehicle. NOTE: this means that "makeType" is not included in the Vehicle class.

Model is the child class of Make.

Model Class:

The Model class represents specific models of vehicles belonging to a particular make. It inherites the Make class, indicating that a Model is a specific type of Make. The Model class has the modelName attribute, representing the name of the specific vehicle model. Note: modelName is not included in any of its parent classes: Make or Vehicle.

Model has many children classes. It children are each unique model class created from the make-model combination. For example: FordFusion, FordF150, FordTaurus, etc.

Enum Classes:

The enum classes (EngineType, MakeType, VehicleType) represent fixed sets of values for specific attributes. For example, EngineType defines the possible engine types - Gasoline, Diesel, and Electric. Similarly, MakeType represents the different make or brand options - FORD, TOYOTA, DODGE, HONDA, and TESLA Lastly, VehicleType represents the different vehicle types available - Sedan, Coupe, and Truck.

The Vehicle class has an association with engineType. NOTE: any class that inherites vehicle or a child class of vehicle (make, type, model, and all of the unique model classes) also has an association with engineType (association arrow pointing to engineType).

The Make class has an association with makeType. NOTE: any class that inherites vehicle or a child class of make (model and all of the unique model classes) also has an association with makeType (association arrow pointing to makeType).

The Type class has association with vehicleType.

VehicleStorage class has an association with the vehicle class.

The relationships between the classes in the UML diagram are as follows:

Inheritance relationships: As mentioned previously, the Type, Make, and Model classes inherit from the Vehicle class and the Model class inherites from the Make class. This implies that they all inherit the attributes and methods defined in the Vehicle class and that the Model class also inherits the attributes and methods from the Make class. Also, all of the unique model classes inherite from the model class and therefore inherits the attributes, methods, and associations from the Model, Make, and Vehicle classes.

Association: Since vehicle has association with engineType then so does type, make, model, and all of the unique model classes. Make has an association with makeType which means so does model and all unique model classes. Type has an association with vehicle Type. Vehicle class has an association with the vehicle class.

Conclusion: Since Vehicle is the root class and has an association with vehicleStorage class, this storage list can contain all of the information gathered from each class thourgh inheritcance and association relationships described above for each overall vehicle and can be used to save to the file.