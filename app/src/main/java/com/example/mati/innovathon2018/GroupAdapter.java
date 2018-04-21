package com.example.mati.innovathon2018;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mati.innovathon2018.models.GroupModel;

import java.util.ArrayList;

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.ViewHolder> {

    private Context gContext;
    private ArrayList<GroupModel> gList = new ArrayList<>();

    GroupAdapter(Context context, ArrayList<GroupModel> list)
    {
        gContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(gContext);
        View view = layoutInflater.inflate(R.layout.rv_group_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        GroupModel groupModel = gList.get(position);
        TextView quantity, budget, date, location;

        quantity = holder.group_quantity;
        budget = holder.group_budget;
        date = holder.group_date;
        location = holder.group_location;

        quantity.setText(groupModel.getActualQuantity() + "/" + groupModel.getMaxQuantity());
        budget.setText(groupModel.getBudget());
        date.setText(groupModel.getDate().toString());
        location.setText(groupModel.getLocation());
    }

    @Override
    public int getItemCount() {
        return gList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView group_quantity,group_budget,group_date,group_location;

        public ViewHolder(View itemView){
            super(itemView);

            group_quantity = itemView.findViewById(R.id.quantity);
            group_budget = itemView.findViewById(R.id.budget);
            group_date = itemView.findViewById(R.id.date);
            group_location = itemView.findViewById(R.id.location);
        }
    }

}
