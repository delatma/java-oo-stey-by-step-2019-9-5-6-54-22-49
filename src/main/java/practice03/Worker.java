package practice03;

public class Worker extends Person{
    //    Then create class Worker to inherit class Person. There are fields name, age,
    Worker(String name, int age) {
        super(name, age);
    }

    //    a method named introduce in class Worker. Method introduce should return string like this:
    //    >I am a Worker. I have a job.
    String introduce(){
        return "I am a Worker. I have a job.";
    }
}
