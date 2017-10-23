package telephoneBook.telephone.book.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import telephoneBook.telephone.book.entities.TelephoneBook;
import telephoneBook.telephone.book.repository.TelephoneBookRepository;
import telephoneBook.telephone.book.service.TelephoneBookService;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * Created by Artem on 10/21/2017.
 */
@RestController
@RequestMapping("/TelephoneBook")
public class TelephoneBookRestControllerImpl implements TelephoneBookRestController {
    @Autowired
    TelephoneBookService telephoneBookService;


    @RequestMapping(value = "/all_records",method = RequestMethod.GET)
    @Override
    public Collection<TelephoneBook> findAll() {
        return this.telephoneBookService.findAll();
    }

    @Override
    public void insert() {

    }


    @RequestMapping(value = "/Records_by_name/{name}", method = RequestMethod.GET)
    @Override
    public Collection<TelephoneBook> getByName(@PathVariable String name) {
        return this.telephoneBookService.getByName(name);
    }


    @RequestMapping(value = "/Records_by_sex/{sex}", method = RequestMethod.GET)
    @Override
    public Collection<TelephoneBook> getBySex(@PathVariable String sex) {
        return this.telephoneBookService.getBySex(sex);
    }
    @RequestMapping(value = "/elder_then_18_years_old", method = RequestMethod.GET)
    @Override
    public Collection<TelephoneBook> getElder18() {
        return this.telephoneBookService.getElder18();
    }

    @Override
    public void updateRecord(Long id) {

    }

    @Override
    public void deleteRecord(Long id) {

    }
}
