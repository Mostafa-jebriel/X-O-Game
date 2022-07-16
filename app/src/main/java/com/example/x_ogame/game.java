package com.example.x_ogame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class game extends AppCompatActivity {
    ImageView b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private String sg="X",sy,sx,mx="player 1 : ",mo="player 2 : ",tsp="Turn For Player : ";
    int xc=0,oc=0,i1=3,i2=3,i3=3,i4=3,i5=3,i6=3,i7=3,i8=3,i9=3,i=0,p1=1,p2=2;
    TextView tx,to,ts,tw,td;
    ImageButton set;
    GifImageView gif;
    Button b,bb;
    Dialog d,d2;
    int x=0,x1,x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //inflate
        set=findViewById(R.id.btn_re);
        gif=findViewById(R.id.gif_view);
        tx=(TextView)findViewById(R.id.text_s_x);
        ts=(TextView)findViewById(R.id.text_s);
        to=(TextView)findViewById(R.id.text_s_o);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        //define dialog
        d=new Dialog(this);
        d.setContentView(R.layout.win);
        d.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        d.setCancelable(false);
        b=d.findViewById(R.id.but_win);
        tw=(TextView)d.findViewById(R.id.te_win);
        //
        d2=new Dialog(this);
        d2.setContentView(R.layout.draw);
        d2.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        d2.setCancelable(false);
        bb=d2.findViewById(R.id.but_dre);
        td=(TextView)d2.findViewById(R.id.te_dre);
        //Intent
        Intent in=getIntent();
        x1=in.getIntExtra("p1",0);
        x2=in.getIntExtra("p2",0);
        //Click buttons
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetvalue();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x==x1){
                    b1.setImageResource(R.drawable.x);
                    i1=1;
                    i++;
                }else {
                    b1.setImageResource(R.drawable.o);
                    i1=0;
                    i++;
                }
                choose_player();
                win_game();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x==x1){
                    b2.setImageResource(R.drawable.x);
                    i2=1;
                    i++;
                }else {
                    b2.setImageResource(R.drawable.o);
                    i2=0;
                    i++;
                }
                choose_player();
                win_game();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x==x1){
                    b3.setImageResource(R.drawable.x);
                    i3=1;
                    i++;
                }else {
                    b3.setImageResource(R.drawable.o);
                    i3=0;
                    i++;
                }
                choose_player();
                win_game();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x==x1){
                    b4.setImageResource(R.drawable.x);
                    i4=1;
                    i++;
                }else {
                    b4.setImageResource(R.drawable.o);
                    i4=0;
                    i++;
                }
                choose_player();
                win_game();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x==x1){
                    b5.setImageResource(R.drawable.x);
                    i5=1;
                    i++;
                }else {
                    b5.setImageResource(R.drawable.o);
                    i5=0;
                    i++;
                }
                choose_player();
                win_game();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x==x1){
                    b6.setImageResource(R.drawable.x);
                    i6=1;
                    i++;
                }else {
                    b6.setImageResource(R.drawable.o);
                    i6=0;
                    i++;
                }
                choose_player();
                win_game();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x==x1){
                    b7.setImageResource(R.drawable.x);
                    i7=1;
                    i++;
                }else {
                    b7.setImageResource(R.drawable.o);
                    i7=0;
                    i++;
                }
                choose_player();
                win_game();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x==x1){
                    b8.setImageResource(R.drawable.x);
                    i8=1;
                    i++;
                }else {
                    b8.setImageResource(R.drawable.o);
                    i8=0;
                    i++;
                }
                choose_player();
                win_game();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x==x1){
                    b9.setImageResource(R.drawable.x);
                    i9=1;
                    i++;
                }else {
                    b9.setImageResource(R.drawable.o);
                    i9=0;
                    i++;
                }
                choose_player();
                win_game();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.dismiss();
                resetvalue2();
            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d2.dismiss();
                resetvalue2();
            }
        });

    }

    private void win_game() {
        if(i1==1 && i2==1 && i3==1){

            d.show();
            tw.setText("player 1 winner");
            xc++;
            tx.setText(mx+xc);
        }
        else if(i4==1 && i5==1 && i6==1) {
            d.show();
            tw.setText("player 1 winner");
            xc++;
            tx.setText(mx + xc);
        }
        else if(i7==1 && i8==1 && i9==1) {
            d.show();
            tw.setText("player 1 winner");
            xc++;
            tx.setText(mx + xc);
        }
        else if(i1==1 && i4==1 && i7==1) {
            d.show();
            tw.setText("player 1 winner");
            xc++;
            tx.setText(mx + xc);
        }
        else if(i2==1 && i5==1 && i8==1) {
            d.show();
            tw.setText("player 1 winner");
            xc++;
            tx.setText(mx + xc);
        }
        else if(i3==1 && i6==1 && i9==1) {
            d.show();
            tw.setText("player 1 winner");
            xc++;
            tx.setText(mx + xc);
        }
        else if(i1==1 && i5==1 && i9==1) {
            d.show();
            tw.setText("player 1 winner");
            xc++;
            tx.setText(mx + xc);
        }
        else if(i3==1 && i5==1 && i7==1) {
            d.show();
            tw.setText("player 1 winner");
            xc++;
            tx.setText(mx + xc);
        }
        else if(i1==0 && i2==0 && i3==0) {
            d.show();
            tw.setText("player 2 winner");
            oc++;
            to.setText(mo + oc);
        }
        else if(i4==0 && i5==0 && i6==0) {
            d.show();
            tw.setText("player 2 winner");
            oc++;
            to.setText(mo + oc);
        }
        else if(i7==0 && i8==0 && i9==0) {
            d.show();
            tw.setText("player 2 winner");
            oc++;
            to.setText(mo + oc);
        }
        else if(i1==0 && i4==0 && i7==0) {
            d.show();
            tw.setText("player 2 winner");
            oc++;
            to.setText(mo + oc);
        }
        else if(i2==0 && i5==0 && i8==0) {
            d.show();
            tw.setText("player 2 winner");
            oc++;
            to.setText(mo + oc);
        }
        else if(i3==0 && i6==0 && i9==0) {
            d.show();
            tw.setText("player 2 winner");
            oc++;
            to.setText(mo + oc);
        }
        else if(i1==0 && i5==0 && i9==0) {
            d.show();
            tw.setText("player 2 winner");
            oc++;
            to.setText(mo + oc);
        }
        else if(i3==0 && i5==0 && i7==0) {
            d.show();
            tw.setText("player 2 winner");
            oc++;
            to.setText(mo + oc);
        }
        else if(i==9){
            d2.show();
        }
    }

    private void choose_player() {
        if(x==x1){
            sg="O";
            x=x2;
            ts.setText(tsp+2);
        }else {
            sg="X";
            x=x1;
            ts.setText(tsp+1);
        }
    }

    private void resetvalue() {
        b1.setImageDrawable(null);
        b2.setImageDrawable(null);
        b3.setImageDrawable(null);
        b4.setImageDrawable(null);
        b5.setImageDrawable(null);
        b6.setImageDrawable(null);
        b7.setImageDrawable(null);
        b8.setImageDrawable(null);
        b9.setImageDrawable(null);
        to.setText(mo+oc);
        tx.setText(mx+xc);
        ts.setText(tsp);
        xc=oc=0;
        i=0;
        sg="X";
        i1=i2=i3=i4=i5=i6=i7=i8=i9=3;
        tw.setText("");
    }

    private void resetvalue2() {
        b1.setImageDrawable(null);
        b2.setImageDrawable(null);
        b3.setImageDrawable(null);
        b4.setImageDrawable(null);
        b5.setImageDrawable(null);
        b6.setImageDrawable(null);
        b7.setImageDrawable(null);
        b8.setImageDrawable(null);
        b9.setImageDrawable(null);
        to.setText(mo+oc);
        tx.setText(mx+xc);
        i=0;
        i1=i2=i3=i4=i5=i6=i7=i8=i9=3;
        tw.setText("");
    }
}