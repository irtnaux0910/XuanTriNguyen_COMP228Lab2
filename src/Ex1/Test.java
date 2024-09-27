package Ex1;

import javax.swing.JOptionPane;
import java.util.Random;
public class Test {
        private int correctAnswers = 0;
        private int incorrectAnswers = 0;
    public String[] questions = {
            "Which of the following tools support the software-development process, including editors for writing and editing programs and debuggers for locating logic errors—errors that cause programs to execute incorrectly?",
            "What is the main function of a Java compiler?",
            "Which of the following components does a Java application need to have at least one of?",
            "Which one of the following symbols indicates a single line comment in Java application source code:",
            "Which one of the following symbols indicates a multi-line comment in Java application source code?"
    };

    public String[][] answers = {
            {"Java Integrated Development Envronments (IDE)", "Java Application Programming Interfaces (API)", "Java Development Kit (JDK)", "Java Virtual Machine (JVM)"},
            { "It executes the bytecodes", "It examines the bytecodes to ensure that they  are valid and do not violate Java’s security restrictions.", "It places the program in memory to execute it","It translates the Java source code into bytecodes that represent the tasks to execute."},
            { "Non-static Method","Class", "Local variable", "Instance variable"},
            {"//", "#!", "\\\\", "##"},
            {"||         ||", "##","/*           */", "//         \\\\"}
    };
    private int[] correctAnswer = {0,3,1,0,2};
    private int questionIndex = 0;

    public void simulateQuestion(String question, String[] answers) {
        String userAnswer = inputAnswer(question, answers);
        int correctAnswerIndex = questionIndex % correctAnswer.length;
        int ans = correctAnswer[correctAnswerIndex];
        checkAnswer(userAnswer, answers[ans]);
        questionIndex++;
    }

        private String inputAnswer(String question, String[] answers) {
            return (String) JOptionPane.showInputDialog(null, question, "Test Question", JOptionPane.QUESTION_MESSAGE, null, answers, answers[0]);
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
            for (int i = 0; i < questions.length; i++) {
                simulateQuestion(questions[i], answers[i]);
            }
            double percentage = (double) correctAnswers / (correctAnswers + incorrectAnswers) * 100;
            JOptionPane.showMessageDialog(null, "Correct answers: " + correctAnswers + "\nIncorrect answers: " + incorrectAnswers + "\nPercentage of correct answers: " + percentage + "%", "Ex1.Test Results", JOptionPane.INFORMATION_MESSAGE);
        }
    }