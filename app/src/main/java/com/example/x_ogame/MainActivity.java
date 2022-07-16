package com.example.x_ogame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageButton b,bg;
    ImageView im;
    Animation anim1,anim2,anim3;
    TextView p1,p2;
    Spinner s,ss;
    String mx="player 1 : ",mo="player 2 : ",sp1,sp2;
    int x,y,sx,sy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.but_start);
        bg=findViewById(R.id.but_start1);
        im=findViewById(R.id.imageView);
        p1=findViewById(R.id.p1);
        p2=findViewById(R.id.p2);
        s = findViewById(R.id.spinner_p1);
        ss = findViewById(R.id.spinner_p2);
        //load animation
        anim1= AnimationUtils.loadAnimation(this,R.anim.anim1);
        anim2= AnimationUtils.loadAnimation(this,R.anim.anim2);
        anim3= AnimationUtils.loadAnimation(this,R.anim.anim3);
        //set animation
        b.startAnimation(anim2);
        bg.startAnimation(anim1);
        im.startAnimation(anim1);
        s.startAnimation(anim3);
        ss.startAnimation(anim2);
        p1.startAnimation(anim3);
        p2.startAnimation(anim2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setVisibility(View.GONE);
                b.setVisibility(View.GONE);
                s.setVisibility(View.VISIBLE);
                ss.setVisibility(View.VISIBLE);
                p1.setVisibility(View.VISIBLE);
                p2.setVisibility(View.VISIBLE);
                //Intent in=new Intent(getApplicationContext(),game.class);
              //  startActivity(in);
            }
        });
        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),game.class);
                in.putExtra("p1",sx);
                in.putExtra("p2",sy);
                 startActivity(in);
            }
        });
        List<String> item=new ArrayList<String>();
        item.add("X");
        item.add("O");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, item);
        s.setAdapter(adapter);
        ss.setAdapter(adapter);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //   Toast.makeText(MainActivity.this, "p"+position, Toast.LENGTH_SHORT).show();
                p1.setText(mx+item.get(position));
                x=position;
                sp1=item.get(position);
                if(x==0){
                    sx=0;
                }
                else {
                    sx=1;
                }
                choose();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ss.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //   Toast.makeText(MainActivity.this, "p"+position, Toast.LENGTH_SHORT).show();
                p2.setText(mo+item.get(position));
                y=position;
                sp2=item.get(position);
                if(y==0){
                    sy=0;
                }
                else {
                    sy=1;
                }
                choose();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


    }
    private void choose() {
        if(x==y){
            Toast.makeText(this, "choose agen", Toast.LENGTH_SHORT).show();
            bg.setVisibility(View.GONE);
        }
        else {
            bg.setVisibility(View.VISIBLE);
        }
    }
}