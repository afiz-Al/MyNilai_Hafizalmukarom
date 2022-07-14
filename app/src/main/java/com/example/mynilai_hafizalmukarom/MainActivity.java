package com.example.mynilai_hafizalmukarom;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ActivityResultLauncher<Intent> resultLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //input2
        TextView tvMk = (TextView) findViewById((R.id.tvMK));
        TextView tvNIM = (TextView) findViewById((R.id.tvNIM));
        TextView tvNama = (TextView) findViewById((R.id.tvNama));
        TextView tvHasil = (TextView) findViewById((R.id.tvNilai));
        TextView tvGrade = (TextView) findViewById((R.id.tvGrade));

        tvMk.setText(getIntent().getStringExtra(input_2.EXTRA_MK));
        tvNIM.setText(getIntent().getStringExtra(input_2.EXTRA_NIM));
        tvNama.setText(getIntent().getStringExtra(input_2.EXTRA_NAMA));
        tvHasil.setText(getIntent().getStringExtra(input_2.EXTRA_HASIL));
        //batasinput2

    }
}