package com.example.kalo.funfacts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook factBook = new FactBook();
    private ColorBook colorBook = new ColorBook();
    //Declare our View variables
    private TextView factTextView;

    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the Views form from the layout file to the corresponding variables

        factTextView = findViewById(R.id.factTextView);
        final Button showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = factBook.getFact();
                int color = colorBook.getColor();

                // Update the screen with our new fact
                factTextView.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
        //Toast.makeText(this, "Yay! Our Activity Was Created! ", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We are logging from OnCreate() method!");
    }
}
