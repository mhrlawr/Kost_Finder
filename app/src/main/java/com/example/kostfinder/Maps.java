package com.example.kostfinder;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps);
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

        // Add a marker in Sydney and move the camera
        LatLng lapas_N3 = new LatLng(-6.124224, 106.194811);
        mMap.addMarker(new MarkerOptions().position(lapas_N3).title("Kostan Lapas N3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lapas_N3, 15));

        LatLng wisma_im3 = new LatLng(-6.121169, 106.191098);
        mMap.addMarker(new MarkerOptions().position(wisma_im3).title("Wisma IM3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(wisma_im3, 15));

        LatLng pondok_winaya = new LatLng(-6.118297, 106.192626);
        mMap.addMarker(new MarkerOptions().position(pondok_winaya).title("Pondok Winaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pondok_winaya, 15));

        LatLng kostan_berkah = new LatLng(-6.124301, 106.195113);
        mMap.addMarker(new MarkerOptions().position(kostan_berkah).title("Kostan Berkah"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kostan_berkah, 15));
    }
}