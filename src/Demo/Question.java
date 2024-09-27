package Demo;

public class Question {
    private String _question;
    private String[] _answers;
    private int _correctAnswer;

    // question constructor
    Question(String question, String[] answers, int correctAnswer){
        this._question=question;
        this._answers=answers;
        this._correctAnswer=correctAnswer;
    }

    // getter for set question
    public String get_question(){return this._question;}

    // getter for answers
    public String[] get_answers(){return this._answers;}

    // getter for correct answers
    public int get_correctAnswer(){return this._correctAnswer;}
}
