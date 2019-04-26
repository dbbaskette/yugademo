package org.dbbaskette.yugademo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Table(value = "users")
public class User implements Serializable {
    @PrimaryKey("user_id") private Long id;
    @Column("uname") private String username;
    @Column("fname") private String firstname;
    @Column("lname") private String lastname;
}
