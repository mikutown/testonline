package top.leafii.testonline.service;

import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Subject;

import java.util.List;

public interface SubjectService {
    PagableResponse list(PageRequest request);

    Boolean checkSubName(String subname);

    Boolean saveSubject(Subject subject);

    Subject findSubjectByid(int id);

    Boolean modifySubject(Subject subject);

    Boolean removeSubject(Subject sbInDB);
}
