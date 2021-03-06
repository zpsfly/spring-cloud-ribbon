package com.forezp.web;

import com.forezp.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@RestController
public class HelloControler {



    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
    	System.out.println("name is : "+name+"**********************************");
        return helloService.hiService(name);
    }

	@Value("${foo}")
	String foo;
	
	
	@RequestMapping(value = "/hifoo")
	public String hi(){
		return foo;
	}
	
	@Value("${image.url}")
	String imageurl;
	
	
	@RequestMapping(value = "/imageurl")
	public String imageUrl(){
		return imageurl;
	}

}
