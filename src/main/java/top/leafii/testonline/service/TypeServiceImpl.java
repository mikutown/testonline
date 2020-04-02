package top.leafii.testonline.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Type;
import top.leafii.testonline.common.domain.TypeExample;
import top.leafii.testonline.mapper.TypeMapper;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeMapper typeMapper;

    @Override
    public PagableResponse list(PageRequest request) {
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<Type> types = typeMapper.selectByExample(new TypeExample());
        return new PagableResponse(new PageInfo<>(types).getTotal(),types);
    }
}
