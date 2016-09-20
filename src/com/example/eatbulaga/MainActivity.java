package com.example.eatbulaga;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	public static List<Kategori> listKategori;
	public static List<Mahasiswa> listMahasiswa;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Membuat list kategori
        listKategori = new ArrayList<Kategori>();
        Kategori kategori1 = new Kategori("alamat",3,"Apakah"); listKategori.add(kategori1);
        Kategori kategori2 = new Kategori("berat",2,"Apakah"); listKategori.add(kategori2);
        Kategori kategori3 = new Kategori("bulan_lahir",2,"Apakah"); listKategori.add(kategori3);
        Kategori kategori4 = new Kategori("fakultas",3,"Apakah"); listKategori.add(kategori4);
        Kategori kategori5 = new Kategori("gendut",1,"Apakah Ia"); listKategori.add(kategori5);
        Kategori kategori6 = new Kategori("jenis_kelamin",3,"Apakah"); listKategori.add(kategori6);
        Kategori kategori7 = new Kategori("jilbab",1,"Apakah Ia"); listKategori.add(kategori7);
        Kategori kategori8 = new Kategori("jurusan",3,"Apakah"); listKategori.add(kategori8);
        Kategori kategori9 = new Kategori("kacamata",1,"Apakah Ia"); listKategori.add(kategori9);
        Kategori kategori10 = new Kategori("nama",3,"Apakah"); listKategori.add(kategori10);
        Kategori kategori11 = new Kategori("suka_bultang",1,"Apakah"); listKategori.add(kategori11);
        Kategori kategori12 = new Kategori("suka_futsal",1,"Apakah"); listKategori.add(kategori12);
        Kategori kategori13 = new Kategori("tahun_lahir",2,"Apakah"); listKategori.add(kategori13);
        Kategori kategori14 = new Kategori("tanggal_lahir",2,"Apakah"); listKategori.add(kategori14);
        Kategori kategori15 = new Kategori("tempat_lahir",3,"Apakah"); listKategori.add(kategori15);
        Kategori kategori16 = new Kategori("tinggi",2,"Apakah"); listKategori.add(kategori16);
        
        // Membuat list mahasiswa
        listMahasiswa = new ArrayList<Mahasiswa>();
        Mahasiswa m1 = new Mahasiswa("Ahmad","L","Cisitu Indah","Jakarta","28","11","1995","180","76","F","T","F","T","F","IF","STEI"); listMahasiswa.add(m1);
        Mahasiswa m2 = new Mahasiswa("Alvin Natawiguna","L","Ciumbuleuit","Jakarta","26","06","1994","171","87","F","T","T","F","F","IF","STEI"); listMahasiswa.add(m2);
        Mahasiswa m3 = new Mahasiswa("Andarias Silvanus","L","Gang Saleh","Bandung","05","11","1994","166","60","F","T","F","T","T","IF","STEI"); listMahasiswa.add(m3);
        Mahasiswa m4 = new Mahasiswa("Andre Susanto","L","Cisitu Indah","Jakarta","08","07","1994","169","70","F","T","T","F","T","IF","STEI"); listMahasiswa.add(m4);
        Mahasiswa m5 = new Mahasiswa("Arieza Nadya Sekariani","P","Dago Asri","Jakarta","21","03","1996","167","59","F","F","F","F","F","IF","STEI"); listMahasiswa.add(m5);
        Mahasiswa m6 = new Mahasiswa("Arina Listyarini Dwiastuti","P","Cimahi","Bandung","20","02","1994","168","61","T","T","F","T","T","IF","STEI"); listMahasiswa.add(m6);
        Mahasiswa m7 = new Mahasiswa("Aryya Dwisatya Widhigda","L","Kebon Kembang","Lumajang","09","09","1994","171","66","F","T","F","T","T","IF","STEI"); listMahasiswa.add(m7);
        Mahasiswa m8 = new Mahasiswa("Chrestella Stephanie","P","Taman Holis Indah","Bandung","08","09","1994","161","55","F","F","F","F","F","IF","STEI"); listMahasiswa.add(m8);
        Mahasiswa m9 = new Mahasiswa("Christ Angga Saputra","L","Taman Hijau","Bandung","16","09","1994","170","65","F","T","F","T","F","IF","STEI"); listMahasiswa.add(m9);
        Mahasiswa m10 = new Mahasiswa("Cilvia Sianora Putri","P","Tubagus Ismail","Jakarta","12","02","1996","167","60","T","T","F","F","T","IF","STEI"); listMahasiswa.add(m10);
        Mahasiswa m11 = new Mahasiswa("Darwin Prasetio","L","Jl.Ciumbuleuit 66","Medan","17","12","1995","168","72","F","T","T","T","T","IF","STEI"); listMahasiswa.add(m11);
        Mahasiswa m12 = new Mahasiswa("Denny Astika Herdioso","L","Jl. Sadang Luhur","Bandung","06","09","1994","174","69","F","F","F","T","F","IF","STEI"); listMahasiswa.add(m12);
        Mahasiswa m13 = new Mahasiswa("Diah Fauziah","P","Cisitu Lama","Jakarta","09","10","1994","167","63","T","T","T","F","F","IF","STEI"); listMahasiswa.add(m13);
        Mahasiswa m14 = new Mahasiswa("Eldwin Christian","L","Jl. Kebon Bibit Barat I No. 52","Jambi","22","12","1995","169","68","F","T","F","T","F","IF","STEI"); listMahasiswa.add(m14);
        Mahasiswa m15 = new Mahasiswa("Eric","L","Ciumbuleuit","Medan","28","06","1994","178","75","F","T","F","F","F","IF","STEI"); listMahasiswa.add(m15);
        Mahasiswa m16 = new Mahasiswa("Fahmi Dumadi","L","Gunung Batu","Bandung","09","09","1994","171","67","F","T","F","T","T","IF","STEI"); listMahasiswa.add(m16);
        Mahasiswa m17 = new Mahasiswa("Fahziar Riesad Wutono","L","Jl. Abadi Regency","Bandung","31","05","1994","170","67","F","F","F","T","T","IF","STEI"); listMahasiswa.add(m17);
        Mahasiswa m18 = new Mahasiswa("Fauzan Hilmi Ramadhian","L","Cisitu Lama","Jakarta","13","02","1996","160","58","F","F","F","T","F","IF","STEI"); listMahasiswa.add(m18);
        Mahasiswa m19 = new Mahasiswa("Felicia Christie","P","Tubagus Ismail","Medan","27","11","1994","168","65","F","T","T","F","F","IF","STEI"); listMahasiswa.add(m19);
        Mahasiswa m20 = new Mahasiswa("Gifari Kautsar","L","Pelesiran","Bandung","09","04","1994","169","64","F","T","F","T","F","IF","STEI"); listMahasiswa.add(m20);
        
        // Tombol Play
        ImageButton next = (ImageButton) findViewById(R.id.imageButton1);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplicationContext(), Choose.class);
                startActivity(myIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       // getMenuInflater().inflate(R.menu.main, menu);
        //return true;
        
    	// Inflate the menu items for use in the action bar
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
    	//handle presses on the action bar items
    	switch(item.getItemId())
    	{
	    	case R.id.action_search:
	    		openSearch();
	    		return true;
	    		
	    	case R.id.action_settings:
	    		openSettings();
	    		return true;
	    	
    		default:
    			return super.onOptionsItemSelected(item);
    	}
    }
    
    private void openSettings() {
		// TODO Auto-generated method stub
		
	}

	private void openSearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
    public void onBackPressed() {
        backButtonHandler();
        return;
    }
 
    public void backButtonHandler() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        // Setting Dialog Title
        alertDialog.setTitle("Leave application?");
        // Setting Dialog Message
        alertDialog.setMessage("Are you sure you want to leave the application?");
        // Setting Positive "Yes" Button
        alertDialog.setPositiveButton("YES",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        // Setting Negative "NO" Button
        alertDialog.setNegativeButton("NO",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        // Mengeluarkan Alert Message
        alertDialog.show();
    }
}
