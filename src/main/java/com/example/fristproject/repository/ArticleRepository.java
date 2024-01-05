package com.example.fristproject.repository;

import com.example.fristproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

/**
 * The interface Article repository.
 */
public interface ArticleRepository extends CrudRepository<Article, Long> {
    /**
     * Find all array list.
     *
     * @return the array list
     */
    @Override
    ArrayList<Article> findAll();
}
