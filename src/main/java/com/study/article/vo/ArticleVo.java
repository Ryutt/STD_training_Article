package com.study.article.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ArticleVo {

    private Long articlePk;
    private String articleTitle;
    private String articleContents;
    private String articleWriter;
    private String postDate;

    @Builder
    ArticleVo(Long articlePk, String articleTitle, String articleContents, String articleWriter, String postDate) {
        this.articlePk = articlePk;
        this.articleTitle = articleTitle;
        this.articleContents = articleContents;
        this.articleWriter = articleWriter;
        this.postDate = postDate;
    }

}
