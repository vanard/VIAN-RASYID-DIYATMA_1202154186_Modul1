package com.studycase.vanard.vianrasyiddiyatma_1202154186_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText firstEditText, secondEditText;
    private Button eatbusBtn, abnormalBtn;
    private String menu, porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstEditText = findViewById(R.id.first_edittext);
        secondEditText = findViewById(R.id.second_edittext);
        eatbusBtn = findViewById(R.id.eatbus_btn);
        abnormalBtn = findViewById(R.id.abnormal_btn);

        menu = firstEditText.getText().toString();
        porsi = secondEditText.getText().toString();
    }

    public void placeOne(View view) {
        Intent intent = new Intent(this, placeActivity.class);
        String tempat = eatbusBtn.getText().toString();

        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);
        intent.putExtra("tempat", tempat);
        startActivity(intent);
    }

    public void placeTwo(View view) {
        Intent intent = new Intent(this, placeActivity.class);
        String tempat = abnormalBtn.getText().toString();

        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);
        intent.putExtra("tempat", tempat);
        startActivity(intent);
    }
}
