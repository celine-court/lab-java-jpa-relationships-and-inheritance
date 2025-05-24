package com.ironhack.labweek8.nurseAssociation.repository;

import com.ironhack.labweek8.nurseAssociation.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
