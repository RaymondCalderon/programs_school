package com.example.foxenglish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

  
 public class Actividad2 extends Activity {
	 private Button a2next;
	 private Button a2quit;
	 
	 
	 
	 protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.actividad2);
			a2next = (Button)findViewById(R.id.a2btn1);
			a2next.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent actividad3= new Intent (Actividad2.this, Actividad3.class);
					startActivity(actividad3);
				} });
{

} } }