package com.example.jiaohongyang.miniapp;

import java.io.Serializable;
/**
 * Created by jiaohongyang on 2/15/16.
 */
public class ZhihuGalleryItem implements Serializable {
    private String url;

    public ZhihuGalleryItem(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
