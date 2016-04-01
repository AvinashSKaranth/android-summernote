# android-summernote
To Add Offline WYSIWIG HTML Editor to your Android App

Add this to your repositories
```
maven {
        url "https://dl.bintray.com/avinashskaranth/maven/"
      }
```

Add this to your dependencies

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
