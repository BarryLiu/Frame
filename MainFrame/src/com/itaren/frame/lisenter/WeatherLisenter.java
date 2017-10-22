package com.itaren.frame.lisenter;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itaren.data.juhe.JuheWeather;
import com.itaren.data.juhe.weather.JsonRootBean;
import com.itaren.frame.childs.WeatherFrame;
import com.itaren.util.Constants;

import net.sf.json.JSONObject;

/**
 * 
 * @author Barry
 *
 */
public class WeatherLisenter extends Object implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		JFrame f = new JFrame("选择城市");
		f.setSize(400, 100);
		f.setLocationRelativeTo(null);
		f.setIconImage(null);
		
		JPanel contentPane=new JPanel();  
        contentPane.setBorder(new EmptyBorder(5,5,5,5));  
        f.setContentPane(contentPane);  
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));  
        JLabel label=new JLabel("证件类型:");  
        contentPane.add(label);  

        JComboBox<String> citys = new JComboBox<>(Constants.citys);
        JButton okBtn=new JButton("确定");
        StringBuffer sb = new StringBuffer();
        
        okBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				  Object item = citys.getSelectedItem();
				  sb.append(item.toString());
				  
				  toWeatherFrame();
				  f.dispose();
			}
		});
        contentPane.add(citys);  
        contentPane.add(okBtn);
        
        f.setVisible(true);
	}

	/**
	 * 请求指定天气数据如正确跳转到天气详情界面
	 */
	private void toWeatherFrame() {
		String result = null;//JuheWeather.getRequest1("上海");
		result = "{\"reason\":\"查询成功!\",\"result\":{\"data\":{\"realtime\":{\"city_code\":\"101020100\",\"city_name\":\"上海\",\"date\":\"2017-10-22\",\"time\":\"22:00:00\",\"week\":0,\"moon\":\"九月初三\",\"dataUptime\":1508681404,\"weather\":{\"temperature\":\"17\",\"humidity\":\"70\",\"info\":\"多云\",\"img\":\"1\"},\"wind\":{\"direct\":\"北风\",\"power\":\"1级\",\"offset\":null,\"windspeed\":null}},\"life\":{\"date\":\"2017-10-22\",\"info\":{\"chuanyi\":[\"较舒适\",\"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。\"],\"ganmao\":[\"少发\",\"各项气象条件适宜，无明显降温过程，发生感冒机率较低。\"],\"kongtiao\":[\"较少开启\",\"您将感到很舒适，一般不需要开启空调。\"],\"xiche\":[\"较适宜\",\"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。\"],\"yundong\":[\"较适宜\",\"天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。\"],\"ziwaixian\":[\"弱\",\"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。\"]}},\"weather\":[{\"date\":\"2017-10-22\",\"info\":{\"day\":[\"1\",\"多云\",\"22\",\"北风\",\"3-4 级\",\"06:01\"],\"night\":[\"1\",\"多云\",\"15\",\"西北风\",\"微风\",\"17:15\"]},\"week\":\"日\",\"nongli\":\"九月初三\"},{\"date\":\"2017-10-23\",\"info\":{\"dawn\":[\"1\",\"多云\",\"15\",\"西北风\",\"微风\",\"17:15\"],\"day\":[\"1\",\"多云\",\"20\",\"西北风\",\"微风\",\"06:02\"],\"night\":[\"1\",\"多云\",\"14\",\"\",\"微风\",\"17:14\"]},\"week\":\"一\",\"nongli\":\"九月初四\"},{\"date\":\"2017-10-24\",\"info\":{\"dawn\":[\"1\",\"多云\",\"14\",\"无持续风向\",\"微风\",\"17:14\"],\"day\":[\"1\",\"多云\",\"20\",\"\",\"微风\",\"06:03\"],\"night\":[\"1\",\"多云\",\"14\",\"东北风\",\"微风\",\"17:13\"]},\"week\":\"二\",\"nongli\":\"九月初五\"},{\"date\":\"2017-10-25\",\"info\":{\"dawn\":[\"1\",\"多云\",\"14\",\"东北风\",\"微风\",\"17:13\"],\"day\":[\"1\",\"多云\",\"21\",\"东北风\",\"微风\",\"06:04\"],\"night\":[\"0\",\"晴\",\"15\",\"东北风\",\"微风\",\"17:12\"]},\"week\":\"三\",\"nongli\":\"九月初六\"},{\"date\":\"2017-10-26\",\"info\":{\"dawn\":[\"0\",\"晴\",\"15\",\"东北风\",\"微风\",\"17:12\"],\"day\":[\"0\",\"晴\",\"21\",\"东北风\",\"微风\",\"06:04\"],\"night\":[\"0\",\"晴\",\"13\",\"北风\",\"微风\",\"17:11\"]},\"week\":\"四\",\"nongli\":\"九月初七\"},{\"date\":\"2017-10-27\",\"info\":{\"night\":[\"0\",\"晴\",\"14\",\"东北风\",\"微风\",\"19:30\"],\"day\":[\"0\",\"晴\",\"21\",\"东北风\",\"微风\",\"07:30\"]},\"week\":\"五\",\"nongli\":\"九月初八\"},{\"date\":\"2017-10-28\",\"info\":{\"night\":[\"0\",\"晴\",\"16\",\"东北风\",\"微风\",\"19:30\"],\"day\":[\"0\",\"晴\",\"22\",\"东北风\",\"微风\",\"07:30\"]},\"week\":\"六\",\"nongli\":\"九月初九\"}],\"f3h\":{\"temperature\":[{\"jg\":\"20171022200000\",\"jb\":\"17\"},{\"jg\":\"20171022230000\",\"jb\":\"16\"},{\"jg\":\"20171023020000\",\"jb\":\"16\"},{\"jg\":\"20171023050000\",\"jb\":\"15\"},{\"jg\":\"20171023080000\",\"jb\":\"16\"},{\"jg\":\"20171023110000\",\"jb\":\"19\"},{\"jg\":\"20171023140000\",\"jb\":\"19\"},{\"jg\":\"20171023170000\",\"jb\":\"18\"},{\"jg\":\"20171023200000\",\"jb\":\"17\"}],\"precipitation\":[{\"jg\":\"20171022200000\",\"jf\":\"0\"},{\"jg\":\"20171022230000\",\"jf\":\"0\"},{\"jg\":\"20171023020000\",\"jf\":\"0\"},{\"jg\":\"20171023050000\",\"jf\":\"0\"},{\"jg\":\"20171023080000\",\"jf\":\"0\"},{\"jg\":\"20171023110000\",\"jf\":\"0\"},{\"jg\":\"20171023140000\",\"jf\":\"0\"},{\"jg\":\"20171023170000\",\"jf\":\"0\"},{\"jg\":\"20171023200000\",\"jf\":\"0\"}]},\"pm25\":{\"key\":\"Shanghai\",\"show_desc\":0,\"pm25\":{\"curPm\":\"89\",\"pm25\":\"65\",\"pm10\":\"81\",\"level\":2,\"quality\":\"良\",\"des\":\"可以正常在户外活动，易敏感人群应减少外出\"},\"dateTime\":\"2017年10月22日21时\",\"cityName\":\"上海\"},\"jingqu\":\"\",\"jingqutq\":\"\",\"date\":\"\",\"isForeign\":\"0\",\"partner\":{\"title_word\":\"中国\",\"show_url\":\"www.weather.com.cn\",\"base_url\":\"http:\\/\\/j.www.haosou.com\\/?u=http%3A%2F%2Fwww.weather.com.cn%2Fweather%2F101020100.shtml&m=3e3513&from=juhe&type=weather\"}}},\"error_code\":0}";
		JSONObject object = JSONObject.fromObject(result);
		JsonRootBean jrb = (JsonRootBean) JSONObject.toBean(object, JsonRootBean.class);
		if (jrb.getError_code() == 0) {

			System.out.println(jrb);
			WeatherFrame wf = new WeatherFrame(jrb);
			wf.setVisible(true);
			// dispose();
			// JOptionPane.showMessageDialog(null, object.toString(), "success",
			// JOptionPane.INFORMATION_MESSAGE);
		} else {
			String error = jrb.getError_code() + ":" + jrb.getReason();
			System.err.println(error);
			JOptionPane.showMessageDialog(null, error, "error", JOptionPane.ERROR_MESSAGE);
		}		
	}

}
