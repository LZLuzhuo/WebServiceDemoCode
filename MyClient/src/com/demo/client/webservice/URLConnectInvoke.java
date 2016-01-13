package com.demo.client.webservice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 方式二:通过URLConnect发送http请求,往WebService服务端发送xml格式的数据,模拟soap协议.
 * @author Luzhuo
 */
public class URLConnectInvoke {
	public static void main(String[] args)  throws IOException{
		URL url = new URL("http://192.168.0.107:8080/helloService");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setRequestProperty("Content-Type", "text/xml;charset=utf-8");
		connection.setRequestMethod("POST");
		
		OutputStream outputStream = connection.getOutputStream();
		String data = "<?xml version=\"1.0\" ?><S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\"><S:Body><ns2:getUserByName xmlns:ns2=\"http://server.demo.com/\"><userId>1</userId></ns2:getUserByName></S:Body></S:Envelope>";
		outputStream.write(data.getBytes());
		
		InputStream inputStream = connection.getInputStream();
		int length = 0;
		byte[] b = new byte[1024];
		StringBuffer buffer = new StringBuffer();
		while((length = inputStream.read(b)) != -1){
			buffer.append(new String(b, 0, length,"utf-8"));
		}
		System.out.println(buffer.toString());
	}
}
