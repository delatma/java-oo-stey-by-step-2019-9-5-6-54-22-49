package practice09;

public class Person {
    //    Create class Person with fields id, name, age and a method named introduce. Id is used to identify persons.
    private int id;
    private String name;
    private int age;

    Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }
    //    Method introduce should return string like this:
    //    >My name is Tom. I am 21 years old.

    String introduce(){
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }


    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return obj.hashCode() == hashCode();
        }
        return false;
    }

    public int hashCode() {
        return id;
    }

}
