package com.project01.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project01.dao.ProductDAO;

@Service
public class ProductService {

   @Autowired
   private ProductDAO productDAO;
   
   public List<Map<String, Object>> getAll() {
      return productDAO.selectAll();
   }
   public List<Map<String, Object>> getRecent() {
	      return productDAO.selectRecent();
	   }
   public List<Map<String, Object>> getDigital() {
	      return productDAO.selectDigital();
	   }
   public List<Map<String, Object>> getPero() {
	      return productDAO.selectPero();
	   }
   public List<Map<String, Object>> getCart() {
	      return productDAO.selectCart();
	   }
}