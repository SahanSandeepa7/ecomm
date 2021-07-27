package com.sawastha.ecomm.Repository;

import com.sawastha.ecomm.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User, Integer> {

}
