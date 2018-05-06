package com.example.md.snapmap;

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

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private  float c = 5.0f;

    private static final LatLng Hyd1 = new LatLng(17.3850,78.4867);
    private static final LatLng Hyd2 = new LatLng(17.4850,78.5767);
    private static final LatLng Hyd3 = new LatLng(17.5850,78.7967);
    private static final LatLng Hyd4 = new LatLng(17.6850,78.6867);
    private static final LatLng Hyd5 = new LatLng(17.7850,78.1267);

    private Marker mHyd1,mHyd2,mHyd3,mHyd4,mHyd5;

    private static final LatLng Del1 = new LatLng(28.7041,77.1025);
    private static final LatLng Del2 = new LatLng(28.6041,77.6025);
    private static final LatLng Del3 = new LatLng(28.5041,77.4525);
    private static final LatLng Del4 = new LatLng(28.4041,77.2325);
    private static final LatLng Del5 = new LatLng(28.3041,77.8225);

    private Marker mDel1,mDel2,mDel3,mDel4,mDel5;

    private static final LatLng Bang1 = new LatLng(12.9716,77.5946);
    private static final LatLng Bang2 = new LatLng(12.8716,77.3946);
    private static final LatLng Bang3 = new LatLng(12.7716,77.4546);
    private static final LatLng Bang4 = new LatLng(12.6716,77.2746);
    private static final LatLng Bang5 = new LatLng(12.5716,77.1946);

    private Marker mBang1,mBang2,mBang3,mBang4,mBang5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        mMap.setMaxZoomPreference(15.0f);



        mHyd1 = mMap.addMarker(new MarkerOptions()
        .position(Hyd1)
                .title("Hyd1")
                .snippet("I am here")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.c02)));
        mHyd1.setTag(0);
        mHyd2 = mMap.addMarker(new MarkerOptions()
                .title("Hyd2")
                .snippet("I am here")
                .position(Hyd2)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.c03)));
        mHyd2.setTag(1);
        mHyd3 = mMap.addMarker(new MarkerOptions()
                .title("Hyd3")
                .snippet("I am here")
                .position(Hyd3)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.fa04)));

        mHyd3.setTag(2);
        mHyd4 = mMap.addMarker(new MarkerOptions()
                .position(Hyd4)
                .title("Hyd4")
                .snippet("I am here")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.fi02)));

        mHyd4.setTag(3);
        mHyd5 = mMap.addMarker(new MarkerOptions()
                .position(Hyd5)
                .title("Hyd5")
                .snippet("I am here")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.fi02)));

        mHyd5.setTag(4);



        mDel1 = mMap.addMarker(new MarkerOptions()
                .position(Del1)
                .title("Del1")
                .snippet("I am here")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.h05)));

        mDel1.setTag(5);
        mDel2 = mMap.addMarker(new MarkerOptions()
                .position(Del2)
                .title("Del2")
                .snippet("I am here")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.m02)));

        mDel2.setTag(6);
        mDel3 = mMap.addMarker(new MarkerOptions()
                .position(Del3)
                .title("Del3")
                .snippet("I am here")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.o03)));

        mDel3.setTag(7);
        mDel4 = mMap.addMarker(new MarkerOptions()
                .position(Del4)
                .title("Del4")
                .snippet("I am here")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.o04)));

        mDel4.setTag(8);
        mDel5 = mMap.addMarker(new MarkerOptions()
                .position(Del5)
                .title("Del5")
                .snippet("I am here")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.c03)));

        mDel5.setTag(9);

        mBang1 = mMap.addMarker(new MarkerOptions()
                .position(Bang1)
                .title("Bang1")
                .snippet("I am here")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.c03)));

        mBang1.setTag(10);
        mBang2 = mMap.addMarker(new MarkerOptions()
                .position(Bang2)
                .title("Bang2")
                .snippet("I am here")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.c02)));

        mBang2.setTag(11);
        mBang3 = mMap.addMarker(new MarkerOptions()
                .position(Bang3)
                .title("Bang3")
                .snippet("I am here")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.o04)));

        mBang3.setTag(12);
        mBang4 = mMap.addMarker(new MarkerOptions()
                .position(Bang4)
                .title("Bang4")
                .snippet("I am here")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.h05)));
        mBang4.setTag(13);
        mBang5 = mMap.addMarker(new MarkerOptions()
                .position(Bang5)
                .title("Bang5")
                .snippet("I am here")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.m02)));
        mBang5.setTag(14);

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Hyd1,5.0f));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {

                float zoomLevel = mMap.getCameraPosition().zoom;
                int tag = (int) marker.getTag();
                if((zoomLevel>=5.0f && zoomLevel <= 8.0f) || (c >= 5.0f && c<=8.0f) )

                {
                    c = c + 2;
                    switch (tag) {
                        case 0:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));

                            break;
                        case 1:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));

                            break;
                        case 2:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));

                            break;
                        case 3:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));

                            break;
                        case 4:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));
                            break;
                        case 5:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));

                            break;
                        case 6:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));

                            break;
                        case 7:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));

                            break;
                        case 8:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));

                            break;
                        case 9:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));

                            break;
                        case 10:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));

                            break;
                        case 11:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));

                            break;
                        case 12:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));

                            break;
                        case 13:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));

                            break;
                        case 14:
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), c));

                            break;

                    }

                }else if(zoomLevel > 8.0f)
                    {
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(),15.0f));
                        CustomWindowAdapter adapter = new CustomWindowAdapter(MapsActivity.this);
                        mMap.setInfoWindowAdapter(adapter);
                        marker.showInfoWindow();

                }/*else if(zoomLevel<5.0f && c!=5.0f){
                    c = 5.0f;
                }*/

                return true;
            }
        });

        mMap.setOnCameraMoveListener(new GoogleMap.OnCameraMoveListener() {
            @Override
            public void onCameraMove() {
                float zoomLevel = mMap.getCameraPosition().zoom;
                if(zoomLevel < 5.0f){
                    c = 5.0f;
                }
            }
        });



    }
}
