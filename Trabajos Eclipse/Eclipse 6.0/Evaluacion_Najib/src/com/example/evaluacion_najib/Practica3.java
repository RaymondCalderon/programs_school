package com.example.evaluacion_najib;



import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Practica3 extends Activity {
	private LinearLayout hola;
	private TextView Hey;
	private EditText Intro;
	private Button Aceptar;
	private TextView salida;
	private ImageView img;
	private Button Limpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practica3);
        hola = (LinearLayout)findViewById(R.id.Yes);
        Hey = (TextView)findViewById(R.id.Hay);
        Aceptar = (Button)findViewById(R.id.Pul);
        Limpiar = (Button)findViewById(R.id.Clean);
        Intro = (EditText)findViewById(R.id.Enter);
        salida = (TextView)findViewById(R.id.txtSalida);
        img=(ImageView)findViewById(R.id.Imagen);
        Aceptar.setOnClickListener(new View.OnClickListener() {
        	
			
			@Override 
			public void onClick(View v) {
				// TODO Auto-generated method stub
				salida.setText(Hey.getText().toString()+" soy "+
				Intro.getText().toString());
			hola.setBackgroundColor(Color.BLUE);
			salida.setTextColor(Color.YELLOW);
			Intro.setText(null);
			Intro.setTextColor(Color.RED);
			img.setImageResource(R.drawable.mario);
    }
			
			
			


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }
   
});
        Limpiar.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				salida.setText("");
					hola.setBackgroundColor(Color.WHITE);
					salida.setTextColor(Color.YELLOW);
					Intro.setText(null);
					Intro.setTextColor(Color.RED);
					img.setImageResource(Color.TRANSPARENT);
			}
			
		});
		
    }

    

}
