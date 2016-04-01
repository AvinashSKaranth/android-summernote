package in.nashapp.androidsummernote;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by Avinash on 01-04-2016.
 */
public class Summernote extends WebView  {
    String text="";
    public Summernote(Context context) {
        super(context);
        enable_summernote();
    }
    public Summernote(Context context, AttributeSet attrs){
        super(context, attrs);
        enable_summernote();
    }
    public Summernote(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        enable_summernote();
    }
    public void enable_summernote(){
        this.getSettings().setJavaScriptEnabled(true);
        this.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        //this.getSettings().setBuiltInZoomControls(true);
        this.addJavascriptInterface(new MyJavaScriptInterface(), "android");
        this. getSettings().setLoadWithOverviewMode(true);
        this. getSettings().setUseWideViewPort(true);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN) {
            this.getSettings().setAllowFileAccessFromFileURLs(true);
            this.getSettings().setAllowUniversalAccessFromFileURLs(true);
        }
        this.loadUrl("file:///android_asset/summernote.html");
    }
    class MyJavaScriptInterface {
        @JavascriptInterface
        public void getText(String html) {
            text=html;
        }
    }
    public void setText(String html) {
        this.loadUrl("javascript:$('#summernote').summernote('reset');");
        this.loadUrl("javascript:$('#summernote').summernote('editor.insertText', '" + html + "');");
    }
    public String getText() {
        text = "P/%TE5XpkAijBc%LjA;_-pZcbiU25E6feX5y/n6qxCTmhprLrqC3H%^hU!%q2,k'm`SHheoW^'mQ~zW93,C?~GtYk!wi/&'3KxW8";
        this.loadUrl("javascript:window.android.getText" + "(document.getElementsByClassName('note-editable')[0].innerHTML);");
        int i=0;
        try{
            while(text.equals("P/%TE5XpkAijBc%LjA;_-pZcbiU25E6feX5y/n6qxCTmhprLrqC3H%^hU!%q2,k'm`SHheoW^'mQ~zW93,C?~GtYk!wi/&'3KxW8")&&i<100){
                Thread.sleep(50);
                i++;
            }
        }catch (Exception e ){text = "Unable get the Text";}
        return text;
    }
}