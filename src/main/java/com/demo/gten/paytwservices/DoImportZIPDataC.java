package com.demo.gten.paytwservices;

import com.demo.commons.FileTools;
import com.demo.param.Heads;
import com.demo.param.Methods;
import com.demo.commons.WebAPISecretary;

import java.io.IOException;

/**
 * @author : eton.lin
 * @description TODO
 * @date 2024-07-23 下午 02:55
 */
public class DoImportZIPDataC  extends WebAPISecretary {
    DoImportZIPDataC() {
        super();
        super.setWsdlURL("http://localhost:8080/GTEN/financeService/services/PaytWService?wsdl");
    }
    public static void main(String[] args) {
        DoImportZIPDataC obj = new DoImportZIPDataC();
        try {
            String token="25b4ec1febbb482e8c947aad14c5cafa";
            String fileStr = FileTools.getFileByte("D:\\工作\\project\\GTEN\\1130819B0017\\TP-113-10007000-01-00-006002-B2-002621130802099.zip");
            String sys = "B";
            String releaseDate="11309010";
            String reqXml = getXML(token,fileStr,sys,releaseDate);
            obj.setBody(reqXml);
            obj.spnedRequest(Methods.POST.getMethod(), Heads.XML.getMethod());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getXML(String tokenKey, String file,String sys,String releaseDate) {
        String soapXML =
                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://Webservice.mali.com.tw\">\n" +
                "   <soapenv:Header/>\n" +
                "   <soapenv:Body>\n" +
                "      <web:doImportZIPDataC>\n" +
                "         <tokenKey>"+tokenKey+"</tokenKey>\n" +
                "         <impFiles>"+file+"</impFiles>\n" +
                "         <sys>"+sys+"</sys>\n" +
                "         <releaseDate>"+releaseDate+"</releaseDate>\n" +
                "      </web:doImportZIPDataC>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";
        return soapXML;
    }


}
