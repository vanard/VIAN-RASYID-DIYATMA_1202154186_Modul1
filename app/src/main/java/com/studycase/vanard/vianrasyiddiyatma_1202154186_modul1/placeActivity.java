package com.studycase.vanard.vianrasyiddiyatma_1202154186_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class placeActivity extends AppCompatActivity {
    String Tmenu, Tporsi, Ttempat;
    TextView menuTextView, porsiTextView, hargaTextView, tempatTextView;
    int harga, total; int osas = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        Intent intent = this.getIntent();
        Tmenu = intent.getStringExtra("menu");
        Tporsi = intent.getStringExtra("porsi");
        Ttempat = intent.getStringExtra("tempat");

        menuTextView = findViewById(R.id.first_textview);
        porsiTextView = findViewById(R.id.second_textview);
        hargaTextView = findViewById(R.id.duit_textview);
        tempatTextView = findViewById(R.id.sub_textview);

        menuTextView.setText(Tmenu);
        porsiTextView.setText(Tporsi);
        tempatTextView.setText(Ttempat);

        switch (Ttempat) {
            case "Eatbus":
                harga = 50000;
                break;
            case "Abnormal":
                harga = 30000;
                break;
        }

        total = parseInt(Tporsi) * harga;
        String hargaTot = Integer.toString(total);
        if (total < osas){
            hargaTextView.setText(hargaTot);
            Toast.makeText(this, "Kuy dinnernya disini aja", Toast.LENGTH_SHORT).show();
        }else{
            hargaTextView.setText(hargaTot);
            Toast.makeText(this, "Money is not enough", Toast.LENGTH_SHORT).show();
        }
    }
}
