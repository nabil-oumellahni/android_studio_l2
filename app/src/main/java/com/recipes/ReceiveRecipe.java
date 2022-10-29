package com.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveRecipe extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =  "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_recipe);
        Intent intent = getIntent();
        // get the intent and get the message from it using get StringExtra()
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = findViewById(R.id.message);
        // add the text to the message text view
        messageView.setText(messageText);
    }

}