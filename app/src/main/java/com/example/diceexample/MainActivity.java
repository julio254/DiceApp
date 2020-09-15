package com.example.diceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();

    private MediaPlayer mpWin;
    private MediaPlayer mpLoss;
    private MediaPlayer Regular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting
        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    // Method that rolls the dice from the rng file which randomly selects a number between 1-6
    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;

        switch(randomNumber) {
            case 1:
                mpLoss = MediaPlayer.create(MainActivity.this, R.raw.bruh);
                mpLoss.start();
                imageViewDice.setImageResource(R.drawable.dice1);
                Toast.makeText(this,"Your roll got a Critical Miss!", Toast.LENGTH_LONG).show();
                break;

            case 2:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice2);
                break;

            case 3:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice3);
                break;

            case 4:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                break;

            case 5:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice5);
                break;

            case 6:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice6);
                break;

            case 7:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice7);
                break;

            case 8:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice8);
                break;

            case 9:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice9);
                break;

            case 10:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice10);
                break;

            case 11:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice11);
                break;

            case 12:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice12);
                break;

            case 13:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice13);
                break;

            case 14:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice14);
                break;

            case 15:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice15);
                break;

            case 16:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice16);
                break;

            case 17:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice17);
                break;

            case 18:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice18);
                break;

            case 19:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice19);
                break;

            case 20:
                mpWin = MediaPlayer.create(MainActivity.this, R.raw.noice);
                mpWin.start();
                imageViewDice.setImageResource(R.drawable.dice20);
                Toast.makeText(this,"Your roll got a Critical Hit!!!!", Toast.LENGTH_LONG).show();
                break;

        }
    }
}