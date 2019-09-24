package practice05;

public class Student extends Person{
//    Then create class Student to inherit class Person. There are fields name, age, klass
    private int klass;

    Student(String name, int age, int klass){
        super(name, age);
        this.klass = klass;
    }

    int getKlass(){
        return klass;
    }
//    and a method named introduce in class Student. Method introduce should return string like this:
//    >My name is Tom. I am 21 years old. I am a Student. I am at Class 2.
//    This text from all subclasses of class Person
//    > My name is Tom. I am 21 years old.
//    should be returned by calling method introduce from class Person.

    String introduce(){
        return super.introduce() + " I am a Student. I am at Class " + klass + ".";
    }

}
