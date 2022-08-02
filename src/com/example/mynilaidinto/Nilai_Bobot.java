package com.example.mynilaidinto;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Nilai_Bobot extends Activity {
	
	EditText nilPresensi, nilTugas, nilUts, nilUas;
	
	Double hadir, tugas, uts, uas;
	Double nilaiakhir;
	Button btnHitung, btnHasil;
	
	TextView nilAkhir, nillPoint;
	String nim, nama, matkul, grade ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nilai__bobot);
		
		String presensi = getIntent().getExtras().getString("presensi");
		matkul = getIntent().getExtras().getString("matkul");
		String tugas = getIntent().getExtras().getString("tugas");
		String uts = getIntent().getExtras().getString("uts");
		String uas = getIntent().getExtras().getString("uas");
		nama = getIntent().getExtras().getString("nama");
		nim = getIntent().getExtras().getString("nim");
		
		nilPresensi = (EditText) findViewById(R.id.btPresensi);
		nilPresensi.setText(presensi);
		
		nilTugas = (EditText) findViewById(R.id.btTugas);
		nilTugas.setText(tugas);
		
		nilUts = (EditText) findViewById(R.id.btUts);
		nilUts.setText(uts);
		
		nilUas = (EditText) findViewById(R.id.btUas);
		nilUas.setText(uas);
		
		nilAkhir = (EditText) findViewById(R.id.nilAkhir);
		nillPoint = (EditText) findViewById(R.id.nillPoint);
		
		btnHitung = (Button) findViewById(R.id.btnHitung);
		btnHitung.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				hadir = Double.parseDouble(nilPresensi.getText().toString());
				double tugas = Double.parseDouble(nilTugas.getText().toString());
				double uts = Double.parseDouble(nilUts.getText().toString());
				double uas = Double.parseDouble(nilUas.getText().toString());
				
				nilaiakhir = (hadir * 0.1) + (tugas * 0.3) + (uts * 0.3) + (uas * 0.3);
				
				if (nilaiakhir >= 90 && nilaiakhir <= 100){
					grade = "A";
				}else if (nilaiakhir >= 80 && nilaiakhir <= 89){
					grade = "B";
				}else if (nilaiakhir >= 60 && nilaiakhir <= 69){
					grade = "C";
				}else {
					grade = "D";
				}
				
				nilAkhir.setText(" " + nilaiakhir);
				nillPoint.setText(" " + grade);
				// TODO Auto-generated method stub
				
			}
		});		
		btnHasil.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View view) {
				Intent i = new Intent(Nilai_Bobot.this, Hasil_Akhir.class);
				i.putExtra("hasil", nilAkhir.getText().toString());
				i.putExtra("point", nillPoint.getText().toString());
				i.putExtra("nama", nama);
				i.putExtra("nim", nim);
				i.putExtra("matkul", matkul);
				startActivity(i);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nilai__bobot, menu);
		return true;
	}

}
