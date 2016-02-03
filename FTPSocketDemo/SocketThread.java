import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketThread extends Thread {
	Socket socket;
	String info;
	InputStream in = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	OutputStream out = null;
	PrintWriter pw = null;
	
	public SocketThread(Socket socket){
		this.socket = socket;
	}

	@Override
	public void run() {
		super.run();
		try{
			// 从Socket获取客户端的输入流。
			in = socket.getInputStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			System.out.println("等待读信息：");
			while((info=br.readLine())!=null){
				System.out.println(info);
			}
			
		
			//socket.shutdownInput();
			
//			if(socket.isConnected()){
//				// 从Socket获取向客户端的输出流。
//				out = socket.getOutputStream();
//				pw = new PrintWriter(out);
//				pw.write("我懂你的好！");
//				pw.flush();
//				socket.shutdownOutput();
//			}
		} catch (IOException e) {
			System.out.println("ServerSocket Wrong.");
			e.printStackTrace();
		} finally {
			try {
				if(socket!=null)
					socket.close();
			} catch (IOException e) {
				System.out.println("Close Wrong.");
				e.printStackTrace();
			}
		}
	}
	
}
