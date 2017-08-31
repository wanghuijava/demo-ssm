package ssm.demo.blog.service;

import ssm.demo.blog.domain.Blog;

public interface BlogService {

    Blog selectByPrimaryKey(Integer id);
    int save(Blog blog);
}
