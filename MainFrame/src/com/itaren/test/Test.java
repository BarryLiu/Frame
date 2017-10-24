package com.itaren.test;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.annotation.Resources;

import com.itaren.util.Resource;


public class Test {
	public static void main(String[] args) throws IOException   {
		
		System.out.println("Test .... "+Resource.NIRCMD_PATH);
		
//		Desktop.getDesktop().open(new File("C:\\Users\\Barry\\Desktop\\abc.txt"));
//		String executeCmd = executeCmd(" git status");
//		System.out.println(executeCmd);
		
		executeNircmd();
	}
	private static void executeNircmd() {
		Process process;
		try {
			//process = Runtime.getRuntime().exec("G:/softs/nircmd/nircmd.exe /c elevate   net start Itaren_8001");//����ϵͳ����
			process = Runtime.getRuntime().exec(Resource.NIRCMD_PATH+" /c elevate   git status ");	//���ط���ǽ
			
			BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));  
		    String line = null;  
		    StringBuilder build = new StringBuilder();  
		    while ((line = br.readLine()) != null) {  
		        build.append(line);  
		    }  
		    System.out.println( build.toString()); 
		    System.out.println("ִ�����");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// ��һ�ַ�ʽ������cmd��ʽ  
	/** 
	 * ִ��cmd���� 
	 *  
	 * @param command 
	 * @throws IOException 
	 */  
	public static String executeCmd(String command) throws IOException {  
	    Runtime runtime = Runtime.getRuntime();  
	    Process process = runtime.exec("cmd /c " + command);  
	    BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));  
	    String line = null;  
	    StringBuilder build = new StringBuilder();  
	    while ((line = br.readLine()) != null) {  
	        build.append(line);  
	    }  
	    return build.toString();  
	}
	  
	
}
