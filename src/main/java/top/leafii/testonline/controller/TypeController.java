package top.leafii.testonline.controller;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.common.domain.Type;
import top.leafii.testonline.common.utils.ItemBankManageMessage;
import top.leafii.testonline.common.utils.JSONMap;
import top.leafii.testonline.service.TypeService;

import java.util.List;

@Controller
@RequestMapping("/type")
public class TypeController {
    @Autowired
    TypeService typeService;
    @RequestMapping("/remove")
    @ResponseBody
    public Object removeType(@RequestParam("typeId") int typeId){
        Type typeInDB = typeService.findTypeById(typeId);
        Boolean removeSuccess = typeService.removeType(typeInDB);
        if(removeSuccess){
            return new JSONMap(true,200, "删除题型："+typeInDB.getTypename()+"成功！");
        }else{
            return new JSONMap(false,200, "删除题型："+typeInDB.getTypename()+"失败！");
        }
    }
    /**
     * 题型修改
     * @param type
     * @return
     */
    @RequestMapping("/modify")
    @ResponseBody
    public Object modifyType(@RequestBody Type type){
        Boolean bool = typeService.modifyType(type);
        if(bool){
            return new JSONMap(true,200, ItemBankManageMessage.TYPE_MODIFY_SUCCESS);
        }else{
            return new JSONMap(false,200, ItemBankManageMessage.TYPE_MODIFY_ERROR);
        }
    }
    /**
     * 通过id查找并返回type对象
     * @param id
     * @return
     */
    @RequestMapping("/gettypebyid")
    @ResponseBody
    public Object getTypeById(@RequestParam("id") int id){
        Type t = typeService.findTypeById(id);
        return t;
    }
    /**
     * 添加题型
     * @param type
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public Object saveType(@RequestBody Type type){
        Boolean bool = typeService.saveType(type);
        if(bool){
            return new JSONMap(true,200, ItemBankManageMessage.TYPE_ADD_SUCCESS);
        }
        else{
            return new JSONMap(false,200, ItemBankManageMessage.TYPE_ADD_ERROR);
        }
    }
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
