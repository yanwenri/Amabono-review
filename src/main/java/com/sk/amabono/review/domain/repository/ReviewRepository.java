package com.sk.amabono.review.domain.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.amabono.review.domain.model.Review;

@RepositoryRestResource
public interface ReviewRepository extends PagingAndSortingRepository<Review, Long> {
}
