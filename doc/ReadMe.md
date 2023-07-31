Vehicle_Matrix.xlsx explanation:
  This excel table is based on the basic statistics of each vehicle identified. This brings a database of all of the different types of vehicles and their make, model, type, engineTYpe, DoorCount, and color to the project. 

Vehicle_UML.drawio explanation:

This is based on my observation of my the Workbook & previous UML, where I mapped out these Objects and/or Members. Using the previous UML file (UML Design), each Instantiable Object was mapped out with Members and Scope. 

Here's an explanation of the reasoning behind the provided UML diagram and the relationships between the classes:

Vehicle Class:

The Vehicle class serves as the ROOT class or parent class for the other classes in the diagram.
It represents a generic vehicle with common attributes - doorCount, engineType, color, and year.
Vehicles next child classes is the class Type.

Type Class:

The Type class represents the different types of vehicles - Sedan, Coupe, or Truck.
It inherites the Vehicle class; this indicates that a "Type" is a type of "Vehicle."
The Type class adds the vehicleType attribute, specifying the type of the vehicle.
NOTE: this means that "vehicleType" is not included in the Vehicle Class. 

Next, The Make classes Extends the Type class aka Make is a child class of Type. Description of the Make class:

The Make class represents the different makes or brands of vehicles - Ford, Toyota, Dodge, Honda, and Tesla.
It inherites the Vehicle class; this indicates that a "Make" is a type of "Vehicle."
The Make class adds the makeType attribute, specifying the make or brand of the vehicle. 
NOTE: this means that "makeType" is not included in the Vehicle class.

FordModels, DodgeModels, ToyotaModels, TeslaModels, HondaModels are the child classes of Make. 

Description of these:

FordModels is a subclass of the Make class, which represents vehicles from the Ford brand.
It inherits the attributes and methods of the Make class, including the makeType attribute that specifies the make or brand as "FORD."
FordModels may contain additional attributes and methods specific to Ford vehicles, such as the modelName and year of the vehicle.

FordModels has its own children classes consisting of all of the models associated with the project (f150, Taurus, fusion, etc.)

DodgeModels:

DodgeModels is a subclass of the Make class, which represents vehicles from the Dodge brand.
It inherits the attributes and methods of the Make class, including the makeType attribute that specifies the make or brand as "DODGE."
DodgeModels may contain additional attributes and methods specific to Dodge vehicles, such as the modelName and year of the vehicle.

ToyotaModels:

ToyotaModels is a subclass of the Make class, which represents vehicles from the Toyota brand.
It inherits the attributes and methods of the Make class, including the makeType attribute that specifies the make or brand as "TOYOTA."
ToyotaModels may contain additional attributes and methods specific to Toyota vehicles, such as the modelName and year of the vehicle.

TeslaModels:

TeslaModels is a subclass of the Make class, which represents vehicles from the Tesla brand.
It inherits the attributes and methods of the Make class, including the makeType attribute that specifies the make or brand as "TESLA."
TeslaModels may contain additional attributes and methods specific to Tesla vehicles, such as the modelName and year of the vehicle.

HondaModels:

HondaModels is a subclass of the Make class, which represents vehicles from the Honda brand.
It inherits the attributes and methods of the Make class, including the makeType attribute that specifies the make or brand as "HONDA."
HondaModels may contain additional attributes and methods specific to Honda vehicles, such as the modelName and year of the vehicle.


EACH OF THESE MODEL CLASSES HAS THEIR OWN CORRESPONDING VEHICLES THAT BELONG TO THAT BRAND MODEL. Their children are each unique model class created from the make-model combination. For example: FordFusion, FordF150, FordTaurus, etc. are children of the Fordmodel class. 

Enum Classes:

The enum classes (EngineType, MakeType, VehicleType) represent fixed sets of values for specific attributes.
For example, EngineType defines the possible engine types - Gasoline, Diesel, and Electric.
Similarly, MakeType represents the different make or brand options - FORD, TOYOTA, DODGE, HONDA, and TESLA
Lastly, VehicleType represents the different vehicle types available - Sedan, Coupe, and Truck. 

The Vehicle class has an association with engineType. NOTE: any class that inherites vehicle or a child class of vehicle (make, type, model, and all of the unique model classes) also has an association with engineType (association arrow pointing to engineType).

The Make class has an association with makeType. NOTE: any class that inherites vehicle or a child class of make (model and all of the unique model classes) also has an association with makeType (association arrow pointing to makeType).

The Type class has association with vehicleType. 

VehicleStorage class has an association with the vehicle class. 

The relationships between the classes in the UML diagram are as follows:

Inheritance relationships: As mentioned previously, the Type class inherits from the Vehicle class, Make inherites Type class, all of the model classes inherite from the make class, and all of the make-model comination classes (ex: FordF150)inherite from thier correspoding model brand. This implies that they all inherit the attributes and methods defined from their parent class(es). 

Association: Since vehicle has association with engineType then so does type, make, the model classes, and all of the unique make-model classes. Make has an association with makeType which means so does the model classes and all unique make-model classes. Type has an association with vehicle Type. Vehicle class has an association with the vehicle class. 

Conclusion: Since Vehicle is the root class and has an association with vehicleStorage class, this storage list can contain all of the information gathered from each class thourgh inheritcance and association relationships described above for each overall vehicle and can be used to save to the file. 

