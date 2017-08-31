package ssm.demo.blog.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ssm.demo.blog.domain.Blog;
import ssm.demo.blog.service.BlogService;

@Controller  
@RequestMapping("/blog")  
public class BlogController {  
    @Resource  
    private BlogService blogService;  
      
    @RequestMapping("/showBlog")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        Blog blog = this.blogService.selectByPrimaryKey(userId);  
        model.addAttribute("blog", blog);  
        return "blog-detail";  
    }  
}  