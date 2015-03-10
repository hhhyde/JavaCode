package httpDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.ietf.jgss.Oid;

public class HttpGetDemo {
	String host = "http://www.webxml.com.cn";
	String path = "webservices/qqOnlineWebService.asmx/qqCheckOnline";
	String queryStr = "qqCode=8698053";
	public void nativeGet() {
		URL qqOnline = null;
		try {
			qqOnline = new URL(host + "/" + path + "?" + queryStr);
			URLConnection connection = qqOnline.openConnection();
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			connection.connect();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			String line = "";
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			in.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 使用 HttpClient 需要以下 6 个步骤：</br> 1. 创建 HttpClient 的实例</br> 2.
	 * 创建某种连接方法的实例，在这里是GetMethod。在 GetMethod 的构造函数中传入待连接的地址 </br> 3.
	 * 调用第一步中创建好的实例的 execute方法来执行第二步中创建好的 method 实例</br> 4. 读 response </br> 5.
	 * 释放连接。无论执行方法是否成功，都必须释放连接</br> 6. 对得到后的内容进行处理
	 * */

	public void HttpClientGet() {
		// 构造HttpClient的实例
		HttpClient httpClient = new HttpClient();
		// 创建GET方法的实例
		GetMethod get = new GetMethod(
				"https://www.webxml.com.cn/webservices/qqOnlineWebService.asmx/qqCheckOnline?qqCode=8698053");
		// 使用系统提供的默认的恢复策略
		get.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
				new DefaultHttpMethodRetryHandler());
		try {
			// 执行getMethod
			int statusCode = httpClient.executeMethod(get);
			if (statusCode != HttpStatus.SC_OK) {
				System.err.println("Method failed: " + get.getStatusLine());
			}
			// 读取内容
			byte[] responseBody = get.getResponseBody();
			// 处理内容
			System.out.println(new String(responseBody));
		} catch (HttpException e) {
			// 发生致命的异常，可能是协议不对或者返回的内容有问题
			System.out.println("Please check your provided http address!");
			e.printStackTrace();
		} catch (IOException e) {
			// 发生网络异常
			e.printStackTrace();
		} finally {
			// 释放连接
			get.releaseConnection();
		}
	}
	
	public static void main(String[] args) {
		HttpGetDemo httpGetDemo = new HttpGetDemo();
		httpGetDemo.HttpClientGet();
	}
}
