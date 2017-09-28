package cn.sxt.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.sxt.dao.UserDao;
import cn.sxt.vo.User;
// mybatis-1.2.3“‘∫Û∞Ê±æ
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public List<User> selectUsers() {
		return this.getSqlSession().selectList("cn.sxt.vo.user.mapper.selectAll");
	}

}
