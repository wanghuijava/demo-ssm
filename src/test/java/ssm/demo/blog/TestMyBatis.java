package ssm.demo.blog;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import ssm.demo.blog.domain.Blog;
import ssm.demo.blog.service.BlogService;  
  
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestMyBatis {  
    private static Logger logger = Logger.getLogger(TestMyBatis.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private BlogService blogService = null;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      blogService = (BlogService) ac.getBean("blogService");  
//  }  

    
    @Test  
    public void save() {  
    	Blog blog = new Blog();
    	//blog.setId(1);
    	blog.setTitle("ssm测试");
    	blog.setContent("ssm测试内容");
    	int result = blogService.save(blog);  
        System.out.println(blog.getId() + "result:"+result);  
        // logger.info("值："+user.getUserName());  
        logger.info(JSON.toJSONString(blogService.selectByPrimaryKey(1)));  
    }
    @Test  
    public void test1() {  
        Blog blog = blogService.selectByPrimaryKey(7);  
        System.out.println(blog.getTitle());  
        // logger.info("值："+user.getUserName());  
        logger.info(JSON.toJSONString(blog));  
    }  
}  