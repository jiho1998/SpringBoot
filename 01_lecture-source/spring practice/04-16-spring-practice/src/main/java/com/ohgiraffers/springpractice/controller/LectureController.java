package com.ohgiraffers.springpractice.controller;

import com.ohgiraffers.springpractice.model.dto.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("lecture")
public class LectureController {

    @GetMapping("expression")
    public ModelAndView expression(ModelAndView mv) {
        mv.addObject("member", new MemberDTO("홍길동", 20, '남', "서울시 서초구"));

        mv.addObject("hello", "hello<h3>Tyhmeleaf<h3>");
     return mv;
    }
}
