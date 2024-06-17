package com.telusko.joblisting.repository;

import com.telusko.joblisting.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface SearchRepository {
    List<Post> findByText(String text);
}
