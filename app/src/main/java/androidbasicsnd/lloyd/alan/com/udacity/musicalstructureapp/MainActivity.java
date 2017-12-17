package androidbasicsnd.lloyd.alan.com.udacity.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**creates a button for each of 4 xml.button areas, and run onClickListners on each. If button clicked, then create new Intent that loads up relevant page */

        // Find the View that matches the newly created play live tracks 'button'
        Button streamingButton = (Button) findViewById(R.id.play_it_and_see_button);

        // Set a click listener on that View
        streamingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent streamedTracksPage = new Intent(MainActivity.this, SelectTracks.class);
                startActivity(streamedTracksPage);
            }
        });

        // Find the View that matches the newly created buy led zep albums/tracks 'button'
        Button buyMusicButton = (Button) findViewById(R.id.purchase_music_button);

        // Set a click listener on that View
        buyMusicButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent purchaseMusicPage = new Intent(MainActivity.this, PurchaseMusic.class);
                startActivity(purchaseMusicPage);
            }
        });

        // Find the View that matches the newly created band info 'button'
        Button bandInfoButton = (Button) findViewById(R.id.band_info_button);

        // Set a click listener on that View
        bandInfoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent bandInfoPage = new Intent(MainActivity.this, BandInfo.class);
                startActivity(bandInfoPage);
            }
        });

        // Find the View that matches the newly created buy audio books 'button'
        Button audioBooksButton = (Button) findViewById(R.id.audio_books_button);

// Set a click listener on that View
        audioBooksButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent audioBooksPage = new Intent(MainActivity.this, AudioBooks.class);
                startActivity(audioBooksPage);
            }
        });

    } //end onCreate method
} //end class


