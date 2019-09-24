package practice07;

public class Klass {
//    Create class Klass with a field named number.
//    And pass a Klass instance into the constructor of Student. Please refer to test cases.
    private int number;

    Klass(int number){
        this.number = number;
    }

    int getNumber(){
        return number;
    }

    String getDisplayName(){
        return "Class " + number;
    }
}
