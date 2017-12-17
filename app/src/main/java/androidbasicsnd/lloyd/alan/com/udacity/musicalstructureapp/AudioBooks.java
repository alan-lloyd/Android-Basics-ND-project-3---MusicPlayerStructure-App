package androidbasicsnd.lloyd.alan.com.udacity.musicalstructureapp;

/**
 * Created by DAVELLOYD on 10/05/2017.
 * Class is called by class MainActivity, which loaded up an onClickListener that calls this class when button "audio books" (also created by MainActivity) is clicked
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AudioBooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_books);
    }

}