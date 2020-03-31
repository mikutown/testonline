package top.leafii.testonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.service.SubjectService;

import java.util.List;

@Controller
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @RequestMapping("/subjlist")
    @ResponseBody
    public PagableResponse<List<Subject>> subList(PageRequest request){
        return subjectService.list(request);
    }

}
