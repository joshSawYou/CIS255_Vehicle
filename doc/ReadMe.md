Vehicle_Matrix.xlsx explanation:
  This excel table is based on the basic statistics of each vehicle identified. This brings a database of all of the different types of vehicles and their make, model, type, engineTYpe, DoorCount, and color to the project. 

Vehicle_UML.drawio explanation:

This is based on my observation of my the Workbook & previous UML, where I mapped out these Objects and/or Members. Using the previous UML file (UML Design), each Instantiable Object was mapped out with Members and Scope. Since classes "CIS255_Vehicle, vehicle, make, type, and model" all had Associations, I only refered to the Name of the class and did not include the member(s) per teacher's instructions. My Enums (EngineType, MakeType, and VehicleType)are leveraged for effectiveness in Class Construction and usage having only Key values and are on the same page. Each unique model from the worksheet can be represented as instances of the Model class
There are root classes: The main application class, CIS255_vehicle, and the vehicle class. From Vehicle you have children classes - make and type. From Make you have a child class - model. All of these relations are inheritance arrows. The enums are EngineType, MakeType, and VehicleType. These do not have arrows because they do not extend any of the classes. 


Although, i htink they have som relation because they are used by certain classes. I need to do more thinking/research on this. 

Here's an explanation of the reasoning behind the provided UML diagram and the relationships between the classes:

Vehicle Class:

The Vehicle class serves as the base class or parent class for the other classes in the diagram.
It represents a generic vehicle with common attributes such as doorCount, engineType, and color.
Make Class:

The Make class represents the different makes or brands of vehicles, such as Ford, Toyota, Dodge, etc.
It is associated with the Vehicle class through inheritance, indicating that a Make is a type of Vehicle.
The Make class adds the makeType attribute, specifying the make or brand of the vehicle.
Type Class:

The Type class represents the different types of vehicles, such as Sedan, Coupe, or Truck.
It is also associated with the Vehicle class through inheritance, indicating that a Type is a type of Vehicle.
The Type class adds the vehicleType attribute, specifying the type of the vehicle.
Model Class:

The Model class represents specific models of vehicles belonging to a particular make.
It extends the Make class, indicating that a Model is a specific type of Make.
The Model class introduces the modelName attribute, representing the name of the specific vehicle model.
Enum Classes:

The enum classes (EngineType, MakeType, VehicleType) represent fixed sets of values for specific attributes.
For example, EngineType defines the possible engine types like Gasoline, Diesel, and Electric.
Similarly, MakeType represents the different make or brand options, and VehicleType represents the different vehicle types available.
The relationships between the classes in the UML diagram are as follows:

Inheritance: The Make, Type, and Model classes inherit from the Vehicle class. This implies that they inherit the attributes and methods defined in the Vehicle class.
Association: There are associations between the classes, indicating a relationship or connection between them. For example, the Make and Type classes are associated with the Vehicle class, suggesting that a Make or Type object is related to a Vehicle object.
Overall, this UML diagram represents a basic structure for modeling vehicles, their makes, types, and specific models. The associations and inheritance relationships capture the hierarchical and interrelated nature of these entities.

