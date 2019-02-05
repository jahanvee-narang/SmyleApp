package com.example.jahanveenarang.smyle;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewClientImp extends WebViewClient {

    private Activity activity = null;

    public WebviewClientImp(Activity activity) {
        this.activity = activity;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        if(url.indexOf("https://www.payumoney.com/paybypayumoney/#/DB085F74BD77B86D098E0C30FEC5AF6F") > -1 ) return false;

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(intent);
        return true;
    }
}