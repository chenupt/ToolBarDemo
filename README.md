[![Android Gems](http://www.android-gems.com/badge/chenupt/DragTopLayout.svg?branch=master)](http://www.android-gems.com/lib/chenupt/DragTopLayout)

DragTopLayout
---
![icon](https://raw.githubusercontent.com/chenupt/DragTopLayout/master/imgs/icon.png)


Sometimes we need to show a top view above a ViewPager or ListView. DragTopLayout is a ViewGroup that contains a content view and a top menu view. You can show the top menu view just drag down the content view at the right time, or drag it up to fold.



The sample app: [click me](https://github.com/chenupt/DragTopLayout/raw/master/imgs/sample-debug-1.2.1.apk)

Here is a show case: 

![gif](https://raw.githubusercontent.com/chenupt/DragTopLayout/master/imgs/dragtop_1.1.0.gif)

Usage
---
Add the dependency to your build.gradle.

```
dependencies {
    compile 'com.github.chenupt.android:dragtoplayout:1.2.1@aar'
}
```

Add the DragTopLayout in your layout.

```xml
 <github.chenupt.dragtoplayout.DragTopLayout
     android:layout_width="match_parent"
     android:layout_height="match_parent">

     <!--top view-->
     <LinearLayout
         android:layout_width="match_parent"
         android:layout_height="wrap_content"
         android:gravity="center"
         android:orientation="vertical">
         ...
     </LinearLayout>

     <!--content view-->
     <LinearLayout
         android:orientation="vertical"
         android:layout_width="match_parent"
         android:layout_height="match_parent">
         ...
     </LinearLayout>

 </github.chenupt.dragtoplayout.DragTopLayout>
```

[XML Attributes](https://github.com/chenupt/DragTopLayout/blob/dev/library/src/main/res/values/attrs.xml)

Changelog
---
### v1.2.1
 * Fixed [#12](https://github.com/chenupt/DragTopLayout/issues/12)
 * Fixed [#20](https://github.com/chenupt/DragTopLayout/issues/20)
 * Support [PullToRefresh](https://github.com/chenupt/DragTopLayout/blob/master/sample%2Fsrc%2Fmain%2Fjava%2Fgithub%2Fchenupt%2Fdragtoplayout%2Fdemo%2Fpulltorefresh%2FPullToRefreshTopLayout.java)

### v1.2.0
 * Support Scrolling continue [#7](https://github.com/chenupt/DragTopLayout/pull/7).@sockeqwe
 * Retain state [#8](https://github.com/chenupt/DragTopLayout/pull/8).@sockeqwe
 * Fixed [#10](https://github.com/chenupt/DragTopLayout/issues/10), [#5](https://github.com/chenupt/DragTopLayout/issues/5), [#4](https://github.com/chenupt/DragTopLayout/issues/4).
 * Remove wizard.

### v1.1.0
 * Support [collapse offset](https://github.com/chenupt/DragTopLayout/issues/2).
 * Support drag down while attaching top view.
 * Support attributes in xml.
 * Add attach util.
 * New sample shows how to control content view attach with ListView & [RecyclerView](https://github.com/chenupt/DragTopLayout/issues/3) & GridView & ScrollView & WebView.
 

Developed By
---
 * Chenupt - <chenupt@outlook.com>
 * G+ [chenupt](https://plus.google.com/u/0/109194013506774756478)
 * 微博：[chenupt](http://weibo.com/p/1005052159173535/home)
 * QQ：753785666

License
---

    Copyright 2015 chenupt

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

