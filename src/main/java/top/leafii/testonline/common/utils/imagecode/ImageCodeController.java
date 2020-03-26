package top.leafii.testonline.common.utils.imagecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
/**
 * @author 叶蕴森
 */
@Controller
public class ImageCodeController {
    @GetMapping("/imageCode")
    public void getImageCode(HttpServletRequest request, HttpServletResponse response) {
        String vericode= CreateVerificationCode.getSecurityCode();
        HttpSession session=request.getSession();
        session.setAttribute("verityCode",vericode);
        //设置返回的内容
        response.setContentType("img/jpeg");
        //浏览器不缓存响应内容--验证码图片，点一次就要刷新一次，所以不能有缓存出现
        response.setHeader("Pragma","No-cache");
        response.setHeader("Cache-Control","no-cache");
        //设置验证码失效时间
        response.setDateHeader("Expires",0);
        //以字节流发过去，交给img的src属性去解析即可
        try {
            ImageIO.write(new CreateVerificationCodeImage(vericode).createImage(),"JPEG",response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
