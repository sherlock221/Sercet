package com.sherlock221b.secret;

import com.sherlock221b.secret.atys.AtyLogin;
import com.sherlock221b.secret.atys.AtyTimeLine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//登录验证
		String token = Config.getCachedToken(this);
		Intent  intent = null;	
		if(token != null){
			intent = new Intent(this,AtyTimeLine.class);
			//token传递过去
			intent.putExtra(Config.KEY, token);
		}
		else{
			intent = new Intent(this,AtyLogin.class);
		}
		
		startActivity(intent);
	}
	
	
	

	
}
