package com.neuedu.dao;

import java.sql.SQLException;
import java.util.List;

import com.neuedu.pojo.MenuData;
import com.neuedu.pojo.SysMenu;

public interface IMenuDao {

	int count()throws ClassNotFoundException, SQLException;
	
	List<SysMenu> findAll(int pageSize, int currentPage) throws ClassNotFoundException, SQLException;

	int insert(SysMenu menu)throws ClassNotFoundException, SQLException;

	List<SysMenu> getMenuList(String parentId)throws ClassNotFoundException, SQLException;

	List<MenuData> getMenuDataList(String id)throws ClassNotFoundException, SQLException;
    sysout
}
