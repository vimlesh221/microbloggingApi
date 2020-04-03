package com.blogger.restapi;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
	public class BlogRetrieveController {
	  @RequestMapping(method = RequestMethod.GET, value="/get/allblog")
	  @ResponseBody
	  public List<Blog> getAllBlogs() {
	  return CreateBlog.getInstance().getBlogRecords();
	  }

	}
