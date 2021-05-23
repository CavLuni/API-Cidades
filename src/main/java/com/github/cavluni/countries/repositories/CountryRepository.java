package com.github.cavluni.countries.repositories;

import com.github.cavluni.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
