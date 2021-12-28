package com.example.clavax;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clavax.RoomDB.CourseModal;

import java.util.ArrayList;
import java.util.List;

public class PinAdapter extends RecyclerView.Adapter<PinAdapter.TrucksHolder> {

    private Context context;
    private List<CourseModal> names;
    private LayoutInflater inflater;

    public PinAdapter(Context context, List<CourseModal> names) {
        this.context = context;
        this.names = names;

        inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public TrucksHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new TrucksHolder(inflater.inflate(R.layout.truck_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TrucksHolder holder, @SuppressLint("RecyclerView") int position) {
                holder.trunck_no.setText("Pin code : "+names.get(position).getCourseName());
              holder.cardCategory.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      if (names.get(position).getCourseName().equals(""))
                      {
                          Toast.makeText(context,"OKKKK",Toast.LENGTH_SHORT).show();
                      }else {


                          context.startActivity(new Intent(context, ViewMap.class).putExtra("zipcode", names.get(position).getCourseName()));
                      }
                  }
              });
    }



    @Override
    public int getItemCount() {
        return names.size();
    }

    public class TrucksHolder extends RecyclerView.ViewHolder {
        private TextView trunck_no;
        private ImageView img;
        private View itemView;
        private CardView cardCategory;
        public TrucksHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;

            trunck_no = itemView.findViewById(R.id.trunck_no);
            cardCategory = itemView.findViewById(R.id.cardCategory);


        }
    }

}
