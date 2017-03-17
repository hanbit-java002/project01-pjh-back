package com.project01.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project01.service.JouService;
import com.project01.service.ProductService;
import com.project01.service.PublicService;

@RestController
@RequestMapping("/api/main/section")
public class MainController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
   @Autowired
   private ProductService productService;
      
   @Autowired
   private JouService jouService;
   
   @Autowired
   private PublicService publicService;
   
   @RequestMapping("/{sectionCode}")
   public List<Map<String, Object>> getSectionItems(
		   @PathVariable("sectionCode") String sectionCode) {
	   			 			
			   if ("store" .equals(sectionCode)) {
				   return productService.getAll();
			   }
			   else if ("recent_store".equals(sectionCode)) {
				   return productService.getRecent();
			   }
			   else if ("recent_post".equals(sectionCode)) {
				   return jouService.getRecent();
			   }
			   else if ("journal".equals(sectionCode)) {
				   return jouService.getAll();
			   }
			   else if ("publications".equals(sectionCode)) {
				   return publicService.getAll();
			   }
			   else if ("digital".equals(sectionCode)) {
				   return productService.getDigital();
			   }
			   else if ("pero".equals(sectionCode)) {
				   return productService.getPero();
			   }
			   /*else if ("products".equals(sectionCode)) {
				   return productService.getAll();
			   }*/
			   else if ("cart".equals(sectionCode)) {
				   return productService.getCart();
			   }
			   return new ArrayList<>();
   }
   
}