package com.winter;

import com.winter.model.ClassInfoDO;
import com.winter.service.impl.ClassInfoServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisDemoApplicationTests {

	@Autowired
	private ClassInfoServiceImpl classInfoDAO;
	@Test
	public void contextLoads() {
        ClassInfoDO byId = classInfoDAO.getById(Long.parseLong("1"));
        System.out.println(byId.getUserName());
	}

}
