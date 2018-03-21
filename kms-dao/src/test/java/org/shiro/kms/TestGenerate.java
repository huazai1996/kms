package org.shiro.kms;

import org.kms.pojo.Admin;
import org.kms.pojo.Cost;
import org.kms.pojo.Details;
import org.kms.pojo.Generate;
import org.kms.pojo.Grade;
import org.kms.pojo.Guardian;
import org.kms.pojo.Inex;
import org.kms.pojo.Permission;
import org.kms.pojo.Recruit;
import org.kms.pojo.Role;
import org.kms.pojo.School;
import org.kms.pojo.Sign;
import org.kms.pojo.Student;
import org.kms.pojo.Teacher;
import org.kms.pojo.User;
import org.kms.utils.ProjectUtils;



public class TestGenerate {
	public static void main(String[] args) throws Exception {
	
		
		ProjectUtils.setClass(new Class[] {Inex.class});
		
		ProjectUtils.generateDaoIntgerface();
		ProjectUtils.generateMappers();
	}
}
