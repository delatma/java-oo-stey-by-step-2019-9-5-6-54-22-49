package practice07;

public class Teacher extends Person{

    //Then create class Teacher to inherit class Person. There are fields name, age, klass
    private Klass klass;
    private Student student;

    Teacher(String name, int age, Klass klass){
        super(name, age);
        this.klass = klass;
    }

    Teacher(String name, int age){
        super(name, age);
    }

    Klass getKlass() {
        return klass;
    }
    //and a method named introduce in class Teacher. Method introduce should return string like this:
    //>My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
    //If klass is null, then it will like this:
    //>My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.
    String introduce(){
        if (klass != null)
            return super.introduce() + " I am a Teacher. I teach " + klass.getDisplayName() + ".";
                return super.introduce() + " I am a Teacher. I teach No Class.";
    }

    //Add method introduceWith with a parameter student. Say Jerry, if Jerry is a student of this teacher then the method
    //should return this:
    //>My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.
    //otherwise:
    //>My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.
    String introduceWith(Student student){
        if (student.getKlass() == klass)
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
                return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }
}
