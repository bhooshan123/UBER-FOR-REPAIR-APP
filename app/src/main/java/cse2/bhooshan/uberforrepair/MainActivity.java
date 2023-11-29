package cse2.bhooshan.uberforrepair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView welcomeText, registerText;
    EditText nameEditText, passwordEditText;
    Button registerButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeText = findViewById(R.id.textView10);
        registerText = findViewById(R.id.textView11);
        nameEditText = findViewById(R.id.editTextTextPersonName5);
        passwordEditText = findViewById(R.id.editTextTextPersonName6);
        loginButton = findViewById(R.id.button);
        registerButton = findViewById(R.id.button2);
        loginButton.setOnClickListener(view -> {
            String name = nameEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            if(name.isEmpty()||password.isEmpty()){
                Toast.makeText(MainActivity.this,"ENTER ALL DETAILS",Toast.LENGTH_SHORT).show();
                return;
            }
            Intent intent2=new Intent(MainActivity.this,MainActivity3.class);
            startActivity(intent2);


        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent(MainActivity.this,MainActivity2.class);
               startActivity(intent);
                receiveddata();

            }

            private void receiveddata() {
                Intent intent1 = getIntent();
                Bundle b = intent1.getExtras();
                String name=b.getString("name","");
                String password=b.getString("password","");
                nameEditText.setText(name);
                passwordEditText.setText(password);
            }
        });

    }

}