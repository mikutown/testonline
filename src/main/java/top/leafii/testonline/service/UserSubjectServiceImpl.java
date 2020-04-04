package top.leafii.testonline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.common.domain.User_sub;
import top.leafii.testonline.common.domain.User_subExample;
import top.leafii.testonline.mapper.User_subMapper;

import java.util.List;

@Service
public class UserSubjectServiceImpl implements UserSubjectService {
    @Autowired
    User_subMapper user_subMapper;
    @Override
    public List<Subject> getNoUserSubject(int uid) {
        User_subExample user_subExample = new User_subExample();
        user_subExample.or().andUIdEqualTo(uid);
        List<Subject> subjects = user_subMapper.selectNoUserSubject(uid);
        return subjects;
    }
}
