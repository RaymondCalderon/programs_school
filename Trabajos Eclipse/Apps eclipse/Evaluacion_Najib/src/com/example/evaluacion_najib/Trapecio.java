package com.example.evaluacion_najib;




import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Trapecio extends Activity {
	private TextView resfin;
	private Button botcal;
    private EditText r1, r2, r3;
    private ImageView imgt; 
	protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.trapecio);
			
			resfin = (TextView)findViewById(R.id.tvres);
			botcal  = (Button)findViewById(R.id.calarea);
			imgt = (ImageView)findViewById(R.id.imgtra);
			r1 = (EditText)findViewById(R.id.inbaseM);
			r2 = (EditText)findViewById(R.id.inBasemen);
			r3 = (EditText)findViewById(R.id.inaltura);
			
			
			//ColorparaEditText
			r1.setTextColor(Color.GREEN);
			r2.setTextColor(Color.GREEN);
			r3.setTextColor(Color.GREEN);
			
			
			botcal.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View view) {
					double BaseM = Double.parseDouble(((EditText)findViewById(R.id.inbaseM)).getText().toString());
					double Basem = Double.parseDouble(((EditText)findViewById(R.id.inBasemen)).getText().toString());
					double Altura = Double.parseDouble(((EditText)findViewById(R.id.inaltura)).getText().toString());
					double trapecio = (BaseM+Basem)*(Altura)/2;
					resfin.setText("El area es:  "+trapecio);
					
					imgt.setImageResource(R.drawable.tra);
					resfin.setTextColor(Color.YELLOW);
					
					
				}
			});
			

}
}