# android-summernote
To Add Offline WYSIWYG HTML Editor to your Android App

<img src="http://ultraimg.com/images/android-summernote.png" alt="android-summernote" width="240" height="">

Add this to your dependencies

```
compile 'in.nashapp.androidsummernote:androidsummernote:1.0.4'
```

Add to Mannifest (For adding images from Device)
```
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
```

Add to your XML 
```
<in.nashapp.androidsummernote.Summernote
android:id="@+id/summernote"
android:layout_width="match_parent"
android:layout_height="match_parent"/>
```

Link the view in your Java Code
```
Summernote summernote = (Summernote) findViewById(R.id.summernote);
summernote.setRequestCodeforFilepicker(5);//Any Number with is not being used by other OnResultActivity
```

Pass the on onActivityResult to Summernote. (Enables attaching images to the Document)
```
@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        summernote.onActivityResult(requestCode, resultCode, intent);
    }
```

Retrive HTML Data
```
String html_data = summernote.getText()
```

Set HTML Data
```
summernote.setText("<h2>Hello World</h2>");
```
