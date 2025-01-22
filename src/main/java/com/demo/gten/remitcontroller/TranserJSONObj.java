package com.demo.gten.remitcontroller;

import lombok.Data;
import org.json.JSONObject;

/*
    @author : Eton.lin
    @description 建立傳遞用參數值
    @date 2024-11-10 下午 11:37
*/
@Data
public class TranserJSONObj {
    String sys_id;
    String gov_code;
    String dept_code;
    String app_key;
    String token;
    String date_kind;
    String date_start;
    String date_end;

    public TranserJSONObj(String sys_id, String gov_code, String dept_code, String app_key, String token, String date_kind, String date_start, String date_end) {
        this.sys_id = sys_id;
        this.gov_code = gov_code;
        this.dept_code = dept_code;
        this.app_key = app_key;
        this.token = token;
        this.date_kind = date_kind;
        this.date_start = date_start;
        this.date_end = date_end;
    }

    public JSONObject createRemitObject() {
        JSONObject obj = new JSONObject();
        obj.put("sys_id", sys_id);
        obj.put("gov_code", gov_code);
        obj.put("dept_code", dept_code);
        obj.put("app_key", app_key);
        obj.put("token", token);
        obj.put("date_kind", date_kind);
        obj.put("date_start", date_start);
        obj.put("date_end", date_end);
        return obj;
    }

    public String createRemitString() {
        JSONObject obj = createRemitObject();
        return obj.toString();
    }
}
