package com.teamfour.articlecontrol.Repositorys;

import com.teamfour.articlecontrol.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
