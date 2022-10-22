package com.adithyarachmat.e_commerce.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.adithyarachmat.e_commerce.Admin.AdminLogin;
import com.adithyarachmat.e_commerce.Admin.AdminPage;
import com.adithyarachmat.e_commerce.Login.MainActivity;
import com.adithyarachmat.e_commerce.R;

public class HomePages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_pages);
    }

    //Membuat menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_kanan,menu);
        return true;
    }

    //Membuat pilihan menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.about)
        {
            startActivity(new Intent(HomePages.this, AdminPage.class));
        }

        return true;
    }

    public void ClothingOnClick(View view) {
    }

    public void ElectronicsOnClick(View view) {
    }

    public void BookOnClick(View view) {
    }

    public void OthersOnClcik(View view) {
    }
}