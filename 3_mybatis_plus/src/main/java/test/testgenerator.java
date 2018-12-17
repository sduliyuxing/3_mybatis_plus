package test;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;


/**
 * @Title testgenerator
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\15 0015 10:23
 */
public class testgenerator {

    @Test
    public void test()
    {
        //全局配置
        GlobalConfig globalConfig=new GlobalConfig();
        globalConfig.setOutputDir("F:\\edasedas\\ideaWorkspace\\a2\\src\\bao1\\java"); //输出路径
        globalConfig.setActiveRecord(true); //ar模式设置
        globalConfig.setFileOverride(true);//文件覆盖
        globalConfig.setBaseColumnList(true);
        globalConfig.setBaseResultMap(true);
        //数据源配置
        DataSourceConfig dataSourceConfig=new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL); //数据库类型
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://127.0.0.1:3306/a");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        //策略配置
        StrategyConfig strategyConfig=new StrategyConfig();
        strategyConfig.setCapitalMode(true);//是否全局大写命名
        strategyConfig.setDbColumnUnderline(true); //数据库字段是否大小写
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);//驼峰命名
        strategyConfig.setInclude(new String[]{"person"});//需要的表
        //包名配置
        PackageConfig packageConfig=new PackageConfig();
        //packageConfig.setParent("generator");
        packageConfig.setMapper("mapper");
        packageConfig.setXml("mapper");
        packageConfig.setEntity("bean");
        packageConfig.setController("controller");
        packageConfig.setService("boot.service");
        packageConfig.setServiceImpl("serviceimpl");
        //整合配置
        AutoGenerator autoGenerator=new AutoGenerator();
        autoGenerator.setGlobalConfig(globalConfig);
        autoGenerator.setDataSource(dataSourceConfig);
        autoGenerator.setStrategy(strategyConfig);
        autoGenerator.setPackageInfo(packageConfig);
        //执行
        autoGenerator.execute();
    }
}
