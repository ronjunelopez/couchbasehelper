package couchbasetest.suites.ronscript.couchbasehelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import suites.ronscript.couchbasehelper.DbUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        DbUtils.connect(getApplicationContext());
    }
}
