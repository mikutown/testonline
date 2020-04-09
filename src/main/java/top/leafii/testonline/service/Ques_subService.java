package top.leafii.testonline.service;

import top.leafii.testonline.common.domain.Ques_sub;
import top.leafii.testonline.common.domain.Subject;

import java.util.List;

public interface Ques_subService {
    List<Subject> getNoQuestionSubject(int quesId);

    List<Subject> getQuestionSubject(int quesId);

    Boolean addQuestionSubject(Ques_sub ques_sub);

    Boolean removeQuestionSubject(Ques_sub ques_sub);
}
