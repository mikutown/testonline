package top.leafii.testonline.service;

import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Question;

import java.util.List;

/**
 * @author leafii
 */
public interface QuestionService {
    PagableResponse<List<Question>> list(PageRequest request);

    Boolean save(Question question);

    Boolean removeQuestion(int quesId);

    Question getQuestionByQuesid(int quesId);

    Boolean modifyQuestion(Question question);
}
