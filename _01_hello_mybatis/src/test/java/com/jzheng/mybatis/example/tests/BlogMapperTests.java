package com.jzheng.mybatis.example.tests;

import com.jzheng.mybatis.example.entity.Blog;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BlogMapperTests {
    @Test
    public void test_selectByPrimaryKey() {
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("mybatis-config.xml");
        Assert.assertNotNull(inputStream);
        Reader reader = new InputStreamReader(inputStream);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = factory.openSession();
        Blog blog = (Blog) sqlSession.selectOne("com.jzheng.mybatis.example.mapper.BlogMapper.selectByPrimaryKey", 1);
        sqlSession.close();
        System.out.println(blog);
    }
}
