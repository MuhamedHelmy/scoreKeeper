package com.example.mohamed_abdelsamad.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView egyptscore,russiascore;
  Button reset,Russia_Add6,Egypt_Add6,Russia_Add1,Egypt_Add1,Russia_Add3,Egypt_Add3,Russia_Add2,Egypt_Add2;
    int i=0;
    int j=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        egyptscore=(TextView)findViewById(R.id.egyptscore);
        russiascore=(TextView)findViewById(R.id.rusiascore);
        reset=(Button)findViewById(R.id.reset);
        Russia_Add6=(Button)findViewById(R.id.buton1);
        Egypt_Add6=(Button)findViewById(R.id.buton2);
        Russia_Add1=(Button)findViewById(R.id.buton3);
        Egypt_Add1=(Button)findViewById(R.id.buton4);
        Russia_Add3=(Button)findViewById(R.id.buton5);
        Egypt_Add3=(Button)findViewById(R.id.buton6);
        Russia_Add2=(Button)findViewById(R.id.buton7);
        Egypt_Add2=(Button)findViewById(R.id.buton8);
    }

    public void resetscore(View view) {
        i=0;
        j=0;
        egyptscore.setText(String.valueOf(i));
        russiascore.setText(String.valueOf(i));
    }

    public void update(View view) {
       switch(view.getId()){
           case R.id.buton1:{
               i+=6;
               russiascore.setText(String.valueOf(i));
           }break;
           case R.id.buton2:{
               j+=6;
               egyptscore.setText(String.valueOf(j));
           }break;
           case R.id.buton3:{
               i+=1;
               russiascore.setText(String.valueOf(i));
           }break;
           case R.id.buton4:{
               j+=1;
               egyptscore.setText(String.valueOf(j));
           }break;
           case R.id.buton5:{
               i+=3;
               russiascore.setText(String.valueOf(i));
           }break;
           case R.id.buton6:{
               j+=3;
               egyptscore.setText(String.valueOf(j));
           }break;
           case R.id.buton7:{
               i+=2;
               russiascore.setText(String.valueOf(i));
           }break;
           case R.id.buton8:{
               j+=2;
               egyptscore.setText(String.valueOf(j));
           }break;
           default:
               Log.i("no thing pressed","try again");
       }


    }
}
