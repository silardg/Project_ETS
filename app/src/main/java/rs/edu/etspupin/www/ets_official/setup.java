package rs.edu.etspupin.www.ets_official;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

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


        Button button = (Button) findViewById(R.id.setup_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _switch = new Intent(setup.this, dashboard.class);
                startActivity(_switch);
            }
        });

    }
}
