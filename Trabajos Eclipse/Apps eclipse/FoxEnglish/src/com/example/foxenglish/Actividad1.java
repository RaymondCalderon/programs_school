package com.example.foxenglish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

  
 public class Actividad1 extends Activity {
	 private Button a1next;
	 private Button a1quit;
	 
	 
	 
	 protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.actividad1);
			a1next = (Button)findViewById(R.id.a1btn1);
			a1next.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent actividad2= new Intent (Actividad1.this, Actividad2.class);
					startActivity(actividad2);
				} });
{

} } }
