package com.anupama.assets.services.serviceimpl;

import com.anupama.assets.models.Members;
import com.anupama.assets.repository.MemberRepository;
import com.anupama.assets.services.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
    Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<Members> getAllProducts() {
        List<Members> members = memberRepository.findAll();
        logger.info("Received Products : {}",members.toString());        
        return members;
    }
    
}
