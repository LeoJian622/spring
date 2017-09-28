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
		return sqlSessionTemplate.selectList("cn.sxt.vo.user.mapper.selectAll");
	}

}
