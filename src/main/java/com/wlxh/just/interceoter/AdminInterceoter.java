package com.wlxh.just.interceoter;

import com.wlxh.just.model.JsonData;
import com.wlxh.just.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截用户等级（admin）
 * @author:baibaiwuchang
 * @Data:2019/2/11 14:13
 */
public class AdminInterceoter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        String token=request.getHeader("token");
        if (token==null)
        {
            token=request.getParameter("token");
        }
            Claims claims= JwtUtil.checkJWT(token);
            if (claims !=null) {
                Integer role = (Integer) claims.get("role");
                if(role>4) {
                    return true;
                }
            }
        SendMessage.sendJsonMessage(response, JsonData.buildError("权限不够",500));
        return false;
    }
}
