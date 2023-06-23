import java.util.Arrays;

public class Class {
    int number;
    String word;
    int[] massive;
    public Class() {

    }
    public Class(int number, String word, int[] massive) {
        this.number = number;
        this.word = word;
        this.massive = massive;
    }

    @Override
    public String toString() {
        return "Class:" +
                "number:" + number +"\n"+
                "word:" + word + "\n" +
                "massive:" + Arrays.toString(massive);
    }
}