
package com.example.image.pcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //클릭 이벤트 부분//
    public void onClick(View v) {
        Intent intent_onClick = new Intent(getApplicationContext(), SubActivity01.class);
        startActivity(intent_onClick);
   }

//클릭 이벤트 부분//
}
