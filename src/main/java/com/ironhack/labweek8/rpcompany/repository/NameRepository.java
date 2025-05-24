package com.ironhack.labweek8.rpcompany.repository;

import com.ironhack.labweek8.rpcompany.model.Name;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NameRepository extends JpaRepository<Name, Long> {
}
