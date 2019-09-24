package practice06;

import java.util.Objects;

public class Teacher extends Person{
    //    Then create class Teacher to inherit class Person. There are fields name, age, klass
    private Integer klass;

    Teacher(String name, int age, int klass){
        super(name, age);
        this.klass = klass;
    }

    Teacher(String name, int age){
        super(name, age);
    }

    int getKlass(){
        return klass;
    }

    //    and a method named introduce in class Teacher. Method introduce should return string like this:
    //    >My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
    //    If klass is null, then it will like this:
    //    >My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.

    String introduce(){
        if (klass == null)
            return super.introduce() + " I am a Teacher. I teach No Class.";
                return super.introduce() + " I am a Teacher. I teach Class " + klass + ".";
    }
}



