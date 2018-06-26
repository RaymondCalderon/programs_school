package com.example.evaluacion_najib;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Cubo extends Activity {
	 private TextView tvcub;
	    private Button calcub;
		private ImageView lun;
	    private EditText col;
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.cubo);
			
			tvcub = (TextView)findViewById(R.id.tvvolf);
			lun = (ImageView)findViewById(R.id.imglun);
			col = (EditText)findViewById(R.id.incubo);
			calcub  = (Button)findViewById(R.id.btncubo);
			
			//ColorparaEditText
			col.setTextColor(Color.YELLOW);
			  
		
			calcub.setOnClickListener(new View.OnClickListener() {
			
				
				@Override
				public void onClick(View view) {
					double a = Double.parseDouble(((EditText)findViewById(R.id.incubo)).getText().toString());
										
					double cubo = (a)*(a)*(a);
					tvcub.setText("El Volumen es:  "+cubo);
					
					lun.setImageResource(R.drawable.cubo);
					tvcub.setTextColor(Color.YELLOW);
				
				}
			});
			

	}
	}



