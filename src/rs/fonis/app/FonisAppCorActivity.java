package rs.fonis.app;
import org.apache.cordova.*;

import android.app.Activity;
import android.os.Bundle;

public class FonisAppCorActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}