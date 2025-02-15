package org.example.utils;

import java.util.HashMap;

public class MiddleManUtils {
    public static HashMap<String, String> middleManUrl = new HashMap<>();
    public static HashMap<String, HashMap<String, String>> middleManHeaders = new HashMap<>();

    // this constructor should be initialized when the application starts
    MiddleManUtils(){
        setMiddleManHeaders();
        setMiddleManUrl();
    }
    public void setMiddleManUrl(){
        middleManUrl.put("Amazon", "https://amazon.example.com");
        middleManUrl.put("FlipKart", "https://flipkart.example.com");
    }
    public void setMiddleManHeaders(){
        // for Flipkart
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("format", "file/json");
        map1.put("connection", "keep-alive");
        map1.put("Accept", "gzip, deflate, br");
        middleManHeaders.put("Flipkart", map1);

        // for Amazon
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("format", "file/json");
        map2.put("connection", "keep-alive");
        map2.put("Accept", "gzip, deflate, br");
        middleManHeaders.put("Amazon", map2);
    }
}
