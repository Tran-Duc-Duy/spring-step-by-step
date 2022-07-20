package com.example.learnspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("Home")
    //@ResponseBody
    public String index() {
        return "index";
    }
}
/*
    ! JSP không được thiết lập trong spring boot nên cần thiết lập thủ công
    + Vào thư mục src, mào main thêm một folder bắt buộc như sau "webapp" (phân biệt chữ hoa chữ thường nên cần gõ chính xác ) sau đó tạo thư mục con tên là "WEB-INF" (là thư mục cấu hình của dự án JSP, những thành phần ở trong thư mục này sẽ không cho người dùng nhìn thấy, chỉ các thành phần trong server mới có thể thấy) sau đó tạo một thư mục tên là views (nơi chứa các thành phần để tạo ra giao diện)

    + Thêm hai thư viện để hỗ trợ sử dụng JSP template engine
    <dependency>
        <groupId>org.apache.tomcat.embed</groupId>
        <artifactId>tomcat-embed-jasper</artifactId>
    </dependency>
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>jstl</artifactId>
    </dependency>

    + Vào thư mục resources, mở file application.properties
    -> xác định thư mục lưu trữ views
    spring.mvc.view.prefix=/WEB-INF/views
    -> xác định hậu tố của file
    spring.mvc.view.suffix=.jsp
    */