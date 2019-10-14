package com.example.viewst1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
ViewStub viewStub,viewStub2;
Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewStub=findViewById(R.id.view);
        viewStub2=findViewById(R.id.vie2);
       // EditText editText=new EditText(this);
      //  editText.getText();
        button1=findViewById(R.id.b1);
        button2=findViewById(R.id.b2);
        button3=findViewById(R.id.b3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewStub.setVisibility(View.VISIBLE);
                viewStub2.setVisibility(View.GONE);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewStub2.setVisibility(View.VISIBLE);
                viewStub.setVisibility(View.GONE);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewStub.setVisibility(View.GONE);
                viewStub2.setVisibility(View.GONE);
            }
        });
    }
}
