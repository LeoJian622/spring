package cn.sxt.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.sxt.dao.UserDao;
import cn.sxt.vo.User;

@Repository("userDao")
//<bean id="userDao" class="cn.sxt.dao.impl.UserDaoImpl">
//<property name="sqlSessionFactory" ref="sqlSessionFactory"/>
//</bean>
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	@Override
	public List<User> getAll() {
		return this.getSqlSession().selectList("cn.sxt.vo.user.mapper.getAll");
	}

	@Override
	public int add(User user) {
		return this.getSqlSession().insert("cn.sxt.vo.user.mapper.add");
	}

	@Override
	public int remove(int id) {
		return this.getSqlSession().delete("cn.sxt.vo.user.mapper.remove");
	}

}
