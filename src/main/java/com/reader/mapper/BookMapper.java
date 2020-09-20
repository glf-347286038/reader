package com.reader.mapper;

import com.reader.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Mapper注解，表明该接口是一个Mybatis中的Mapper,这种方式需要在每一个Mapper上
 * 都添加注解；还有一种简单的方式是在配置类上添加@MapperScan("org.sang.mapper")注解，
 * 表示扫描org.sang.mapper包下的所有接口作为Mapper,这样就不要在每个接口上配置@Mapper注解
 */
@Mapper
public interface BookMapper {
    int addBook(Book book);
    int deleteBookById(Integer id);
    int updateBookById(Book book);

    /**
     * @Author:高凌峰
     * @Date 2020-08-29 23:29:29
     * 根据书名查询书籍信息
    */
    Book getBookByName(String name);

    /**
     * @Author:高凌峰
     * @Date 2020-08-29 23:30:01
     * 批量查询书籍信息
    */
    List<Book> queryBookList();
}
