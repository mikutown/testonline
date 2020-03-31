package top.leafii.testonline.service;

import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Subject;

import java.util.List;

public interface SubjectService {
    PagableResponse<List<Subject>> list(PageRequest request);
}
