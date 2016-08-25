package com.example.jnitest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity  implements OnClickListener{
	
	private EditText editText1;
	private EditText editText2;
	private EditText editText3;
	private Button  button1;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.Button01).setOnClickListener(this);

	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int sum=0;
		
		button1=(Button)findViewById(R.id.Button01);
		editText1=(EditText)findViewById(R.id.editText01);
		editText2=(EditText)findViewById(R.id.editText02);
		editText3=(EditText)findViewById(R.id.editText03);
		
		int a=Integer.parseInt(editText1.getText().toString());
		int b=Integer.parseInt(editText2.getText().toString());
		sum =NativeClass.jniArrayAvg(a, b);
		
			switch(v.getId()){
						case R.id.Button01:
										editText3.setText(Integer.toString(sum));
							break;
							
						default:
									
							break;
			}
	}	
}
