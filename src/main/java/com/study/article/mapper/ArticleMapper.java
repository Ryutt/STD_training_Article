package com.study.article.mapper;

import com.study.article.vo.ArticleVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {

    int insertOne(ArticleVo articleVo);

    ArticleVo getReadArticle(Long boardPk);

    List<ArticleVo> getArticleList();
}