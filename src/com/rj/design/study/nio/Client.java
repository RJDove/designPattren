package com.rj.design.study.nio;


import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * @version 1.0.0
 * @desc
 * @auth eg2
 * @date 2019/1/8
 * @modifyBy
 */
public class Client {

    public static void main(String[] args) throws Exception{
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1",8090));
        //开启非阻塞
        socketChannel.configureBlocking(false);
       /* ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (;;) {
            byteBuffer.flip();
            byteBuffer.put(bufferedReader.readLine().getBytes());
            socketChannel.write(byteBuffer);
            byteBuffer.clear();
        }*/

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            socketChannel.write(Charset.forName("UTF-8").encode(str));
        }

        /*int len = -1;
        while ((len = socketChannel.read(byteBuffer)) != -1) {
            byteBuffer.flip();
            System.out.println(new String (byteBuffer.array(), 0, len));
            byteBuffer.clear();
        }
        socketChannel.close();*/
        //System.out.println("客户端。。。");
    }
}
