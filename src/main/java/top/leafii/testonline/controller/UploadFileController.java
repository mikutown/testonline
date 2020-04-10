package top.leafii.testonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import top.leafii.testonline.common.domain.Question;
import top.leafii.testonline.common.utils.ItemBankManageMessage;
import top.leafii.testonline.common.utils.JSONMap;
import top.leafii.testonline.common.utils.UserManageMessage;
import top.leafii.testonline.service.QuestionService;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/picture")
public class UploadFileController {
    @Autowired
    QuestionService questionService;
    @Value("${sysUploadFileDir}")
    private String sysUploadFileDir;

    @RequestMapping("/add")
    @ResponseBody
    public Object submitUpload(@RequestParam("file") MultipartFile file) {
        String fileName = file.getOriginalFilename();

        if(fileName.indexOf("\\") != -1){
            fileName = fileName.substring(fileName.lastIndexOf("\\"));
        }
        //获取文件存放地址
        String filePath = sysUploadFileDir;
        File f = new File(filePath);
        if(!f.exists()){
            //不存在路径则进行创建
            f.mkdirs();
        }
        FileOutputStream out = null;
        try {
            //重新自定义文件的名称
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String d = sdf.format(date);
            filePath = filePath+d+fileName;
            out = new FileOutputStream(filePath);
            out.write(file.getBytes());
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONMap(false,200, ItemBankManageMessage.PICTURE_ADD_ERROR);
        }
        //返回有文件地址的json
        return new JSONMap(true,200, ItemBankManageMessage.PICTURE_ADD_SUCCESS,filePath);
    }

    @RequestMapping("/addtoquestion")
    @ResponseBody
    public Object addFileToQuestion(@RequestBody Question question){
        Boolean aBoolean = questionService.modifyQuestion(question);
        if(aBoolean){
            return new JSONMap(true,200, ItemBankManageMessage.PICTURE_QUEST_SUCCESS);

        }else{
            return new JSONMap(false,200, ItemBankManageMessage.PICTURE_QUEST_ERROR);
        }

    }
}
