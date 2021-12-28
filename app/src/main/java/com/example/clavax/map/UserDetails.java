package com.example.clavax.map;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;


public class UserDetails {
    private SharedPreferences mSharedPreferences;
    public static final String userinfo = "userinfo";
    public static final String id = "id";
    public static final String isActive = "isActive";
    public static final String name = "name";
    public static final String mobile = "mobile";
    public static final String email = "email";
    public static final String main_address = "main_address";
    public static final String flat = "flat";
    public static final String landmark = "landmark";
    public static final String zip = "zip";
    public static final String lats = "lats";
    public static final String ad_ids = "ad_ids";
    public static final String latitude = "latitude";
    public static final String longitude = "longitude";
    public static final String intro = "intro";
    public static final String cues = "cues";
    public static final String city = "city";
    public static final String saved_address = "saved_address";
    public static final String coupon = "coupon";
    public static final String updatekey = "updatekey";
    public static final String regid = "regid";
    public static final String cart_count = "cart_count";
    private Context mContext;

    public UserDetails(Context mContext) {
        this.mContext = mContext;
    }

    public void setId(String Id) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(id, Id);
        editor.apply();
    }

    public String getId() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(id, "0");
    }

    public void setIsActive(String isActives) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(isActive, isActives);
        editor.apply();
    }

    public String getIsActive() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(isActive, "0");
    }

    public void setName(String names) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(name, names);
        editor.apply();
    }

    public String getName() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(name, "0");
    }

    public void setMobile(String mobiles) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(mobile, mobiles);
        editor.apply();
    }

    public String getMobile() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(mobile, "0");
    }

    public void setEmail(String emails) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(email, emails);
        editor.apply();
    }

    public String getEmail() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(email, "0");
    }

    public void setMainAddress(String m_add) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(main_address, m_add);
        editor.apply();
    }

    public String getMainAddress() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(main_address, "0");
    }

    public void setFlat(String flats) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(flat, flats);
        editor.apply();
    }

    public String getFlat() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(flat, "0");
    }

    public void setLandMark(String lands) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(landmark, lands);
        editor.apply();
    }

    public String getLandMark() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(landmark, "0");
    }

    public void setZipCode(String zips) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(zip, zips);
        editor.apply();
    }

    public String getZipCode() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(zip, "0");
    }

    public void setLatLong(String latLong) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(lats, latLong);
        editor.apply();
    }

    public String getLatLong() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(lats, "0");
    }

    public void setAddressId(String ad_id) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(ad_ids, ad_id);
        editor.apply();
    }

    public String getAddressId() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(ad_ids, "0");
    }

    public void setLatitude(String lat) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(latitude, lat);
        editor.apply();
    }

    public String getLatitude() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(latitude, "0");
    }

    public void setLongitude(String longs) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(longitude, longs);
        editor.apply();
    }

    public String getLongitude() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(longitude, "0");
    }

    public void setIntro(String intr) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(intro, intr);
        editor.apply();
    }

    public String getIntro() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(intro, "0");
    }

    public void setCues(String cue) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(cues, cue);
        editor.apply();
    }

    public String getCues() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(cues, "0");
    }

    public void setCity(String cit) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(city, cit);
        editor.apply();
    }

    public String getCity() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(city, "0");
    }

    public void setSaveAddress(String s_add) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(saved_address, s_add);
        editor.apply();
    }

    public String getSavedAddress() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(saved_address, "0");
    }

    public void setCoupon(String coup) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(coupon, coup);
        editor.apply();
    }

    public String getCoupon() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(coupon, "0");
    }

    public void setUpdateKey(String upk) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(updatekey, upk);
        editor.apply();
    }

    public String getUpdateKey() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(updatekey, "0");
    }

    public void setRegId(String regId) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(regid, regId);
        editor.apply();
    }

    public String getRegId() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(regid, "0");
    }

    public void setCartCount(String ct_ct) {
        mSharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(cart_count, ct_ct);
        editor.apply();
    }

    public String getCartCount() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(userinfo, MODE_PRIVATE);
        return sharedPreferences.getString(cart_count, "0");
    }
}
