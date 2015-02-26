package webserviceDemo;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

public class Clientdemo {
	public static void main(String[] args) throws AxisFault {
		RPCServiceClient client=new RPCServiceClient();
		client.getOptions().setTo(new EndpointReference("http://localhost:8080/axis2/services/HelloService"));
		QName method=new QName("http://ws.apache.org/axis2", "sayHello");
		Object[] arg=new Object[]{};
		@SuppressWarnings("rawtypes")
		Class[] resp=new Class[]{String.class};
		System.out.println(client.invokeBlocking(method, arg, resp)[0]);
	}

}
