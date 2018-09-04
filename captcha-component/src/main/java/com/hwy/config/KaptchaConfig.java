package com.hwy.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 验证码配置
 * @date 2018/9/4 13:58
 **/
@Configuration
public class KaptchaConfig {

    @Bean(name = "captchaProducer")
    public DefaultKaptcha getDefaultKaptcha() {
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        Properties properties = new Properties();
        //图片边框，合法值：yes , no
        properties.put("kaptcha.border", "no");
        //边框颜色，合法值： r,g,b (and optional alpha) 或者 white,black,blue.
        properties.put("kaptcha.border.color", "93,126,57");
        //字体颜色，合法值： r,g,b  或者 white,black,blue.
        properties.put("kaptcha.textproducer.font.color", "71,134,17");
        //背景颜色渐变，开始颜色；默认值：light grey
        properties.put("kaptcha.background.clear.from", "237,247,255");
        //背景颜色渐变， 结束颜色；默认值：white
        properties.put("kaptcha.background.clear.to", "237,247,255");
        //干扰 颜色，合法值： r,g,b 或者 white,black,blue.
        properties.put("kaptcha.noise.color", "93,126,57");
        //图片宽；默认值：200
//        properties.put("kaptcha.image.width", "100");
        //图片高；默认值： 50
//        properties.put("kaptcha.image.height", "42");
        //字体大小；默认值：40px.
//        properties.put("kaptcha.textproducer.font.size", "38");
        //文本集合，验证码值从此集合中获取；默认值： abcde2345678gfynmnpwx
        properties.put("kaptcha.textproducer.char.string", "abcde2345678gkqrtfynmypwxABCDEGKQRTFYNMPWXY");
        //session key，默认值：KAPTCHA_SESSION_KEY
        properties.put("kaptcha.session.key", "code");
        //验证码长度；默认值：5
        properties.put("kaptcha.textproducer.char.length", "6");
        //字体；默认值：Arial, Courier
        properties.put("kaptcha.textproducer.font.names", "Arial");
        Config config = new Config(properties);
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }
}
