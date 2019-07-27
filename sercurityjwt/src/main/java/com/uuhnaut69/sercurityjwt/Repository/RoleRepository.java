package com.uuhnaut69.sercurityjwt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uuhnaut69.sercurityjwt.Entity.Role;
import com.uuhnaut69.sercurityjwt.Entity.RoleName;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(RoleName roleName);
}