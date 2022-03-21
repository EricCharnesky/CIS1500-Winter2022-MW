package arraysandarraylists;

public class Main {

    public static void main(String[] args) {
        int score1 = 99;
        int score2 = 100;
        int score3 = score1;
        int score4 = 92;
        int score5 = 94;

        System.out.println("score1: " + score1);
        System.out.println("score3: " + score3);

        score1 = 100;
        System.out.println("score1: " + score1);
        System.out.println("score3: " + score3);

        // array - type name + square braces =  new keyword, type[number of values]
        int scores[] = new int[5]; // indexes 0-4

        // variables [index of] - you can set or get the value
        scores[0] = 99;
        scores[1] = 100;
        scores[2] = scores[0]; // assigns on the left, get on the right
        scores[3] = 92;
        scores[4] = 94;

        for ( int index = 0; index < scores.length; index++ ){
            System.out.println("Scores at index: " + index + " == " + scores[index]);
        }

        int highestScore = scores[0];
        int lowestScore=  scores[0];
        double totalScore = 0; // to avoid int division

        // enhanced for loop - READ ONLY
        // for ( type variable-name in array )
        for ( int score : scores){
            if ( score > highestScore){
                highestScore = score;
            }
            if ( score < lowestScore){
                lowestScore = score;
            }
            totalScore += score;
        }

        System.out.println("Highest score: " + highestScore);
        System.out.println("Lowest score: " + lowestScore);
        System.out.println("Average score: " + totalScore / scores.length);
    }
}
