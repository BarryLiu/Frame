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
public class Weather {

    private Date date;
    private Info info;
    private String week;
    private String nongli;
    public void setDate(Date date) {
         this.date = date;
     }
     public Date getDate() {
         return date;
     }

    public void setInfo(Info info) {
         this.info = info;
     }
     public Info getInfo() {
         return info;
     }

    public void setWeek(String week) {
         this.week = week;
     }
     public String getWeek() {
         return week;
     }

    public void setNongli(String nongli) {
         this.nongli = nongli;
     }
     public String getNongli() {
         return nongli;
     }

}