package com.example.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {


    int scoreTeamA=0;
    int scoreTeamB=0;
    int scoreTeamC=0;

    EditText editScoreA;
    Button updateAbutton;
    EditText editScoreB;
    Button updateBbutton;
    EditText editScoreC;
    Button updateCbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editScoreA = (EditText) findViewById(R.id.editAscore);
        updateAbutton = (Button) findViewById(R.id.updateA);
        updateAbutton.setOnClickListener(this);
        editScoreB = (EditText) findViewById(R.id.editBscore);
        updateBbutton = (Button) findViewById(R.id.updateB);
        updateBbutton.setOnClickListener(this);
        editScoreC = (EditText) findViewById(R.id.editCscore);
        updateCbutton = (Button) findViewById(R.id.updateC);
        updateCbutton.setOnClickListener(this);
    }
        @Override
        public void onClick(View v){
            switch (v.getId()) {
                case R.id.updateA:
                    scoreTeamA+= Integer.valueOf(editScoreA.getText().toString());
                    displayForTeamA(scoreTeamA);
                    break;

                case R.id.updateB:
                    scoreTeamB+= Integer.valueOf(editScoreB.getText().toString());
                    displayForTeamB(scoreTeamB);
                    break;

                case R.id.updateC:
                    scoreTeamC+= Integer.valueOf(editScoreC.getText().toString());
                    displayForTeamC(scoreTeamC);
                    break;

                case R.id.reset:
                    displayForTeamA(0);
                    displayForTeamB(0);
                    displayForTeamC(0);
                    scoreTeamA=0;
                    scoreTeamB = 0;
                    scoreTeamC=0;

                default:
                    break;




    }




        }







    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamC(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_c_score);
        scoreView.setText(String.valueOf(score));
    }
}
