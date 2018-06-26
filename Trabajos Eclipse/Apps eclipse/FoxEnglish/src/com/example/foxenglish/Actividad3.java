package com.example.foxenglish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

  
 public class Actividad3 extends Activity {
	 private Button a3next;
	 private Button a3quit;
	 
	 
	 
	 protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.actividad3);
			a3next = (Button)findViewById(R.id.a3btn1);
			a3next.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent resultados= new Intent (Actividad3.this, Resultados.class);
					startActivity(resultados);
				} });
{

} } }
