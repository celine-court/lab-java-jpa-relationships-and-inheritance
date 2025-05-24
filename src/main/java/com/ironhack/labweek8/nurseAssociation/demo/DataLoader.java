package com.ironhack.labweek8.nurseAssociation.demo;

import com.ironhack.labweek8.nurseAssociation.model.Association;
import com.ironhack.labweek8.nurseAssociation.model.Division;
import com.ironhack.labweek8.nurseAssociation.model.Member;

import com.ironhack.labweek8.nurseAssociation.repository.AssociationRepository;
import com.ironhack.labweek8.nurseAssociation.repository.DivisionRepository;
import com.ironhack.labweek8.nurseAssociation.repository.MemberRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

import static com.ironhack.labweek8.nurseAssociation.model.enums.StatusMember.ACTIVE;
import static com.ironhack.labweek8.nurseAssociation.model.enums.StatusMember.LAPSED;


@Component
@Profile("dev")
public class DataLoader implements CommandLineRunner {

    private final AssociationRepository associationRepository;
    private final DivisionRepository divisionRepository;
    private final MemberRepository memberRepository;


    public DataLoader(AssociationRepository associationRepository, DivisionRepository divisionRepository, MemberRepository memberRepository) {
        this.associationRepository = associationRepository;
        this.divisionRepository = divisionRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading data...");

        var association1 = new Association("Nurse Association of Spain","division1");


        var division1 = new Division("DivisionA","DistrictH","Pt Johnson",new Member());
        var division2 = new Division("DivisionB","DistrictU", "Pt Martin",new Member());
        var division3 = new Division("DivisionC","DistrictU","Pt Court",new Member());
        var division4 = new Division("DivisionD","DistrictP","Pt Catusse",new Member());
        var division5 = new Division("DivisionE","DistrictH","Pt Tremoulet",new Member());
        var division6 = new Division("DivisionF","DistrictP","Pt Jacotot",new Member());
        var division7 = new Division("DivisionG","DistrictU","Pt Vaimbois",new Member());

        divisionRepository.saveAll(List.of(division1, division2,division3,division4,division5,division6,division7));

        var member1 = new Member("Alex", LocalDate.of(2026,05,24), ACTIVE);
        var member2 = new Member("Nono", LocalDate.of(2027,05,24), ACTIVE);
        var member3 = new Member( "Juan", LocalDate.of(2028,05,24), ACTIVE);
        var member4 = new Member("lulu", LocalDate.of(2024,05,24), LAPSED);
        var member5 = new Member("Holly",LocalDate.of(2028,05,24), ACTIVE);
        var member6 = new Member("David",LocalDate.of(2023,05,24), LAPSED );
        var member7 = new Member("Laeti",LocalDate.of(2040,05,24),ACTIVE);

        memberRepository.saveAll(List.of(member1,member2,member3,member4,member5,member6,member7));

        associationRepository.save(association1);

        divisionRepository.save(division1);
        divisionRepository.save(division2);
        divisionRepository.save(division3);
        divisionRepository.save(division4);
        divisionRepository.save(division5);
        divisionRepository.save(division6);
        divisionRepository.save(division7);

        memberRepository.save(member1);
        memberRepository.save(member2);
        memberRepository.save(member3);
        memberRepository.save(member4);
        memberRepository.save(member5);
        memberRepository.save(member6);
        memberRepository.save(member7);

        System.out.println("Loading data complete.");

    }


}
