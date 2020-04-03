package com.blogger.restapi;
import java.util.ArrayList;
import java.util.List;
public class CreateBlog {
	 private List<Blog> blogRecords;
	    private static CreateBlog createBlog = null;
	    private CreateBlog(){
	    	blogRecords = new ArrayList<Blog>();
	    }
	    public static CreateBlog getInstance() {
	        if(createBlog == null) {
	        	createBlog = new CreateBlog();
	              return createBlog;
	            }
	            else {
	                return createBlog;
	            }
	    }
	    public void add(Blog std) {
	    	blogRecords.add(std);
	    }
	  
		public List<Blog> getBlogRecords() {
			 return blogRecords;
		}
}
