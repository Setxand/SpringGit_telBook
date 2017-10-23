package telephoneBook.telephone.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telephoneBook.telephone.book.entities.TelephoneBook;
import telephoneBook.telephone.book.repository.TelephoneBookRepository;

import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;

/**
 * Created by Artem on 10/21/2017.
 */
@Service
public class TelephoneBookServiceImpl implements TelephoneBookService {
    @Autowired
    TelephoneBookRepository telephoneBookRepository;

    @Override
    public Collection<TelephoneBook> findAll() {
        return this.telephoneBookRepository.findAll();
    }

    @Override
    public void insert() {

    }

    @Override
    public Collection<TelephoneBook> getByName(String name) {
        return this.telephoneBookRepository.findByName(name);
    }

    @Override
    public Collection<TelephoneBook> getBySex(String sex) {
        return this.telephoneBookRepository.findBySex(sex);
    }

    @Override
    public Collection<TelephoneBook> getElder18() {
        return this.telephoneBookRepository.findByYearMoreThen18((new GregorianCalendar().get(Calendar.YEAR) - 18) );
    }

    @Override
    public void updateRecord(Long id) {

    }

    @Override
    public void deleteRecord(Long id) {

    }
}
