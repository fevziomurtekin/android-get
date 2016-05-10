
package com.tekin.deneme1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Example {

    @SerializedName("st_name")
    @Expose
     String stName;
    @SerializedName("st_major")
    @Expose
    String stMajor;
    @SerializedName("st_tel")
    @Expose
     String stTel;

    /**
     * 
     * @return
     *     The stName
     */
    public String getStName() {
        return stName;
    }

    /**
     * 
     * @param stName
     *     The st_name
     */
    public void setStName(String stName) {
        this.stName = stName;
    }

    /**
     * 
     * @return
     *     The stMajor
     */
    public String getStMajor() {
        return stMajor;
    }

    /**
     * 
     * @param stMajor
     *     The st_major
     */
    public void setStMajor(String stMajor) {
        this.stMajor = stMajor;
    }

    /**
     * 
     * @return
     *     The stTel
     */
    public String getStTel() {
        return stTel;
    }

    /**
     * 
     * @param stTel
     *     The st_tel
     */
    public void setStTel(String stTel) {
        this.stTel = stTel;
    }

}
