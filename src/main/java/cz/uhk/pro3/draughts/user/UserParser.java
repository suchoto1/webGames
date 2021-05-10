package cz.uhk.pro3.draughts.user;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public class UserParser {

    // For testing purposes only
    public static List<UserDetails> getUserDetailsAsList() {

        return List.of(User.withUsername("admin").password("test").roles("ADMIN").build(),User.withUsername("test").password("test").roles("USER").build());

    }

}
