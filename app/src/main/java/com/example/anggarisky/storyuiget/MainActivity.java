package com.example.anggarisky.storyuiget;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleStory, subtitleStory, titleStoryTwo;
    Button btnstory, btnstarted;
    EditText inputStoryOne, inputStoryTwo, inputStoryThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleStory = (TextView) findViewById(R.id.titleStory);
        titleStoryTwo = (TextView) findViewById(R.id.titleStoryTwo);
        subtitleStory = (TextView) findViewById(R.id.subtitleStory);

        inputStoryOne = (EditText) findViewById(R.id.inputStoryOne);
        inputStoryTwo = (EditText) findViewById(R.id.inputStoryTwo);
        inputStoryThree = (EditText) findViewById(R.id.inputStoryThree);

        btnstory = (Button) findViewById(R.id.btnstory);
        btnstarted = (Button) findViewById(R.id.btnstarted);

        Typeface AbrilFat = Typeface.createFromAsset(getAssets(),"fonts/AbrilFat.ttf");
        Typeface MLight = Typeface.createFromAsset(getAssets(),"fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(),"fonts/MMedium.ttf");

        titleStory.setTypeface(AbrilFat);
        titleStoryTwo.setTypeface(AbrilFat);
        subtitleStory.setTypeface(MLight);
        btnstory.setTypeface(MMedium);

        inputStoryOne.setTypeface(MLight);
        inputStoryTwo.setTypeface(MLight);
        inputStoryThree.setTypeface(MLight);

//      set animate

        titleStoryTwo.setAlpha(0);
        titleStory.setTranslationY(200);

        inputStoryOne.setAlpha(0);
        inputStoryOne.setTranslationY(200);

        inputStoryTwo.setAlpha(0);
        inputStoryTwo.setTranslationY(200);

        inputStoryThree.setAlpha(0);
        inputStoryThree.setTranslationY(200);

        btnstarted.setAlpha(0);
        btnstarted.setTranslationY(200);

//      different screen

        titleStory.setAlpha(0);
        titleStory.setTranslationY(200);


        subtitleStory.setAlpha(0);
        subtitleStory.setTranslationY(200);

        btnstory.setAlpha(0);
        btnstory.setTranslationY(200);

        titleStory.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();
        subtitleStory.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(600).start();
        btnstory.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(900).start();

//      onclick animate

        btnstory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titleStoryTwo.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();

                inputStoryOne.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(600).start();
                inputStoryTwo.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(700).start();
                inputStoryThree.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(800).start();

                btnstarted.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(1000).start();

                // remove the old screen
                titleStory.animate().alpha(0).translationY(-200).setDuration(800).start();
                subtitleStory.animate().alpha(0).translationY(-200).setDuration(800).start();
                btnstory.animate().alpha(0).translationY(-200).setDuration(800).start();
            }
        });


    }
}
