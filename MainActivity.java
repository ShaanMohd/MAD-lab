package com.example.regform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    EditText name, password;

    RadioGroup gender;

    CheckBox terms;

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        gender = findViewById(R.id.gender);
        terms = findViewById(R.id.terms);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (name.getText().toString().isEmpty()) {
                    name.setError("Enter your name");
                    return;
                }

                if (password.getText().toString().isEmpty()) {
                    name.setError("Enter password");
                    return;
                }

                if(password.length() < 0) {
                    password.setError("Password must contain 8 characters");
                    return;
                }

                if (!terms.isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Accept terms and conditions",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(MainActivity.this,
                        "Registration Successful",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}