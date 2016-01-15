package module6.task2flower;

public class RosebushWithNoRosesException extends Exception {

    public String getExceptionMessage(){
        return "Rosebush can't exist with no roses!";
    }

}
