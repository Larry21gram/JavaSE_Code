package io;

import java.io.*;

public class CopyImargin {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(new File("C:\\Users\\lanou\\Desktop\\JavaSE_Code\\Day15_Socket\\src\\io\\psb.jpg"));

        FileOutputStream fos = new FileOutputStream(new File("src\\io\\oo.jpg"));

        int len = 0 ;
        byte[] bytes = new byte[1024];

        while ((len = fis.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();

    }
}
