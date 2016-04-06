# android-summernote
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-android--summernote-green.svg?style=true)](https://android-arsenal.com/details/1/3392)

To Add Offline WYSIWYG HTML Editor to your Android App

<img src="http://ultraimg.com/images/android-summernote.png" alt="android-summernote" width="240" height="">

Add this to your dependencies

```groovy
compile 'in.nashapp.androidsummernote:androidsummernote:1.0.4'
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
summernote.setRequestCodeforFilepicker(5);//Any Number with is not being used by other OnResultActivity
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
summernote.setText("<h2>Hello World</h2>");
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

Copyright (c) 2016 Avinash S Karanth

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
