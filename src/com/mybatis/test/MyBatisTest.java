package com.mybatis.test;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.po.MyUser;
public class MyBatisTest {

	public static void main(String[] args) {
		try {
			InputStream config=Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(config);
			SqlSession ss=ssf.openSession();
			List<MyUser> listMu=ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser");
			for(MyUser myUser:listMu) {
				System.out.println(myUser);
			}
			ss.commit();
			ss.close();
		} catch (IOException e){
			e.printStackTrace();
		}

	}

}
