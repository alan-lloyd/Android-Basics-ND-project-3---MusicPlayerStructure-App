package androidbasicsnd.lloyd.alan.com.udacity.musicalstructureapp;

/**
 * Created by DAVELLOYD on 09/05/2017.
 * Class is called by class MainActivity, which loaded up an onClickListener that calls this class when button "select tracks" (also created by MainActivity) is clicked
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SelectTracks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_tracks);
    }

}