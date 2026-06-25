package com.abisola.loginapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declared as local variables to eliminate the "field can't be converted" warning
        EditText username = findViewById(R.id.etUsername);
        EditText password = findViewById(R.id.etPassword);
        Button login = findViewById(R.id.btnLogin);

        login.setOnClickListener(view -> {
            Log.d( "Login", "Button clicked");+

          //  String user = username.getText().toString().trim();
          //  String pass = password.getText().toString().trim();

          //  if (user.equals("admin") && pass.equals("1234")) {
          //      Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
           // } else {
                Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
           // }
        });
    }
}