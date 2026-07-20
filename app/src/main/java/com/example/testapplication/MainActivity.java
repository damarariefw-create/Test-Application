package com.example.testapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.buttonMultiplication), (View v, WindowInsetsCompat insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void additional(View view) {
        //identifer
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView textView = findViewById(R.id.textView);

        //fetch
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        int hasil = Integer.parseInt(num1) + Integer.parseInt(num2);

        //show
        textView.setText("Hasil: " + hasil);

    }
    public void subtraction(View view) {
        //identifer
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView textView = findViewById(R.id.textView);
        //fetch
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        int hasil = Integer.parseInt(num1) - Integer.parseInt(num2);


        //show
        textView.setText("Hasil: " + hasil);
    }
    public void multiplication(View view) {
        //identifer
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView textView = findViewById(R.id.textView);

        //fetch
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        int hasil = Integer.parseInt(num1) * Integer.parseInt(num2);

        //show
        textView.setText("Hasil: " + hasil);
    }
    public void division(View view) {
        //identifer
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView textView = findViewById(R.id.textView);

        //fetch
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        int hasil = Integer.parseInt(num1) / Integer.parseInt(num2);

        //show
        textView.setText("Hasil: " + hasil);
    }

    public void reset(View view) {
        //identifer
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView textView = findViewById(R.id.textView);

        //reset
        number1.setText("");
        number2.setText("");
        textView.setText("");
    }
}
