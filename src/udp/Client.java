package udp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Client {
	public static void main(String[] args) throws IOException {
		DatagramSocket client=new DatagramSocket(6666);
		String msg="这里是我定义的信息";
		byte[] data=convert(msg);
//		byte[] data=new byte[1024];
		DatagramPacket packet=new DatagramPacket(data,data.length,new InetSocketAddress("localhost",9999));
		client.send(packet);
		client.close();
	}
	
	public static byte[] convert(String msg) throws IOException{
		byte[] data=null;
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		DataOutputStream out=new DataOutputStream(bos);
		out.writeUTF(msg);
		out.flush();
		data=bos.toByteArray();
		out.close();
		return data;
	}
}
