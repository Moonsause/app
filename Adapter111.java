package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;

public class Adapter111 extends RecyclerView.Adapter<Adapter111.ViewHolder> {
    private final Context context;
    private final List<Map<String, String>> dataList;

    public Adapter111(Context context, List<Map<String, String>> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item111, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Map<String, String> item = dataList.get(position);
        holder.title.setText(item.get("title"));
        holder.description.setText(item.get("description"));

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity111.class);
            intent.putExtra("title", item.get("title"));
            intent.putExtra("description", item.get("description"));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_item_title);
            description = itemView.findViewById(R.id.description111);
        }
    }
}
