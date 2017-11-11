package com.aarakshya.testgps;

import android.content.Intent;
import android.location.Location;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    double[][] LatLngs=new double[500][2];
        Marker[] mark = new Marker[500];
    LatLng[] latLngs= new LatLng[500];
    double lat,lang;
    double curlat, curlang;


   // Intent intent= getIntent();
   // double lat =intent.getDoubleExtra("lat",0);
   // double lang =intent.getDoubleExtra("lang",0);
    //tdouble LatLngs[][]; //array milena teu ta ho problem naihahahaha
    String[] places= new String[500];
// {
//            "metropolitan police thimi", // yo k ramita ho?  yo ramita hoina tit ehl eeh  haru ho
//            "maharajgunj police station",
//            "golfutar police bit",
//            "basundhara police station",
//            "thapathali police station",
//            "kalimati police station",
//            "metro police station",
//            "koteshowr police station",
//            "kapan police station",
//            "nepal police headquarters",
//            "metropolitan police circle",
//            "armed police force",
//            "swayambhu police station",
//            "dhobichaur police station",
//            "metropolitan police station",
//            "pulchowk police station",
//            "bhaisepati police station",
//            "imadol police station",
//            "kadaghari police station",
//            "metropolitan police circle"
//
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle b = getIntent().getExtras();
        String x = b.getString("lat");
        String y= b.getString("lang");

         curlat= Double.parseDouble(x);
         curlang= Double.parseDouble(y);
        //Toast.makeText(this, x+ "  the parsed text is  "+ y, Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        InputStreamReader is = null;
        try {
            is = new InputStreamReader(getAssets().open("data.csv"),"UTF-8");
        } catch (IOException e) {//pakha na
            e.printStackTrace();
        }

        BufferedReader reader = new BufferedReader(is);
        try {
            reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String line;
        int temp=0;
        //String daate, bhata;
        try {
            while ((line = reader.readLine()) != null) {
                String[] RowData = line.split(",");
                LatLngs[temp][0]= Double.parseDouble(RowData[0]);
                LatLngs[temp][1]= Double.parseDouble(RowData[1]);
                places[temp]=RowData[8 ].toString();
                temp++;
                            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Add a marker in Sydney and move the camera
//          LatLng sydney = new LatLng(27.682103, 85.391487);
       // latLngs[0] =new LatLng(27.682103, 85.391487);
//        bLatLngs[0][0]= 27.682103; LatLngs[0][1]= 85.391487;
//        LatLngs[1][0]= 27.739591; LatLngs[1][1]= 85.338589;
//        LatLngs[2][0]= 27.747544; LatLngs[2][1]= 85.348545;
//        LatLngs[3][0]= 27.738105; LatLngs[3][1]= 85.325403;
//        LatLngs[4][0]= 27.688991; LatLngs[4][1]= 85.320436;
//        LatLngs[5][0]= 27.697531; LatLngs[5][1]= 85.299756;
//        LatLngs[6][0]= 27.671965; LatLngs[6][1]= 85.326105;
//        LatLngs[7][0]= 27.678844; LatLngs[7][1]= 85.348700;
//        LatLngs[8][0]= 27.736019; LatLngs[8][1]= 85.360147;
//        LatLngs[9][0]= 27.715894; LatLngs[9][1]= 85.328658;
//        LatLngs[10][0]= 27.718572; LatLngs[10][1]= 85.309346;
//        LatLngs[11][0]=27.717964 ; LatLngs[11][1]=85.283404;
//        LatLngs[12][0]=27.713532 ; LatLngs[12][1]=85.292631;
//        LatLngs[13][0]=27.712121 ; LatLngs[13][1]= 85.307303;
//        LatLngs[14][0]=27.672339 ; LatLngs[14][1]=85.325097;
//        LatLngs[15][0]=27.677194 ; LatLngs[15][1]=85.316573;
//        LatLngs[16][0]=27.652641 ; LatLngs[16][1]=85.305121;
//        LatLngs[17][0]= 27.659429; LatLngs[17][1]=85.343123;
//        LatLngs[18][0]=27.692914 ; LatLngs[18][1]=85.374805;
//        LatLngs[19][0]=27.682578 ; LatLngs[19][1]=85.371940;

//        latLngs[1]=new LatLng(27.739591, 85.338589);
//        latLngs[2]=new LatLng(27.747544, 85.348545);
//        latLngs[3]=new LatLng(27.738105, 85.325403);
//        latLngs[4]=new LatLng(27.688991, 85.320436);
//        latLngs[5]=new LatLng(27.697531, 85.299756);
//        latLngs[6]=new LatLng(27.671965, 85.326105);
//        latLngs[7]=new LatLng(27.678844, 85.348700);
//        latLngs[8]=new LatLng(27.736019, 85.360147);
//        latLngs[9]=new LatLng( 27.715894, 85.328658);
//        latLngs[10]=new LatLng(, 85.309346);
//        latLngs[11]=new LatLng( , );
//        latLngs[12]=new LatLng(, );
//        latLngs[13]=new LatLng(,);
//        latLngs[14]=new LatLng(, );
//        latLngs[15]=new LatLng(, );u
//        latLngs[16]=new LatLng(, );
//        latLngs[17]=new LatLng(, );
//        latLngs[18]=new LatLng(, );
//        latLngs[19]=new LatLng(, );


       // mMap.addMarker(new MarkerOptions().position().title("Marker in Sydney"));
      //  mMap.moveCamera(CameraUpdateFactory.newLatLng(latLngs));

        for (int i=0;i<20;i++){
            //mMap.addMarker(new MarkerOptions().position(latLngs[i]).title(places[i]));
            double m = LatLngs[i][0];
            double n = LatLngs[i][1];

            latLngs[i]=new LatLng(m, n);
          //  mMap.moveCamera(CameraUpdateFactory.newLatLng(latLngs[i]));
            drawMarker(latLngs[i], places[i], i);
          //  Toast.makeText(MapsActivity.this, latLngs[i].toString(), Toast.LENGTH_SHORT).show();

        }
        //la la tyo ta garaula
        //tyo ??? chai dekhi sahana man laaagena hataidinxu testo vako haru

        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(curlat, curlang)));
       // drawMarker(new LatLng(curlat,curlang), "you", 20);
        mark[20] = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(curlat,curlang))
                .title("you").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mark[20].showInfoWindow();

        mMap.animateCamera( CameraUpdateFactory.zoomTo( 15.0f ) );
    }



    private void drawMarker(LatLng point, String title_marker, int i) {
               mark[i] = mMap.addMarker(new MarkerOptions()
                .position(point)
                .title(title_marker).icon(BitmapDescriptorFactory.fromResource(R.drawable.police)));
        mark[i].showInfoWindow();
      //  mMap.animateCamera( CameraUpdateFactory.zoomTo( 13.0f ) );
    }











}





















