package com.mkpk.restorante.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mkpk.restorante.R;

public class FirstScreenActivity extends AppCompatActivity {

    // Constraint Layout. It will function as button
    private ConstraintLayout startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstscreen);

        // Get reference to button
        startBtn = findViewById(R.id.startBtn);

        // Add an onClick listener
        startBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstScreenActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}