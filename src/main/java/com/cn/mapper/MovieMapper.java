package com.cn.mapper;

import com.cn.model.Movie;

import java.util.List;

public interface MovieMapper {

    void insert(Movie movie);

    List<Movie> findAll();
}
