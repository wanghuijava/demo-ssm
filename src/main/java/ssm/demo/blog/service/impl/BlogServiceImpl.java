package ssm.demo.blog.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ssm.demo.blog.dao.BlogDao;
import ssm.demo.blog.domain.Blog;
import ssm.demo.blog.service.BlogService;

@Service("blogService") 
public class BlogServiceImpl implements BlogService {

	@Resource
	private BlogDao blogDao; 
	
	
	public Blog selectByPrimaryKey(Integer id) {
		return this.blogDao.selectByPrimaryKey(id);  
	}

	public int save(Blog blog) {
		return this.blogDao.insert(blog);  
	}
}
