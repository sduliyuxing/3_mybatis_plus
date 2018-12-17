package bean;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
/**
 * @Title bean.person
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\12 0012 14:59
 */

// TableName  指定表名
// TableId    指定主键  type: 指定主键策略.
// TableField 数据库中字段

@TableName(value = "person")
public class person {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private  Integer money;

    @TableLogic //逻辑删除属性
    private  Integer flag;
    public person() {
    }

    public person(String name, Integer money) {
        this.name = name;
        this.money = money;
    }

    public person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public person(Integer id, String name, Integer money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", flag=" + flag +
                '}';
    }
}
