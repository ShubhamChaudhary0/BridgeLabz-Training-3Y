import java.util.*;

class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String msg) {
        super(msg);
    }
}

public class QuizResultProcessor {
    public static int calculateScore(String[] correct, String[] user) throws InvalidQuizSubmissionException {
        if (correct.length != user.length) {
            throw new InvalidQuizSubmissionException("Answer length mismatch!");
        }
        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(user[i])) score++;
        }
        return score;
    }

    public static void main(String[] args) {
        String[] correct = {"A","B","C","D"};
        String[] user = {"a","b","X","d"};
        try {
            int score = calculateScore(correct, user);
            System.out.println("Score: " + score + "/" + correct.length);
        } catch (InvalidQuizSubmissionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
