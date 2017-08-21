package com.xiaohuiweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wudiTK on 2017/8/19.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }

}
