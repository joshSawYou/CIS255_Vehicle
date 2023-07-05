Source Code Explanation: 
We do not have source yet. But I would imagine it would pull from some sort of vehicle database.

Folder Structure(s):
Java SDK Version, 


IDE: I used JGrasp. The specific version was jGRASP version 2.0.6_11 Beta 5.

Class Diagram UML:
I did a class hierarchy. I based this on what I thought would be the class ancestory of this project. For example, I figured it would start with Vehicle as highest parent class. Its children would be Vehicle Makes. Vehicle also has the child class Type. The reason I set it up this way is because in my mind ALL vehicles have a doorCount, engineType, model, and color. A separate class is needed for makes because there are different name brands (makes) for each vehicle. This class extends vehicle in the sense that it still has the attributes of doorCount, engineType, model, and color. I chose the class child type to also extend vehicle class and its attributes, but also have attributes of its own such as being a Sedan, Coupe, or Truck. 
