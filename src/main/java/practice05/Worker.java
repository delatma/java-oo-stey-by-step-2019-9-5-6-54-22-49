package practice05;

public class Worker extends Person{
//    Then create class Worker to inherit class Person. There are fields name, age,
    Worker(String name, int age){
        super(name, age);
    }

//    a method named introduce in class Workder. Method introduce should return string like this:
//    > My name is Tom. I am 21 years old. I am a Worker. I have a job.
//    This text from all subclasses of class Person
//    > My name is Tom. I am 21 years old.
//    should be returned by calling method introduce from class Person.
    String introduce(){
        return super.introduce() + " I am a Worker. I have a job.";
    }
}
