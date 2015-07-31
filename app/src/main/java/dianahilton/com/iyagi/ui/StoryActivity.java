package dianahilton.com.iyagi.ui;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import dianahilton.com.iyagi.R;


public class StoryActivity extends Activity {

    public static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));

        if (name == null) {
            name = "Friend";
        }
        Log.d(TAG, name);
    }
}
