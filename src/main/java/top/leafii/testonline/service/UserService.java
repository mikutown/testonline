package top.leafii.testonline.service;

import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.User;

import java.util.List;

public interface UserService {
    public User findUserByUname(User user);

    Boolean checkUname(String uname);

    Boolean insertUser(User user);
    public PagableResponse list(PageRequest request);
}
