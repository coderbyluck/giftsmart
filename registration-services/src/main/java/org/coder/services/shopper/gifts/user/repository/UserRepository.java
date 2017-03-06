package org.coder.services.shopper.gifts.user.repository;

import org.coder.services.shopper.gifts.user.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by coderbyluck on 3/4/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
