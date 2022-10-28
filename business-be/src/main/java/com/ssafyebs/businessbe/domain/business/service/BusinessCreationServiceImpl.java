package com.ssafyebs.businessbe.domain.business.service;

import com.ssafyebs.businessbe.domain.business.controller.BusinessController;
import com.ssafyebs.businessbe.domain.business.dto.BusinessCreationRequestDto;
import com.ssafyebs.businessbe.domain.business.entity.Business;
import com.ssafyebs.businessbe.domain.business.repository.BusinessRepository;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BusinessCreationServiceImpl implements BusinessCreationService {

    final static Logger logger = LogManager.getLogger(BusinessCreationServiceImpl.class);
    private final BusinessRepository businessRepository;
    @Override
    public void create(BusinessCreationRequestDto businessCreationRequestDto) {
        Business business = businessCreationRequestDto.toEntity();
        logger.warn(business);
        businessRepository.save(business);
    }
}
