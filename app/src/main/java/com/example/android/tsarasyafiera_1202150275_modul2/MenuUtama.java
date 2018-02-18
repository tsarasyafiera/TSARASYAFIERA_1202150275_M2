package com.example.android.tsarasyafiera_1202150275_modul2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {
    private RadioGroup radioGroupPesan;
    private RadioButton rb_dinein, rb_takeaway;
    private Button btnPesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        radioGroupPesan = (RadioGroup) findViewById(R.id.radioGroupPesan);
    }



            public void pesanSekarang (View view) {


                int selectedId = radioGroupPesan.getCheckedRadioButtonId();
                rb_dinein = findViewById(R.id.radioButton_dinein);
                rb_takeaway = findViewById(R.id.radioButton_takeaway);


                if (selectedId == rb_dinein.getId()) {
                    Intent intent = new Intent(MenuUtama.this, DineIn.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(MenuUtama.this, TakeAway.class);
                    startActivity(intent);


                }
            }

}

