package com.example.btnanimation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import xyz.hanks.library.bang.SmallBangView;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer musica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Reproduce la musica en la actividad
        musica = MediaPlayer.create(this,R.raw.intro_donato);
        musica.setLooping(true);//para q la siga reproduciendo
        musica.start();


    }
    @Override
    protected void onResume() {
        super.onResume();
        musica.start();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        musica.pause();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // La actividad está a punto de ser destruida.
        if(musica.isPlaying()){
            musica.stop();
            musica.release();
        }
    }
}
