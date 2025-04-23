package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontendController {

    // 정적 파일이 아닌 모든 요청을 index.html로 포워딩
    @RequestMapping(value = { "/", "/{path:[^\\.]*}", "/**/{path:[^\\.]*}" })
    public String redirect() {
        return "forward:/index.html";
    }
}
