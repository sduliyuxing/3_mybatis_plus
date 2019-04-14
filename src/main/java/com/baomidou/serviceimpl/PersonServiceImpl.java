package com.baomidou.serviceimpl;

import com.baomidou.bean.Person;
import com.baomidou.mapper.PersonMapper;
import com.baomidou.service.IPersonService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2018-09-15
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {
	
}
