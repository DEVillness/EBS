package com.ssafyebs.businessbe.domain.manage.repository;

import com.ssafyebs.businessbe.domain.manage.entity.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricingRepository extends JpaRepository<Pricing, Long> {
}
