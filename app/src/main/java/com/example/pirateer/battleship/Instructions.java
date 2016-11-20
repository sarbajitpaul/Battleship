package com.example.pirateer.battleship;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        TextView instructionText = (TextView) findViewById(R.id.instructionText);
        instructionText.setText(Html.fromHtml(getString(R.string.instructions)));
    }
}
