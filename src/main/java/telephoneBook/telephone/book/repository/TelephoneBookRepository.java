package telephoneBook.telephone.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import telephoneBook.telephone.book.entities.TelephoneBook;

import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;

/**
 * Created by Artem on 10/21/2017.
 */
public interface TelephoneBookRepository extends JpaRepository<TelephoneBook,Long> {
    Collection<TelephoneBook>findByName(String name);
    Collection<TelephoneBook>findBySex(String sex);

    @Query("Select c from TelephoneBook c where year(c.dateBirthday)< :year")
    Collection<TelephoneBook>findByYearMoreThen18(@Param("year")int year);
}
