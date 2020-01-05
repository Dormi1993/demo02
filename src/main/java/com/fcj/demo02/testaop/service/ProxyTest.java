package com.fcj.demo02.testaop.service;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by dormi on 2020/1/4.
 */
public class ProxyTest {
    public static void main(String[] args) throws Exception {
        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(
                "$Proxyfcj", new Class[]{UserService.class});
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/dormi/research/Java/Proxyha.class");
        fileOutputStream.write(proxyClassFile);
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
