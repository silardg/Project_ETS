package rs.edu.etspupin.www.ets_official;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class main_class extends AppCompatActivity {

    Intent intent_chooseclass   = new Intent(main_class.this, choose_class.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent_setupclass    = new Intent(main_class.this, setup.class);

        startActivity(intent_setupclass);
        //startActivity(intent_chooseclass);
    }
}
