package practice02;

public class Student extends Person{
    //        Then create class Student to inherit class Person. There are fields name,
    //        age, klass and a method named introduce in class Student.
    private int klass;

    Student(String name, int age, int klass){
        super(name, age);
        this.klass = klass;
    }

    int getKlass(){
        return klass;
    }

    //        Method introduce should return string like this:
    //        >I am a Student. I am at Class 2.
    String introduce(){
        return "I am a Student. I am at Class " + klass + ".";
    }

}
