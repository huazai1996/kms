package org.kms.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.Resource;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class ProjectUtils {
	
	private static Class[] classes; //要生成相应模块的实体类
	private static Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
	private static Map<String, Object> model = new HashMap<String, Object>();//公共的模型数据
	
	
	
	
	public static  void  setClass (Class[] clazzes) {
		ProjectUtils.classes = clazzes;
	}
	
	/**
	 * FreeMarker框架的配置
	 */
	static {
		try {
			configuration.setDirectoryForTemplateLoading(new File("src/main/resources"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		configuration.setDefaultEncoding("utf-8");
		
		
		//准备模型数据
		model.put("projectName","kms");
		model.put("jing", "#");
		model.put("daola", "$");
	}
	
	/**
	 * 生成Dao接口
	 */
	public static void generateDaoIntgerface() throws Exception {
		Template template = configuration.getTemplate("dao.ftl");
		
		//根据传入的classes 来批量生成dao接口
		if (classes ==null ) {
			return;
		}
		for (Class clazz : classes) {
			model.put("pojoName", clazz.getSimpleName());
			//找带注解的属性
			Field[] fields = clazz.getDeclaredFields();
			String pk = "Integer";
			for (Field field : fields) {
				if (field.getAnnotations().length>0) {
					if (field.getAnnotations()[0].annotationType() == Resource.class) {
						pk=field.getType().getSimpleName();
					}
				}
				
			}
			model.put("pkType", pk);
			
			//输出到对应的目录
			File  file = new File("src/main/java/org/kms/dao/"+clazz.getSimpleName()+"Dao.java");
			if (file.exists() == false) {
				file.createNewFile();
			}		
			Writer out = new OutputStreamWriter(new FileOutputStream(file));
			template.process(model, out);
			
			System.out.println("generate 成功"+clazz.getSimpleName()+"Dao.java");
		}
	}
	
	/**
	 * 生成  sql mapper files
	 */
	public static void generateMappers() throws Exception {
		Template template = configuration.getTemplate("mapper.ftl");
		
		//根据传入的classes 来批量生成mapper
		if (classes ==null ) {
			return;
		}
		for (Class clazz : classes) {
			
			model.put("pojoName", clazz.getSimpleName());
			
			//根据类名自动计算出表名 SysUser --> sys_users
			StringBuffer sb= new StringBuffer(clazz.getSimpleName());
			
			
			char[] array =	clazz.getSimpleName().toCharArray();
			for(int i = 1; i<array.length; i++){
				char c= array[i];
				boolean isupper =	Character.isUpperCase(c);
				if (isupper) {
					sb.insert(i, "_");
				}
			}
			model.put("table_name", sb.toString());
			
			//声明一个list 存放列名
			List<String> columnNames = new ArrayList<String>();
			
			//找带注解的属性
			Field[] fields = clazz.getDeclaredFields();
			String pk = "Integer";
			for (Field field : fields) {
					if (field.getAnnotations().length>0 && field.getAnnotations()[0].annotationType() == Resource.class) {
						pk=field.getType().getSimpleName();
					}else {
						columnNames.add(field.getName());
					}
				
			}
			model.put("columnNames", columnNames);
			
			
			//输出到对应的目录
			File  file = new File("src/main/java/org/kms/mappers/"+clazz.getSimpleName()+"Mapper.xml");
			if (file.exists() == false) {
				file.createNewFile();
			}		
			Writer out = new OutputStreamWriter(new FileOutputStream(file));
			template.process(model, out);
			
			System.out.println("generate 成功"+clazz.getSimpleName()+"Mapper.xml");
		}
	
	}
}
