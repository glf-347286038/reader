package com.reader.mapper;

import com.reader.entity.Book;
import com.reader.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserBookRelation {
    /**
     * 增加用户拥有书籍
     */
    int addUserBook(UserBookRelation userBookRelation);

    /**
     * 根据书本Id删除用户的书籍
     */
    int deleteUserBook(Integer bookId);

    /**
     * 根据用用户Id删除书本的所有者
     */
    int deleteBookUser(Integer userId);

    /**
     * 根据用户Id查询所拥有书籍的所有信息
     */
    List<Book> getAllUser_Book(Integer userId);

    /**
     * 根据书籍Id查询其所有者的用户信息
     */
    List<User> getAllBook_User(Integer bookId);

    /**
     * 更新用户拥有书籍的关系（）
     */
    int updateBookById(UserBookRelation id);

    /**
     */
    UserBookRelation getUserBookRelationById();
}
