package com.crawler.controller;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crawler.model.UrlDetails;
import com.crawler.service.CrawlerServiceImpl;

@RestController
public class CrawlerController {
	Logger logger = LoggerFactory.getLogger(CrawlerController.class);
	@Autowired
	private CrawlerServiceImpl crawlwrServiceImpl;
	
	@PostMapping(value = "getLinks")
	public Set<String> getLinks(@RequestBody UrlDetails urlDetails){
		Set<String> pageLinks=null;
		try {
			pageLinks=crawlwrServiceImpl.getPageLinks(urlDetails.getUrl(),urlDetails.getText());
			
		}catch(Exception e) {
			logger.debug(e.getMessage());
		}
		return pageLinks;
	}
	
}
