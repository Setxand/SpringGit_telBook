package telephoneBook.telephone.book.entities;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Artem on 10/21/2017.
 */

@Entity
@Table(name = "telephonebook")
public class TelephoneBook {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "telephone_number")
    private String telephoneNumber;
    @Column(name = "date_birthday")
    @Temporal(TemporalType.DATE)
    private Date dateBirthday;
    @Column(name = "sex")
    private String sex;

    public TelephoneBook(String name, String lastName, String telephoneNumber, Date dateBirthday, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.dateBirthday = dateBirthday;
        this.sex = sex;
    }
    public TelephoneBook(){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public Date getDateBirthday() {
        return dateBirthday;
    }

    public String getSex() {
        return sex;
    }
}
