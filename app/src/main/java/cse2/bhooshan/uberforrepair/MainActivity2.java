package cse2.bhooshan.uberforrepair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText nameEditText, passwordEditText, emailEditText, phoneEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nameEditText = findViewById(R.id.editTextTextPersonName);
        passwordEditText = findViewById(R.id.editTextTextPersonName2);
        emailEditText = findViewById(R.id.editTextTextPersonName3);
        phoneEditText = findViewById(R.id.editTextTextPersonName4);
        Button registerButton = findViewById(R.id.button3);
        registerButton.setOnClickListener(view -> registeruser());
    }
        private void registeruser(){
            String name = nameEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            String email = emailEditText.getText().toString();
            String phone = phoneEditText.getText().toString();
            if (name.isEmpty() || password.isEmpty() || email.isEmpty() || phone.isEmpty()) {

                Toast.makeText(this, "Please fill in all details", Toast.LENGTH_SHORT).show();
                return;
            }
           Intent intent=new Intent(MainActivity2.this,MainActivity.class);
            intent.putExtra("name",name);
            intent.putExtra("password",password);
            startActivity(intent);




    }
}