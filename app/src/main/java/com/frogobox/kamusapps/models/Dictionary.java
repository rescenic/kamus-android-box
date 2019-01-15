package com.frogobox.kamusapps.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Faisal Amir
 * ic_icon Inc License
 * =========================================
 * KamusApps
 * Copyright (C) 15/01/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Line     : bullbee117
 * Phone    : 081357108568
 * Majors   : D3 Teknik Informatika 2016
 * Campus   : Telkom University
 * -----------------------------------------
 * id.amirisback.frogobox
 */
public class Dictionary implements Parcelable {

    private String word;
    private String description;

    public Dictionary(String word, String description) {
        this.word = word;
        this.description = description;
    }

    public Dictionary() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.word);
        dest.writeString(this.description);
    }

    protected Dictionary(Parcel in) {
        this.word = in.readString();
        this.description = in.readString();
    }

    public static final Parcelable.Creator<Dictionary> CREATOR = new Parcelable.Creator<Dictionary>() {
        @Override
        public Dictionary createFromParcel(Parcel source) {
            return new Dictionary(source);
        }

        @Override
        public Dictionary[] newArray(int size) {
            return new Dictionary[size];
        }
    };
}
