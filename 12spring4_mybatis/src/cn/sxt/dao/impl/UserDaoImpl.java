package cn.sxt.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import cn.sxt.dao.UserDao;
import cn.sxt.vo.User;

public class UserDaoImpl implements UserDao {
	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<User> selectUsers() {
		User user = new User();
		user.setName("u4");
		user.setPwd("123");
		sqlSessionTemplate.insert("cn.sxt.vo.user.mapper.addUser", user);
		sqlSessionTemplate.delete("cn.sxt.vo.user.mapper.removeUser",20);
		return sqlSessionTemplate.selectList("cn.sxt.vo.user.mapper.selectAll");
	}

}
