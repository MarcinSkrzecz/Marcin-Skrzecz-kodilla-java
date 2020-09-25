package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
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
        System.out.println(searchingFacade);
        System.out.println(employeeDao);
        System.out.println(companyDao);
        //Given
        Employee A = new Employee("AAA", "BBB");
        Employee B = new Employee("EEE", "BBB");
        Employee C = new Employee("RRR", "DDD");

        employeeDao.save(A);
        employeeDao.save(B);
        employeeDao.save(C);

        int IdA = A.getId();
        int IdB = B.getId();
        int IdC = C.getId();

        //When
        List<Employee> employeesWithFragmentLastName = searchingFacade.searchForEmployee("BBB");

        //Then
        Assert.assertEquals(2, employeesWithFragmentLastName.size());

        //CleanUp
        try {
            employeeDao.deleteById(IdA);
            employeeDao.deleteById(IdB);
            employeeDao.deleteById(IdC);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Test
    public void testSearchForCompany() {
        //Given
        Company A = new Company("AAA_BBB_CCC");
        Company B = new Company("BBB_CCC_DDD");
        Company C = new Company("CCC_DDD_EEE");

        companyDao.save(A);
        companyDao.save(B);
        companyDao.save(C);

        int IdA = A.getId();
        int IdB = B.getId();
        int IdC = C.getId();

        //When
        List<Company> companiesWithFragmentName = searchingFacade.searchForCompanies("BBB");

        //Then
        Assert.assertEquals(2, companiesWithFragmentName.size());

        //CleanUp
        try {
            companyDao.deleteById(IdA);
            companyDao.deleteById(IdB);
            companyDao.deleteById(IdC);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
