# OO Three Main Features
### Encapsulation
Encapsulation is a feature of object-oriented programming where a set of attributes are bundled together as a class that store the current sate of the object with a set of methods using these attributes. This concept of encapsulation implements an information-hiding mechanism.

```
public class Car{
   //attributes
   private String model;
   private int wheels;

   public Car(String model, int wheels){
      this.model = model;
      this.wheels = wheels;
  }
}
```
Above *Car* class encapsulates attributes *name* and *wheels* which is inaccessible from other classes. Below *carModel* method operates on these attributes without being able to directly access them.

```
public void carModel(Car myCar){
     myCar.registerModel();
}
```
### Inheritance
Inheritance enables programmers to reuse existing code or extend an existing type.

Below example is a *Car* class.
```
public class Car {
    int wheels;
    String model;
    void start() {
        // Check essential parts
    }
}
```
The class *ArmoredCar* inherits the members of *Car* class by using the keyword *extends* in its declaration, making it a *derived class*. Derived class can inherit *protected* and *public* members from its base class that are not *static*. Also, if both classes are in the same *package*, both *default* and *package* access are inherited, hence, if they do not belong in the same package, both *default* and *package* access are not inherited.

However, not all members of a base class can be accessed by a derived class, which are *private* and *static*.

```
public class AutomaticCar extends Car {
    int remote;
    void remoteStartCar() {
    // this vehicle can be started by using a remote control
    }
}
```
If both the base and the derived class use the same variable or method name, the words *super* and *this* are used to identify which class' variable is being pointed to. The prefix *super* refers to the parent class instance while *this* prefix refers to the instance in which it is used.

>Example:
```
public class AutomaticCar extends Car {
    private String model;
    public String getAValue() {
        return super.model;  //returns value of model defined in base class Car
        //return this.model; will return value of model defined in AutomaticCar 
        //return model; will return value of model defined in AutomaticCar 
    }
}
```

Static members belong to a class and not to instances. The keyword *super* cannot be used. 

>Example
```
public class Car {
    public static String msg() {
        return "Car";
    }
}
```
```
public class AutomaticCar extends Car {
    public static String msg() {
        return super.msg(); // this won't compile.
    }
}
```
We may modify the call as follows:
```
return Car.msg();
```

>For both classes (base and derived) that define the same *static* method with the same signature:
```
public class Car {
    public static String msg() {
        return "Car";
    }
}
```
```
public class AutomaticCar extends Car {
    public static String msg() {
        return "AutomaticCar ";
    }
}
```
We may create an object as follows:
```
Car first = new AutomaticCar();
AutomaticCar second = new AutomaticCar();
```
Object *first* calling method *msg*: `first.msg()` will output "Car" and `second.msg()` will output *AutomaticCar*.

### Polymorphism
Polymorphism enables the use of same entities in different forms. This means that you can declare several methods with the same name as long as they have different characteristics.
Polymorphism has two implementations: method *overloading* and method *overriding*.

###### Static Polymorphism
Method overloading means that several methods with the same  name can be declared in a class. But the numbers, names, or types of their parameters should be different.

>Example
```
public class Car {
    public void msg() {
        System.out.println("This is a car.");
    }
    public void msg(String brand) {
        System.out.println("This is a " + brand + ".");
    }
    public void msg(int remote) {
        System.out.println("This is a car with " + remote + " remotes.");
    }
}
```
Below test TestCar class instantiates a new Car object which calls the `msg()` method three times.
```
class TestCar{
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.msg();
		myCar.msg("BMW");
		myCar.msg(5);
	}
}
```
The output has three polymorphic `msg()` methods:
```
[Console output of TestCar]
This is a car.
This is a BMW car. 
This is a car with 5 remotes.
```

###### Dynamic Polymorphism
Method overriding enables to override a parent class from its child class.

>Example
```
class Car{
	public void wheelRims() {
		System.out.println("This car has steel wheel rims.");
	}
}
```
```
class Sedan extends Car {
	public void wheelRims () {
		System.out.println("This car has chrome wheel rims.");
	}
}
```
The TestCar class instantiates a new Car object and calls its `wheelRims()` method. Then, it also creates a Sedan object and calls the polymorphic `wheelRims()` method again.
```
class TestCar {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.wheelRims();
		Sedan mySedan = new Sedan();
		mySedan. wheelRims();
	}
}
```
The output is as follows:
```
[Console output of TestCar]
This car has steel wheel rims.
This car has chrome wheel rims.
```

# Five Principles (SOLID)

### 1. Single Responsibility Principle (SRP)
This principle states that:
>One class should have one and only one responsibility.

This means that programmers should write, change, and maintain a class for only one purpose. If it is a *model* class, then it should strictly represent only one actor/ entity. 

> Example

> Teacher.java
```
public class Teacher
{
    private int teacherId;
    private String firstName;
    private String lastName;
    private String age;
    private List<Classes> classes;
}
```
>Classes.java
```
public class Classes
{
    private int guId;
    private String classNumber;
    private String className;
    private String type;
}
```
Both *Teacher* and *Classes* have single responsibility to store their specific information. If we want to change a state of *Teacher* then we do not need to modify the class *Classes* and vice-versa.

### 2. Open Closed Principle (OCP)
This principle states that:
> Software components should be open for extension, but closed for modification.

This means that classes should be designed in a way that other developers may be able to change the flow of control in specific conditions in their applications by extending the base class and overriding some functions but without modifying the base class.

> Example
```
public class Person {
    String introduce(){
        return "I am a person.";
    }
}
```
```
public class Student extends Person
{
   @Override
   String introduce(){
        return "I am a Worker. I have a job.";
    }
}
```
Above *Student* class overrides *Person* method `introduce()` logic without modifying the base class.

### 3. Liskov's Substitution Principle (LSP)
This principle extends `Open Closed Principle`. This states that:
> Derived types must be completely substitutable for their base types.

>Let Φ(x) be a property provable about objects x of type T. Then Φ(y) should be true for objects y of type S where S is a subtype of T.

This means that developers may replace objects of a parent class with objects of a subclass without breaking the application. This requires all subclasses to behave in the same way as the parent class. This principle ensures that inheritance is used correctly.

>Example

> Bird.java
```
public class Bird{
    public void fly(){}
}
public class Duck extends Bird{}
```
The base class *Bird* has a method `fly()`. The derived class *Duck* is logically correct because a duck does fly.

>However, if we extend the class as below:
```
public class Ostrich extends Bird{}
```
>It breaks the LS Principle because an Ostrich, although it is a bird, does not fly. Hence, it cannot implement the method `fly()`. 

>A good example for this scenario may be implemented as below:
```
public class Bird{}
public class FlightBirds extends Bird{
    public void fly(){}
}
public class Duck extends FlightBirds{}
public class Ostrich extends Bird{} 
```

### 4. Interface Segregation Principle (ISP)
This principle states that:
>Clients should not be forced to implement unnecessary methods which they will not use.

This is similar to the `Single Responsibility Principle`, which goal is to reduce the side effect and frequency of required changes by splitting a large software into smaller, independent parts through correct abstraction. Hence, if you have wrong initial object decomposition, you might likely violate this principle. Always follow the `Rule of Three` which states that two instances of similar code don't require refactoring, but when used three times, it should be extracted into a new procedure. Correct abstraction is the key.

>Example
```
public interface Athlete {
     void compete();
     void swim();
     void longJump();
     void sprint();
     void javelinThrow();     
}
```
The interface *Athlete* has methods four methods `compete()`, `swim()`, `longJump()`, and `sprint()`, `javelinThrow()`. 

> Supposed that a class *MarkD* is a swimming athlete and implements the interface *Athlete*:
```
public class MarkD implements Athlete {
     @Override
    public void compete() {
        System.out.println("MarkD started competing");
    }
     @Override
    public void swim() {
        System.out.println("MarkD started swimming");
    }
     @Override
    public void longJump() {
    }
     @Override
    public void sprint() {
    }
     @Override
    public void javelinThrow() {
    }
}
```
Methods like `longJump()`, `sprint()`, and `javelinThrow()` will never be used by *MarkD*.
The same problem will occur for another athlete that does not swim or participate in jump or throw events. To apply this principle, we will have to refactor the original interface and create other interfaces like below:
```
public interface SwimAthlete extends Athlete {
     void swim();
 }
```
```
public interface JumpAthlete extends Athlete {
     void longJump();
 }
```
```
public interface TrackAthlete extends Athlete {
     void sprint();
 }
```
```
public interface ThrowAthlete extends Athlete {
     void javelinThrow();
 }
```
Therefore, *MarkD* will not have to implement actions that he is not capable of performing.
```
public class MarkD implements SwimAthlete {
     @Override
    public void compete() {
        System.out.println("MarkD started competing");
    }
     @Override
    public void swim() {
        System.out.println("MarkD started swimming");
    }
 }
```

### 5. Dependency Inversion Principle (DIP)
This principle states that:
>Depend on abstractions, not on concretions.

This means that a software should be designed in such a way that various modules can be separated from each other using an abstract layer to bind them together. 
The intent is to decouple objects to the extent that no client code has to be changed because an object it depends on needs to be changed to a different one. I achieves testability and replaceability. because components in a loosely coupled system can be replaced with alternative implementations that provide the same services.

>Example

>LightBulb.java
```
public class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}
```
>ElectricPowerSwitch.java
```
public class ElectricPowerSwitch {
    public LightBulb lightBulb;
    public boolean on;
    public ElectricPowerSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }
    public boolean isOn() {
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            lightBulb.turnOff();
            this.on = false;
        } else {
            lightBulb.turnOn();
            this.on = true;
        }
    }
}
```
In the above example, the requirement is an electrical switch that turns a light bulb on or off. *LightBulb* class has methods `turnOn()` and `turnOff()` to turn a bulb on and off.
The *ElectricPowerSwitch* class has a field referencing *LightBulb*.

>The switch is now ready for use to turn on and off the light bulb. However, the high-level *ElectricPowerSwitch* class is directly dependent on the low-level *LightBulb* class. Inspecting the code, the *LightBulb* class is hardcoded in *ElectricPowerSwitch*; but a switch should not be tied to a bulb, it should be able to turn on and off other appliances and devices too, say a fan, an AC, or the entire lightning system of an amusement park. There will be multiple modifications required in the *ElectricPowerSwitch* class each time new appliance or device is added. Hence, the design is flawed and does not conform to this principle.

Below is a good implementation of above requirement that follows the DIP.
> Switch.java
```
public interface Switch {
    boolean isOn();
    void press();
}
```
> The above interface with `isOn()` and `press()` methods will provide flexibility to plug in other types of switches if required.

> Switchable.java
```
public interface Switchable {
    void turnOn();
    void turnOff();
}
```
>Above interface with methods `turnOn()` and `turnOff()` will provide functionality to individual switchable devices in the application. 

> ElectricPowerSwitch.java
```
public class ElectricPowerSwitch implements Switch {
    public Switchable client;
    public boolean on;
    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = false;
    }
    public boolean isOn() {
        return this.on;
    }
   public void press(){
       boolean checkOn = isOn();
       if (checkOn) {
           client.turnOff();
           this.on = false;
       } else {
             client.turnOn();
             this.on = true;
       }
   }
}
```
> The class *ElectricPowerSwitch* implemented the *Switch* interface and referred the *Switchable* interface instead of any concrete class in a field. With this implementation, any `Switchable` devices can now be added without worrying about modifying the *ElectricPowerSwitch* class.

> LightBulb.java
```
public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }
    @Override
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}
```
> Fan.java
```
public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }
    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}
```
> Both low-level *LightBulb* and *Fan* classes implemented the high-level *Switchable* interface to provide their own functionality for turning on and off. These low-level classes depend (inversely) on the abstraction as required by the client.

> ElectricPowerSwitchTest.java
```
public class ElectricPowerSwitchTest {
    @Test
    public void testPress() throws Exception {
     Switchable switchableBulb=new LightBulb();
     Switch bulbPowerSwitch=new ElectricPowerSwitch(switchableBulb);
     bulbPowerSwitch.press();
     bulbPowerSwitch.press();
//
    Switchable switchableFan=new Fan();
    Switch fanPowerSwitch=new ElectricPowerSwitch(switchableFan);
    fanPowerSwitch.press();
    fanPowerSwitch.press();
    }
}
```
> Above unit test will then output as follows:
```
LightBulb: Bulb turned on...
LightBulb: Bulb turned off...
Fan: Fan turned on...
Fan: Fan turned off...
```

## SUMMARY OF SOLID
|    | PRINCIPLE                         | DEFINITION                                                            | 
| -- | --------------------------------- | --------------------------------------------------------------------- |
|SRP | Single Responsibility Principle   |A class should have one, and only one, reason to change.               |
|OCP | Open Closed Principle             |You should be able to extend a classes behavior, without modifying it. |
|LSP | Liskov Substitution Principle     |Derived classes must be substitutable for their base classes.          |
|ISP | Interface Segregation Principle   |Make fine grained interfaces that are client specific.                 |
|DIP | Dependency Inversion Principle    |Depend on abstractions, not on concretions.                            |
