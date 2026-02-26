package com.suvam.accounts.repo;

import com.suvam.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import java.net.InterfaceAddress;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>
{

    Optional<Customer> findByMobileNumber(String mobileNumber);}

