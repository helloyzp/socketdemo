package com.example.simpleudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 简单的UDP通信的服务端
 */
public class UdpService {

    public static void main(String... args) throws IOException {

        // 创建DatagramSocket，监听指定的端口
        DatagramSocket datagramSocket = new DatagramSocket(12307);

        byte[] bytes = new byte[1024];
        //UDP与TCP的Socket接收数据略有区别，需要创建一个DatagramPacket消息数据报对象，用于接收消息
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        //receive()方法进行阻塞等待读取消息
        datagramSocket.receive(datagramPacket);

        System.out.println("接收到的数据： " + new String(datagramPacket.getData()));


    }


}
