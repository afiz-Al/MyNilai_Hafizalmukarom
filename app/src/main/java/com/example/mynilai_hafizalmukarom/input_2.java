package com.example.mynilai_hafizalmukarom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class input_2 extends AppCompatActivity  {
    final public static String EXTRA_NIM = "extra_nim";
    final public static String EXTRA_NAMA = "extra_nama";
    final public static String EXTRA_MK = "extra_mk";

    final public static String EXTRA_HASIL = "extra_hasil";

    EditText nhadir, ntugas, nuts, nuas;
    TextView nhasil, nketerangan;

    Integer nh, nt, nts, nas;
    Double nhas;
    String ket;

    String[] matakuliah = {"JARKOM", "KALKULUS 1", "KALKULUS 2", "ANIMASI DIGITAL", "MPJ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input2);
        EditText editNim = (EditText) findViewById(R.id.editTextNIM);
        EditText editNama = (EditText) findViewById(R.id.editTextNama);
        EditText editMk = (EditText) findViewById(R.id.editTextNama);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, matakuliah);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
    }

        nhadir = (EditText) findViewById(R.id.hadir);
        ntugas = (EditText) findViewById(R.id.tugas);
        nuts = (EditText) findViewById(R.id.uts);
        nuas = (EditText) findViewById(R.id.uas);
        nhasil = (TextView) findViewById(R.id.hasil);
        nketerangan = (TextView) findViewById(R.id.keterangan);

        Button btnSave = (Button) findViewById(R.id.idButtonSave);
//        saat tombol save diklik
        btnSave.setOnClickListener(v -> {
//                kode untuk aksi dari klik button
//            menggunakan intent
            Intent loginIntent = new Intent(input_2.this, MainActivity.class);
            loginIntent.putExtra(EXTRA_NIM, editNim.getText().toString());
            loginIntent.putExtra(EXTRA_NAMA, editNama.getText().toString());
            loginIntent.putExtra(EXTRA_MK, editMk.getText().toString());

            startActivity(loginIntent);
        });
        }

        public void aksi (View klik){

            switch (klik.getId()){
                case R.id.button:
                    nh = Integer.parseInt(nhadir.getText().toString());
                    nt = Integer.parseInt(ntugas.getText().toString());
                    nts = Integer.parseInt(nuts.getText().toString());
                    nas = Integer.parseInt(nuas.getText().toString());
                    nhas = (0.1 * nh) + (0.35 * nt) + (0.2 * nts) + (0.35 * nas);
                    if (nhas >= 70) {
                        ket = "Lulus" ;
                    }
                    else {
                        ket ="Tidak Lulus" ;
                    }
                    nhasil.setText("Nilai Anda = " + String.valueOf(nhas).toString());
                    nketerangan.setText(String.valueOf(ket).toString());
                    break;

                case R.id.button2:
                    nhadir.setText("");
                    ntugas.setText("");
                    nuts.setText("");
                    nuas.setText("");
                    nhasil.setText("");
                    nketerangan.setText("");

            }

        }

    }
