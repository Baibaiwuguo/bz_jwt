package com.wlxh.just.interceoter;

import com.google.gson.Gson;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author:baibaiwuchang
 * @Data:2019/2/11 14:14
 */
public class SendMessage implements HandlerInterceptor {
    private static final Gson gson = new Gson();
    /**
     *响应数据给前端
     * @param response
     * @param obj
     */
    public static void sendJsonMessage(HttpServletResponse response, Object obj) throws IOException
    {
        response.setContentType("application/json; charset=utf-8");
        PrintWriter writer=response.getWriter();
        writer.print(gson.toJson(obj));
        writer.close();
        response.flushBuffer();

    }
}
