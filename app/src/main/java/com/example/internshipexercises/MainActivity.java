package com.example.internshipexercises;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.internshipexercises.model.Post;
import com.example.internshipexercises.server.ServerProvider;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);



        setToolbar();

    }

    private void setToolbar() {
        android.support.v7.widget.Toolbar
                mytoolbar = findViewById(R.id.my_toolbar);
        mytoolbar.setTitle("Restaurant");
        mytoolbar.setSubtitle("Restaurant description");

        setSupportActionBar(mytoolbar);
    }

    private void getImageUsingThread() {

    }

    private void getImageUsingExecutor() {

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int position = item.getItemId();
        switch (position) {
            case R.id.action_favourite:
                Toast.makeText(getApplicationContext(), "Favourites", Toast.LENGTH_LONG).show();
                return true;
                case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "Settings", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
