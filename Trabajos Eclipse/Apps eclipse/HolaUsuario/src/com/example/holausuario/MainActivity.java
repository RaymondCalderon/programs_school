package com.example.holausuario;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	private LinearLayout ll1;
	private TextView tv1;
	private EditText et1;
	private Button btn1;
	private TextView tv2;
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 
        ll1 = (LinearLayout)findViewById(R.id.ll1);
        tv1 = (TextView)findViewById(R.id.tv1);
        btn1 = (Button)findViewById(R.id.btn1);
        et1 = (EditText)findViewById(R.id.et1);
        tv2 = (TextView)findViewById(R.id.tv2);
        btn1.setOnClickListener(new View.OnClickListener(){
    

	public void onClick(View v) {
		// TODO Auto-generated method stub
		tv2.setText(tv1.getText().toString()+" soy "+
		et1.getText().toString());
	ll1.setBackgroundColor(Color.GREEN);
	tv2.setTextColor(Color.YELLOW);
	et1.setText(null);
	et1.setTextColor(Color.BLACK);
	
    
    }
	   
});
    }
}

