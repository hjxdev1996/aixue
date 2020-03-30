package com.hejiaxing.controller;

import com.hejiaxing.aixue.domain.Employee;
import com.hejiaxing.aixue.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployController {
    //restful的地址尽量不要动词 不要用geiByUserid 之类的    {method:规定请求的方式 只能是post的方式}
    //requserBody  把body请求中的数据，按照spirngmvc的原理封装进去
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
    //本应该写service获取到用户信息，去和数据库对比 现在是做假数据测试
        if("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return  AjaxResult.me().setSuccess(true).setMsg("登录成功");
        }else {
            return  AjaxResult.me().setSuccess(false).setMsg("登录失败");
        }
    }


}
