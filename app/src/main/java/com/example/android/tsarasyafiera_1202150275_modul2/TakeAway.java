package com.example.android.tsarasyafiera_1202150275_modul2;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

    }
    public void showDatePickerDialog(View view) {
        android.support.v4.app.DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker));
    }

    public void showTimePickerDialog(View view) {
        android.support.v4.app.DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_picker));
    }

    public void pilihPesanan(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(TakeAway.this);

        myAlert.setMessage("Data sudah benar?");
        myAlert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface pilihPesanan, int which) {
                Intent intent = new Intent(TakeAway.this, DaftarMenu.class);
                startActivity(intent);
            }
        });

        myAlert.show();
    }


}