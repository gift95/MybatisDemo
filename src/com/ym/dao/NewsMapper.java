package com.ym.dao;

import com.ym.entity.News;

import java.util.List;

public interface NewsMapper {

    /**
     * @return 返回所有新闻的集合
     */
    List<News> getAllNews();

    News getNewsById(int newsId);

    List<News> getNewsByPro(News news);



}
