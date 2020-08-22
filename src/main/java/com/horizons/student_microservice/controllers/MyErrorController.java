package com.horizons.student_microservice.controllers;

import org.json.JSONObject;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class MyErrorController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public JSONObject handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        JSONObject result = new JSONObject();
        if (status != null) {
            result.put("code",status.toString());
            result.put("message",request.getAttribute(RequestDispatcher.ERROR_MESSAGE));
        }
        return result.put("message","Unknown Error");
    }
}
