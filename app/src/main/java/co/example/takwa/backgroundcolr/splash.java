package co.example.takwa.backgroundcolr;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class splash extends AppCompatActivity {
    TextView textView;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        linearLayout=findViewById(R.id.lay);

        textView =findViewById(R.id.textStyld);
        Typeface typeface= Typeface.createFromAsset(getAssets(),"Jennifer Lynne.ttf");
        textView.setTypeface(typeface);
        textView.setText("Which color would you like to paint yourself");

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        //Animation ia a class under lang
        //AnimationUtil is a Class under object class, loadAnimation is the public method of this class

        Animation animation= AnimationUtils.loadAnimation(this,R.anim.my_anime);
        linearLayout.setAnimation(animation);

        final Thread thread =  new Thread(){
            @Override
            public void run() {
                for(int i=0;i<=3;i++){

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //catch (Exception e){

                    }
                startActivity(new Intent(splash.this,MainActivity.class));
                finish();

                }

        };
        thread.start();

    }
}
