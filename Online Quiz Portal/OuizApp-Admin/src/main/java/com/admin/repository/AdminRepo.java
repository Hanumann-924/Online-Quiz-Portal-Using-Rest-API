package com.admin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.admin.model.AdminDetails;
@Repository
public interface AdminRepo extends JpaRepository<AdminDetails, Long> {
	
	@Query(value = "select * from admin_details where auname = ?", nativeQuery = true)
	public AdminDetails findByAuname(String uname);
}
