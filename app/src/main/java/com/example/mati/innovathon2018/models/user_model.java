package com.example.mati.innovathon2018.models;

import android.media.Image;
import android.os.Parcelable;
import android.os.Parcel;
public class UserModel implements Parcelable{
    private String mUserName;
    private String mUserSurname;
    private Image mUserProfilePicture;

    public UserModel(){

    }
    public UserModel(String userName, String userSurname, Image profileImage){
        this.mUserName = userName;
        this.mUserSurname = userSurname;
        this.mUserProfilePicture = profileImage;
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mUserName);
        dest.writeString(this.mUserSurname);
        dest.writeByteArray(mUserProfilePicture.);
    }

}
