package com.itaren.data.juhe;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import com.itaren.data.juhe.weather.JsonRootBean;
import com.itaren.util.ConfigUtil;
import com.itaren.util.Constants;

import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;
  
/**
*天气预报调用示例代码 － 聚合数据
*在线接口文档：
*https://www.juhe.cn/docs/api/id/73
**/
  
public class JuheWeather {
    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent =  "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
  
    //配置您申请的KEY
    public static final String APPKEY =ConfigUtil.getProperty(Constants.JUHE_WEATHER_KEY);
  
    //1.根据城市查询天气
    public static void getRequest1(){
        String result =null;
        String url ="http://op.juhe.cn/onebox/weather/query";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("cityname","温州");//要查询的城市，如：温州、上海、北京
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","");//返回数据的格式,xml或json，默认json
  
        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
                System.out.println(object.get("result"));
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getRequest1(String city){
        String result =null;
        String url ="http://op.juhe.cn/onebox/weather/query";//请求接口地址
        Map params = new HashMap();//请求参数
        params.put("cityname",city);//要查询的城市，如：温州、上海、北京
        params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
        params.put("dtype","");//返回数据的格式,xml或json，默认json
  
        try {
            result =net(url, params, "GET");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
    }
     
  
    public static void main(String[] args) {
    	String result = null;// getRequest1("上海");
    	result="{\"reason\":\"查询成功!\",\"result\":{\"data\":{\"realtime\":{\"city_code\":\"101020100\",\"city_name\":\"上海\",\"date\":\"2017-10-22\",\"time\":\"22:00:00\",\"week\":0,\"moon\":\"九月初三\",\"dataUptime\":1508681404,\"weather\":{\"temperature\":\"17\",\"humidity\":\"70\",\"info\":\"多云\",\"img\":\"1\"},\"wind\":{\"direct\":\"北风\",\"power\":\"1级\",\"offset\":null,\"windspeed\":null}},\"life\":{\"date\":\"2017-10-22\",\"info\":{\"chuanyi\":[\"较舒适\",\"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。\"],\"ganmao\":[\"少发\",\"各项气象条件适宜，无明显降温过程，发生感冒机率较低。\"],\"kongtiao\":[\"较少开启\",\"您将感到很舒适，一般不需要开启空调。\"],\"xiche\":[\"较适宜\",\"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。\"],\"yundong\":[\"较适宜\",\"天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。\"],\"ziwaixian\":[\"弱\",\"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。\"]}},\"weather\":[{\"date\":\"2017-10-22\",\"info\":{\"day\":[\"1\",\"多云\",\"22\",\"北风\",\"3-4 级\",\"06:01\"],\"night\":[\"1\",\"多云\",\"15\",\"西北风\",\"微风\",\"17:15\"]},\"week\":\"日\",\"nongli\":\"九月初三\"},{\"date\":\"2017-10-23\",\"info\":{\"dawn\":[\"1\",\"多云\",\"15\",\"西北风\",\"微风\",\"17:15\"],\"day\":[\"1\",\"多云\",\"20\",\"西北风\",\"微风\",\"06:02\"],\"night\":[\"1\",\"多云\",\"14\",\"\",\"微风\",\"17:14\"]},\"week\":\"一\",\"nongli\":\"九月初四\"},{\"date\":\"2017-10-24\",\"info\":{\"dawn\":[\"1\",\"多云\",\"14\",\"无持续风向\",\"微风\",\"17:14\"],\"day\":[\"1\",\"多云\",\"20\",\"\",\"微风\",\"06:03\"],\"night\":[\"1\",\"多云\",\"14\",\"东北风\",\"微风\",\"17:13\"]},\"week\":\"二\",\"nongli\":\"九月初五\"},{\"date\":\"2017-10-25\",\"info\":{\"dawn\":[\"1\",\"多云\",\"14\",\"东北风\",\"微风\",\"17:13\"],\"day\":[\"1\",\"多云\",\"21\",\"东北风\",\"微风\",\"06:04\"],\"night\":[\"0\",\"晴\",\"15\",\"东北风\",\"微风\",\"17:12\"]},\"week\":\"三\",\"nongli\":\"九月初六\"},{\"date\":\"2017-10-26\",\"info\":{\"dawn\":[\"0\",\"晴\",\"15\",\"东北风\",\"微风\",\"17:12\"],\"day\":[\"0\",\"晴\",\"21\",\"东北风\",\"微风\",\"06:04\"],\"night\":[\"0\",\"晴\",\"13\",\"北风\",\"微风\",\"17:11\"]},\"week\":\"四\",\"nongli\":\"九月初七\"},{\"date\":\"2017-10-27\",\"info\":{\"night\":[\"0\",\"晴\",\"14\",\"东北风\",\"微风\",\"19:30\"],\"day\":[\"0\",\"晴\",\"21\",\"东北风\",\"微风\",\"07:30\"]},\"week\":\"五\",\"nongli\":\"九月初八\"},{\"date\":\"2017-10-28\",\"info\":{\"night\":[\"0\",\"晴\",\"16\",\"东北风\",\"微风\",\"19:30\"],\"day\":[\"0\",\"晴\",\"22\",\"东北风\",\"微风\",\"07:30\"]},\"week\":\"六\",\"nongli\":\"九月初九\"}],\"f3h\":{\"temperature\":[{\"jg\":\"20171022200000\",\"jb\":\"17\"},{\"jg\":\"20171022230000\",\"jb\":\"16\"},{\"jg\":\"20171023020000\",\"jb\":\"16\"},{\"jg\":\"20171023050000\",\"jb\":\"15\"},{\"jg\":\"20171023080000\",\"jb\":\"16\"},{\"jg\":\"20171023110000\",\"jb\":\"19\"},{\"jg\":\"20171023140000\",\"jb\":\"19\"},{\"jg\":\"20171023170000\",\"jb\":\"18\"},{\"jg\":\"20171023200000\",\"jb\":\"17\"}],\"precipitation\":[{\"jg\":\"20171022200000\",\"jf\":\"0\"},{\"jg\":\"20171022230000\",\"jf\":\"0\"},{\"jg\":\"20171023020000\",\"jf\":\"0\"},{\"jg\":\"20171023050000\",\"jf\":\"0\"},{\"jg\":\"20171023080000\",\"jf\":\"0\"},{\"jg\":\"20171023110000\",\"jf\":\"0\"},{\"jg\":\"20171023140000\",\"jf\":\"0\"},{\"jg\":\"20171023170000\",\"jf\":\"0\"},{\"jg\":\"20171023200000\",\"jf\":\"0\"}]},\"pm25\":{\"key\":\"Shanghai\",\"show_desc\":0,\"pm25\":{\"curPm\":\"89\",\"pm25\":\"65\",\"pm10\":\"81\",\"level\":2,\"quality\":\"良\",\"des\":\"可以正常在户外活动，易敏感人群应减少外出\"},\"dateTime\":\"2017年10月22日21时\",\"cityName\":\"上海\"},\"jingqu\":\"\",\"jingqutq\":\"\",\"date\":\"\",\"isForeign\":\"0\",\"partner\":{\"title_word\":\"中国\",\"show_url\":\"www.weather.com.cn\",\"base_url\":\"http:\\/\\/j.www.haosou.com\\/?u=http%3A%2F%2Fwww.weather.com.cn%2Fweather%2F101020100.shtml&m=3e3513&from=juhe&type=weather\"}}},\"error_code\":0}";
    	JSONObject object = JSONObject.fromObject(result);
        if(object.getInt("error_code")==0){
            System.out.println(object.get("result"));
            JSONObject fromObject = JSONObject.fromObject(object);
            JsonRootBean jrb = (JsonRootBean) JSONObject.toBean(fromObject, JsonRootBean.class);
            System.out.println(jrb);
            
   	 }else{
       	 String error = object.get("error_code")+":"+object.get("reason");
            System.err.println(error);
            JOptionPane.showMessageDialog(null, error, "error", JOptionPane.ERROR_MESSAGE);
        }
    }
  
    /**
     *
     * @param strUrl 请求地址
     * @param params 请求参数
     * @param method 请求方法
     * @return  网络请求字符串
     * @throws Exception
     */
   public static String net(String strUrl, Map params,String method) throws Exception {
            HttpURLConnection conn = null;
            BufferedReader reader = null;
            String rs = null;
            try {
                StringBuffer sb = new StringBuffer();
                if(method==null || method.equals("GET")){
                    strUrl = strUrl+"?"+urlencode(params);
                }
                URL url = new URL(strUrl);
                conn = (HttpURLConnection) url.openConnection();
                if(method==null || method.equals("GET")){
                    conn.setRequestMethod("GET");
                }else{
                    conn.setRequestMethod("POST");
                    conn.setDoOutput(true);
                }
                conn.setRequestProperty("User-agent", userAgent);
                conn.setUseCaches(false);
                conn.setConnectTimeout(DEF_CONN_TIMEOUT);
                conn.setReadTimeout(DEF_READ_TIMEOUT);
                conn.setInstanceFollowRedirects(false);
                conn.connect();
                if (params!= null && method.equals("POST")) {
                    try {
                        DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                        out.writeBytes(urlencode(params));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                InputStream is = conn.getInputStream();
                reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
                String strRead = null;
                while ((strRead = reader.readLine()) != null) {
                    sb.append(strRead);
                }
                rs = sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (reader != null) {
                    reader.close();
                }
                if (conn != null) {
                    conn.disconnect();
                }
            }
            return rs;
        }
  
    //将map型转为请求参数型
    public static String urlencode(Map<String,String> data) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry i : data.entrySet()) {
            try {
                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue()+"","UTF-8")).append("&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}