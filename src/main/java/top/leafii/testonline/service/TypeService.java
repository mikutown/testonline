package top.leafii.testonline.service;

import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Type;

import java.util.List;

public interface TypeService {
    PagableResponse list(PageRequest request);
}
