package com.quiz.simplequiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvScore, tvQuestion;
    Button btnAns01,btnAns02,btnAns03,btnAns04;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore;
    private int mQuestionLenght = mQuestions.getLenght();

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        tvScore = (TextView)findViewById(R.id.tv_score);
        tvQuestion = (TextView)findViewById(R.id.tv_question);

        btnAns01 = (Button) findViewById(R.id.btn_ans_1);
        btnAns02 = (Button) findViewById(R.id.btn_ans_2);
        btnAns03 = (Button) findViewById(R.id.btn_ans_3);
        btnAns04 = (Button) findViewById(R.id.btn_ans_4);

        updateQuestion(r.nextInt(mQuestionLenght));

        btnAns01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnAns01.getText().toString().equalsIgnoreCase(mAnswer)){
                    mScore++;
                    tvScore.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                }else{
                    gameOver();
                }
            }
        });
        btnAns02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnAns02.getText().toString().equalsIgnoreCase(mAnswer)){
                    mScore++;
                    tvScore.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                }else{
                    gameOver();
                }
            }
        });
        btnAns03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnAns03.getText().toString().equalsIgnoreCase(mAnswer)){
                    mScore++;
                    tvScore.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                }else{
                    gameOver();
                }
            }
        });
        btnAns04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnAns04.getText().toString().equalsIgnoreCase(mAnswer)){
                    mScore++;
                    tvScore.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                }else{
                    gameOver();
                }
            }
        });

    }

    private void updateQuestion(int i){
        tvQuestion.setText(mQuestions.getQuestion(i));
        btnAns01.setText(mQuestions.getChoice1(i));
        btnAns02.setText(mQuestions.getChoice2(i));
        btnAns03.setText(mQuestions.getChoice3(i));
        btnAns04.setText(mQuestions.getChoice4(i));

        mAnswer = mQuestions.getCorrentAnswer(i);
    }


    private void gameOver(){
        new AlertDialog.Builder(this)
        .setMessage("Game over! Your score is "+ mScore+" points")
        .setCancelable(false)
        .setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        })
        .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        }).create().show();
    }
}
