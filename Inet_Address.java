import java.net.*;
import java.io.*;

public class Inet_Address {
	public static void main(String[]args) {
		try {
			InetAddress ip = InetAddress.getByName("www.github.com");
			
			System.out.println("Host Name: "+ip.getHostName());
			System.out.println("IP Address: "+ ip.getHostAddress());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
