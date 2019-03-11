package com.wlxh.just.utils;


import com.wlxh.just.model.Admin;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * @author:baibaiwuchang
 * @Data:2019/2/9 0:17
 * jwt工具类
 */
public class JwtUtil {
    public static final String SUBJECT="xdclass";
    public static final long EXPICE=1000*60*60*24;  //过期时间60分钟  后改为一天
    public static final String APPSECRET="baibaiwucahng";  //秘钥

    /**
     * 生成token
     * @param user
     * @return
     */

    public static  String geneJsonWebToken(Admin user)
    {
        if (user.getId()== null)
            return null;
        String token=Jwts.builder().setSubject(SUBJECT)
                .claim("id",user.getId())
                .claim("role",user.getRole())
                .claim("typeId",user.getTypeId())
                .claim("username",user.getUsername())
                .claim("name",user.getName())
                .claim("mobile",user.getMobile())
                .claim("company",user.getCompany())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+EXPICE))
                .signWith(SignatureAlgorithm.HS256,APPSECRET).compact();
        return token;
    }

    /**
     *
     * @param token
     * @return
     */
    public static Claims checkJWT(String token)
    {
        try{
            final Claims claims= Jwts.parser().setSigningKey(APPSECRET)
                    .parseClaimsJws(token).getBody();
            return claims;
        }catch (Exception e)
        {
            System.out.println("非法token！！");
        }

        return null;
    }
}


