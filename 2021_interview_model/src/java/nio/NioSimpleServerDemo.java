package nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author coolDY
 * @Date 2021-02-22
 * 非阻塞io基础版
 * 缺点：1.如果没有客户端连入会一直空转
 *      2.当大量的客户端连入后，若只有部分客户端发送消息，channelList也需要遍历所有进行数据获取
 */
public class NioSimpleServerDemo {

    static ArrayList channelList = new ArrayList();

    public static void main(String[] args) throws IOException {

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(9000));
        System.out.println("开启服务...");
        //设置为非阻塞
        serverSocketChannel.configureBlocking(false);

        while (true){
            SocketChannel socketChannel = serverSocketChannel.accept();
            if(socketChannel != null){
                System.out.println("客户端连接成功...");
                //设置为非阻塞
                socketChannel.configureBlocking(false);
                channelList.add(socketChannel);
            }

            Iterator<SocketChannel> iterator = channelList.iterator();
            //遍历获取客户端发送数据
            while (iterator.hasNext()){
                SocketChannel channel = iterator.next();
                ByteBuffer byteBuffer = ByteBuffer.allocate(128);
                int len = channel.read(byteBuffer);

                if(len > 0){
                    System.out.println("客户端发送的消息为："+new String(byteBuffer.array()));
                }else if(len == -1){
                    iterator.remove();
                    System.out.println("客户端关闭");
                }
            }
        }
    }
}
