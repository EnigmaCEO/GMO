package com.enigmagames.gmo;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import org.apache.cordova.*;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class App extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                WindowManager.LayoutParams.FLAG_FULLSCREEN | 
                WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        
        setRequestedOrientation(
    		  ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//landscape mode
    		 
		getWindow().setFlags(
		  WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,
		  WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);//keep screen on
		 
		requestWindowFeature(Window.FEATURE_NO_TITLE);//no title
		
		super.setIntegerProperty("splashscreen", R.drawable.splash);

		super.loadUrl("file:///android_asset/www/index.html", 5000);
		
        super.setIntegerProperty("backgroundColor", Color.WHITE);
        
        super.appView.setHorizontalScrollBarEnabled(false);
        
     // Create native view with UI controls.
	View view = View.inflate(getContext(), R.layout.main, null);
	view.setBackgroundColor(Color.TRANSPARENT);
	
	View html = (View)appView.getParent();
    html.setBackgroundColor(Color.TRANSPARENT);
    

	root.addView(view);
        
    }
}