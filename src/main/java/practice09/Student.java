package practice09;

public class Student extends Person{
    //    Then create class Student to inherit class Person. There are fields id, name, age, klass
    //    But field klass is an object rather than a number.
    private Klass klass;

    //    pass a Klass instance into the constructor of Student.
    Student(int id, String name, int age, Klass klass){
        super(id, name, age);
        this.klass = klass;
    }

    Klass getKlass(){
        return klass;
    }

    //    and a method named introduce in class Student. Method introduce should return string like this:
    //    >My name is Tom. I am 21 years old. I am a Student. I am at Class 2.
    //    Klass has a assignLeader method which receive a Student instance to assign the leader of the Klass.
    //    If Tom if the leader of the Klass, then calling return of method introduce to Tom should look like this:
    //    >My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.
    //    otherwise the method introduce should just bahave like before.

    String introduce(){
        if (getKlass() != null && klass.getLeader() != null && klass.getLeader().getName() == (this.getName()))
        {
            return super.introduce() + " I am a Student. I am Leader of " + klass.getDisplayName() + ".";
        }
        else
            {
                return super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
            }
    }

}
