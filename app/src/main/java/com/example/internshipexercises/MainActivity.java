package com.example.internshipexercises;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int incrementValue=0;
    private TextView incrementTv;
    private Button incrementBtn;
    private  static final String STATE_INCREMENT="increment";

    public static final String TAG= MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if( savedInstanceState!=null){
            incrementValue=savedInstanceState.getInt(STATE_INCREMENT);
        }

        Log.d(TAG,"onCreate: Happy to be born!");
        initViews();


    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(STATE_INCREMENT,incrementValue);

    }



    private void initViews(){
        incrementTv=findViewById(R.id.counter_value_tv);
        incrementBtn=findViewById(R.id.increment_bt);

        incrementTv.setText(incrementValue+"");
        incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementValue++;
                incrementTv.setText(incrementValue+"");
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart: Activity exists but it is not visible");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume: Preparing final UI changes for your master ");
    }

    //vine o aplicatie in fata
    //app dispare de pe ecran
    //ex dialog alert
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause: You can see me, but i don't want to interact ");
    }

    //inchidem procesele
    //on destroy nu e tot timpul apelata
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop: Packing up, preparing to leave");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy: Bye bye !");
    }
}
