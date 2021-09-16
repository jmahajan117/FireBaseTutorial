package com.example.firebasetutorial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    public FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth = FirebaseAuth.getInstance();
    }

    /**
     * This button navigates to the next screen
     * @param view default param to move
     */
    public void onClickCreate(View view) {
        Intent i = new Intent(this, CreateAccount.class);
        startActivity(i);
    }

    /**
     * TODO: After clicking in the Sign In Button, this should sign in the user using Firebase, and move to the CollectData Screen
     * @param view default param
     */

    public void onSignIn(View view) {
        TextInputEditText user = (TextInputEditText) findViewById(R.id.usernameField);
        EditText pass = (EditText) findViewById(R.id.passwordField);
        String userName = user.getText().toString();
        String password = pass.getText().toString();



    }


}