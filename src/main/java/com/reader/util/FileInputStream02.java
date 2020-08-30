package com.reader.util;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
@Component
public class FileInputStream02 {
    FileInputStream fis = null;
    File file =null;
    public void read(String path){
        file = new File(path);
        try {
            fis = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int temp = 0;
            while ((temp = fis.read(bytes))!=-1){
                System.out.println(new String(bytes,0,temp));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
