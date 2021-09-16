package com.example.firebasetutorial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class CreateAccount extends AppCompatActivity {


    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        auth = FirebaseAuth.getInstance();
    }

    /**
     * TODO: Create new firebase user, then exit activity
     * If button is clicked, then run this
     * @param view default param
     */
    public void onClick(View view) {
        String email = ((EditText) findViewById(R.id.editTextEmail)).getText().toString();
        String pass = ((EditText) findViewById(R.id.createEditPass)).getText().toString();
    }
}