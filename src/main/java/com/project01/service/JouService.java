package com.project01.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project01.dao.JouDAO;

@Service
public class JouService {

   @Autowired
   private JouDAO jouDAO;
   
   public List<Map<String, Object>> getAll() {
      return jouDAO.selectAll();
   }
   public List<Map<String, Object>> getRecent() {
	      return jouDAO.selectRecent();
	   }
}