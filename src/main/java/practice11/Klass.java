package practice11;

public class Klass {
    //    Create class Klass with fields number and leader.
    private int number;
    private Student leader;
    private Student member;

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

    //A teacher will print text below when a student becomes the leader of any classes that the teacher teach:
    //>I am Tom. I know Jerry become Leader of Class 2.

    //    Klass has a assignLeader method which receive a Student instance to assign the leader of the Klass.
    void assignLeader(Student leader){
        if (member != null){
            this.leader = leader;
            System.out.print("I am Tom. I know " + leader.getName() + " become Leader of Class " + getNumber() + ".\n");
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    //Klass also has a appendMember method which receive a Student instance to add a  student to this Klass.
    //If a student is not in the Klass, then assignLeader to the student will fail and return:
    //>It is not one of us.
    //and if so, the method introduce of Student should just bahave like before.

    //A teacher will print text below when a student joins any classes that the teacher teach:
    //>I am Tom. I know Jerry has joined Class 2.
    void appendMember(Student student){
        member = student;
        System.out.print("I am Tom. I know " + member.getName() + " has joined Class " + getNumber() + ".\n");
    }

}
