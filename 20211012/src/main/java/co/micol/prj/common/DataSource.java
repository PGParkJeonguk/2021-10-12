package co.micol.prj.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {
	private static SqlSessionFactory sqlSessionFactory;		//mybatis쓸때 이렇게 한다.
	private DataSource() {}	//외부에서 생성자 못만들게 하기
	
	public static SqlSessionFactory getInstance() {		//내가 원하는 데이터베이스에 Connection Pool 기반으로 연결되었다. 
		String resource = "mybatis-config.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sqlSessionFactory;
	}
	//7
}
