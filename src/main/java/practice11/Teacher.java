package practice11;

import java.util.LinkedList;

public class Teacher extends Person{
    //    Then create class Teacher to inherit class Person. There are fields id, name, age, classes
    private LinkedList<Klass> classes;
    private Klass klass;
    private Student student;

    Teacher(int id, String name, int age, LinkedList<Klass> classes){
        super(id, name, age);
        this.classes = classes;
    }

    Teacher(int id, String name, int age){
        super(id, name, age);
    }

    Klass getKlass(){
        return klass;
    }

    public LinkedList<Klass> getClasses(){
        return classes;
    }
//and a method named introduce in class Teacher. Method introduce should return string like this:
//>My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2, 3.
//if the length of classes is zero, then it should return string like this:
//>My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.

    String introduce(){
        if (getClasses() != null && !getClasses().isEmpty()){
            String classes = "";
            for (Klass klass: getClasses()){
                classes +=Integer.toString(klass.getNumber()).concat(", ");
            }
            return super.introduce() + " I am a Teacher. I teach " + "Class " + classes.substring(0,classes.length()-2)+".";
        }
        else return super.introduce() + " I am a Teacher. I teach " + "No Class.";
    }

    //This text from all subclasses of class Person
    //>My name is Tom. I am 21 years old.
    //should be returned by calling method introduce from class Person.

    String introduceWith(Student student){
        if (isTeaching(student))
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }
    //    Teacher also has a isTeaching method which receive a Student instance to return it's ture
    //    or false that the teacher is teaching the student. Once the student is in any classes that
    //    teacher is teaching, the method should return true.
    //    And there is a corresponding method named isIn in class Student to return is the student is in the klass.
    boolean isTeaching(Student student){
        for (Klass klass : getClasses()){
            if (klass.getNumber() == student.isIn())
                return true;
        }
        return false;
    }

}
