package com.kgc.dubbo.hrmanagerconsumer.controller;

import com.kgc.dubbo.pojo.Person;
import com.kgc.dubbo.service.HrManagerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-12-14 18:54
 */
@Controller
public class HrManagerController {
    @Reference
    HrManagerService hrManagerService;

    @RequestMapping("/")
    public String hrm(Model model){
        List<Person> list=hrManagerService.selectByAll();
        model.addAttribute("list",list);
        return "select";
    }

    @RequestMapping("/toAdd")
    public  String  toadd(){
        return "add";
    }

    @RequestMapping("doAdd")
    public String doAdd(Person person){

        hrManagerService.add(person);
        return "select";
    }
    @RequestMapping("/delete")
    public String delete(Integer id){
        hrManagerService.del(id);
        return "redirect:/select";
    }
}
