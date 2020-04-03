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

    @Override
    public Boolean chectTypeName(String typename) {
        TypeExample typeExample = new TypeExample();
        typeExample.or().andTypenameEqualTo(typename);
        List<Type> types = typeMapper.selectByExample(typeExample);
        return types.size()>0?false:true;
    }

    @Override
    public Boolean saveType(Type type) {
        int i = typeMapper.insertSelective(type);
        return i>0?true:false;
    }

    @Override
    public Type findTypeById(int id) {
        Type type = typeMapper.selectByPrimaryKey(id);
        return type;
    }

    @Override
    public Boolean modifyType(Type type) {
        int i = typeMapper.updateByPrimaryKeySelective(type);
        return i>0?true:false;
    }
}
