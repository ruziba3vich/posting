package com.prodonik.posting.models;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class User implements UserDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true) // Ensure uniqueness of usernames
    private String username;
    
    private String password;
    
    // Define user roles/authorities
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "user_authorities", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "authority")
    private Collection<String> authorities;
    
    // Other user-related fields (if any)
    
    // Implement UserDetails methods
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Convert authorities to GrantedAuthority objects
        // Example: return authorities.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    // Other UserDetails methods
    
    @Override
    public boolean isAccountNonExpired() {
        return true; // You can implement custom logic if account expiration is needed
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // You can implement custom logic if account locking is needed
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // You can implement custom logic if credentials expiration is needed
    }

    @Override
    public boolean isEnabled() {
        return true; // You can implement custom logic if account enablement is needed
    }
}
