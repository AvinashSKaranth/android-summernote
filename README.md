# android-summernote
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-android--summernote-green.svg?style=true)](https://android-arsenal.com/details/1/3392)

To Add Offline WYSIWYG HTML Editor to your Android App

<img src="http://ultraimg.com/images/android-summernote.png" alt="android-summernote" width="240" height="">

Add this to your dependencies

```groovy
compile 'in.nashapp.androidsummernote:androidsummernote:1.0.5'
```

Add to Manifest (For adding images from Device)
```xml
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
```

Add to your XML 
```xml
<in.nashapp.androidsummernote.Summernote
    android:id="@+id/summernote"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>
```

Link the view in your Java Code
```java
Summernote summernote = (Summernote) findViewById(R.id.summernote);
summernote.setRequestCodeforFilepicker(5);//Any Number which is not being used by other OnResultActivity
```

Pass the on onActivityResult to Summernote. (Enables attaching images to the Document)
```java
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
    super.onActivityResult(requestCode, resultCode, intent);
    summernote.onActivityResult(requestCode, resultCode, intent);
}
```

Retrive HTML Data
```java
String html_data = summernote.getText()
```

Set HTML Data
```java
summernote.setText("<h2>Hello World.<h2><br><h3> I'am Summernote</h3>");
```

Known Issues

* Calling from Fragment

Current Resolution

Using summernote as a static variable in the Fragment and calling onActivityResult from the Main Activity
```java
// In Fragment
static Summernote summernote;

// In Activity
Fragment.summernote.onActivityResult(requestCode, resultCode, intent);
```
**License** 
Apache License 2.0
