package nio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author coolDY
 * @Date 2021-02-22
 * Blocking io 阻塞io
 */
public class BioServerDemo {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        System.out.println("开启服务...");

        while (true){
            System.out.println("等待连接...");
            //此处会阻塞，等待客户端连接
            Socket socket = serverSocket.accept();
            System.out.println("客户端连接成功");


            byte[] bytes = new byte[1024];
            //此处会阻塞，等待客户端发送数据
            int read = socket.getInputStream().read(bytes);

            if(read != -1){
                System.out.println("客户端接受的数据："+new String(bytes));
            }

        }
    }
}
