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

    @Override
    public List<Subject> getUserSubject(int uid) {
        User_subExample user_subExample = new User_subExample();
        user_subExample.or().andUIdEqualTo(uid);
        List<Subject> subjects = user_subMapper.selectUserSubject(uid);
        return subjects;
    }

    @Override
    public Boolean addUserSubject(User_sub userSub) {
        int i = user_subMapper.insertSelective(userSub);
        return i>0?true:false;
    }

    @Override
    public Boolean removeUserSubject(User_sub userSub) {
        User_subExample userSubExample = new User_subExample();
        userSubExample.or().andUIdEqualTo(userSub.getuId()).andSubIdEqualTo(userSub.getSubId());
        int i = user_subMapper.deleteByExample(userSubExample);
        return i>0?true:false;
    }

    @Override
    public User_sub getstatus(int uid, int subid) {
        User_subExample example = new User_subExample();
        example.or().andUIdEqualTo(uid).andSubIdEqualTo(subid);
        List<User_sub> user_subs = user_subMapper.selectByExample(example);
        return user_subs.get(0);
    }
}
