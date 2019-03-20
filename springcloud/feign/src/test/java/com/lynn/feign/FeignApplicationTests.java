package com.lynn.feign;

import com.lynn.FeignApplication;
import com.lynn.Services.ApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/*
@RunWith(SpringRunner.class)
@SpringBootTest(classes=FeignApplication.class)
*/
@SpringBootTest(classes = FeignApplication.class)
//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
public class FeignApplicationTests {

    @Autowired
    private ApiService apiService;

    @Test
    public void test(){
        try {
            System.out.println(apiService.index());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
