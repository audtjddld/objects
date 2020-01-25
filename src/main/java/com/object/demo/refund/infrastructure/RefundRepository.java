package com.object.demo.refund.infrastructure;

import com.object.demo.refund.domain.Refund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefundRepository extends JpaRepository<Refund, Long> {
}
