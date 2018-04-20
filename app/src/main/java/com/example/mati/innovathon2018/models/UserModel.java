package com.example.mati.innovathon2018.models;

import android.os.Parcel;
import android.os.Parcelable;
public class UserModel implements Parcelable{
    private String mUserName;
    private String mUserSurname;


    public UserModel(){

    }
    public UserModel(String userName, String userSurname){
        this.mUserName = userName;
        this.mUserSurname = userSurname;

    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mUserName);
        dest.writeString(this.mUserSurname);

    }
    protected UserModel(Parcel in) {
        this.mUserName = in.readString();
        this.mUserSurname = in.readString();

    }
    public static final Parcelable.Creator<UserModel> CREATOR = new Parcelable.Creator<UserModel>() {
        @Override
        public UserModel createFromParcel(Parcel source) {
            return new UserModel(source);
        }

        @Override
        public UserModel[] newArray(int size) {
            return new UserModel[size];
        }
    };

}
