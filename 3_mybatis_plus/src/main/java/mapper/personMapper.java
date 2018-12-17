package mapper;

import bean.person;
import com.baomidou.mybatisplus.mapper.BaseMapper;

public interface personMapper  extends BaseMapper<person> {
   public int deleteall();
}
