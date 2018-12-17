package test;

import bean.person1;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Title junit2
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\14 0014 16:26
 */
public class junit2 {
    private ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");

    @Test
    public void test1()
    {
        person1 p=new person1();
        List<person1> list = p.selectList(new EntityWrapper().like("name", "a"));
        for(person1 x:list)
        {
            System.out.println(x);
        }
    }

    @Test
    public void test2()
    {
        person1 p=new person1("wer",10);
        boolean b = p.insert();
        System.out.println(b);
    }

    @Test
    public void test3()
    {
        person1 p=new person1(10,"poi",90);
        boolean b = p.updateById();
        System.out.println(b);
    }

    @Test
    public void test4()
    {
        person1 p=new person1();
        boolean b = p.delete(new EntityWrapper().ge("id", 8));
        System.out.println(b);
    }
}
