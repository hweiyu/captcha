package com.hwy.service.impl;

import com.google.code.kaptcha.Producer;
import com.hwy.service.CaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/9/4 14:03
 **/
@Service
public class CaptchaServiceImpl implements CaptchaService {

    @Autowired
    private Producer producer;

    /**
     * 生成验证码
     *
     * @return
     */
    @Override
    public BufferedImage createCaptcha() {
        //生成文字验证码
        String code = producer.createText();
        return producer.createImage(code);
    }
}
