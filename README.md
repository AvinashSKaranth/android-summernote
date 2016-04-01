# android-summernote
Add WYSIWIG to your project by including this in your gradle
```
compile 'in.nashapp.androidsummernote:androidsummernote:1.0.0'
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
```

Retrive HTML Data
```
String html_data = summernote.getText()
```

Set HTML Data
```
summernote.setText("Hello World");
```
