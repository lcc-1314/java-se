package com.liuc.io;



import java.io.*;

public class StreamFile {
    public static void main(String[] args) {
        //writeFile();
        readerFile();
    }
    public static void writeFile(){
        String str ="java学习就靠较坚持实战";

        try {
            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream("C:\\Users\\Administrator\\Desktop\\hello.txt",true)
            );
            byte[] data = str.getBytes();
            try {
                bos.write(data);
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readerFile(){
        try {
            InputStream bis = new BufferedInputStream(
                    new FileInputStream("C:\\Users\\Administrator\\Desktop\\hello.txt")
            );
            byte[] data = new byte[50];
            int n = -1;
            while ((n = bis.read(data,0,data.length)) != -1){
                String str = new String(data,0,n, "utf-8");
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
