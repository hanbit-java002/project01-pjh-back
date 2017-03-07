package com.project01.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JouDAO {
   
   @Autowired
   private SqlSession sqlSession;
   
   public List<Map<String, Object>> selectAll() {
      return sqlSession.selectList("jou.selectAll");
   }
   public List<Map<String, Object>> selectRecent() {
	  return sqlSession.selectList("jou.selectRecent");
   }


}