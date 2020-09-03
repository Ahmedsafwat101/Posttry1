package com.example.login;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("J5UpLdpjyLxQdRDHxHtZXu8RX4pKnAwVOSodDMyy")
                .clientKey("R71ePoykLNsDuRMjO9Iid5IMoDFjrtIPCpuXKR0E")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
