package com.example.danyal.bluetoothhc05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.catalinjurjiu.animcubeandroid.AnimCube;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;

public class AutoScrambling extends AppCompatActivity {

    Toolbar mtoolbar;
    TextInputEditText noofmoves;
    public AnimCube animCube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_scrambling);
        animCube = findViewById(R.id.animcube2);
        mtoolbar=findViewById(R.id.autotoolbar);

        noofmoves=findViewById(R.id.nofmovesauto);



        setSupportActionBar(mtoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }


   //for movement animation
    private void moveanimation(String s) {

        animCube.setMoveSequence(s);
        animCube.animateMoveSequence();
    }

    private void AutoMoves(int moves) {
        int min = 1;
        int max = 12;
        int i1;

        for(int i=0;i<moves;i++)
        {
            Random r = new Random();
            i1 = r.nextInt(max - min + 1) + min;
            Toast.makeText(this, i1, Toast.LENGTH_SHORT).show();
            switch(i1)
            {
                //1==U 3==D 5==F 7==B 9==L 11==R 12==U' 10==D' 8==F' 6==B' 4==L' 2==R'
                case 1:
                    moveanimation("U");
                    break;
                case 2:
                    moveanimation("R'");
                    break;
                case 3:
                    moveanimation("D");
                    break;
                case 4:
                    moveanimation("L'");
                    break;
                case 5:
                    moveanimation("F");
                    break;
                case 6:
                    moveanimation("B'");
                    break;
                case 7:
                    moveanimation("B");
                    break;
                case 8:
                    moveanimation("F'");
                    break;
                case 9:
                    moveanimation("L");
                    break;
                case 10:
                    moveanimation("D'");
                    break;
                case 11:
                    moveanimation("R");
                    break;
                case 12:
                    moveanimation("U'");
                    break;

            }

        }

    }

    //clicking go button
    public void autoscramblingclick(View view) {

        String value=noofmoves.getText().toString().trim();
        int nofmoves=Integer.valueOf(value);
        AutoMoves(nofmoves);

    }
}
