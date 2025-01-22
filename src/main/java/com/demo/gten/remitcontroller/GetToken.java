package com.demo.gten.remitcontroller;

import com.demo.param.Heads;
import com.demo.param.Methods;
import com.demo.commons.WebAPISecretary;
import org.json.JSONObject;
import org.json.XML;
import java.util.Optional;

/*
    @author : Eton.lin
    @description 匯款入戶查詢-取得token值
    @date 2024-11-07 上午 11:54
*/
public class GetToken extends WebAPISecretary {
    GetToken() {
        super();
        super.setWsdlURL("http://127.0.0.1:8080/GTEN/web/remit/queryToken");
    }

    public JSONObject getToken() {
        GetToken obj = new GetToken();
        try {
            Optional<String> jsonObj = Optional.ofNullable(obj.spnedRequest(Methods.GET.getMethod(), Heads.JSON.getMethod()));
            if (jsonObj.isPresent()) {
                return XML.toJSONObject(jsonObj.get());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
