package com.example.danyal.bluetoothhc05;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.catalinjurjiu.animcubeandroid.AnimCube;

public class scramblingcube3d extends AppCompatActivity {

    public AnimCube animCube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scramblingcube3d);
        animCube = findViewById(R.id.animcube);

    }

    public void btn1click(View view) {
        animCube.setMoveSequence("U");
        animCube.animateMoveSequence();

    }

    public void btn2click(View view) {
        animCube.setMoveSequence("U'");
        animCube.animateMoveSequence();
    }

    public void btn3click(View view) {
        animCube.setMoveSequence("D");
        animCube.animateMoveSequence();
    }

    public void btn4click(View view) {
        animCube.setMoveSequence("D'");
        animCube.animateMoveSequence();
    }

    public void btn5click(View view) {
        animCube.setMoveSequence("F");
        animCube.animateMoveSequence();
    }

    public void btn6click(View view) {
        animCube.setMoveSequence("F'");
        animCube.animateMoveSequence();
    }


    public void btn7click(View view) {
        animCube.setMoveSequence("B");
        animCube.animateMoveSequence();
    }

    public void btn8click(View view) {
        animCube.setMoveSequence("B'");
        animCube.animateMoveSequence();
    }

    public void btn9click(View view) {
        animCube.setMoveSequence("L");
        animCube.animateMoveSequence();
    }

    public void btn10click(View view) {
        animCube.setMoveSequence("L'");
        animCube.animateMoveSequence();
    }

    public void btn11click(View view) {
        animCube.setMoveSequence("R");
        animCube.animateMoveSequence();
    }

    public void btn12click(View view) {
        animCube.setMoveSequence("R'");
        animCube.animateMoveSequence();
    }
}
