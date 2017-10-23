package telephoneBook.telephone.book.controllers;

import telephoneBook.telephone.book.entities.TelephoneBook;

import java.util.Collection;

/**
 * Created by Artem on 10/21/2017.
 */
public interface TelephoneBookRestController {
    public Collection<TelephoneBook>findAll();
    public void insert();
    public Collection<TelephoneBook> getByName(String name);
    public Collection<TelephoneBook> getBySex(String sex);
    public Collection<TelephoneBook> getElder18();
    public void updateRecord(Long id);
    public void deleteRecord(Long id);
}
