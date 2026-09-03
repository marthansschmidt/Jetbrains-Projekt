public class Main {

    public static void main(String[] args) {

        Question question1 = new Question(
                1,
                "Which of these is a Java data type?",
                "String",
                "System",
                "Scanner",
                "Main",
                "String"
        );

        Question question2 = new Question(
                2,
                "Which keyword is used for a condition in Java?",
                "while",
                "if",
                "class",
                "new",
                "if"
        );

        Question question3 = new Question(
                3,
                "Which symbol ends a Java statement?",
                ".",
                ",",
                ";",
                ":",
                ";"
        );

        question1.printInfo();
        question2.printInfo();
        question3.printInfo();
    }
}