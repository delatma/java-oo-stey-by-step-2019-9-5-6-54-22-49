package practice02;

public class Student extends Person{
    private int classNumber;

    Student(String name, int age, int classNumber){
        super(name, age);
        this.classNumber = classNumber;
    }

    int getKlass(){
        return classNumber;
    }

    String introduce(){
        return "I am a Student. I am at Class " + classNumber + ".";
    }

}
