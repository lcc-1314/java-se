package com.liuc.io;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        writefile();
        readerFile();
    }
    public static void writefile(){
        File file = new File("C:\\Users\\Administrator\\Desktop\\hello.txt");
        //String str = "您好，欢迎来学java";
        String str = "\r\n每天实战500行java代码，一个月就牛逼了";
        try {
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readerFile(){
        File file = new File("C:\\Users\\Administrator\\Desktop\\hello.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str = null;
            //str = br.readLine();  error
            while((str = br.readLine())!= null){
                System.out.println(str);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
