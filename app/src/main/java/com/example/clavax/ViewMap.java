package com.example.clavax;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.clavax.map.CustomMapFragment;
import com.example.clavax.map.MapWrapperLayout;
import com.example.clavax.map.SingleShotLocationProvider;
import com.example.clavax.map.TrackGPS;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ViewMap extends AppCompatActivity implements  OnMapReadyCallback{
    Double lat;
    Double lngit;
    public static ViewMap exc;
    private GoogleMap googleMap;
    LocationRequest mLocationRequest;
    GoogleApiClient mGoogleApiClient;
    CustomMapFragment mapFragment;
    View mapView;
    private View mMarkerParentView;
    String zipcode="";
    String zip = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_map);
        Intent i=getIntent();
        zipcode=i.getStringExtra("zipcode");
        Log.e("integer",Integer.parseInt(zipcode)+"");

        if (zipcode.length()>4)
        {
            zip=zipcode;
        }else if(zipcode.length()==4)
        {
            zip="0"+zipcode;
        }else if(zipcode.length()==3)
        {
            zip="00"+zipcode;
        }
        Log.e("zipcode",zip);
        final Geocoder geocoder = new Geocoder(this);

        try {
            List<Address> addresses = geocoder.getFromLocationName(zip, 1);
            if (addresses != null && !addresses.isEmpty()) {
                Address address = addresses.get(0);
                // Use the address as needed
                lat= address.getLatitude();
                lngit= address.getLongitude();
                String message = String.format("Latitude: %f, Longitude: %f",
                        address.getLatitude(), address.getLongitude());
                Log.e("latlong",message);
                //Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            } else {
                // Display appropriate message when Geocoder services are not available
                Toast.makeText(this, "Unable to geocode zipcode", Toast.LENGTH_LONG).show();
            }
        } catch (IOException e) {
            // handle exception
        }
        mapFragment = (CustomMapFragment) getFragmentManager().findFragmentById(R.id.map1);
        mapFragment.getMapAsync(ViewMap.this);
        mapView = mapFragment.getView();
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
        exc = this;
    }
    @Override
    public void onMapReady(GoogleMap gMap) {
        googleMap = gMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        try {
            googleMap.setMyLocationEnabled(true);
        } catch (SecurityException se) {

        }

        //Edit the following as per you needs
        googleMap.setTrafficEnabled(true);
        googleMap.setIndoorEnabled(true);
        googleMap.setBuildingsEnabled(true);
        googleMap.getUiSettings().setZoomControlsEnabled(true);
        //
if (lat!=null ||lngit!=null) {

    LatLng placeLocation = new LatLng(lat, lngit); //Make them global
    MarkerOptions marker = new MarkerOptions().position(
            new LatLng(lat, lngit)).title(zip);
    //changing marker icon
    marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE));
    //adding marker
    googleMap.addMarker(marker);
    CameraPosition cameraPosition = new CameraPosition.Builder().target(
            new LatLng(lat, lngit)).zoom(18).build();
    googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
//    googleMap.moveCamera(CameraUpdateFactory.newLatLng(placeLocation));
//    googleMap.animateCamera(CameraUpdateFactory.zoomTo(18.0f), 1000, null);
}
    }

  }