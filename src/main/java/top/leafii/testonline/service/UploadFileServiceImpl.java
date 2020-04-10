package top.leafii.testonline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.leafii.testonline.mapper.UploadFileMapper;

@Service
public class UploadFileServiceImpl implements UploadFileService {
    @Autowired
    UploadFileMapper uploadFileMapper;
}
