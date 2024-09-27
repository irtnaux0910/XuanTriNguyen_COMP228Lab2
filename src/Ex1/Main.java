package Ex1;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        // Replace with your actual questions and answers
        String[] questions = {
                "Which of the following tools support the software-development process, including editors for writing and editing programs and debuggers for locating logic errors—errors that cause programs to execute incorrectly?",
                "What is the main function of a Java compiler?",
                "Which of the following components does a Java application need to have at least one of?",
                "Which one of the following symbols indicates a single line comment in Java application source code:",
                "Which one of the following symbols indicates a multi-line comment in Java application source code?"
        };

        String[][] answers = {
                {"Java Integrated Development Envronments (IDE)", "Java Application Programming Interfaces (API)", "Java Development Kit (JDK)", "Java Virtual Machine (JVM)"},
                {"It translates the Java source code into bytecodes that represent the tasks to execute.", "It executes the bytecodes", "It examines the bytecodes to ensure that they  are valid and do not violate Java’s security restrictions.", "It places the program in memory to execute it"},
                {"Class", "Local variable", "Non-static Method", "Instance variable"},
                {"//", "#!", "\\\\", "##"},
                {"/*           */", "||         ||", "##", "//         \\\\"}
        };

        for (int i = 0; i < questions.length; i++) {
            test.simulateQuestion(questions[i], answers[i]);
        }

        test.displayResults();
    }
}

