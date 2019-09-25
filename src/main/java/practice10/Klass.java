package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    //    Create class Klass with fields number and leader.
    private int number;
    private Student leader;
    private List<Student> students = new ArrayList<>();

    //    But leader doesn't get assigned in the constructor.
    Klass(int number){
        this.number = number;
    }

    int getNumber(){
        return number;
    }

    Student getLeader(){
        return leader;
    }

    String getDisplayName(){
        return "Class " + number;
    }
    //    Klass has a assignLeader method which receive a Student instance to assign the leader of the Klass.
    void assignLeader(Student leader){
        if (isMember(leader)) this.leader = leader;
        else System.out.append("It is not one of us.\n");
    }

    private boolean isMember(Student leader) {
        return leader.getKlass().number == this.number;
    }

    //Klass also has a appendMember method which receive a Student instance to add a  student to this Klass.
    //If a student is not in the Klass, then assignLeader to the student will fail and return:
    //>It is not one of us.
    //and if so, the method introduce of Student should just bahave like before.
    void appendMember(Student student){
        students.add(student);
    }
}
