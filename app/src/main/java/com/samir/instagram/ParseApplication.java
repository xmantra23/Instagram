package com.samir.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YGXptXzNrEOCKcuFAWxM3D1lbXETtJR26hBQi4Jd")
                .clientKey("4Fco5Hf0d8yCCjR6H1Lug0tebmT80SuqibgKnvL9")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
