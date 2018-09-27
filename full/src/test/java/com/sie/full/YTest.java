package com.sie.full;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

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
public class YTest {
	@Autowired
	DataSource dataSource;
	@Autowired
	KindMapper kindapper;
	
//	@Test
//	@GetMapping("/kind")
//	public Kind getKind(){
//		return kindMapper.selectByPrimaryKey(1);
//	}
	 
	@Test	
	public void testMydatis()  {
		
		 List<Kind> kindList= kindapper.getAllKind();
		 for (int i = 0; i < kindList.size(); i++) {
			 System.out.println(kindList.get(i).getKindName());
		}
		 

	}

}
