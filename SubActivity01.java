package com.example.image.pcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;



public class SubActivity01 extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub01);
        webView = (WebView)findViewById(R.id.webView);
        WebSettings websettings=webView.getSettings();
        websettings.setJavaScriptEnabled(true);

        websettings.setBuiltInZoomControls(true);
        webView.loadUrl("http://1.214.111.157:8081/");


    }
    public void onClick(View v) {
        Intent intent_onClick = new Intent(getApplicationContext(), SubActivity02.class);
        startActivity(intent_onClick);
    }
}
