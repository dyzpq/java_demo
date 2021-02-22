package nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author coolDY
 * @Date 2021-02-22
 * 非阻塞io改进版本
 *      selector：多路复用器（监听是否有客户端连接，或客户端发送消息）
 *      优点： 1.不会存在空转情况
 *             2.可以只用遍历客户端有数据的集合
 */
public class NioSelectorServerDemo {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(9000));
        //开启非阻塞
        serverSocketChannel.configureBlocking(false);
        //设置多路复用器
        Selector selector = Selector.open();
        //将serverSocketChannel注册到selector中
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("服务开启...");

        while (true){
            //阻塞，监听是否有事件发生
            selector.select();

            //如果监听到事件，则获取获取事件
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();

            while (iterator.hasNext()){
                SelectionKey key = iterator.next();

                //如果是客户端连接事件
                if(key.isAcceptable()){
                    ServerSocketChannel server = (ServerSocketChannel)key.channel();
                    SocketChannel socketChannel = server.accept();
                    socketChannel.configureBlocking(false);
                    //注册socketChannel到selector中
                    socketChannel.register(selector,SelectionKey.OP_READ);
                    System.out.println("客户端连接成功...");

                //如果是读取事件
                }else if(key.isReadable()){
                    SocketChannel socketChannel = (SocketChannel)key.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(128);
                    int len = socketChannel.read(byteBuffer);
                    if(len > 0){
                        System.out.println("客户端发送消息："+new String(byteBuffer.array()));
                    }else if(len == -1){
                        System.out.println("客户端断开连接...");
                        socketChannel.close();
                    }
                }
                //删除该次事件，防止重复发送
                iterator.remove();
            }
        }
    }
}
