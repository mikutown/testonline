package top.leafii.testonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import top.leafii.testonline.service.UploadFileService;

@Controller
public class UploadFileController {
    @Autowired
    UploadFileService uploadFileService;
}
