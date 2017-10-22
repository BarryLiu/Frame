/**
  * Copyright 2017 bejson.com 
  */
package com.itaren.data.juhe.weather;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Auto-generated: 2017-10-22 21:35:33
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Life {

    private Date date;
    //private Info info;
    private Map<String, String> info =new HashMap<>();
    public void setDate(Date date) {
         this.date = date;
     }
     public Date getDate() {
         return date;
     }
/*
    public void setInfo(Info info) {
         this.info = info;
     }
     public Info getInfo() {
         return info;
     }
*/
     public Map<String, String> getInfo() {
		return info;
	}
     public void setInfo(Map<String, String> info) {
		this.info = info;
	}
}