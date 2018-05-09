package com.example.trent.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button changeTextButton;
    Button expensive;
    Button cheap;
    TextView message;
    String[] places = {"Whataburger","Chick-Fil-A","Chilis","Buffalo Wild Wings","Pizaa By Design","Panda Express","Canes","Betty Rosas","Chipotle","La Popular","Jasons Deli","Beehive","Vagabond","Heffs"};
    String[] pricey = {"Beehive Steakhouse","Lytle Land & Cattle Co","Abi-Haus","Copper Creekk Restaurant","Cypress Street Station","Outback Steakhouse","Perinis Ranch","Vagabond","The Mill Winery","Bonzai Japanese steakhouse"};
    String[] fast = {"Whataburger","CICIs Pizza","Chicken Express","Canes Chicken","Panda Express","Sonic","McDonalds","Burger King","Taco Bell","Taco Bueno","Lucy's Burgers","Subway","FireHouse subs","Heffs"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = (TextView)findViewById(R.id.tvMessage);
        changeTextButton = (Button)findViewById(R.id.bChangeText);
        expensive = (Button)findViewById(R.id.button2);
        cheap = (Button)findViewById(R.id.button3);
        cheap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yikes = fast[(int)(Math.random()* fast.length)];
                message.setText(yikes);
            }
        });
        expensive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String wow = pricey[(int)(Math.random() * pricey.length)];
                        message.setText(wow);
            }
        });
        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String word = places[(int)(Math.random() * places.length)];
                message.setText(word);
            }

        });


    }
}

