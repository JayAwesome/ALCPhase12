package com.example.jayawesome.alcphase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Aboutalc extends AppCompatActivity {

    WebView AboutAlc;
    String URL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutalc);

        URL = "https://andela.com/alc/";
        AboutAlc = (WebView) findViewById(R.id.AboutAlc);

        AboutAlc.loadUrl(URL);
        AboutAlc.setWebViewClient(new WebViewClient());

    }
}
