package edu.washington.yslasm.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;

public class MainActivity extends ActionBarActivity {

    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "OnCreate event fired");

    }

    public void onStart() {
        super.onStart();
        Log.i(TAG, "OnStart event fired");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onStop() {
        super.onStop();
        Log.e(TAG, "We're going down Captain!");
    }

    public void onResume() {
        super.onResume();
        Log.i(TAG, "OnResume event fired");
    }

    public void onRestart() {
        super.onRestart();
        Log.i(TAG, "OnRestart event fired");
    }

    public void onPause() {
        super.onPause();
        Log.i(TAG, "OnPause event fired");
    }
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "We're going down Captain!");
    }
}
