package rs.edu.etspupin.www.ets_official;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class main_class extends AppCompatActivity {

    Intent intent_setupclass    = new Intent(main_class.this, setup.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent_dashboardclass = new Intent(main_class.this, dashboard.class);

        //startActivity(intent_setupclass);
        startActivity(intent_dashboardclass);
    }
}
