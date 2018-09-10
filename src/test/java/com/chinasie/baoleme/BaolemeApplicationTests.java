package com.chinasie.baoleme;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chinasie.baoleme.dao.KindMapper;
import com.chinasie.baoleme.domain.Kind;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaolemeApplicationTests {

	@Autowired
	DataSource dataSource;
	@Autowired
	KindMapper kindapper;

	@Test
	public void contextLoads() throws SQLException {
		System.out.println("dataSource..." + dataSource.getClass());

		Connection connection = dataSource.getConnection();
		System.out.println("connection..." + connection);
	}
	@Test	
	public void testMydatis()  {
		//ApplicationContext ctf=new ClassPathXmlApplicationContext("applicationContext.xml");
		//DataSource datasource=(DataSource) ctf.getBean("dataSource");		
		//System.out.println(datasource);
		
		Kind employee =kindapper.selectById(1);
		System.out.println(employee);

	}

}
