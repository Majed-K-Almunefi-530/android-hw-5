package com.example.cvprojecthw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText name = findViewById(R.id.name);
        final EditText birth = findViewById(R.id.Date);
        final EditText job = findViewById(R.id.job);
        final EditText phone = findViewById(R.id.Phone);
        final EditText email = findViewById(R.id.email);
        Button reset = findViewById(R.id.reset);
        Button view = findViewById(R.id.view);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                birth.setText("");
                job.setText("");
                phone.setText("");
                email.setText("");
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view = new Intent(MainActivity2.this,MainActivity3.class);
                view.putExtra("name",name.getText().toString());
                view.putExtra("date",birth.getText().toString());
                view.putExtra("job",job.getText().toString());
                view.putExtra("phone",phone.getText().toString());
                view.putExtra("mail",email.getText().toString());
                startActivity(view);

            }
        });

    }
}