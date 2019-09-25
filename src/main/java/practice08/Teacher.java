package practice08;

public class Teacher extends Person{
    //Then create class Teacher to inherit class Person. There are fields id, name, age, klass and

    private Klass klass;
    private Student student;

    Teacher(int id, String name, int age, Klass klass){
        super(id, name, age);
        this.klass = klass;
    }

    Teacher(int id, String name, int age){
        super(id, name, age);
    }

    Klass getKlass(){
        return klass;
    }

    //a method named introduce in class Teacher. Method introduce should return string like this:
    //>My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
    //If klass is null, then it will like this:
    //>My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.
    String introduce(){
        if (klass != null)
            return super.introduce() + " I am a Teacher. I teach " + klass.getDisplayName() + ".";
        return super.introduce() + " I am a Teacher. I teach No Class.";
    }

    //This text from all subclasses of class Person
    //>My name is Tom. I am 21 years old.
    //should be returned by calling method introduce from class Person.

    String introduceWith(Student student){
        if (student.getKlass() == klass)
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

}
