package com.example.hw5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //linking
        TextView name1 = findViewById(R.id.myname);
        TextView birth1 = findViewById(R.id.birth1);
        TextView job1 = findViewById(R.id.job);
        final TextView phone1 = findViewById(R.id.phone);
        final TextView mail = findViewById(R.id.email);
        Button back = findViewById(R.id.back);
        Button call = findViewById(R.id.call);
        Button mailme = findViewById(R.id.mailme);

        //getting info from activity two
        Bundle b = getIntent().getExtras();
        name1.setText(b.getString("name"));
        birth1.setText(b.getString("date"));
        job1.setText(b.getString("job"));
        phone1.setText(b.getString("phone"));
        mail.setText(b.getString("mail"));

        //going to activity to two
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent back = new Intent(MainActivity3.this,MainActivity2.class);
                //
                 startActivity(back);



            }

        });
        //calling by clicking on the number
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = phone1.getText().toString();
                if (phone.isEmpty()){
                    Toast.makeText(getApplicationContext(),"please enter a valid number",Toast.LENGTH_SHORT).show();
                }
                else {
                    String s = "tel:" + phone;
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(s));
                    startActivity(intent);
                }
            }
        });
        //calling by clicking on the button
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = phone1.getText().toString();
                if (phone.isEmpty()){
                    Toast.makeText(getApplicationContext(),"please enter a valid number",Toast.LENGTH_SHORT).show();
                }
                else {
                    String s = "tel:" + phone;
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(s));
                    startActivity(intent);
                }
            }
        });
        //mailing by clicking on the button
        mailme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mailone = mail.getText().toString();
                Intent intet = new Intent(Intent.ACTION_SEND);
                intet.setType("message/rfc822");
                intet.putExtra(Intent.EXTRA_EMAIL,new String[]{mailone});
                intet.setPackage("com.google.android.gm");
                startActivity(intet);

            }
        });
        //mailing by clicking on the mail
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mailone = mail.getText().toString();
                Intent intet = new Intent(Intent.ACTION_SEND);
                intet.setType("message/rfc822");
                intet.putExtra(Intent.EXTRA_EMAIL,new String[]{mailone});
                intet.setPackage("com.google.android.gm");
                startActivity(intet);

            }
        });


    }
}