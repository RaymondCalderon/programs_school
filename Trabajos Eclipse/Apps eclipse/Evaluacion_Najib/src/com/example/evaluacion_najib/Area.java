package com.example.evaluacion_najib;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Area extends Activity {
	public RadioButton rbtrapecio;
	public RadioButton rbrombo;
	public RadioButton rbheptagono;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.area);
		
		rbtrapecio = (RadioButton)findViewById(R.id.rbtrapecio);
		rbrombo = (RadioButton)findViewById(R.id.rbrombo);
		rbheptagono = (RadioButton)findViewById(R.id.rbheptagono);
		rbtrapecio.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				rbtrapecio.setChecked(false);
				Intent trapecio = new Intent (Area.this, Trapecio.class);
				startActivity(trapecio);}});
				rbrombo.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						rbrombo.setChecked(false);
						Intent rombo = new Intent (Area.this, Rombo.class);
						startActivity(rombo);}});
						rbheptagono.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View arg0) {
								rbrombo.setChecked(false);
								Intent heptagono = new Intent (Area.this, Heptagono.class);
								startActivity(heptagono);}});
								
							}
}
				
					
	
	
						

