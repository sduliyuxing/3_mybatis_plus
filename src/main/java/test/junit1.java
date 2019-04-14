package test;

import bean.book;
import bean.person;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import mapper.bookMapper;
import mapper.bumenMapper;
import mapper.personMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.*;

/**
 * @Title test.junit
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\13 0013 17:22
 */
public class junit1 {
    private ApplicationContext ctx = new
            ClassPathXmlApplicationContext("spring.xml");
    private personMapper personmapper=ctx.getBean("personMapper",personMapper.class);
    private bookMapper bookmapper =ctx.getBean("bookMapper",bookMapper.class);
    private bumenMapper bumenmapper=ctx.getBean("bumenMapper",bumenMapper.class);

    @Test
    public void test0() throws Exception{
        DataSource ds = ctx.getBean("dataSource",DataSource.class);
        Connection conn = ds.getConnection();
        System.out.println(ds);
        System.out.println(conn);
    }

    @Test
    public void test1(){
        person p = personmapper.selectById("aa");
        System.out.println(p);
        List<Integer> list=new ArrayList<Integer>();
        list.add(1000);
        list.add(1001);
        list.add(1002);
        List<book> emp1 = bookmapper.selectBatchIds(list);
        System.out.println(emp1);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("money", 80);
        List<person> emp2 = personmapper.selectByMap(map);
        for(person p1:emp2){
            System.out.println(p1);
        }
        emp2.clear();
        emp2= personmapper.selectPage(new Page<person>(1, 4),
                new EntityWrapper<person>().ge("money", 10));
        for(person p1:emp2){
            System.out.println(p1);
        }
        emp2.clear();
        emp2=personmapper.selectList(new EntityWrapper<person>().like("name","a"));
        for(person p1:emp2){
            System.out.println(p1);
        }
    }

    @Test
    public void test2(){
//        insert方法在插入时， 会根据实体类的每个属性进行非空判断，只有非空的属性对应的字段才会出现到SQL语句中
        Integer t = personmapper.insert(new person(9,"xyz"));
        System.out.println(t);
        book b=new book(null,"m",9);
        t = bookmapper.insert(b);
        System.out.println(t);
    }

    @Test
    public void test3()
    {
        person p=new person("mko",50);
        Integer t = personmapper.updateById(p);
        System.out.println(t);
        t=personmapper.update(p, new EntityWrapper<person>().eq("name", "ee"));
        System.out.println(t);
    }

    @Test
    public void test4()
    {
        Integer t = personmapper.delete(new EntityWrapper<person>().eq("name", "mko"));
        System.out.println(t);
    }
}
