package com.example.firebasetutorial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class CollectData extends AppCompatActivity {


    public FirebaseFirestore db;
    public FirebaseAuth auth;
    final String collection = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect_data);
        TextView name = (TextView) findViewById(R.id.TextNameField);
        TextView secret = (TextView) findViewById(R.id.textFieldSecret);
        auth = FirebaseAuth.getInstance();


        /**
         * TODO: Access firestore and update Name and Secret Fields
         * HINT: email == document ID
         */

    }

}