package practice01;

public class Person {
    private String name;
    private int age;

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
        return "My name is " + name + ". I am " + age +" years old.";
    }

}
