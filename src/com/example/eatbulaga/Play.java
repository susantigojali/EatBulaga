package com.example.eatbulaga;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Play extends Activity {

	private List<Mahasiswa> mhs;
    private List<Kategori> listKategori;
    private List<Pertanyaan> listPertanyaan;
    private Pertanyaan question;
    private int idxAttr;
	private String soal;
	private boolean done;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_play);
		final EditText edittext = (EditText) findViewById(R.id.editText1);
		final ImageButton playagain = (ImageButton) findViewById(R.id.imageButton4);
		final ImageButton yes = (ImageButton) findViewById(R.id.imageButton1);
		final ImageButton no = (ImageButton) findViewById(R.id.imageButton2);
		final ImageButton maybe = (ImageButton) findViewById(R.id.imageButton3);
		playagain.setVisibility(View.GONE);
		edittext.setEnabled(false);
		edittext.setKeyListener(null);
		Bundle extras = getIntent().getExtras();
		done = false; // Penanda bahwa permainan belum berakhir
		soal = extras.getString("nama"); // Nama yang dipilih
		mhs = MainActivity.listMahasiswa; // Mengambil list seluruh mahasiswa
		listKategori = MainActivity.listKategori; // Mengambil list seluruh kategori
		question = new Pertanyaan(); // Membuat pertanyaan baru
		listPertanyaan = new ArrayList<Pertanyaan>(); // List pertanyaan yang sudah pernah diajukan
		
		// Memilih atribut mahasiswa secara acak;
		Random rand=new Random();
        do{
            do{
                idxAttr=rand.nextInt(16);
            }while(idxAttr==9);

            // Membuat pertanyaan
            question.random(listKategori, mhs, idxAttr);
        }while(question.isAsked(listPertanyaan)|| !question.goodQuestion(mhs));
        listPertanyaan.add(question);
        edittext.setText(question.toPrint());
        
        // Tombol Yes 
        yes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	question.setJawaban("y");
                
                // Decrease and Conquer
                List<Mahasiswa> newmhs=DecreaseConquer.proses(mhs,mhs.size() ,question, idxAttr, listKategori);
                mhs=newmhs;
                
                if(mhs.size()>1)
                {
                    // Membuat pertanyaan baru
                    Random rand=new Random();
                    question = new Pertanyaan();
                    do{
                        do{
                            idxAttr=rand.nextInt(16);
                        }while(idxAttr==9);

                        // Membuat pertanyaan
                        question.random(listKategori, mhs, idxAttr);
                    }while(question.isAsked(listPertanyaan)|| !question.goodQuestion(mhs));
                    listPertanyaan.add(question);
                    edittext.setText(question.toPrint());
                }
                else 
                {
                    if(mhs.size()==1)
                    {
                        if(mhs.get(0).getNama().equalsIgnoreCase(soal))
                        {
                            edittext.setText("Orang tersebut adalah "+mhs.get(0).getNama());
                        }
                        else
                        {
                        	edittext.setText("Anda salah memberikan kriteria!!");
                        }
                    }
                    else
                    {
                    	edittext.setText("Tidak ada orang dengan kriteria tersebut!!");
                    }
                    playagain.setVisibility(View.VISIBLE);
                    yes.setVisibility(View.GONE);
                    no.setVisibility(View.GONE);
                    maybe.setVisibility(View.GONE);
                    done = true;
                }
            }
        });
        
        // Tombol No
        no.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	question.setJawaban("t");
                
                // Decrease and Conquer
                List<Mahasiswa> newmhs=DecreaseConquer.proses(mhs,mhs.size() ,question, idxAttr, listKategori);
                mhs=newmhs;
                
                if(mhs.size()>1)
                {
                    // Membuat pertanyaan baru
                    Random rand=new Random();
                    question = new Pertanyaan();
                    do{
                        do{
                            idxAttr=rand.nextInt(16);
                        }while(idxAttr==9);

                        // Membuat pertanyaan
                        question.random(listKategori, mhs, idxAttr);
                    }while(question.isAsked(listPertanyaan)|| !question.goodQuestion(mhs));
                    listPertanyaan.add(question);
                    edittext.setText(question.toPrint());
                }
                else 
                {
                    if(mhs.size()==1)
                    {
                        if(mhs.get(0).getNama().equalsIgnoreCase(soal))
                        {
                            edittext.setText("Orang tersebut adalah "+mhs.get(0).getNama());
                        }
                        else
                        {
                        	edittext.setText("Anda salah memberikan kriteria!!");
                        }
                    }
                    else
                    {
                    	edittext.setText("Tidak ada orang dengan kriteria tersebut!!");
                    }
                    playagain.setVisibility(View.VISIBLE);
                    yes.setVisibility(View.GONE);
                    no.setVisibility(View.GONE);
                    maybe.setVisibility(View.GONE);
                    done = true;
                }
            }
        });
        
        // Tombol Maybe
        maybe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	question.setJawaban("b");
                
                // Decrease and Conquer
                List<Mahasiswa> newmhs=DecreaseConquer.proses(mhs,mhs.size() ,question, idxAttr, listKategori);
                mhs=newmhs;
                
                if(mhs.size()>1)
                {
                    // Membuat pertanyaan baru
                    Random rand=new Random();
                    question = new Pertanyaan();
                    do{
                        do{
                            idxAttr=rand.nextInt(16);
                        }while(idxAttr==9);

                        // Membuat pertanyaan
                        question.random(listKategori, mhs, idxAttr);
                    }while(question.isAsked(listPertanyaan)|| !question.goodQuestion(mhs));
                    listPertanyaan.add(question);
                    edittext.setText(question.toPrint());
                }
                else 
                {
                    if(mhs.size()==1)
                    {
                        if(mhs.get(0).getNama().equalsIgnoreCase(soal))
                        {
                            edittext.setText("Orang tersebut adalah "+mhs.get(0).getNama());
                        }
                        else
                        {
                        	edittext.setText("Anda salah memberikan kriteria!!");
                        }
                    }
                    else
                    {
                    	edittext.setText("Tidak ada orang dengan kriteria tersebut!!");
                    }
                    playagain.setVisibility(View.VISIBLE);
                    yes.setVisibility(View.GONE);
                    no.setVisibility(View.GONE);
                    maybe.setVisibility(View.GONE);
                    done = true;                    
                }
            }
        });
        
        // Tombol Play Again
        playagain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	finish();
            	Intent myIntent = new Intent(getApplicationContext(), Choose.class);
                startActivity(myIntent);
            	
            }
        });
	}
	
	// Tombol back android
	 @Override
	    public void onBackPressed() {
		 	if(done)
		 	{
		 		finish();
		 	}
		 	else
		 	{
		 		 backButtonHandler();
		 	}
	       
	        return;
	    }
	 
	    public void backButtonHandler() {
	        AlertDialog.Builder alertDialog = new AlertDialog.Builder(Play.this);
	        // Setting Dialog Title
	        alertDialog.setTitle("Exit Game?");
	        // Setting Dialog Message
	        alertDialog.setMessage("Are you sure you want to exit the game?");
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
	    
	    

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.play, menu);
		return true;
	}

}
