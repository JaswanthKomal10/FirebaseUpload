package com.jaswanthk.firebaseuploadpro;

import com.google.firebase.database.Exclude;

public class FileUploadFBase {


    private String mName,mKey;
    private String mImageUrl;

    public FileUploadFBase() {
        //empty constructor needed
    }

    public FileUploadFBase(String name, String imageUrl) {
        if (name.trim().equals("")) {
            name = "No Name";
        }

        mName = name;
        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setName(String name) {
        mName = name;
    }


    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    @Exclude
    public String getKey() {
        return mKey;
    }

    @Exclude
    public void setKey(String key) {
        mKey = key;
    }
}

