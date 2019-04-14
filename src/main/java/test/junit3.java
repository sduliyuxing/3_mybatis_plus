package test;

import mapper.personMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title testinjector
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\15 0015 15:14
 */
public class junit3 {

    ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    personMapper p=ctx.getBean("personMapper",personMapper.class);

//    自定义操作
    @Test
    public void test1()
    {
        int i = p.deleteall();
        System.out.println(i);
    }

//    逻辑删除
    @Test
    public void test2()
    {
        Integer t = p.deleteById(5);
        System.out.println(t);
    }
}
