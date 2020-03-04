package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText1 = findViewById(R.id.editText2);
        final EditText editText2 = findViewById(R.id.editText3);
        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        TextView textView = findViewById(R.id.textView4);

        editText1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        editText2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

        button1.setOnClickListener(v -> {
                textView.setText(String.valueOf(Double.valueOf(editText1.getText().toString()) * (Double.valueOf(editText2.getText().toString()))));
        });
        button2.setOnClickListener(v -> {
            textView.setText(String.valueOf(Double.valueOf(editText1.getText().toString()) / (Double.valueOf(editText2.getText().toString()))));
        });
        button3.setOnClickListener(v -> {
            textView.setText(String.valueOf(Double.valueOf(editText1.getText().toString()) + (Double.valueOf(editText2.getText().toString()))));
        });
        button4.setOnClickListener(v -> {
            textView.setText(String.valueOf(Double.valueOf(editText1.getText().toString()) - (Double.valueOf(editText2.getText().toString()))));
        });
    }

}
