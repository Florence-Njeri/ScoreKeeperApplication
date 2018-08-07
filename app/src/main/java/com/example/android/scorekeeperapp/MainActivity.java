package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int counterTry, counterPenalty, counterDropped, counterConversion;
    int counterTryB, counterPenaltyB, counterDroppedB, counterConversionB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    /**
     * Team A and set the textView of each button to the number of goals scored
     * @param view
     */
    public void tryTeamA(View view){
        scoreTeamA+=5;
        counterTry++;
     TextView   textViewTryA=findViewById(R.id.try_text_view);
        textViewTryA.setText(String.valueOf(counterTry));
        display( scoreTeamA);
    }
    public void penaltyKickTeamA(View view){
        scoreTeamA+=3;
        counterPenalty++;
       TextView textViewPenaltyA=findViewById(R.id.penalty_text_view);
        textViewPenaltyA.setText(String.valueOf(counterPenalty));
        display(scoreTeamA);
    }
    public void droppedGoalTeamA(View view){
        scoreTeamA+=3;
        counterDropped++;
      TextView  textViewDroppedA=findViewById(R.id.dropped_text_view);
        textViewDroppedA.setText(String.valueOf(counterDropped));

        display( scoreTeamA);
    }
    public void ConversionKickTeamA(View view){
        scoreTeamA+=2;
        counterConversion++;
       TextView textViewConversionA=findViewById(R.id.conversion_text_view);
        textViewConversionA.setText(String.valueOf(counterConversion));
        display( scoreTeamA);
    }
    public void display(int total){
        TextView scoreTextView=findViewById(R.id.team_a_score);
        scoreTextView.setText(String.valueOf(total));
    }
    /**
     * Team B and set the textView of each button to the number of goals scored
     * @param view
     */
    public void tryTeamB(View view){
        scoreTeamB+=5;
        counterTryB++;
        TextView textView=findViewById(R.id.try_B_view);
        textView.setText(String.valueOf(counterTryB));
        displayB(scoreTeamB);
    }
    public void penaltyKickTeamB(View view){
        scoreTeamB+=3;
        counterPenaltyB++;
        TextView textView=findViewById(R.id.penalty_B_view);
        textView.setText(String.valueOf(counterPenaltyB));
        displayB(scoreTeamB);
    }
    public void droppedGoalTeamB(View view){
        scoreTeamB+=3;
        counterDroppedB++;
        TextView textView=findViewById(R.id.dropped_B_view);
        textView.setText(String.valueOf(counterDroppedB));

        displayB(scoreTeamB);
    }
    public void ConversionKickTeamB(View view){
        scoreTeamB+=2;
        counterConversionB++;
        TextView textView=findViewById(R.id.conversion_B_view);
        textView.setText(String.valueOf(counterConversionB));
        displayB(scoreTeamB);
    }
    public void displayB(int total){
        TextView scoreTextView=findViewById(R.id.team_b_score);
        scoreTextView.setText(String.valueOf(total));
    }
    /**
     * Reset Button method
     */
    public void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        display(scoreTeamA);
        displayB(scoreTeamB);
       counterTry=0; counterPenalty=0; counterDropped=0; counterConversion=0;
         counterTryB=0; counterPenaltyB=0; counterDroppedB=0; counterConversionB=0;

         //Team A TextViews
        TextView   textViewTryA=findViewById(R.id.try_text_view);
        textViewTryA.setText(String.valueOf(counterTry));
        TextView textViewPenaltyA=findViewById(R.id.penalty_text_view);
        textViewPenaltyA.setText(String.valueOf(counterPenalty));
        TextView  textViewDroppedA=findViewById(R.id.dropped_text_view);
        textViewDroppedA.setText(String.valueOf(counterDropped));
        TextView textViewConversionA=findViewById(R.id.conversion_text_view);
        textViewConversionA.setText(String.valueOf(counterConversion));

//Team B Text View
        TextView textViewTryB=findViewById(R.id.try_B_view);
        textViewTryB.setText(String.valueOf(counterTryB));
        TextView textViewPenaltyB=findViewById(R.id.penalty_B_view);
        textViewPenaltyB.setText(String.valueOf(counterPenaltyB));
        TextView textViewDroppedB=findViewById(R.id.dropped_B_view);
        textViewDroppedB.setText(String.valueOf(counterDroppedB));
        TextView textViewConversionB=findViewById(R.id.conversion_B_view);
        textViewConversionB.setText(String.valueOf(counterConversionB));
    }
}



