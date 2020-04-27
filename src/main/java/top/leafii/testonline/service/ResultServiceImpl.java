package top.leafii.testonline.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Result;
import top.leafii.testonline.common.domain.ResultExample;
import top.leafii.testonline.common.domain.User_sub;
import top.leafii.testonline.common.domain.User_subExample;
import top.leafii.testonline.mapper.ResultMapper;
import top.leafii.testonline.mapper.User_subMapper;

import java.util.Date;
import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    ResultMapper resultMapper;
    @Autowired
    User_subMapper user_subMapper;
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

    @Override
    public Result selectResultByUidSubid(int uId, int subId) {
        List<Result> results = resultMapper.selectBySubidUid(subId, uId);
        if(results.get(0)!=null){
            return results.get(0);
        }
        return null;
    }

    @Override
    public Boolean insertScore(int uId, int subId, Result rs, double score) {
        rs.setScore(score);
        rs.setRestime(new Date());
        User_sub user_sub = new User_sub();
        user_sub.setStatus(1);

        User_subExample user_subExample = new User_subExample();
        user_subExample.or().andUIdEqualTo(uId).andSubIdEqualTo(subId);
        user_subMapper.updateByExampleSelective(user_sub,user_subExample);
        //System.out.println(rs);
        int i = resultMapper.updateByPrimaryKeySelective(rs);
        return i>0?true:false;
    }


}
