package com.demo.gten.voucherbaservices;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import com.demo.param.Heads;
import com.demo.param.Methods;
import com.demo.commons.WebAPISecretary;

public class GetToken extends WebAPISecretary {
    GetToken() {
        super();
        super.setWsdlURL("http://127.0.0.1:8080/GTEN/financeService/services/VoucherBAService?wsdl");
    }

    public static void main(String[] args) {
        GetToken obj = new GetToken();
        obj.setBody(getXML("112", "002001", "B2", "10010000"));
        try {
            obj.spnedRequest(Methods.POST.getMethod(), Heads.XML.getMethod());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (KeyStoreException e) {
            throw new RuntimeException(e);
        } catch (KeyManagementException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getXML(String YYY, String deptCode, String importKind, String city) {

        String soapXML = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://Webservice.mali.com.tw\">\r\n"
                + "   <soapenv:Header/>\r\n"
                + "   <soapenv:Body>\r\n"
                + "      <web:getTokenKey>\r\n"
                + "         <!--Optional:-->\r\n"
                + "         <YYY>"
                + YYY
                + "</YYY>\r\n"
                + "         <!--Optional:-->\r\n"
                + "         <deptCode>"
                + deptCode
                + "</deptCode>\r\n"
                + "         <!--Optional:-->\r\n"
                + "         <importKind>"
                + importKind
                + "</importKind>\r\n"
                + "         <!--Optional:-->\r\n"
                + "         <city>"
                + city
                + "</city>\r\n"
                + "      </web:getTokenKey>\r\n"
                + "   </soapenv:Body>\r\n"
                + "</soapenv:Envelope>";
        return soapXML;
    }
}
