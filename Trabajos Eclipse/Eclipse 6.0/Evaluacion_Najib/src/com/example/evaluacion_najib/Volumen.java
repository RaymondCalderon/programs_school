package com.example.evaluacion_najib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Volumen extends Activity {
	public RadioButton rbcubo;
	public RadioButton rbcilindro;
	public RadioButton rbesfera;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.volumen);
		
		rbcubo = (RadioButton)findViewById(R.id.rbcubo);
		rbcilindro = (RadioButton)findViewById(R.id.rbcilindro);
		rbesfera = (RadioButton)findViewById(R.id.rbEsfera);
		rbcubo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				rbcubo.setChecked(false);
				Intent cubo = new Intent (Volumen.this, Cubo.class);
				startActivity(cubo);}});
				rbcilindro.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						rbcilindro.setChecked(false);
						Intent cilindro = new Intent (Volumen.this, Cilindro.class);
						startActivity(cilindro);}});
						rbesfera.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View arg0) {
								rbesfera.setChecked(false);
								Intent esfera = new Intent (Volumen.this, Esfera.class);
								startActivity(esfera);}});
								
							}

				
				}
