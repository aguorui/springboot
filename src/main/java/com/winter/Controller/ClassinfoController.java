package com.winter.Controller;

import com.winter.model.ClassInfoDO;
import com.winter.service.project.ProjectService;
import com.winter.service.test.ClassInfoDOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;

/**
 * Created By Donghua.Chen on  2018/1/9
 */
@Controller
@RequestMapping("/class")
public class ClassinfoController {

    @Autowired
    private ClassInfoDOService classInfoDOService;


    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity get(){
        ClassInfoDO byId = classInfoDOService.getById(new Long(1));
        return ResponseEntity.ok("查询成功::"+byId.getUserName());
    }
}
