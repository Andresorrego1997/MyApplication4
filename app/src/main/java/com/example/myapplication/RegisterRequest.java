package com.example.myapplication;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 312C on 2/04/2019.
 */

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL="http://192.168.1.51/Register.php";
    private Map<String,String> params;
    public RegisterRequest (String name, String username, int age, String password, Response.Listener<String> listener){
        super (Method.POST,REGISTER_REQUEST_URL,listener, null);
        params=new HashMap<>();
        params.put("name",name);
        params.put("username",username);
        params.put("age",age+"");
        params.put("password",password);
    }

    @Override
    public Map<String, String> getParams() {

        return params;
    }
}