package com.demo.m;

import com.demo.commons.Common;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.ArrayList;
import java.util.List;

/*
    @author : Eton.lin
    @description TODO
    @date 2024-09-13 上午 10:48
*/
public class Sbom {
    public static void main(String[] args) throws Exception {

        List<String> oriSbom = Common.readMavenCsv("D:\\sbom.csv");
        List<String[]> searchURLs = buildMavenURl(oriSbom);
        List<String[]> reSearchURLs = new ArrayList<>();
        int i = 0;
        for (String[] searchURL : searchURLs) {
            ++i;
            try {
                String[] result = new String[3];
                Document connection = Jsoup.connect(searchURL[0])
                        .userAgent("PostmanRuntime/7.41.2")
                        .cookie("cookie", "MVN_SESSION=eyJhbGciOiJIUzI1NiJ9.eyJkYXRhIjp7InVpZCI6IjRmNTViZGIwLTcxN2ItMTFlZi1hMWU1LTg5NjJkY2EwMjRkZiJ9LCJleHAiOjE3NTc3MzQ4NDMsIm5iZiI6MTcyNjE5ODg0MywiaWF0IjoxNzI2MTk4ODQzfQ.GNobwdq80UB8TNUEEqv8QzOqikMgaeXQSljGlrFDDMA; __cf_bm=hdAE1VANOIBaOvpgJbWSQzMtjs.OhyUpfv9vRif0Qlo-1726198836-1.0.1.1-kegFySG8nLZbNkaEJopW3x62YjkSMcDPQZ4_olOPxJ7xzrk5YI97hlmewmsuW36LOAeL.Fni2oE50FQNdfec9A")
                        .timeout(3000)
                        .get();
                result[0] = searchURL[1];
                result[1] = searchURL[2];
                result[2] = connection.body().getElementsByClass("b lic").get(0).text();
                reSearchURLs.add(result);

            } catch (Exception e) {
                System.out.println(i + "筆異常 url"+e.getMessage());
            }
        }
        Common.writeCSV(reSearchURLs);
    }

    static List<String[]> buildMavenURl(List<String> purUrl) {
        List<String[]> urls = new ArrayList<>();
        int i = 0;
        for (String url : purUrl) {
            ++i;
            try {
                String[] elements = new String[3];
                String[] strings = url.split("/");
                String artifactId = strings[1];
                String name = strings[2].split("@")[0];
                String version = url.split("@")[1].split("/?type")[0].replace("?", "");
                String mUrl = "https://mvnrepository.com/artifact/" + artifactId + "/" + name + "/" ;
                elements[0] = mUrl;
                elements[1] = artifactId;
                elements[2] = version;
                urls.add(elements);
            } catch (Exception e) {
                System.out.println(i + "筆異常");
            }
        }
        return urls;
    }
}
