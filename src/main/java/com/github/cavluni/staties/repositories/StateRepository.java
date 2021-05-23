package com.github.cavluni.staties.repositories;

import com.github.cavluni.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
