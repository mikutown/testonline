package top.leafii.testonline.service;

import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Type;

import java.util.List;

public interface TypeService {
    PagableResponse list(PageRequest request);

    Boolean chectTypeName(String typename);

    Boolean saveType(Type type);

    Type findTypeById(int id);

    Boolean modifyType(Type type);

    Boolean removeType(Type typeInDB);
}
