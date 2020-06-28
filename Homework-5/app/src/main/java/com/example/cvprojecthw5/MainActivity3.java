package com.example.cvprojecthw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView name1 = findViewById(R.id.myname);
        TextView birth1 = findViewById(R.id.birth1);
        TextView job1 = findViewById(R.id.job);
        TextView phone1 = findViewById(R.id.phone);
        TextView mail = findViewById(R.id.email);
        Button back = findViewById(R.id.back);


        Bundle b = getIntent().getExtras();
        name1.setText(b.getString("name"));
        birth1.setText(b.getString("date"));
        job1.setText(b.getString("job"));
        phone1.setText(b.getString("phone"));
        mail.setText(b.getString("mail"));
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(back);
            }
        });


    }
}