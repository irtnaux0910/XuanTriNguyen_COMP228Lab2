package Ex1;

import javax.swing.JOptionPane;
import java.util.Random;
public class Test {
        private int correctAnswers = 0;
        private int incorrectAnswers = 0;

        public void simulateQuestion(String question, String[] answers) {
            String userAnswer = inputAnswer(question, answers);
            checkAnswer(userAnswer, answers[0]);
        }

        private String inputAnswer(String question, String[] answers) {
            return (String) JOptionPane.showInputDialog(null, question, "Ex1.Test Question", JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);
        }

        private void checkAnswer(String userAnswer, String correctAnswer) {
            if (userAnswer.equals(correctAnswer)) {
                correctAnswers++;
                JOptionPane.showMessageDialog(null, generateMessage(0), "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                incorrectAnswers++;
                JOptionPane.showMessageDialog(null, generateMessage(1) + "\nCorrect answer: " + correctAnswer, "Result", JOptionPane.ERROR_MESSAGE);
            }
        }
       
        private String generateMessage(int type) {
            Random random = new Random();
            switch (random.nextInt(4)) {
                case 0:
                    return type == 0 ? "Excellent!" : "No. Please try again";
                case 1:
                    return type == 0 ? "Good!" : "Wrong. Try once more";
                case 2:
                    return type == 0 ? "Keep up the good work!" : "Don't give up!";
                case 3:
                    return type == 0 ? "Nice work!" : "No. Keep trying";
                default:
                    return "";
            }
        }

        public void displayResults() {
            double percentage = (double) correctAnswers / (correctAnswers + incorrectAnswers) * 100;
            JOptionPane.showMessageDialog(null, "Correct answers: " + correctAnswers + "\nIncorrect answers: " + incorrectAnswers + "\nPercentage of correct answers: " + percentage + "%", "Ex1.Test Results", JOptionPane.INFORMATION_MESSAGE);
        }
    }