package com.hb;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.api.translate.Language;
import com.google.api.translate.Translate;

public class ConvertActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //final Typeface customF = Typeface.createFromAsset(this.getAssets(), "kk.ttf");
        final TextView textV = (TextView) findViewById(R.id.textView1);
        //textV.setTypeface(customF);
        textV.setTypeface(Typeface.createFromAsset(getAssets(),"kk.ttf")); 
        try{
        Translate.setHttpReferrer("www.ram.com");
		String str1=Translate.execute("love", Language.ENGLISH, Language.HINDI);
	
		//textV.setText(getResources().getString(R.string.x));
		Toast.makeText(this, str1, Toast.LENGTH_SHORT).show();
	//webView.loadUrl(x);
	//	webView.loadDataWithBaseURL("www.some.com","नमस्ते", "text/html", "utf-8", null);
    } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
    }
}