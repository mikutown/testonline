package top.leafii.testonline.controller;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.common.domain.Type;
import top.leafii.testonline.service.TypeService;

import java.util.List;

@Controller
@RequestMapping("/type")
public class TypeController {
    @Autowired
    TypeService typeService;

    /**
     * 用于添加题型时判断是否重名
     * @param typename
     * @return
     */
    @RequestMapping("/check-typename")
    @ResponseBody
    public Boolean checkTypename(@RequestParam("typename") String typename){
        return typeService.chectTypeName(typename);
    }
    /**
     * 返回json类型的type list
     * @param request
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public PagableResponse<List<Type>> typeList(PageRequest request){
        return typeService.list(request);
    }

}
