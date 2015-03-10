package httpDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class HttpPostDemo {
	public void nativePost() {
		String url = "http://www.webxml.com.cn/webservices/qqOnlineWebService.asmx/qqCheckOnline";
		String param = "qqCode=8698053";
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			URL qqOnline = new URL(url);
			URLConnection connection = qqOnline.openConnection();
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 发送POST请求必须设置如下两行
			connection.setDoOutput(true);
			connection.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
					connection.getOutputStream())));
			// 发送请求参数
			out.print(param);
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void httpClientPost() {
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod("http://www.webxml.com.cn/webservices/qqOnlineWebService.asmx/qqCheckOnline");
		NameValuePair[] pairs = { new NameValuePair("qqCode", "8698053") };
		post.setRequestBody(pairs);
		try {
			int status = client.executeMethod(post);
			if (status == HttpStatus.SC_OK) {
				byte[] aa = post.getResponseBody();
				System.out.println(new String(aa));
			}
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		HttpPostDemo httpPostDemo = new HttpPostDemo();
		httpPostDemo.httpClientPost();
	}
}
