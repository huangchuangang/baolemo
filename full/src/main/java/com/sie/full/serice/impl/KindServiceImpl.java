package com.sie.full.serice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sie.full.dao.KindMapper;
import com.sie.full.model.Kind;
import com.sie.full.service.KindService;

@Service
public class KindServiceImpl implements KindService {
	
	//查找类目
	@Autowired
	KindMapper kindMapper;
	public List<Kind> selectByPrimary(Kind kind){
		return kindMapper.selectByPrimaryKey(kind);
	}
	
	//添加类目
	@Override
	public void insertSelective(Kind kind) {
		// TODO Auto-generated method stub
		System.out.println(kindMapper.insertSelective(kind));
		
	}
	
	//更新类目
	@Override
	public void updateByPrimaryKeySelective(Kind kind) {
		// TODO Auto-generated method stub
		kindMapper.updateByPrimaryKey(kind);
	}
	
	//删除类目
	@Override
	public void deleteByPrimaryKey(Integer kindId) {
		// TODO Auto-generated method stub
		kindMapper.deleteByPrimaryKey(kindId);
		
	}

	//显示所有类目
	@Override
	public List<Kind> getAllKind() {
		List<Kind> kindlist = kindMapper.getAllKind();
		//String a="";
		for (int i = 0; i < kindlist.size(); i++) {
			String s=kindlist.get(i).getKindId()+' '+kindlist.get(i).getKindName()+' '+
					kindlist.get(i).getKindCreatetime()+' '+kindlist.get(i).getKindUpdatetime();
			//a+=s;
			System.out.println(kindlist.get(i).getKindId()+' '+kindlist.get(i).getKindName()+' '+
					kindlist.get(i).getKindCreatetime()+' '+kindlist.get(i).getKindUpdatetime());
		}
		return kindlist;
	}
}
