package com.project.vagabond95.nullawaysample;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    log(null);
  }

  // error
  public void log(String text) {
    Log.d(MainActivity.class.getCanonicalName(), "Text size : " + text.length());
  }

  // success
  /*public void log(@Nullable String text) {
    if (text != null) {
      Log.d(MainActivity.class.getCanonicalName(), "Text size : " + text.length());
    }
  }*/
}
