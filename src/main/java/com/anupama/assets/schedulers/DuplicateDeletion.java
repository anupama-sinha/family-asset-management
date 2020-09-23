package com.anupama.assets.schedulers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

public class DuplicateDeletion {
    
    Logger logger = LoggerFactory.getLogger(DuplicateDeletion.class);

    @Scheduled(cron = "${cron.expression}")
    public void deleteDuplicateMembers() throws Exception {
        logger.info("Deleting Duplicate Members");
    }  
}
