package dao;

import pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIf(Map map);


    List<Blog> queryBlogChoose(Map map); // 使用choose(when,otherwise)只会满足第一个查询条件,类似switch语句

    //更新博客
    int updateBlog(Map map);

    //查询第1-2-3号记录的博客
    List<Blog> queryBlogForEach(Map map);
}
