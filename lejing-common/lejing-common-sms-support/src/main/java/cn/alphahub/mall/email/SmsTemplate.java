package cn.alphahub.mall.email;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 短信模板方法
 *
 * @author lwj
 * @version 1.0
 * @date 2021-09-24
 */
@Component
public class SmsTemplate {

    @Resource
    private SmsSupport smsSupport;

}
