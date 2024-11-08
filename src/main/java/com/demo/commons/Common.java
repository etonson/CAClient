package com.demo.commons;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Common {
    public static List<String> readMavenCsv(String csvPath) {
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(csvPath));//檔案讀取路徑
            BufferedReader reader = new BufferedReader(isr);
            List<String> result = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String item[] = line.split(",");
                result.add(item[0].trim());
            }
            return result;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void writeCSV(List<String[]> list) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D://file_output.csv"));//檔案輸出路徑
            for (String[] item : list) {
                bw.write(item[0] + "," + item[1] + "," + item[2]+"\n");
            }
            bw.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
