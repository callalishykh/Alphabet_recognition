package com.example.letterrecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView type;
    private EditText input_letter;
    private Button submit;

    private String resetsky="b,d,f,h,k,l,t";
    private String resetgrass="a,c,i,m,n,o,r,s,u,v,w,x,z";
    private String resetroot="g,j,p,q,y";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = input_letter.getText().toString();
                if (data.length() >1){
                    type.setText("More Than One Alphabet is not Accepted");

                }else {

                    if (data.length() > 0) {
                        if (resetsky.indexOf(data) >= 0) {
                            type.setText("sky letter");
                        } else if (resetgrass.indexOf(data) >= 0) {
                            type.setText("Grass letter");
                        } else {
                            type.setText("Root letter");
                        }
                    }
                }
            }
        });
    }

    private void initialize(){
        input_letter= findViewById(R.id.input_data);
        type= findViewById(R.id.type);
        submit= findViewById(R.id.submit);

    }
}