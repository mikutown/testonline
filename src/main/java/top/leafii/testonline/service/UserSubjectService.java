package top.leafii.testonline.service;

import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.common.domain.User_sub;

import java.util.List;

public interface UserSubjectService {
    List<Subject> getNoUserSubject(int uid);
}
