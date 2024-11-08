package com.demo.gten.remitcontroller;

import com.demo.param.Heads;
import com.demo.param.Methods;
import com.demo.commons.WebAPISecretary;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Optional;

/*
    @author : Eton.lin
    @description TODO
    @date 2024-11-07 上午 11:54
*/
public class GetToken extends WebAPISecretary {
    GetToken() {
        super();
        super.setWsdlURL("http://127.0.0.1:8080/GTEN/web/remit/queryToken");
    }

    public JSONObject getToken() throws IOException {
        GetToken obj = new GetToken();
        try {
            Optional<String> jsonObj = Optional.ofNullable(obj.spnedRequest(Methods.GET.getMethod(), Heads.JSON.getMethod()));
            if (jsonObj.isPresent()) {
                return new JSONObject(jsonObj.get());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
