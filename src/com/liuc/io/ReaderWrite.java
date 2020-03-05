package com.liuc.io;

import java.io.*;
import java.util.Scanner;

public class ReaderWrite {
    public static void main(String[] args) throws IOException {
        //java中io操作
        /**
         * 字符流：文本数据，数据先放入缓存，再操作缓存
         * 字节流 ：文本，音乐，图片，视频等数据，直接操作文件
         *
         */
        reader();
        //writer("hello world");
        //scanner();
    }
    public static void reader() throws IOException {
        char c = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按0退出：");
        do{
            try {
                c = (char)br.read();
                System.out.println(c);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        while (c!='0');



    }
    public static void writer(String str){
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write(str);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void scanner(){
        String str = null;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println("输入的字符串：" + str);
        sc.close();
    }
}