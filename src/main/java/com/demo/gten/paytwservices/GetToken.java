package com.demo.gten.paytwservices;

import com.demo.param.Heads;
import com.demo.param.Methods;
import com.demo.commons.WebAPISecretary;

import java.io.IOException;

/*
 * @author : eton.lin
 * @description TODO
 * @date 2024-07-23 下午 02:21
 **/

public class GetToken extends WebAPISecretary {
    GetToken() {
        super();
        super.setWsdlURL("https://ccp1.dgbas.gov.tw/GTEN/financeService/services/VoucherBAService?wsdl");
    }

    public static void main(String[] args) {
        GetToken obj = new GetToken();
        obj.setBody(getXML("113", "002002", "B1", "10017000"));
        try {
            obj.spnedRequest(Methods.POST.getMethod(), Heads.XML.getMethod());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getXML(String YYY,String deptCode,String importKind,String city){
        String soapXML = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://Webservice.mali.com.tw\">\n" +
                "   <soapenv:Header/>\n" +
                "   <soapenv:Body>\n" +
                "      <web:getTokenKey>\n" +
                "         <YYY>"+YYY+"</YYY>\n" +
                "         <deptCode>"+deptCode+"</deptCode>\n" +
                "         <importKind>"+importKind+"</importKind>\n" +
                "         <city>"+city+"</city>\n" +
                "      </web:getTokenKey>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";
        return soapXML;
    }
}
