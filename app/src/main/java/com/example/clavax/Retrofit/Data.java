
package com.example.clavax.Retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("list")
    @Expose
    private java.util.List<list> list = null;
    @SerializedName("count")
    @Expose
    private Integer count;

    public java.util.List<list> getList() {
        return list;
    }

    public void setList(java.util.List<list> list) {
        this.list = list;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
