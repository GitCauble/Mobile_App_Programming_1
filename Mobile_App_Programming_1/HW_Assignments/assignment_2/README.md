# Assignment_2


# Student name: Ryan Cauble


# ID: 00267379

# strings.xml  :

```
<resources>
    <string name="app_name">Happy Birthday</string>
    <string name="action_settings">Settings</string>
    <string name="to_ben">Happy Birthday, Ben</string>
    <string name="from_lyla">From, Lyla!</string>
</resources>

```

# activity_main.xml  :

```
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <ImageView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:scaleType="centerCrop"
        android:src="@drawable/androidparty" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="sans-serif-light"
        android:padding="20dp"
        android:text="@string/to_ben"
        android:textColor="@android:color/white"
        android:textSize="36sp" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_alignParentRight="true"
        android:fontFamily="sans-serif-light"
        android:padding="20dp"
        android:text="@string/from_lyla"
        android:textColor="@android:color/white"
        android:textSize="36sp" />

</RelativeLayout>
```


![screenshot](https://user-images.githubusercontent.com/17748575/30352902-e03ff618-97f0-11e7-8ba6-1116d683660e.png)
