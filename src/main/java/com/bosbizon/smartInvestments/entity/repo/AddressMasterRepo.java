package com.bosbizon.smartInvestments.entity.repo;

import com.bosbizon.smartInvestments.entity.AddressMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressMasterRepo extends JpaRepository<AddressMaster,Long> {
}
