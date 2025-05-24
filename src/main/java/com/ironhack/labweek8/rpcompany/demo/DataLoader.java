package com.ironhack.labweek8.rpcompany.demo;

import com.ironhack.labweek8.rpcompany.model.Contact;
import com.ironhack.labweek8.rpcompany.model.Name;
import com.ironhack.labweek8.rpcompany.repository.ContactRepository;
import com.ironhack.labweek8.rpcompany.repository.NameRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static com.ironhack.labweek8.rpcompany.model.enums.NameSalutation.MR;
import static com.ironhack.labweek8.rpcompany.model.enums.NameSalutation.MRS;

@Component
public class DataLoader implements CommandLineRunner {

    private final ContactRepository contactRepository;
    private final NameRepository nameRepository;

    public DataLoader(ContactRepository contactRepository, NameRepository nameRepository) {
        this.contactRepository = contactRepository;
        this.nameRepository = nameRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        var name1 = new Name("Jean","Hubert","Delacourt", MR);
        var name2 = new Name("Louis","Herve","Maure",MR);
        var name3 = new Name("Alice","Gertrude","Marceau",MRS);

        var contact1 = new Contact("pfizer","Mr",name1);
        var contact2 = new Contact("pfizer","Mr", name2);
        var contact3 = new Contact("pfizer","Mrs",name3);

        nameRepository.save(name1);
        nameRepository.save(name2);
        nameRepository.save(name3);

        contactRepository.save(contact1);
        contactRepository.save(contact2);
        contactRepository.save(contact3);

        System.out.println("Loading data complete.");

    }


}
