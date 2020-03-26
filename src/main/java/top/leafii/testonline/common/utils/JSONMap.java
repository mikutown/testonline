package top.leafii.testonline.common.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 叶蕴森
 * @Time 2020.3.21
 * JSONMap工具类用于登录时返回json值得构造
 */
public class JSONMap {
    //禁止json序列化
    //@JSONField(serialize = false)
    private static ThreadLocal<Map> threadLocal = new ThreadLocal<>();
    public JSONMap() {
    }
    public JSONMap(boolean isSuccess, int statusCode, String msg) {
        this.put("success", isSuccess).put("statusCode", statusCode).put("msg", msg);
    }

    public JSONMap(boolean isSuccess, int statusCode, String msg, Object data) {
        this.put("success", isSuccess).put("statusCode", statusCode).put("msg", msg).put("data",data);
    }

    public JSONMap put(String key, Object value){
        Map<String,Object> map = threadLocal.get();
        if(map==null){
            map = new HashMap<>();
            threadLocal.set(map);
        }
        map.put(key,value);
        return this;
    }
    //json化mapper

    public Map<String, Object> getData() {
        return threadLocal.get();
    }

    public Map<String,Object> end(){
        return getData();
    }


//    public static void main(String[] args) {
//
//      JSONModelMap jsonModelMap  = new JSONModelMap().put("success", false).put("statusCode", 200).put("msg", "用户名不存在");
//        String s = JSON.toJSONString(jsonModelMap);
//        System.out.println(s);
//    }

}
