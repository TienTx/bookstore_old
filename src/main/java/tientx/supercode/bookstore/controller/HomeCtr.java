/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import tientx.supercode.bookstore.tool.MyTool;

/**
 *
 * @author zOzDarKzOz
 */
@Controller
public class HomeCtr {

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String redirectToHome(Model model) {
        return "redirect:/home.html";
    }

    @RequestMapping(value = "home.html", method = RequestMethod.GET)
    public ModelAndView home(ModelAndView mav, HttpServletRequest request) {
        mav = new ModelAndView("home");
        MyTool.setModelData(mav, "Home", request);
        return mav;
    }
}
