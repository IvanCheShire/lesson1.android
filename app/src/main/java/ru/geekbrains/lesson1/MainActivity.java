package ru.geekbrains.lesson1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private final static int REQUEST_CODE = 1;
    private final static String RESULT1 = "МОСКВА";
    private final static String RESULT2 = "САНКТ-ПЕТЕРБУРГ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startSecondActivity = findViewById(R.id.button);
        startSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
            startActivityForResult(intent, REQUEST_CODE);;
        }
    });
}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != REQUEST_CODE) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }

        if (resultCode == RESULT_OK){
            EditText num = findViewById(R.id.editText);
            num.setText(data.getStringExtra("City"));
            if ((num.toString()).equals(RESULT1)){
                EditText temp = findViewById(R.id.editTemp);
                temp.setText("Температура + 20");
            } else {
                EditText temp = findViewById(R.id.editTemp);
                temp.setText("Температура + 15");}
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}