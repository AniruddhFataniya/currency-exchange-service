package com.rudraksh.rest.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rudraksh.rest.microservices.currencyexchangeservice.model.CurrencyExchange;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long>{
	
	CurrencyExchange findByFromAndTo(String from, String to);
}
