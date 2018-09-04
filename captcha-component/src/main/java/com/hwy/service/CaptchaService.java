package com.hwy.service;

import java.awt.image.BufferedImage;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/9/4 14:02
 **/
public interface CaptchaService {

    /**
     * 生成验证码
     * @return
     */
    BufferedImage createCaptcha();
}
