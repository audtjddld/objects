package com.object.demo.refund.application.refund;

import com.object.demo.common.EventProvider;
import com.object.demo.refund.domain.Refund;
import com.object.demo.refund.infrastructure.RefundRepository;
import com.object.demo.sap.domain.event.SapRefundRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class RefundService {

    private final RefundRepository repository;

    public RefundService(RefundRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void update(Long id, String message) {
        Optional<Refund> refund = findById(id);
        refund.ifPresent(this.repository::save);
    }

    @Transactional(readOnly = true)
    public Optional<Refund> findById(Long id) {
        return this.repository.findById(id);
    }

    @Transactional
    public void aggregateRefund(List<Long> refundLists) {
        Refund refund = new Refund(refundLists);
        repository.save(refund);
        EventProvider.publisher(new SapRefundRequest(refund.getId(), refund.getTotalPrice()));
    }
}
