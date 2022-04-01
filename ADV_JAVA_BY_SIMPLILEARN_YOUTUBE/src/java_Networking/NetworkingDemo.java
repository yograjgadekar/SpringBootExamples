package java_Networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {

	public static void main(String[] args) throws UnknownHostException {
		String url = "www.simplilearn.com";
			
		InetAddress inetAddress = Inet4Address.getByName(url);
		
		System.out.println("Address : "+ Arrays.toString(inetAddress.getAddress()));
		
		//getHostAddress() method
		System.out.println("Host Address : " + inetAddress.getHostAddress());
		
		//isAnyLocalAddress() method
		System.out.println("is AnyLocalAddress : " + inetAddress.isAnyLocalAddress());
		
		//isLinkLocalAddress() method
		System.out.println("is LinkLocalAddress : " + inetAddress.isLinkLocalAddress());
		
		//isLoopbackAddress() method
		System.out.println("is LoopBackAddress : " + inetAddress.isLoopbackAddress());
		
		//isSiteLocalAddress() method
		System.out.println("is SiteLocalAddress : " + inetAddress.isSiteLocalAddress());
		
		//hashCode() method
		System.out.println("hashCode : " + inetAddress.hashCode());
		
		
		
	}

}
