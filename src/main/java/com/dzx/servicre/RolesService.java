package com.dzx.servicre;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dzx.entity.Kfz;
import com.dzx.entity.Modules;
import com.dzx.entity.Roles;

public interface RolesService {
  
	public List<Roles> getAllModules(String Name,Integer limit,Integer page);
	/*
	 * ��ɫ��ɾ�Ĳ�
	 * */
		int getConutModules(String Name);
		int addRoles(String id,String name);
		int deleteRoles(String id);
		int updateRoles(String id,String name);
		/*
		 * ��ɫȨ����ɾ�Ĳ�
		 */
		//��ɫȨ����
				public List<Modules> getAllModulesByid(String roleId);
		int addrolemodules(Integer mId, String rId);
		int  delrolemodules(String rId);
}