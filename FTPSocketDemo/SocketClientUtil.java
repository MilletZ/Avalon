import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClientUtil {
	public static void main(String[] args){
		String info;
		Socket s = null;
		OutputStream out = null;
		OutputStreamWriter osw = null;
		
		
		try {
			// 根据主机名或ip创建Socket。
			s = new Socket("127.0.0.1", 8888);
			// 从Socket获取向服务器端的输出流。
			out = s.getOutputStream();
			osw = new OutputStreamWriter(out);
			int i = 0;
			while(i<10){
				osw.write("我是一个极好的客户端。");
				osw.write('\r');
				osw.write('\n');
				osw.flush();
				
				System.out.println("我发言了。");
				i++;
				try {
					
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			s.shutdownOutput();
			
			// 从Socket获取服务端的输入流。
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(s!=null)
					s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
