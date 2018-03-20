package org.shiro.kms;

import org.kms.pojo.Admin;
import org.kms.pojo.Permission;
import org.kms.pojo.Role;
import org.kms.pojo.User;
import org.kms.utils.ProjectUtils;



public class TestGenerate {
	public static void main(String[] args) throws Exception {
	
		
		ProjectUtils.setClass(new Class[] {Admin.class});
		
		//ProjectUtils.generateDaoIntgerface();
		ProjectUtils.generateMappers();
	}
}
