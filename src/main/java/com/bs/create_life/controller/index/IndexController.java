package com.bs.create_life.controller.index;

import com.bs.create_life.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class IndexController extends BaseController {

    @RequestMapping("get")
    String index() {
        return "";
    }
}
