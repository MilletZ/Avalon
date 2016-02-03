import java.io.IOException;
import java.net.ServerSocket;

public class SocketServerUtil {
	public static void main(String[] args){
		ServerSocket ss = null;
		int count = 0;
		
		try{
			// 创建ServerSocket并绑定端口号。
			ss = new ServerSocket(8888);
				
			System.out.println("---------正在启动监听，等待客户端连接---------");
			while(true){
				// 开始侦听端口，并返回一个与客户端建立连接的Socket。
				new SocketThread(ss.accept()).start();
				count++;
				System.out.println("客户端数量："+count);
			}
		} catch(IOException ioe){
			ioe.printStackTrace();
		}
			
	}
}
