package com.hgn.kimi.dal.dao;

import java.util.List;
import java.util.Map;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.dao.DataAccessException;

import com.hgn.kimi.exception.DAOException;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;

/**
 * 
 */
public class BaseDAO implements InitializingBean {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    
    
    private SqlSessionTemplate sqlSession;  

	@Override
	public void afterPropertiesSet() throws Exception {
		if(sqlSession==null)
			throw new Exception("BaseDAO initilize fail,check related spring's configuration file");
	}
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

    public int update(String statementName, Object parameterObject) throws DAOException {
		try{
            return sqlSession.update(statementName, parameterObject);
        }catch (DataAccessException e){
            throw new DAOException("[BaseDAO-update]",e);
        }
	}

	public Object insert(String statementName, Object parameterObject) throws DAOException {
		try{
            return sqlSession.insert(statementName, parameterObject);
        }catch (DataAccessException e){
            throw new DAOException("[BaseDAO-insert]",e);
        }
	}

    public int delete(String statementName, Object parameterObject) throws DAOException {
		try{
            return sqlSession.delete(statementName, parameterObject);
        }catch (DataAccessException e){
            throw new DAOException("[BaseDAO-delete]",e);
        }
	}

	public Object queryForObject(String statementName, Object parameterObject) throws DAOException {
		try{
            return sqlSession.selectOne(statementName, parameterObject);
        }catch (DataAccessException e){
            throw new DAOException("[BaseDAO-queryForObject]",e);
        }
	}

	public List<?> queryForList(String statementName, Object parameterObject) throws DAOException {
		try{
            return sqlSession.selectList(statementName, parameterObject);
        }catch (DataAccessException e){
            throw new DAOException("[BaseDAO-queryForList]",e);
        }
	}
	
    /**
     * ȡList�����ҳ
     * 
     * @param statementName
     * @param parameterObject
     * @param pageNo 
     *             ҳ��
     * @param pageSize 
     *             ÿҳ��¼��
     * @return
     * @throws DAOException
     */
//    public List<?> queryForList(String statementName, Object parameterObject, int pageNo, int pageSize) throws DAOException {
//        try{
//            return sqlSession.selectList(statementName, parameterObject, pageSize * (pageNo - 1), pageSize);
//        }catch (DataAccessException e){
//            throw new DAOException("[BaseDAO-queryForList]",e);
//        }
//    }

	public Map<?, ?> queryForMap(String statementName, Object parameterObject, String keyProperty) throws DAOException {
		try{
            return sqlSession.selectMap(statementName, parameterObject, keyProperty);
        }catch (DataAccessException e){
            throw new DAOException("[BaseDAO-queryForMap]",e);
        }
	}

//    public Map<?, ?> queryForMap(String statementName, Object parameterObject, String keyProperty, String valueProperty) throws DAOException {
//        try{
//            return sqlSession.selectMap(statementName, parameterObject, keyProperty, valueProperty);
//        }catch (DataAccessException e){
//            throw new DAOException("[BaseDAO-queryForMap]",e);
//        }
//    }

}