/**
  * Copyright 2017 bejson.com 
  */
package com.itaren.data.juhe.weather;
import java.util.Date;

/**
 * Auto-generated: 2017-10-22 21:35:33
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Realtime {

    private String city_code;
    private String city_name;
    private Date date;
    private String time;
    private int week;
    private String moon;
    private int dataUptime;
    private Weather weather;
    private Wind wind;
    public void setCity_code(String city_code) {
         this.city_code = city_code;
     }
     public String getCity_code() {
         return city_code;
     }

    public void setCity_name(String city_name) {
         this.city_name = city_name;
     }
     public String getCity_name() {
         return city_name;
     }

    public void setDate(Date date) {
         this.date = date;
     }
     public Date getDate() {
         return date;
     }

    public void setTime(String time) {
         this.time = time;
     }
     public String getTime() {
         return time;
     }

    public void setWeek(int week) {
         this.week = week;
     }
     public int getWeek() {
         return week;
     }

    public void setMoon(String moon) {
         this.moon = moon;
     }
     public String getMoon() {
         return moon;
     }

    public void setDataUptime(int dataUptime) {
         this.dataUptime = dataUptime;
     }
     public int getDataUptime() {
         return dataUptime;
     }

    public void setWeather(Weather weather) {
         this.weather = weather;
     }
     public Weather getWeather() {
         return weather;
     }

    public void setWind(Wind wind) {
         this.wind = wind;
     }
     public Wind getWind() {
         return wind;
     }

}