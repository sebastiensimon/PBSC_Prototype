package com.example.asti3.palmbeachstatecollege;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Transportation(View view) {

        Intent intent = new Intent(this, TransportationActivity.class);
        startActivity(intent);
    }

    public void Blackboard(View view) {

        Intent intent = new Intent(this, BlackboardActivity.class);
        startActivity(intent);
    }

    public void Admission(View view) {

        Intent intent = new Intent(this, AdmissionActivity.class);
        startActivity(intent);

    }

    public void Email(View view) {

        Intent intent = new Intent(this, AreaofStudyActivity.class);
        startActivity(intent);

    }

    public void BelleGladetutor(View view) {

        Intent intent = new Intent(this, BelleGladeActivity.class);
        startActivity(intent);
    }

    public void BocaRatontutor(View view) {

        Intent intent = new Intent(this, BocaRatonTutorActivity.class);
        startActivity(intent);
    }

    public void LakeWorthTutor(View view) {

        Intent intent = new Intent(this, LakeWorthTutorActivity.class);
        startActivity(intent);
    }

    public void Catalog(View view) {

        Intent intent = new Intent(this, CatalogActivity.class);
        startActivity(intent);
    }

    public void Directory(View view) {

        Intent intent = new Intent(this, DirectoryActivity.class);
        startActivity(intent);

    }

    public void Event(View view) {

        Intent intent = new Intent(this, EventActivity.class);
        startActivity(intent);
    }

    public void Facebook(View view) {

        Intent intent = new Intent(this, FacebookActivity.class);
        startActivity(intent);
    }

    public void Instagram(View view) {

        Intent intent = new Intent(this, InstagramActivity.class);
        startActivity(intent);
    }

    public void Flickr(View view) {

        Intent intent = new Intent(this, FlickrActivity.class);
        startActivity(intent);
    }

    public void IncidentforEmployee(View view) {

        Intent intent = new Intent(this, IncidentforEmployeeActivity.class);
        startActivity(intent);

    }

    public void IncidentsforStudents(View view) {

        Intent intent = new Intent(this, IncidentforStudentsActivity.class);
        startActivity(intent);
    }

    public void Library(View view) {

        Intent intent = new Intent(this, LibraryActivity.class);
        startActivity(intent);
    }

    public void Map(View view) {

        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }

    public void News(View view) {

        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }

    public void PalmBeachGardentutor(View view) {

        Intent intent = new Intent(this, PalmBeachGardentTutorActivity.class);
        startActivity(intent);
    }

    public void Pantherweb(View view) {

        Intent intent = new Intent(this, PantherwebActivity.class);
        startActivity(intent);
    }

    public void Loxtutor(View view) {

        Intent intent = new Intent(this, LoxTutorActivity.class);
        startActivity(intent);
    }

    public void Twitter(View view) {

        Intent intent = new Intent(this, TwitterActivity.class);
        startActivity(intent);
    }

    public void Youtube(View view) {

        Intent intent = new Intent(this, YoutubeActivity.class);
        startActivity(intent);
    }

    public void Dibs(View view) {

        Intent intent = new Intent(this, DibsActivity.class);
        startActivity(intent);
    }
}