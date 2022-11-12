package com.iic.connectthebots.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.iic.connectthebots.R;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class StudentLoginPage extends AppCompatActivity {

    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login_page);

        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        FirebaseFirestore firestore = FirebaseFirestore.getInstance();
/*
        // reading data
        firestore.collection("users")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            /*
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Map<String, Object>[] data=  new HashMap<>();
                                data[0] = document.getData();
                                Log.d("Success read", document.getId() + " => " + document.getData());

                                user = findViewById(R.id.username);
                                pass = findViewById(R.id.password);


//                                JSONObject obj =
                                // cred validation

                            }
                        } else {
                            Log.w("failure read", "Error getting documents.", task.getException());
                        }
                    }
                });

*/
    }
}