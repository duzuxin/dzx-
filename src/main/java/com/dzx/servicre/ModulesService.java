package com.dzx.servicre;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dzx.entity.Modules;
import com.dzx.entity.Roles;

public interface ModulesService {
	public List<Modules> getAllModules();
	   public int updateModulesById(Modules modules);
	   public int deleteModulesById(Integer id);
	   public int addModules(Modules modules);
		  public Modules getAllModulesbyid(Integer id);
	//�����û�id��ý�ɫ����
		public List<Roles> getRolesByUseid(String uid);
		public List<Modules> getModuleByroleid(List<String> rid);
		

}
