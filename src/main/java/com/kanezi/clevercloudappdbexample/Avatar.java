package com.kanezi.clevercloudappdbexample;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "avatars")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Avatar {
    @Id
    String name;
    String url;
}
