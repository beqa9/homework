package com.example.shop.security;

import com.example.shop.entities.User;
import com.example.shop.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

@RequiredArgsConstructor
public class UserManager implements UserDetailsService {

    private final UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = usersRepository.findAllByUsername(username);
        if (user.isEmpty()){
            throw new RuntimeException("User %s not found".formatted(username));
        }
        return user.get();
    }

    public static User getCurrentUser(){
        var auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null || auth.getPrincipal() == null) {
            throw new RuntimeException("auth needed");
        }
        if (auth.getPrincipal() instanceof User user){
            return user;
        }
        throw new RuntimeException("Anonymus");
    }
}
