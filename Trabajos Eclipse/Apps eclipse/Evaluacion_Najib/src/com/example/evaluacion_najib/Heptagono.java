package com.example.evaluacion_najib;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Heptagono extends Activity {
     private TextView reshep;
     private Button calhep;
     private EditText d1, d2;
     private ImageView imgh;
     protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.heptagono);
		
		reshep = (TextView)findViewById(R.id.tvhep);
		imgh = (ImageView)findViewById(R.id.imghep);
		d1 = (EditText)findViewById(R.id.inper);
		d2 = (EditText)findViewById(R.id.inapo);
		calhep  = (Button)findViewById(R.id.btncalhep);
		
		//ColorparaEditText
		d1.setTextColor(Color.YELLOW);
		d2.setTextColor(Color.YELLOW);
		
		calhep.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View view) {
				double Perimetro = Double.parseDouble(((EditText)findViewById(R.id.inper)).getText().toString());
				double Apotema= Double.parseDouble(((EditText)findViewById(R.id.inapo)).getText().toString());
				
				double heptagono = (Perimetro)*(Apotema)/2;
				reshep.setText("El area es:  "+heptagono);
				
				imgh.setImageResource(R.drawable.hep);
				reshep.setTextColor(Color.YELLOW);
				
			}
		});
		

}
}
