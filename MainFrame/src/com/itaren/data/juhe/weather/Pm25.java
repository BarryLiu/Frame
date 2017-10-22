/**
  * Copyright 2017 bejson.com 
  */
package com.itaren.data.juhe.weather;

/**
 * Auto-generated: 2017-10-22 21:35:33
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Pm25 {

    private String key;
    private int show_desc;
    private Pm25 pm25;
    private String dateTime;
    private String cityName;
    public void setKey(String key) {
         this.key = key;
     }
     public String getKey() {
         return key;
     }

    public void setShow_desc(int show_desc) {
         this.show_desc = show_desc;
     }
     public int getShow_desc() {
         return show_desc;
     }

    public void setPm25(Pm25 pm25) {
         this.pm25 = pm25;
     }
     public Pm25 getPm25() {
         return pm25;
     }

    public void setDateTime(String dateTime) {
         this.dateTime = dateTime;
     }
     public String getDateTime() {
         return dateTime;
     }

    public void setCityName(String cityName) {
         this.cityName = cityName;
     }
     public String getCityName() {
         return cityName;
     }

}