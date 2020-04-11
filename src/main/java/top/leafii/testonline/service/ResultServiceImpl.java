package top.leafii.testonline.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Result;
import top.leafii.testonline.common.domain.ResultExample;
import top.leafii.testonline.mapper.ResultMapper;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    ResultMapper resultMapper;

    @Override
    public PagableResponse<List<Result>> list(PageRequest request) {
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<Result> results = resultMapper.selectByExample(new ResultExample());
        return new PagableResponse(new PageInfo<>(results).getTotal(),results);
    }

    @Override
    public PagableResponse<List<Result>> listbyuid(PageRequest request, int uid) {
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        ResultExample example = new ResultExample();
        example.or().andUIdEqualTo(uid);
        List<Result> results = resultMapper.selectByExample(example);
        return new PagableResponse(new PageInfo<>(results).getTotal(),results);

    }

}
