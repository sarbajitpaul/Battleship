package com.example.pirateer.battleship;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button A1 , A2 , A3 , A4 , A5 , A6 , A7 , A8;
    Button B1 , B2 , B3 , B4 , B5 , B6 , B7 , B8;
    Button C1 , C2 , C3 , C4 , C5 , C6 , C7 , C8;
    Button D1 , D2 , D3 , D4 , D5 , D6 , D7 , D8;
    Button E1 , E2 , E3 , E4 , E5 , E6 , E7 , E8;
    Button F1 , F2 , F3 , F4 , F5 , F6 , F7 , F8;
    Button G1 , G2 , G3 , G4 , G5 , G6 , G7 , G8;
    Button H1 , H2 , H3 , H4 , H5 , H6 , H7 , H8;
    TextView title;
    ArrayList<Integer> battleShips = new ArrayList<>();
    int noOfGuesses = 0 , i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        (A1 = (Button) findViewById(R.id.A1)).setOnClickListener(this);
        (A2 = (Button) findViewById(R.id.A2)).setOnClickListener(this);
        (A3 = (Button) findViewById(R.id.A3)).setOnClickListener(this);
        (A4 = (Button) findViewById(R.id.A4)).setOnClickListener(this);
        (A5 = (Button) findViewById(R.id.A5)).setOnClickListener(this);
        (A6 = (Button) findViewById(R.id.A6)).setOnClickListener(this);
        (A7 = (Button) findViewById(R.id.A7)).setOnClickListener(this);
        (A8 = (Button) findViewById(R.id.A8)).setOnClickListener(this);

        (B1 = (Button) findViewById(R.id.B1)).setOnClickListener(this);
        (B2 = (Button) findViewById(R.id.B2)).setOnClickListener(this);
        (B3 = (Button) findViewById(R.id.B3)).setOnClickListener(this);
        (B4 = (Button) findViewById(R.id.B4)).setOnClickListener(this);
        (B5 = (Button) findViewById(R.id.B5)).setOnClickListener(this);
        (B6 = (Button) findViewById(R.id.B6)).setOnClickListener(this);
        (B7 = (Button) findViewById(R.id.B7)).setOnClickListener(this);
        (B8 = (Button) findViewById(R.id.B8)).setOnClickListener(this);

        (C1 = (Button) findViewById(R.id.C1)).setOnClickListener(this);
        (C2 = (Button) findViewById(R.id.C2)).setOnClickListener(this);
        (C3 = (Button) findViewById(R.id.C3)).setOnClickListener(this);
        (C4 = (Button) findViewById(R.id.C4)).setOnClickListener(this);
        (C5 = (Button) findViewById(R.id.C5)).setOnClickListener(this);
        (C6 = (Button) findViewById(R.id.C6)).setOnClickListener(this);
        (C7 = (Button) findViewById(R.id.C7)).setOnClickListener(this);
        (C8 = (Button) findViewById(R.id.C8)).setOnClickListener(this);

        (D1 = (Button) findViewById(R.id.D1)).setOnClickListener(this);
        (D2 = (Button) findViewById(R.id.D2)).setOnClickListener(this);
        (D3 = (Button) findViewById(R.id.D3)).setOnClickListener(this);
        (D4 = (Button) findViewById(R.id.D4)).setOnClickListener(this);
        (D5 = (Button) findViewById(R.id.D5)).setOnClickListener(this);
        (D6 = (Button) findViewById(R.id.D6)).setOnClickListener(this);
        (D7 = (Button) findViewById(R.id.D7)).setOnClickListener(this);
        (D8 = (Button) findViewById(R.id.D8)).setOnClickListener(this);

        (E1 = (Button) findViewById(R.id.E1)).setOnClickListener(this);
        (E2 = (Button) findViewById(R.id.E2)).setOnClickListener(this);
        (E3 = (Button) findViewById(R.id.E3)).setOnClickListener(this);
        (E4 = (Button) findViewById(R.id.E4)).setOnClickListener(this);
        (E5 = (Button) findViewById(R.id.E5)).setOnClickListener(this);
        (E6 = (Button) findViewById(R.id.E6)).setOnClickListener(this);
        (E7 = (Button) findViewById(R.id.E7)).setOnClickListener(this);
        (E8 = (Button) findViewById(R.id.E8)).setOnClickListener(this);

        (F1 = (Button) findViewById(R.id.F1)).setOnClickListener(this);
        (F2 = (Button) findViewById(R.id.F2)).setOnClickListener(this);
        (F3 = (Button) findViewById(R.id.F3)).setOnClickListener(this);
        (F4 = (Button) findViewById(R.id.F4)).setOnClickListener(this);
        (F5 = (Button) findViewById(R.id.F5)).setOnClickListener(this);
        (F6 = (Button) findViewById(R.id.F6)).setOnClickListener(this);
        (F7 = (Button) findViewById(R.id.F7)).setOnClickListener(this);
        (F8 = (Button) findViewById(R.id.F8)).setOnClickListener(this);

        (G1 = (Button) findViewById(R.id.G1)).setOnClickListener(this);
        (G2 = (Button) findViewById(R.id.G2)).setOnClickListener(this);
        (G3 = (Button) findViewById(R.id.G3)).setOnClickListener(this);
        (G4 = (Button) findViewById(R.id.G4)).setOnClickListener(this);
        (G5 = (Button) findViewById(R.id.G5)).setOnClickListener(this);
        (G6 = (Button) findViewById(R.id.G6)).setOnClickListener(this);
        (G7 = (Button) findViewById(R.id.G7)).setOnClickListener(this);
        (G8 = (Button) findViewById(R.id.G8)).setOnClickListener(this);

        (H1 = (Button) findViewById(R.id.H1)).setOnClickListener(this);
        (H2 = (Button) findViewById(R.id.H2)).setOnClickListener(this);
        (H3 = (Button) findViewById(R.id.H3)).setOnClickListener(this);
        (H4 = (Button) findViewById(R.id.H4)).setOnClickListener(this);
        (H5 = (Button) findViewById(R.id.H5)).setOnClickListener(this);
        (H6 = (Button) findViewById(R.id.H6)).setOnClickListener(this);
        (H7 = (Button) findViewById(R.id.H7)).setOnClickListener(this);
        (H8 = (Button) findViewById(R.id.H8)).setOnClickListener(this);

        findViewById(R.id.hitButton).getBackground().setColorFilter(Color.parseColor("#9b0000"), PorterDuff.Mode.DARKEN);;
        findViewById(R.id.missButton).getBackground().setColorFilter(Color.parseColor("#A3CC7A"), PorterDuff.Mode.DARKEN);;

        title = (TextView) findViewById(R.id.title);

        //String a = "";
        for(i = 0 ; i < 3 ; i++) {
            setBattleShips();
        }

        /*for (String S : battleShips) {
            a += S + " ";
            int id = getResources().getIdentifier(S, "id", getPackageName());
            View v = findViewById(id);
            v.getBackground().setColorFilter(Color.parseColor("#9b0000"), PorterDuff.Mode.DARKEN);
        }
        //a += "|";

        title.setText(a);*/

        /*A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                title.setText("Working" + id);
                v.getBackground().setColorFilter(Color.parseColor("#9b0000"), PorterDuff.Mode.DARKEN);
            }
        });*/
    }

    private void setBattleShips() {
        int determine = (int) (Math.random() * 2 + 1);

        if(determine % 2 == 0)
            setUpHorizontal();
        else
            setUpVertical();
    }

    private void setUpHorizontal() {
        int row = (int) (Math.random() * 8);
        int column = (int) (Math.random() * 6 + 1);

        String S = "";
        S += (char) (row + 65);
        S += column;
        int id = getResources().getIdentifier(S, "id", getPackageName());

        if(i != 0 && (battleShips.contains(id) || battleShips.contains(id + 1) || battleShips.contains(id + 2)))
            setUpHorizontal();
        else {
            battleShips.add(id);
            battleShips.add(++id);
            battleShips.add(++id);
        }
    }

    private void setUpVertical() {
        int row = (int) (Math.random() * 6);
        int column = (int) (Math.random() * 8 + 1);

        String S = "";
        S += (char) (row + 65);
        S += column;
        int id = getResources().getIdentifier(S, "id", getPackageName());

        if(i != 0 && (battleShips.contains(id) || battleShips.contains(id + 8) || battleShips.contains(id + 16)))
            setUpVertical();
        else {
            battleShips.add(id);
            battleShips.add(id + 8);
            battleShips.add(id + 16);
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        noOfGuesses++;

        if(battleShips.contains(id)){
            battleShips.remove(battleShips.indexOf(id));

            if(battleShips.isEmpty())
                Toast.makeText(this , "Congratulations! You took " + noOfGuesses + " guesses." , Toast.LENGTH_SHORT).show();
            v.getBackground().setColorFilter(Color.parseColor("#9b0000"), PorterDuff.Mode.DARKEN);
            v.setEnabled(false);
        }
        else{
            v.getBackground().setColorFilter(Color.parseColor("#A3CC7A"), PorterDuff.Mode.DARKEN);
            v.setEnabled(false);
        }
    }
}
