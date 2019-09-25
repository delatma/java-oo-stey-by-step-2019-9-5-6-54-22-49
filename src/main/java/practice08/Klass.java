package practice08;

public class Klass {
    //    Create class Klass with fields number and leader.
    private int number;
    private Student leader;

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
        this.leader = leader;
    }
}
