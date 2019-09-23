package practice02;

public class Student {
    private String name;
    private int age;
    private int classNumber;

    Student(String name, int age, int classNumber){
        this.name = name;
        this.age = age;
        this.classNumber = classNumber;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    int getKlass(){
        return classNumber;
    }

    String introduce(){
        return "I am a Student. I am at Class " + getKlass() + ".";
    }

}
