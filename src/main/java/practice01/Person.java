package practice01;

public class Person {
    //    Create class Person with fields name, age and a method named introduce.
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

    //    Method introduce should return string like this:
    //    >My name is Tom. I am 21 years old.
    String introduce(){
        return "My name is " + name + ". I am " + age +" years old.";
    }

}
