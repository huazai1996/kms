package org.shiro.kms;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kms.dao.AdminDao;
import org.kms.dao.GradeDao;
import org.kms.dao.SignDao;
import org.kms.pojo.Admin;
import org.kms.pojo.Grade;
import org.kms.pojo.Sign;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:web-dao.xml")
public class TestModel {
	
	@Resource
	private GradeDao gradeDao;
	
	@Resource
	private SignDao signDao;

	public void setSignDao(SignDao signDao) {
		this.signDao = signDao;
	}

	public void setGradeDao(GradeDao gradeDao) {
		this.gradeDao = gradeDao;
	}



	@Test
	public void test() {
		List<Grade> list = gradeDao.getAll();
		for (Grade grade : list) {
			System.out.println(grade.getGradeName());
		}
	}
	@Test
	public void testa() {
		List<Sign> list = signDao.getAll();
		for (Sign sign : list) {
			System.out.println(sign.getDate());
		}
	}


}
