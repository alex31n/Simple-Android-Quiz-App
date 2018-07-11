package com.quiz.simplequiz;

public class Questions {

    private  String[] mQuestions = {
            "Which is the first planet in the Solar systems?",
            "Which is the second planet in the Solar systems?",
            "Which is the third planet in the Solar systems?",
            "Which is the fourth planet in the Solar systems?",
            "Which is the fifth planet in the Solar systems?",
            "Which is the sixth planet in the Solar systems?",
            "Which is the seventh planet in the Solar systems?",
            "Which is the eighth planet in the Solar systems?",
            "Which is the ninth planet in the Solar systems?",
    };


    private String[][] mCHoices={
            {"Mercury", "Venus","Mars","Saturn"},
            {"Jupiter", "Venus","Earth","Neptune"},
            {"Earth", "Jupiter","Pluto","Venus"},
            {"Jupiter", "Saturn","Mars","Earth"},
            {"Jupiter", "Pluto","Mercury","Earth"},
            {"Uranus", "Venus","Mars","Saturn"},
            {"Saturn", "Pluto","Uranus","Earth"},
            {"Venus", "Neptune","Pluto","Mars"},
            {"Mercury", "Venus","Mars","Pluto"},
    };


    private String[] mCorrectAnswers = {"Mercury", "Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto"};


    public String getQuestion(int a){
        return mQuestions[a];
    }

    public String getChoice1(int a){
        return mCHoices[a][0];
    }
    public String getChoice2(int a){
        return mCHoices[a][1];
    }
    public String getChoice3(int a){
        return mCHoices[a][2];
    }
    public String getChoice4(int a){
        return mCHoices[a][3];
    }
    public String getCorrentAnswer(int a){
        return mCorrectAnswers[a];
    }
    public int getLenght(){
        return mQuestions.length;
    }
}
