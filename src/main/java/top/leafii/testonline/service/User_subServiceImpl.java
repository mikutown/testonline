package top.leafii.testonline.service;

import org.springframework.beans.factory.annotation.Autowired;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.common.domain.User_sub;
import top.leafii.testonline.common.domain.User_subExample;
import top.leafii.testonline.mapper.User_subMapper;

public class User_subServiceImpl implements User_subService{
    @Autowired
    User_subMapper user_subMapper;
    @Override
    public Boolean setStatus(int uId, int subId) {
        User_sub user_sub = new User_sub();
        user_sub.setStatus(1);
        user_sub.setSubId(subId);
        user_sub.setuId(uId);
        User_subExample user_subExample = new User_subExample();
        user_subExample.or().andSubIdEqualTo(subId).andUIdEqualTo(uId);
        int i = user_subMapper.updateByExampleSelective(user_sub, user_subExample);

        return i>0?true:false;
    }
}
