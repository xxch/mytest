package udp;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Service {

	public static void main(String[] args) throws IOException {
		//创建服务端和端口号
		DatagramSocket server =new DatagramSocket(9999);
		//准备容器
		byte[] container=new byte[1024];
		//封装成包
		DatagramPacket packet=new DatagramPacket(container,container.length);
		//接收数据
		server.receive(packet);
		//分析数据
		String data=convert(packet.getData());
		System.out.println("这里开始输出我的数据："+data);
		//关闭
		server.close();
	}
	
	public static String convert(byte[] data) throws IOException{
		DataInputStream dis=new DataInputStream(new ByteArrayInputStream(data));
		String str=dis.readUTF();
		return str;
	}

}
