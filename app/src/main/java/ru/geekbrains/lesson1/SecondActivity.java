package ru.geekbrains.lesson1;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Button backToFirstActivity1 = findViewById(R.id.buttonBack1);
        backToFirstActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentResult = new Intent();
                intentResult.putExtra("City", backToFirstActivity1.getText().toString());
                setResult(RESULT_OK, intentResult);
                finish();
            }

        });
        final Button backToFirstActivity2 = findViewById(R.id.buttonBack2);
        backToFirstActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentResult = new Intent();
                intentResult.putExtra("City", backToFirstActivity2.getText().toString());
                setResult(RESULT_OK, intentResult);
                finish();
            }

        });
    }
}
