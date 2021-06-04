package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.LinkType;

public interface LinkTypeDao extends JpaRepository<LinkType, Integer>{

}
