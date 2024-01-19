package com.example.mynewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class MyAdaptor extends RecyclerView.Adapter<MyAdaptor.MyViewHolder> {
    private int[] images;
    private String[] names;
    private Context context;

    public MyAdaptor(Context context , int images[], String[] names) {

        this.context = context;
        this.images = images;
        this.names = names;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.single_item_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {
        holder.image.setImageResource(images[position]);
        holder.text.setText(names[position]);

        // Set a click listener for the item
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Show a Toast message on item click
                Toast.makeText(context, "Clicked on: " + names[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView text;

        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageview);
            text = itemView.findViewById(R.id.name2);
        }
    }
}
