package com.example.mati.innovathon2018;



import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.MyViewHolder> {

    private List<User> userList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, surname, university;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.userName);
            surname = (TextView) view.findViewById(R.id.userSurname);
            university = (TextView) view.findViewById(R.id.university);
        }
    }


    public UsersAdapter(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        User user = userList.get(position);
        holder.name.setText(user.getName());
        holder.surname.setText(user.getSurname());
        holder.university.setText(user.getUniversity());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}