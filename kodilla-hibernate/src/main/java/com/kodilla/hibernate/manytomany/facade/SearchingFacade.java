package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchingFacade {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

    public List<Employee> searchForEmployee(String lastName) {
        LOGGER.info("Searching for employees...");
        List<Employee> employees = employeeDao.searchByLastNameFragment(lastName);
        if (employees.size() > 0) {
            LOGGER.info("Employees that match searching criteria:");
        } else {
            LOGGER.error(SearchingException.ERR_EMPTY_TABLE);
        }
        return employees;
    }

    public List<Company> searchForCompanies(String name) {
        LOGGER.info("Searching for companies...");
        List<Company> companies = companyDao.searchByCompanyNameFragment(name);
        if (companies.size() > 0) {
            LOGGER.info("Companies that match searching criteria:");
        } else {
            LOGGER.error(SearchingException.ERR_EMPTY_TABLE);
        }
        return companies;
    }

}
