package co.example.takwa.backgroundcolr;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.titlestyleId);
        Typeface typeface= Typeface.createFromAsset(getAssets(),"Jennifer Lynne.ttf");
        textView.setTypeface(typeface);
        textView.setText("Hello World");

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


    }

    public void click(View view) {
        if(view.getId() == R.id.purple){
            purpleColor();
        }
        if(view.getId() == R.id.blue){
            blueColor();
        }
        if(view.getId() == R.id.violet){
            violetColor();
        }
    }

    private void purpleColor() {
        SharedPreferences sharedPreferences= getSharedPreferences("dbOne",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        textView.setBackgroundResource(R.color.colorpurple);
        editor.commit();

    }

    private void blueColor() {
        SharedPreferences sharedPreferences= getSharedPreferences("dbOne",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        textView.setBackgroundResource(R.color.colorblue);
        editor.commit();

    }

    private void violetColor() {
        SharedPreferences sharedPreferences= getSharedPreferences("dbOne",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        textView.setBackgroundResource(R.color.colorviolet);
        //textView.setBackground(R.color.colorblue);
        editor.commit();

    }




}
/*
try this (for small file):    org.gradle.jvmargs=-XX\:MaxHeapSize\=256m -Xmx256m
or this (for big file):     -XX:MaxHeapSize=512m
 */

