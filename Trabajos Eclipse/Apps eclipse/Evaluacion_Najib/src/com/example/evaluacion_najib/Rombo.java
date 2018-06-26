package com.example.evaluacion_najib;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Rombo extends Activity {
	private TextView rsal;
	private Button fin;
	private EditText s1, s2;
	private ImageView imgz;
	 
	protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.rombo);
			
			rsal = (TextView)findViewById(R.id.tvfinal);
			fin     = (Button)findViewById(R.id.btncalculaar);
			s1 = (EditText)findViewById(R.id.inlogladoc);
			s2 = (EditText)findViewById(R.id.inlogaltura);
			imgz = (ImageView)findViewById(R.id.imgsol);
			
			//ColorparaEditText
			s1.setTextColor(Color.YELLOW);
			s2.setTextColor(Color.YELLOW);
			  
			  
			fin.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View view) {
					double Lado = Double.parseDouble(((EditText)findViewById(R.id.inlogladoc)).getText().toString());
			        double Altura = Double.parseDouble(((EditText)findViewById(R.id.inlogaltura)).getText().toString());
					double rombo = (Lado)*(Altura);
					rsal.setText("El area es:  "+rombo);
					
					imgz.setImageResource(R.drawable.rom);
					rsal.setTextColor(Color.YELLOW);
					
				}
			});
			

}
}


