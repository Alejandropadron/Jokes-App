package lpadron.me.jokesapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Joke> jokes = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout touch = (RelativeLayout)findViewById(R.id.touch);
        final TextView jokesContent = (TextView) findViewById(R.id.jokeLabel);
        final TextView artistContent = (TextView) findViewById(R.id.artistLabel);


        Joke joke1 = new Joke("Why did the chicken cross the road?", "Alex Padron" );
        jokes.add(joke1);
        Joke joke2 = new Joke("Roses are red", "Alex Padron" );
        jokes.add(joke2);
        Joke joke3 = new Joke("suck a dick", "Alex Padron" );
        jokes.add(joke3);
        Joke joke4 = new Joke("fuck java", "Alex Padron" );
        jokes.add(joke4);

        touch.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            @Override
            public void onClick(View v) {
                if (count<jokes.size()){
                    Joke j = jokes.get(count);
                    jokesContent.setText(j.getJokeContent());
                    artistContent.setText(j.getArtistName());
                    count = count + 1;
                }
                else {
                    count = 0;
                }
            }
        });

    }

}
