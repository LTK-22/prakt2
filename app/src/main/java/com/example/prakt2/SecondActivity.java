package com.example.prakt2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Получаем переданный текст из MainActivity
        String newText = getIntent().getStringExtra("textFromMainActivity");

        // Устанавливаем текст в TextView
        //TextView textView = findViewById(R.id.textView1);
        //textView.setText(newText);

        // Устанавливаем результат, который будет передан обратно в MainActivity
        Intent resultIntent = new Intent();
        resultIntent.putExtra("resultKey", newText);
        setResult(RESULT_OK, resultIntent);

        // Завершаем SecondActivity
        finish();
    }
}