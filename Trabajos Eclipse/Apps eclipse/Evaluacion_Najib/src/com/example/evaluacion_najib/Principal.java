package com.example.evaluacion_najib;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Principal extends Activity {
	private Button entrar;
	public EditText user, pass;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);
		entrar = (Button)findViewById(R.id.btnintro);
	    entrar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				user = (EditText)findViewById(R.id.user);
				pass = (EditText)findViewById(R.id.pass);
				String usuario = user.getText().toString();
				String passwd = pass.getText().toString();
			   if (usuario.equals("Najib")&& passwd.equals("Loera")){
				   Intent intent = new Intent (Principal.this, Elegir.class);
					startActivity(intent);
					user.setText(null);
					pass.setText(null);}
				   else {Toast.makeText(
					Principal.this, 
					"Usuario o Contraseña incorrectos", 
					Toast.LENGTH_SHORT).show();
			   }
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}

}
