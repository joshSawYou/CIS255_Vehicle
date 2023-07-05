Source Code Explanation: 
We do not have source yet. But I would imagine it would pull from some sort of vehicle database. I believe the classes in my source code will be vehicle, make, model, and type. Explanation of the relationships between them are in the class diagram UML explanation below. 

Folder Structure(s): There are no class folders yet because we are not supposed to write the source code yet. The folders in this entirre guthub repository are just following the structure provided in the instructions.

Java SDK Version: java 20

IDE: I used JGrasp. The specific version was jGRASP version 2.0.6_11 Beta 5.

Class Diagram UML:
I did a class hierarchy. I based this on what I thought would be the class ancestory of this project. For example, I figured it would start with Vehicle as highest parent class. Its children would be Vehicle Makes. Vehicle also has the child class Type. The reason I set it up this way is because in my mind ALL vehicles have a doorCount, engineType, and color. A separate class is needed for makes because there are different name brands (makes) for each vehicle. This class extends vehicle in the sense that it still has the attributes of vehicle such as doorCount, engineType, and color. I chose the class child "Type" to also extend vehicle class and its attributes, but also have attributes of its own such as being a Sedan, Coupe, or Truck. The Model class extends the Make class because there are certain models that belong to each make. 
