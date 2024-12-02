package com.demo.gtdmcash.cashapiservice;

import com.demo.commons.WebAPISecretary;
import com.demo.param.Heads;
import com.demo.param.Methods;
import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.util.Optional;

/*
    @author : Eton.lin
    @description 傳票匯入相關api
    @date 2024-11-13 上午 11:54
*/
public class GetToken  extends WebAPISecretary {
    GetToken() {
        super();
        super.setWsdlURL("http://127.0.0.1:8080/GTDMCASH/web/api/cash/get-token-key");
    }
    public static void main(String[] args) {
        GetToken obj = new GetToken();
        try {
            Optional<String> jsonObj = Optional.ofNullable(obj.spnedRequest(Methods.GET.getMethod(), Heads.JSON.getMethod()));
            if (jsonObj.isPresent()) {
                JSONObject result =  XML.toJSONObject(jsonObj.get());
                System.out.println(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
