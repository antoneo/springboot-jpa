package com.ace.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ace.domain.GNMX;
import com.ace.domain.XTGN;
import com.ace.web.service.XTGNRepository;

@RestController
public class IndexController {
	@Autowired
	private XTGNRepository xtgnRepository;
	
	@RequestMapping(value={"/","/login","login.jsp"})
    public String login() {
        return "login";
    }
	
	@RequestMapping(value={"/index","/index.jsp"})
    public String index() {
        return "index";
    }

	@RequestMapping(value={"/gngl"})
    public String gngl() {
        return "gngl";
    }
	
	@RequestMapping(value="/getMenu",method=RequestMethod.POST)
    public List<Map<String,Object>> getMenu(){
		List<Map<String,Object>> menu=new ArrayList<Map<String,Object>>();
    	List<XTGN> lists=xtgnRepository.findAllByOrderBySeqXtgnAsc();
    	for(XTGN xtgn:lists){
    		Map<String,Object> map=new HashMap<String,Object>();
    		map.put("id", xtgn.getId());
    		map.put("text", xtgn.getName());
    		map.put("icon", xtgn.getIcoXtgn());
    		map.put("url", "");
//    		System.out.println(xtgn.getGnmx());
    		List<Map<String,Object>> ls=new ArrayList<Map<String,Object>>();
    		for(GNMX gnmx:xtgn.getGnmx()){
    			Map<String,Object> m=new HashMap<String,Object>();
    			m.put("id",xtgn.getId()*100+gnmx.getId());
    			m.put("text", gnmx.getName());
    			m.put("icon", gnmx.getIcoGnmx());
    			m.put("url", gnmx.getUrlGnmx());
    			ls.add(m);
    		}
    		map.put("menus", ls);
    		menu.add(map);
    	}
    	
    	return menu;
    }
}
