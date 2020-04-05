package top.leafii.testonline.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.common.domain.UserExample;
import top.leafii.testonline.common.utils.MD5;
import top.leafii.testonline.mapper.UserMapper;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User findUserByUname(User user) {
        UserExample userExample = new UserExample();
        userExample.or().andUnameEqualTo(user.getUname());
        List<User> users = userMapper.selectByExample(userExample);
        return(users.size()>0?users.get(0):null);
    }

    @Override
    public Boolean checkUname(String uname) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria().andUnameEqualTo(uname);
        return userMapper.countByExample(userExample) == 0;
    }

    @Override
    public Boolean insertUser(User user) {
        int i;
        i = userMapper.insertSelective(user);
        return i>0?true:false;
    }

    @Override
    public PagableResponse list(PageRequest request) {
        //完成分页
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<User> users = userMapper.selectByExample(new UserExample());
        //System.out.println(new PageInfo<>(users).getTotal());//打印总数
        return new PagableResponse(new PageInfo<>(users).getTotal(),users);
    }

    @Override
    public Boolean removeUser(User user) {
        int i = userMapper.deleteByPrimaryKey(user.getuId());
        return i>0?true:false;
    }

    @Override
    public User findUserByUid(int id) {
        User u = userMapper.selectByPrimaryKey(id);
        return u;
    }

    @Override
    public Boolean modifyUser(User user) {
        int i = userMapper.updateByPrimaryKeySelective(user);
        return i>0?true:false;
    }


}
