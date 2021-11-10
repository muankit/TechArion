package com.ankit.techarion;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.ankit.techarion.databinding.ActivityMainBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    public BottomNavigationView navView;
    private BottomAppBar bottomAppBar;
    private FloatingActionButton fab;
    public NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());*/

       /* // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
*/
        initi();

        navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(navView, navController);


    }

    private void initi() {

        navView = findViewById(R.id.nav_view);
        bottomAppBar = findViewById(R.id.bottomAppBar);
        fab = findViewById(R.id.fab);
        navView.setBackground(null);
        navView.getMenu().getItem(2).setCheckable(false);
    }

    public void hideBottomBar(){
        bottomAppBar.setVisibility(View.GONE);
        navView.setVisibility(View.GONE);
        fab.hide();
    }

    public void showBottomBar(){
        bottomAppBar.setVisibility(View.VISIBLE);
        navView.setVisibility(View.VISIBLE);
        fab.show();
    }

}