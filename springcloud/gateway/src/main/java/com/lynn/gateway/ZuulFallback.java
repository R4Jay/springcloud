package com.lynn.gateway;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.io.InputStream;

public class ZuulFallback  implements FallbackProvider {
    @Override
    public String getRoute() {
        return null;
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {

        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return HttpStatus.OK.value();

            }

            @Override
            public String getStatusText() throws IOException {
                return HttpStatus.OK.getReasonPhrase();
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
//                JSONObject json =new JSONObject();
//                json.put("state","501");
//                json.put("msg","后台接口错误");
//                return new ByteArrayInputStream(json.toJSONString().getBytes("UTF-8")); ////返回前端的内容
                return null;

            }

            @Override
            public HttpHeaders getHeaders() {
//                HttpHeaders httpHeaders = new HttpHeaders();
//                httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8); //设置头
//                return httpHeaders;
                return null;
            }
        };
    }
}