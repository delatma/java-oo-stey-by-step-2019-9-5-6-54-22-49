package practice02;

public class Person {
    private String name;
    private int age;

    Person(){
        this.name = name;
        this.age = age;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    String introduce(){
        return "My name is " + getName() + ". I am " + getAge() +" years old.";
    }
}
