package com.Ecommerces.TcFootwear.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String address;

    @Column( name = "phoneNumber", nullable = false)
    private String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
    }

    public void setAddress(String address) {
    }

    public void setName(String name) {
    }

    public void setEmail(String email) {
    }

}
