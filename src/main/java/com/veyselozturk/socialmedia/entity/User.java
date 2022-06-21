package com.veyselozturk.socialmedia.entity;

import lombok.Data;

import javax.persistence.*;
import java.lang.annotation.Documented;

@Data
@Entity //(jpa) spesificasyonları implement eden hybernate diye bir library kullanıyoruz. hibernate referance ımplementansyon. hybernate bızım java objelerımızle onlara karsılık gelen databasedekı tablolar arasındakı ılıskıyı saglar.
@Table(name = "veysel")

public class User {

    @Id // primary key oldugunu söylüyoruz.
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // Id nasıl üretilecek
    private Long id;
    private String username;
    private String displayName;
    private String password;


}
