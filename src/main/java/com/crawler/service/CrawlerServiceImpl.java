package com.crawler.service;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CrawlerServiceImpl{
	 Logger logger = LoggerFactory.getLogger(CrawlerServiceImpl.class);

    Set<String> urlLinks;
    public CrawlerServiceImpl() {
    	this.urlLinks=new HashSet<>();
    }
    
	public Set<String> getPageLinks(String url,String txt){
		
		if (!urlLinks.contains(url)) {   
			try {   
				urlLinks.add(url);
			    // fetch the HTML code of the given URL by using the connect() and get() method and store the result in Document  
			    Document doc = Jsoup.connect(url).get();  
			                
			    // use the select() method to parse the HTML code for extracting links of other URLs and store them into Elements    
			    Elements availableLinksOnPage = doc.select("a[href]");  
			    // for each extracted URL, repeating process  
			    if(StringUtils.isEmpty(txt)) {            
			    availableLinksOnPage.forEach(element->
			    		getPageLinks(element.attr("abs:href"),txt)
			    	);
			    }else {
			    	 availableLinksOnPage.forEach(element->{
			    		if(element.text().toLowerCase().contains(txt.toLowerCase())) {
			    	 		getPageLinks(element.attr("abs:href"),txt);
			    	 	}
			    	 }
			    	);
			    }
			}  
			
			catch (IOException e) {   
				logger.debug("Error-"+e.getMessage());
			}
		}
		return urlLinks;
	}   
	
}
