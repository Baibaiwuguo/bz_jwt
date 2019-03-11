package com.wlxh.just.interceoter;

import com.wlxh.just.model.JsonData;
import com.wlxh.just.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 * 拦截是否登录
 * @author:baibaiwuchang
 * @Data:2019/2/11 13:04
 */
public class LoginInterceoter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        String url=request.getRequestURI();
        String token=request.getHeader("token");
        if (token==null)
        {
            token=request.getParameter("token");
        }
        if (token!=null)
        {
            Claims claims= JwtUtil.checkJWT(token);
            if (claims !=null) {
                Integer id = (Integer) claims.get("id");
                String username=(String) claims.get("username");


                request.setAttribute("user_id", id);
                System.out.println("---用户操作----");
                System.out.println("用户"+username+" ---  "+"操作接口"+url);
                return true;
            }
        }

        SendMessage.sendJsonMessage(response, JsonData.buildError("请登录",405));
        return false;
    }

}
