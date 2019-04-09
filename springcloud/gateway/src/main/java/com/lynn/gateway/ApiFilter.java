package com.lynn.gateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/*
    filterType 为过滤类型，可选值有 pre（路由之前）、routing（路由之时）、post（路由之后）、error（发生错误时调用）。
    filterOrdery 为过滤的顺序，如果有多个过滤器，则数字越小越先执行
    shouldFilter 表示是否过滤，这里可以做逻辑判断，true 为过滤，false 不过滤
    run 为过滤器执行的具体逻辑，在这里可以做很多事情，比如：权限判断、合法性校验等。*/

@Component
public class ApiFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        //这里写校验代码
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        if(!"12345".equals(token)){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().getWriter().write("token is invalid.");
            }catch (Exception e){}
        }
        return null;
    }
}