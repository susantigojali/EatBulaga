package com.example.eatbulaga;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Choose extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose);
		
		// Mengisi listview dengan nama2 dari database
		final ListView listview = (ListView) findViewById(R.id.listView1);
	    
	    final List<String> list = new ArrayList<String>();
	    for (int i = 0; i < MainActivity.listMahasiswa.size(); ++i) {
	      list.add(MainActivity.listMahasiswa.get(i).getNama());
	    }
	    final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list);
	    listview.setAdapter(adapter);
	    
	    // Mengklik nama yang tersedia
	    listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	        @Override
	        public void onItemClick(AdapterView<?> adapter, View view, int position, long id){
	        	finish();
	        	
	            Intent intent = new Intent(Choose.this, Play.class);
	            Object o = adapter.getItemAtPosition(position);
	            intent.putExtra("nama",o.toString());
	            startActivity(intent);
	        }
	    });
	}

	@Override
    public void onBackPressed() {
		
		 finish();
		//Intent intent = new Intent(Choose.this, MainActivity.class);
		//startActivity(intent);
        return;
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.choose, menu);
		return true;
	}

}
