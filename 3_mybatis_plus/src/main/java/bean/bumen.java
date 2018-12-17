package bean;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * @Title bean.bumen
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\12 0012 15:02
 */

@TableName
public class bumen {
    @TableId
    private String name;
    private String bm;

    public bumen() {
    }

    public bumen(String name, String bm) {
        this.name = name;
        this.bm = bm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm;
    }

    @Override
    public String toString() {
        return "bean.bumen{" +
                "name='" + name + '\'' +
                ", bm='" + bm + '\'' +
                '}';
    }
}
