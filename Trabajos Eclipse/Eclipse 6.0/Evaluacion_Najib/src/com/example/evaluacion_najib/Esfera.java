package com.example.evaluacion_najib;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Esfera extends Activity {
    private TextView tvfia;
    private Button cales;
	private ImageView img;
    private EditText y1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.esfera);
		
		tvfia = (TextView)findViewById(R.id.tvesf);
		cales  = (Button)findViewById(R.id.calef);
		img = (ImageView)findViewById(R.id.imgesfera);
	    y1 = (EditText)findViewById(R.id.inradio);
		cales.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				double r = Double.parseDouble(((EditText)findViewById(R.id.inradio)).getText().toString());
		
				
				double esfera = (1.3333)*Math.PI*(r*r*r);
				tvfia.setText("El Volumen es:  "+esfera);
				
				img.setImageResource(R.drawable.esf);
				tvfia.setTextColor(Color.BLUE);
			
				
					  
				
			}
		});
		

}
}