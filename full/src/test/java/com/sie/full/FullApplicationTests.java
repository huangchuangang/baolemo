package com.sie.full;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sie.full.dao.KindMapper;
import com.sie.full.model.Kind;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FullApplicationTests {
	@Autowired
	DataSource dataSource;
	@Autowired
	KindMapper kindapper;

	@Test
	public void contextLoads() throws SQLException {
		System.out.println("dataSource...数据源" + dataSource.getClass());

		Connection connection = dataSource.getConnection();
		System.out.println("connection..." + connection);
	}
	
//	@Test	
//	public void testMydatis()  {
//		
//		Kind kind =kindapper.selectByPrimaryKey(1);
//		System.out.println(kind);
//
//	}

}
