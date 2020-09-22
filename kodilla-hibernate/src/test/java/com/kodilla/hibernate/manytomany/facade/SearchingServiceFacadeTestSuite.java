package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SearchingServiceFacadeTestSuite {
    @Autowired
    private SearchingFacade searchingFacade;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void testSearchForEmployeeLastName() {
        //Given
        Employee A = new Employee("AAA", "BBB");
        Employee B = new Employee("EEE", "BBB");
        Employee C = new Employee("RRR", "DDD");

        int IdA = A.getId();
        int IdB = B.getId();
        int IdC = C.getId();

        employeeDao.save(A);
        employeeDao.save(B);
        employeeDao.save(C);

        //When
        List<Employee> employeesWithFragmentLastName = searchingFacade.searchForEmployee("BBB");

        //Then
        Assert.assertEquals(2, employeesWithFragmentLastName.size());

        //CleanUp
        companyDao.deleteById(IdA);
        companyDao.deleteById(IdB);
        companyDao.deleteById(IdC);
    }

    @Test
    public void testSearchForCompany() {
        //Given
        Company A = new Company("AAA_BBB_CCC");
        Company B = new Company("BBB_CCC_DDD");
        Company C = new Company("CCC_DDD_EEE");

        int IdA = A.getId();
        int IdB = B.getId();
        int IdC = C.getId();

        companyDao.save(A);
        companyDao.save(B);
        companyDao.save(C);

        //When
        List<Company> companiesWithFragmentName = searchingFacade.searchForCompanies("BBB");

        //Then
        Assert.assertEquals(2, companiesWithFragmentName.size());

        //CleanUp
        companyDao.deleteById(IdA);
        companyDao.deleteById(IdB);
        companyDao.deleteById(IdC);
    }
}
