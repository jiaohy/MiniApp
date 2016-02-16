package com.example.jiaohongyang.miniapp;

/**
 * Created by jiaohongyang on 2/15/16.
 */
public class UrlManager {
    private static final String TAG = UrlManager.class.getSimpleName();

    public static final String API_KEY = "178069b03af62f5735258c0a10a14d6e";
    public static final String PREF_SEARCH_QUERY ="searchQuery";

    private static final String ENDPOINT = "http://kantu.superlin.cc/api/zhihu_spider";
    private static final String METHOD_GETRECENT = "flickr.photos.getRecent";
    private static final String METHOD_SEARCH = "flickr.photos.search";

    private static volatile UrlManager instance = null;
    private static final String DEFAULT_URL = "https://www.zhihu.com/question/36979922";
    private static final String PARAM = "?url=";

    private UrlManager() {

    }

    public static UrlManager getInstance() {
        if (instance == null) {
            synchronized (UrlManager.class) {
                if (instance == null) {
                    instance = new UrlManager();
                }
            }
        }
        return instance;
    }

    public static String getItemUrl(String query, int page) {
        String url;
        if (query != null) {
            url = ENDPOINT + PARAM + query;
        } else {
            url = ENDPOINT + PARAM + DEFAULT_URL;
        }
        return url;
    }
}
