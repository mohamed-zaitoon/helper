/* Created by Mohamed Zaitoon */

package com.mycompany.myapp2;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.annotation.*;
import mz.libs.helper.Helper;
public class MainActivity extends AppCompatActivity {


	private WebView webview1;

	private ProgressDialog pD;

	private LinearLayout mErr;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
        Helper.blockScreenShot(this);
		//setContentView(R.layout.mzlibs);
	//	initialize(_savedInstanceState);
	}
/*
	private void initialize(Bundle _savedInstanceState) {

		webview1 = (WebView) findViewById(R.id.activity_main_webview);
	    mErr = (LinearLayout) findViewById(R.id.error);
		pD = new ProgressDialog(this);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		webview1.getSettings().setLoadWithOverviewMode(true);
		webview1.getSettings().setUseWideViewPort(true);
		webview1.getSettings().setDomStorageEnabled(true);
		webview1.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
		webview1.setWebChromeClient(new WebChromeClient());

		webview1.loadUrl("https://mohamed-m-zaitoon.github.io");
		pD.show(this,"Loading please wait..", "", false);
	 

		webview1.setWebViewClient(new WebViewClient() {
				@Override
				public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {

					super.onPageStarted(_param1, _param2, _param3);
					pD.show();
				}

				@Override
				public void onPageFinished(WebView _param1, String _param2) {

					super.onPageFinished(_param1, _param2);
					if(pD.isShowing()){
						pD.dismiss();
					}
				}

				@Override
				@TargetApi(21)
				public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
					return shouldOverrideUrlLoading(webView, webView.getUrl());
				}


			    @SuppressWarnings("deprecation")
				@Override
				public boolean shouldOverrideUrlLoading(WebView view, String url) {

					if (Uri.parse(url).getHost().equals("mohamed-zaitoon.github.io")){
						return false;
					}

					Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
					view.getContext().startActivity(intent);
					return true;
				}

				@Override
				@TargetApi(21)
				public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
					onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
				}

				@Override
			    @SuppressWarnings("deprecation")
				public void onReceivedError(WebView webView, int i, String str, String str2) {
					webview1.setVisibility(View.GONE);
				    mErr.setVisibility(View.VISIBLE);
					if(pD.isShowing()){
						pD.dismiss();
					}
				}


			});
	}

	@Override
	public void onBackPressed()
	{
		// TODO: Implement this method
		super.onBackPressed();
	}

	public void reload(View v){
		webview1.setVisibility(View.VISIBLE);
		mErr.setVisibility(View.GONE);
		webview1.reload();
	}
*/
}
