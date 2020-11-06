package com.example.laba3_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    NavController navController;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent newInt = new Intent(this, AboutActivity.class);
                startActivity(newInt);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
    }

    public void onClick(View view) {
            switch (view.getId()) {
                case R.id.f1t2:
                    navController.navigate(R.id.action_firstFragment2_to_secondFragment);
                    break;
                case R.id.f2t1:
                    navController.navigate(R.id.action_secondFragment_to_firstFragment2);
                    break;
                case R.id.f2t3:
                    navController.navigate(R.id.action_secondFragment_to_thirdFragment);
                    break;
                case R.id.f3t1:
                    navController.navigate(R.id.action_thirdFragment_to_firstFragment2);
                    break;
                case R.id.f3t2:
                    navController.navigate(R.id.action_thirdFragment_to_secondFragment);
                    break;
                case R.id.oneMore:
                    navController.navigate(R.id.action_firstFragment_to_oneMoreFragment);
                    break;
                case R.id.backFromVote:
                    navController.navigate(R.id.action_oneMoreFragment_to_firstFragment);
                    break;
            }
    }
}