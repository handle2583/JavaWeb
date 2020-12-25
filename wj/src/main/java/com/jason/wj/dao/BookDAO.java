package com.jason.wj.dao;


import com.jason.wj.pojo.Book;
import com.jason.wj.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author miaojian_v
 */
public interface BookDAO extends JpaRepository<Book,Integer> {
    /**
     * @param category
     * @return
     */
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}
