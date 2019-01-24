package com.example.jahanveenarang.smyle;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class DashBoard extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    String key="UCCjAYRuosoIm6huzZiAcEaQ";
   // String str="S.E.W.A. and SMYLE foundation Delhi";
   private FirebaseAuth mAuth;
    ImageView about , donate ,refer ;
    TextView educateGirls, bookTrips , joinUs , facebook , youtube ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       mAuth=FirebaseAuth.getInstance();
       about = findViewById(R.id.about);
       donate = findViewById(R.id.donate);
       refer = findViewById(R.id.refer);

       educateGirls = findViewById(R.id.educategirls);
       bookTrips= findViewById(R.id.booktrips);
       joinUs = findViewById(R.id.joinus);


       facebook = findViewById(R.id.read);
       youtube= findViewById(R.id.watch);


       about.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i = new Intent(DashBoard.this , AboutActivity.class);
               startActivity(i);
           }
       });

        refer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Smyle");
                String shareMessage= "\nLet me recommend you this application\n\n";
                shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                startActivity(Intent.createChooser(shareIntent, "choose one"));
            }
        });

        educateGirls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashBoard.this , GiveEducation100children.class);
                startActivity(i);
            }
        });

        bookTrips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        joinUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashBoard.this , JoinUS.class);
                startActivity(i);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                Uri uri=Uri.parse("https://www.facebook.com/groups/1059347210847449");
                intent.setData(uri);
                startActivity(intent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                Uri uri=Uri.parse("https://www.youtube.com/channel/"+key);
                intent.setData(uri);
                startActivity(intent);

            }
        });




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dash_board, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.sign_out) {
            mAuth.signOut();
            startActivity(new Intent(DashBoard.this,LoginActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.about) {

            Intent i = new Intent(DashBoard.this , AboutActivity.class);
            startActivity(i);
        } else if (id == R.id.news) {


        }else if (id == R.id.gallery) {
            Intent i = new Intent(DashBoard.this , Gallery.class);
            startActivity(i);

        } else if (id == R.id.sponser) {
            Intent i = new Intent(DashBoard.this , GiveEducation100children.class);
            startActivity(i);

        }
        else if (id == R.id.share) {

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Smyle");
            String shareMessage= "\nLet me recommend you this application\n\n";
            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            startActivity(Intent.createChooser(shareIntent, "choose one"));

        }
        else if (id == R.id.join) {
            Intent i = new Intent(DashBoard.this , JoinUS.class);
            startActivity(i);

        }
        else if (id == R.id.write) {

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/html");
            intent.putExtra(Intent.EXTRA_EMAIL, "4smylefoundation@gmail.com");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Regarding ngo support");
            intent.putExtra(Intent.EXTRA_TEXT, "Respected sir, ");

            startActivity(Intent.createChooser(intent, "Send Email"));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
