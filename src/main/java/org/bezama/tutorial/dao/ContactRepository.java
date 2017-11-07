package org.bezama.tutorial.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.bezama.tutorial.entities.Contact;
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
