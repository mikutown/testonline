package top.leafii.testonline.service;

import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Result;

import java.util.List;

public interface ResultService {
    PagableResponse<List<Result>> list(PageRequest request);

    PagableResponse<List<Result>> listbyuid(PageRequest request, int uid);

    Result selectResultByUidSubid(int uId, int subId);

    Boolean insertScore(int uId, int subId, Result rs, double score);
}
