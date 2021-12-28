package com.example.clavax;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.clavax.InterFace.APIInterface;
import com.example.clavax.Retrofit.PinList;
import com.example.clavax.RoomDB.CourseModal;
import com.example.clavax.RoomDB.ViewModal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_trucks_lst;
    ArrayList<Pin_Model> names;
    PinAdapter pinAdapter;
    APIInterface apiInterface;
    private ViewModal viewmodal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetData ();
    }
        public void SetData ()
        {
            rv_trucks_lst = findViewById(R.id.rv_trucks_lst);
            names = new ArrayList<>();
            rv_trucks_lst.setHasFixedSize(true);
            rv_trucks_lst.setLayoutManager(new LinearLayoutManager(this));
            viewmodal = ViewModelProviders.of(this).get(ViewModal.class);

            // below line is use to get all the courses from view modal.
            viewmodal.getAllCourses().observe(this, new Observer<List<CourseModal>>() {
                @Override
                public void onChanged(List<CourseModal> models) {
                    // when the data is changed in our models we are
                    // adding that list to our adapter class.
                 //   adapter.submitList(models);
                    pinAdapter = new PinAdapter(MainActivity.this, models);
                    rv_trucks_lst.setAdapter(pinAdapter);
                }
            });
//        names.add(new Trucks_Model("","","","",""));
//        rv_trucks_lst.setAdapter(trucksAdapter);
            Pinlist();

        }
        public void Pinlist ()
        {
             viewmodal.deleteAllCourses();
            apiInterface = APIClient.getClient().create(APIInterface.class);
            Call<PinList> call = apiInterface.zipcodes();
            call.enqueue(new Callback<PinList>() {
                @Override
                public void onResponse(Call<PinList> call, Response<PinList> response) {
                    PinList myteamectnet = response.body();
//                if (myteamectnet.getResponseCode()==200) {

                    Log.e("responce", "getdata");
                    names.clear();

                    for (int i = 0; i < myteamectnet.getData().getList().size(); i++) {
                        CourseModal model = new CourseModal(myteamectnet.getData().getList().get(i).getZipcode()+"", myteamectnet.getData().getList().get(i).getId()+"", "");
                        viewmodal.insert(model);
//                        names.add(new Pin_Model(myteamectnet.getData().getList().get(i).getZipcode()+"",myteamectnet.getData().getList().get(i).getId()+""));
//                        pinAdapter = new PinAdapter(MainActivity.this, names);
//                        rv_trucks_lst.setAdapter(pinAdapter);


                    }

                }


                @Override
                public void onFailure(Call<PinList> call, Throwable t) {

                }
            });
        }
    }