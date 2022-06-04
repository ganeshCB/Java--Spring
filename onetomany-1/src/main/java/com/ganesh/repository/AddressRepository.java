package com.ganesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
