package com.example.mynilaidinto;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends Activity {
	
	Spinner spin_MK;
	TextView txt_Hasil;
	String[] MK = {"---- Mata Kuliah ----","Mobile Computing","Manajemen Proyek","SI Web","Komputasi Cerdas","Simulator Digital"};
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        spin_MK = (Spinner) findViewById(R.id.spinMK);
        txt_Hasil = (TextView) findViewById(R.id.txtHasil);
        
        ArrayAdapter<String> adapter = new ArrayAdapter <String>(this, android.R.layout.simple_spinner_item, MK);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_MK.setAdapter(adapter);
        
    }
    public void KlikOK(View v){
    	txt_Hasil.setText ("Mata Kuliah yang anda pilih " + spin_MK.getSelectedItem());
    }
    
    public void KlikNext(View view) {
        Intent i = new Intent (MainActivity.this, Nilai_MK.class);
        String text = null;
		i.putExtra("matkul", text);
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
