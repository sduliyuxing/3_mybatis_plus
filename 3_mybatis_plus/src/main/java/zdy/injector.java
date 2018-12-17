package zdy;


import com.baomidou.mybatisplus.entity.TableInfo;
import com.baomidou.mybatisplus.mapper.AutoSqlInjector;
import org.apache.ibatis.builder.MapperBuilderAssistant;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.session.Configuration;

/**
 * @Title injector
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\15 0015 14:50
 */
public class injector extends AutoSqlInjector {

    @Override
    public void inject(Configuration configuration,MapperBuilderAssistant builderAssistant, Class<?> mapperClass,Class<?> modelClass,TableInfo table) {
        String sql="delete from "+table.getTableName();
        String method="deleteall";
        SqlSource sqlSource=languageDriver.createSqlSource(configuration,sql,modelClass);
        this.addDeleteMappedStatement(mapperClass,method,sqlSource);

    }

}
