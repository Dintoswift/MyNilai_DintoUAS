package com.example.mynilaidinto;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Nilai_MK extends Activity {
	
	View nim, nama, presensi, tugas, uts, uas;
    View Submit;
    String Matkul;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nilai__mk);
		
		Matkul = getIntent().getExtras().getString("Matkul");
		nim = findViewById(R.id.hNIM);
		nama = findViewById(R.id.hNama);
		presensi = findViewById(R.id.hPresensi);
		tugas = findViewById(R.id.hTugas);
		uts = findViewById(R.id.hUTS);
		uas = findViewById(R.id.hUAS);
		
		Submit = findViewById(R.id.btnSUBMIT);
		Submit.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View view){
				Intent i = new Intent(Nilai_MK.this, Nilai_Bobot.class);
				i.putExtra("presensi", presensi.getContext().toString());
				i.putExtra("tugas",tugas.getContext().toString());
				i.putExtra("uts",uts.getContext().toString());
				i.putExtra("uas",uas.getContext().toString());
				i.putExtra("nama",nama.getContext().toString());
				i.putExtra("nim",nim.getContext().toString());
				i.putExtra("matkul",Matkul);
				startActivity(i);
				
				
			}
		});
		
	}
}
	
