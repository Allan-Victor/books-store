package com.thinkconstructive.book_store.config;

import com.thinkconstructive.book_store.model.SecurityUser;
import com.thinkconstructive.book_store.model.UserInfo;
import com.thinkconstructive.book_store.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SecurityUserDetailsService implements UserDetailsService {

    private final UserInfoRepository userInfoRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = userInfoRepository.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User name not found"));

        return new SecurityUser(userInfo);


    }
}
