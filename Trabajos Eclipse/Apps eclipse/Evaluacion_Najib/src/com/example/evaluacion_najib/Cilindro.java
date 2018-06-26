package com.example.evaluacion_najib;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Cilindro extends Activity {
    private TextView tvv;
    private Button calv;
    private ImageView tvimg;
	private EditText in1, in2;
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cilindro);
		
		tvv = (TextView)findViewById(R.id.tvvol);
		calv  = (Button)findViewById(R.id.btnvol);
		tvimg = (ImageView)findViewById(R.id.imcil);
		in1  = (EditText)findViewById(R.id.inh);
		in2  = (EditText)findViewById(R.id.inr);
		
		calv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				double r = Double.parseDouble(((EditText)findViewById(R.id.inr)).getText().toString());
				double h = Double.parseDouble(((EditText)findViewById(R.id.inh)).getText().toString());
				
				double cilindro = Math.PI*(r)*(r)*(h);
				tvv.setText("El Volumen es:  "+cilindro);
				
				tvimg.setImageResource(R.drawable.cil);
				tvv.setTextColor(Color.YELLOW);
			    in1.setText(null);
				in2.setText(null);
				
				
			}
		});
		

}
}

