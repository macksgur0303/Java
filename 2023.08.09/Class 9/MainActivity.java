package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView wv;
    private String url = "https://www.youtube.com/watch?v=S4kd9OPzcf0&list=PLC51MBz7PMyyyR2l4gGBMFMMUfYmBkZxm&index=10";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv = (WebView) findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(url);
        wv.setWebChromeClient(new WebChromeClient());
        wv.setWebViewClient(new WebViewClient());

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // 어떠한 입력을 받았을때 동작 수행
        if((keyCode == KeyEvent.KEYCODE_BACK) && wv.canGoBack()){
            wv.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            // 현재 페이지의 url를 읽어올 수 있는 메소드
            view.loadUrl(url);
            return true;
        }
    }
}