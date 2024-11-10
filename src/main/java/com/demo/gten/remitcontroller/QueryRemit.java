package com.demo.gten.remitcontroller;

import com.demo.commons.WebAPISecretary;
import com.demo.param.Heads;
import com.demo.param.Methods;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Optional;

/*
    @author : Eton.lin
    @description 匯款入戶查詢
    @date 2024-11-11 上午 01:24
*/
public class QueryRemit extends WebAPISecretary {
    String postParam;
    QueryRemit() {
        super();
        super.setWsdlURL("http://127.0.0.1:8080/GTEN/web/remit/queryRemit");
    }

    public JSONObject postQueryRemit() throws IOException {
        QueryRemit obj = new QueryRemit();
        obj.setBody(postParam);
        try {
            Optional<String> jsonObj = Optional.ofNullable(obj.spnedRequest(Methods.POST.getMethod(), Heads.JSON.getMethod()));
            if (jsonObj.isPresent()) {
                return new JSONObject(jsonObj.get());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}