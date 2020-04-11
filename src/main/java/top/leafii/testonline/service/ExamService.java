package top.leafii.testonline.service;

import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Exam;
import top.leafii.testonline.common.domain.User;

import java.util.List;

public interface ExamService {
    PagableResponse<List<Exam>> list(PageRequest request);
}
