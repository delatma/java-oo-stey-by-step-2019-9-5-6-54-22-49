package practice07;

public class Student extends Person {
    //    Then create class Student to inherit class Person. There are fields name, age, klass
    //    But field klass is an object rather than a number. Create class Klass with a field named number.
    //    And pass a Klass instance into the constructor of Student. Please refer to test cases.

    private Klass klass;

    Student(String name, int age, Klass klass){
        super(name, age);
        this.klass = klass;
    }

    Klass getKlass() {
        return klass;
    }
    //    and a method named introduce in class Student. Method introduce should return string like this:
    //    >My name is Tom. I am 21 years old. I am a Student. I am at Class 2.
    String introduce(){
        return super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
    }
}
