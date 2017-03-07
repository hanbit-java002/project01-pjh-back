package com.project01.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project01.dao.PublicDAO;

@Service
public class PublicService {

   @Autowired
   private PublicDAO publicDAO;
   
   public List<Map<String, Object>> getAll() {
      return publicDAO.selectAll();
   }
   
}