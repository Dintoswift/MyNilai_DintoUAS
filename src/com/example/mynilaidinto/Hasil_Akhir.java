package com.example.mynilaidinto;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;

public class Hasil_Akhir extends Activity {
	
	EditText nimhasil, namahasil, nilaihasil, pointhasil;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hasil__akhir);
		
		nimhasil = (EditText) findViewById(R.id.nimhasil);		
		namahasil = (EditText) findViewById(R.id.namahasil);
		nilaihasil = (EditText) findViewById(R.id.nilaihasil);
		pointhasil = (EditText) findViewById(R.id.pointhasil);
		
		String hasil = getIntent().getExtras().getString("hasil");
		String point = getIntent ().getExtras().getString("point");
		
		String matkul = getIntent().getExtras().getString("matkul");
		
		nilaihasil.findViewById(R.id.nilaihasil);
		nilaihasil.setText(hasil);
		
		pointhasil.findViewById(R.id.pointhasil);
		pointhasil.setText(point);
		
		String nim = getIntent().getExtras().getString("nim");
		String nama = getIntent().getExtras().getString("nama");
			
		nimhasil.findViewById(R.id.nimhasil);
		nimhasil.setText(nim);
		
		namahasil.findViewById(R.id.namahasil);	
		namahasil.setText(nama);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hasil__akhir, menu);
		return true;
	}

}
