package Reflection;

public class ReflectionTest extends EmenyPlayer {

    private String currName = "Aushala";

    private String randString;

    public String getRandString() {
        return randString;
    }

    public String getCurrName() {
        return currName;
    }

    private String oppentName;

    private String getPrivate() {
        return "How did you get this";
    }

    private EmenyPlayer oppent;

    private String getOtherPrivate(int thisInt, String thatString) {

        return "How did you get here " + thisInt + " " + thatString;

    }

    public ReflectionTest(int number, String randString) {

        this.randString = randString;

        System.out.println("You sent: " + number + " " + randString);

    }

    public EmenyPlayer DominoEnemyplace(EmenyPlayer oppent) {

        return this.oppent = oppent;

    }
}
