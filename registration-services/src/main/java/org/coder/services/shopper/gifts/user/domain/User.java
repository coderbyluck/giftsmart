package org.coder.services.shopper.gifts.user.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by coderbyluck on 3/4/17.
 */

@Data
public class User {

    private String firstName;
    private String lastName;
    private String middleName;

    private Date dateOfBirth;
    private GenderEnum gender;

    private String email;

    private Phone mobileNumber;
    private Phone telephoneNumber;

    private Address homeAddress;

    @Id
    private String id;

    private String userId;


}
