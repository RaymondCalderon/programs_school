package com.example.evaluacion_najib;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Elegir extends Activity {
	public RadioButton rbarea;
	public RadioButton rbvolumen;
	public RadioButton rbprac;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.elegir);
		rbarea = (RadioButton)findViewById(R.id.rbarea);
		rbvolumen = (RadioButton)findViewById(R.id.rbvolumen);
		rbprac = (RadioButton)findViewById(R.id.rbprac3);
		rbarea.setOnClickListener(new View.OnClickListener() {
			
			
			
			
			
			@Override
			public void onClick(View view) {
				rbvolumen.setChecked(false);
				Intent area = new Intent (Elegir.this, Area.class);
				startActivity(area);}});
				rbvolumen.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View view) {
						rbarea.setChecked(false);
						Intent volumen = new Intent (Elegir.this, Volumen.class);
						startActivity(volumen);
						rbprac.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View view) {
							rbprac.setChecked(false);
							Intent practica3 = new  Intent (Elegir.this, Practica3.class);
							startActivity(practica3);
							
								
						
							
							}
						});
						
					
					
					}
					
				});
				
	
	}
	
}
						
						
						
				
				
			
			
		
			