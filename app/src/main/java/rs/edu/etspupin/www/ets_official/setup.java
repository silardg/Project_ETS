package rs.edu.etspupin.www.ets_official;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class setup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // request feature
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // setup the layout
        setContentView(R.layout.activity_setup);

        // set the flag that we are using fullscreen and no status bar is needed
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
}
