package com.example.guanfang_countbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
 * This class is Exceptions, it will show a notice and a back button
 *
 *
 * @author Guanfang Dong
 * @version  1.0
 * @since 1.0
 */
public class Exceptions extends AppCompatActivity {
    private TextView warning;

    @Override
    /**
     * Called when the activity is first created.
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exceptions);

        warning = (TextView)findViewById(R.id.activity);
        Button Back = (Button) findViewById(R.id.back);
        Back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent backToMain = new Intent(Exceptions.this, MainActivity.class);
                startActivity(backToMain);
            }

        });
    }
}
