package com.example.gaurav.l6;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton B1 = (ImageButton)findViewById(R.id.b1);
        B1.setOnClickListener(
            new ImageButton.OnClickListener(){

                 public void onClick(View v){

                    dialContactPhone("7303637273");
                 }
            }
        );
        Button add = (Button)findViewById(R.id);

    }
    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
}
