package com.example.mati.innovathon2018;



import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

public class GroupsAdapter extends RecyclerView.Adapter<GroupsAdapter.MyViewHolder> {

    private List<Group> groupList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView quantity, budget, location, date;

        public MyViewHolder(View view) {
            super(view);
            quantity = (TextView) view.findViewById(R.id.quantity);
            budget = (TextView) view.findViewById(R.id.budget);
            location = (TextView) view.findViewById(R.id.location);
            date = (TextView) view.findViewById(R.id.date);

        }
    }


    public GroupsAdapter(List<Group> groupList) {
        this.groupList = groupList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.group_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Group group = groupList.get(position);
        holder.quantity.setText(group.getActualQuantity() + "/" + group.getMaxQuantity());
        holder.budget.setText(group.getBudget());
        holder.location.setText(group.getLocation());
        holder.date.setText(group.getDate().toString());
    }

    @Override
    public int getItemCount() {
        return groupList.size();
    }
}