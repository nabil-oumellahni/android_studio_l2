package com.recipes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddRecipe extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);
    }

    public void onSendMessage(View view) {
        EditText messageView = findViewById(R.id.message);
        // get the text from the editable text field with an ID of 'message'
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(this, ReceiveRecipe.class);
        // add the text to the intent giving it a name of "message"
        intent.putExtra(ReceiveRecipe.EXTRA_MESSAGE, messageText);
        // start activity ReceiveRecipe
        startActivity(intent);
    }
}
