package com.blogger.restapi;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CreateBlogController {
  @RequestMapping(method = RequestMethod.POST, value="/create/blog")
  @ResponseBody
  public CreateBlogReply createBlog(@RequestBody Blog blog) {
  System.out.println("In createBlog");
        CreateBlogReply createBlogreply = new CreateBlogReply();           
        CreateBlog.getInstance().add(blog);
        //We are setting the below value just to reply a message back to the caller
        createBlogreply.setTitle(blog.getTitle());
        createBlogreply.setData(blog.getData());
        createBlogreply.setLabel(blog.getLabel());
        createBlogreply.setCreateBlogStatus("Successful");
        return createBlogreply;
}
}