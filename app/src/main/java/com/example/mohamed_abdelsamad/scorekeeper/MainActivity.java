package com.example.mohamed_abdelsamad.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView egyptscore;
    TextView russiascore;
    Button reset;
    Button Russia_Add6;
    Button Egypt_Add6;
    Button Russia_Add1;
    Button Egypt_Add1;
    Button Russia_Add3;
    Button Egypt_Add3;
    Button Russia_Add2;
    Button Egypt_Add2;
    int i;
    int j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        egyptscore = findViewById(R.id.egyptscore);
        russiascore = findViewById(R.id.rusiascore);
        reset = findViewById(R.id.reset);
        Russia_Add6 = findViewById(R.id.buton1);
        Egypt_Add6 = findViewById(R.id.buton2);
        Russia_Add1 = findViewById(R.id.buton3);
        Egypt_Add1 = findViewById(R.id.buton4);
        Russia_Add3 = findViewById(R.id.buton5);
        Egypt_Add3 = findViewById(R.id.buton6);
        Russia_Add2 = findViewById(R.id.buton7);
        Egypt_Add2 = findViewById(R.id.buton8);
    }

    public void resetscore(View view) {
        i = 0;
        j = 0;
        egyptscore.setText(String.valueOf(i));
        russiascore.setText(String.valueOf(j));
        update(view);
    }

    public void update(View view) {

       switch(view.getId()){
           case R.id.buton1: {    // if button seleted is button 1
               i += 6;              // add 6 to the previous value
               russiascore.setText(String.valueOf(i));  // make the text for textview  with the new value
           }break;
           case R.id.buton2: {       // if button seleted is button 2
               j += 6;               // add 6 to the previous value
               egyptscore.setText(String.valueOf(j));           // make the text for textview  with the new value
           }break;
           case R.id.buton3: {        // if button seleted is button 3
               i += 1;                   // add 1 to the previous value
               russiascore.setText(String.valueOf(i));        // make the text for textview  with the new value
           }break;
           case R.id.buton4: {       // if button seleted is button 4
               j += 1;                  // add 1 to the previous value
               egyptscore.setText(String.valueOf(j));               // make the text for textview  with the new value
           }break;
           case R.id.buton5: {           // if button seleted is button 5
               i += 3;                 // add 3 to the previous value
               russiascore.setText(String.valueOf(i));       // make the text for textview  with the new value
           }break;
           case R.id.buton6: {                 // if button seleted is button 6
               j += 3;                      // add 3 to the previous value
               egyptscore.setText(String.valueOf(j));           // make the text for textview  with the new value
           }break;
           case R.id.buton7: {                      // if button seleted is button 7
               i += 2;                         // add 2 to the previous value
               russiascore.setText(String.valueOf(i));          // make the text for textview  with the new value
           }break;
           case R.id.buton8: {                 // if button seleted is button 8
               j += 2;                      // add 2 to the previous value
               egyptscore.setText(String.valueOf(j));       // make the text for textview  with the new value
           }break;
           default:
               Log.i("no thing pressed","try again");

       }


    }
}
