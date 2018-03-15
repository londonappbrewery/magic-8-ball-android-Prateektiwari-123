package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;
    Button AskButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView= findViewById(R.id.image_8ball);
        AskButton=findViewById(R.id.askButton);

        final int [] ballArray=new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        AskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random= new Random();
                int num =random.nextInt(5);
                imageView.setImageResource(ballArray[num]);

            }
        });
    }
}
