package com.project01.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {
   
   @Autowired
   private SqlSession sqlSession;
   
   public List<Map<String, Object>> selectAll() {
      return sqlSession.selectList("product.selectAll");
   }
   public List<Map<String, Object>> selectRecent() {
	      return sqlSession.selectList("product.selectRecent");
	   }
   public List<Map<String, Object>> selectDigital() {
	      return sqlSession.selectList("product.selectDigital");
	   }
   public List<Map<String, Object>> selectPero() {
	      return sqlSession.selectList("product.selectPero");
	   }
   public List<Map<String, Object>> selectCart() {
	      return sqlSession.selectList("product.selectCart");
	   }

}