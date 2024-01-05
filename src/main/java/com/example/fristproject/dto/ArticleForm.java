package com.example.fristproject.dto;

import com.example.fristproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * The type Article form.
 */
@AllArgsConstructor
@ToString
public class ArticleForm {

    private Long id;
    private String title;
    private String content;

    /**
     * To entity article.
     *
     * @return the article
     */
    public Article toEntity() {
        return new Article(id, title, content);
    }

    /*
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }


    */

}
