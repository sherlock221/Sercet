package com.sherlock221b.secret;

import android.content.Context;
import android.content.SharedPreferences.Editor;

public class Config {
	
	public  final static String  APP_ID = "com.sherlock221b.secret";
	public  final static String  KEY = "token";
	
	
	/**
	 * 获取缓存Token方法
	 * @param context
	 * @return
	 */
	public static String getCachedToken(Context context){
		 return context.getSharedPreferences(APP_ID, Context.MODE_PRIVATE).getString(KEY, null);
	}
	
	
	/**
	 * 缓存token
	 * @param context
	 * @param token
	 */
	public void cachedToken(Context context,String token){
		Editor e = context.getSharedPreferences(APP_ID, Context.MODE_PRIVATE).edit();
		e.putString(KEY, token);
		e.commit();
	}
	
}
