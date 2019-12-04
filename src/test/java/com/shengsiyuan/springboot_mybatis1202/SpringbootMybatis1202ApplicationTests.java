package com.shengsiyuan.springboot_mybatis1202;

import com.shengsiyuan.springboot_mybatis1202.bean.Dept;
import com.shengsiyuan.springboot_mybatis1202.bean.Emp;
import com.shengsiyuan.springboot_mybatis1202.mapper.DeptMapper;
import com.shengsiyuan.springboot_mybatis1202.mapper.EmpDeptMapper;
import com.shengsiyuan.springboot_mybatis1202.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringbootMybatis1202ApplicationTests {

  @Autowired
    RabbitTemplate rabbitTemplate;

  @Autowired
    AmqpAdmin amqpAdmin;

 @Autowired
 DeptMapper deptMapper;

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    void contextLoads() throws MessagingException {
//        Dept dept = deptMapper.selectDeptById(3);

//        rabbitTemplate.convertAndSend("exchange.direct","atguigu.news",dept);

//        Object o = rabbitTemplate.receiveAndConvert("atguigu.news");
//        System.out.println(o.getClass());

//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setSubject("通知-今晚开会");
//        message.setText("今晚7:30开会");
//        message.setTo("2268605953@qq.com");
//        message.setFrom("757004980@qq.com");
//
//        javaMailSender.send(message);

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);

        helper.setSubject("通知");
        helper.setText("今晚8:20开会");
        helper.setTo("2268605953@qq.com");
        helper.setFrom("757004980@qq.com");
        helper.addAttachment("hell.jpg",new File("E:\\9312427341_1801630455.jpg"));

        javaMailSender.send(mimeMessage);


    }

}
