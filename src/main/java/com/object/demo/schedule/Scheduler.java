package com.object.demo.schedule;

import com.object.demo.common.EventProvider;
import com.object.demo.refund.domain.event.AggregateRefundEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
@Component
public class Scheduler {

    @Scheduled(cron = "*/5 * * * * *")
    public void refundSchedule() {
        SecureRandom random = new SecureRandom();
        Set<Long> refundSet = new HashSet<>();

        while (!(refundSet.size() == 5)) {
            refundSet.add((long) random.nextInt(10000000));
        }

        List<Long> refunds = new ArrayList<>(refundSet);

        log.info("start");
        EventProvider.publisher(new AggregateRefundEvent(refunds));
    }
}
