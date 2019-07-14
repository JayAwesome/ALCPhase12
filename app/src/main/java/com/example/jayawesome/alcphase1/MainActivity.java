package com.example.jayawesome.alcphase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView= findViewById(R.id.Aboutalc);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.andela.com/alc/");

        Button butt1=(Button)findViewById(R.id.button);
        Button butt2=(Button)findViewById(R.id.button2);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this,Aboutalc.class);
                startActivity(int1);
            }
        });



        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int2= new Intent(MainActivity.this,MyProfile.class);
                startActivity(int2);
            }
        });
    }
}
