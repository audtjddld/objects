package com.object.demo.myshop.review.infrastructure;

import com.object.demo.myshop.member.domain.MemberId;
import com.object.demo.myshop.review.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, MemberId> {
}
