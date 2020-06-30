package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0,softwareMachineId);
        Assert.assertNotEquals(0,dataMaestersId);
        Assert.assertNotEquals(0,greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testQueryEmployeeLastname() {
        //Given
        Employee e1 = new Employee("AAA", "BBB");
        Employee e2 = new Employee("CCC", "DDD");
        Employee e3 = new Employee("EEE", "BBB");

        //When
        employeeDao.save(e1);
        int employeeE1Id = e1.getId();
        employeeDao.save(e2);
        int employeeE2Id = e2.getId();
        employeeDao.save(e3);
        int employeeE3Id = e3.getId();
        List<Employee> lastnameBBB = employeeDao.searchByLastname("BBB");

        //Then
        Assert.assertEquals(2,lastnameBBB.size());

        //CleanUp
        try {
            employeeDao.deleteById(employeeE1Id);
            employeeDao.deleteById(employeeE2Id);
            employeeDao.deleteById(employeeE3Id);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testQueryCompanyFirst3Signs() {
        //Given
        Company c1 = new Company("ABC_Company");
        Company c2 = new Company("ABC_Company2");
        Company c3 = new Company("ABC_Company3");
        Company c4 = new Company("ABD_Company");
        Company c5 = new Company("ABE_Company");

        //When
        companyDao.save(c1);
        int company1 = c1.getId();
        companyDao.save(c2);
        int company2 = c2.getId();
        companyDao.save(c3);
        int company3 = c3.getId();
        companyDao.save(c4);
        int company4 = c4.getId();
        companyDao.save(c5);
        int company5 = c5.getId();
        List<Company> first3Signs = companyDao.SearchByCompanyFirst3Signs("ABC");

        //Then
        Assert.assertEquals(3,first3Signs.size());

        //CleanUp
        try {
            companyDao.deleteById(company1);
            companyDao.deleteById(company2);
            companyDao.deleteById(company3);
            companyDao.deleteById(company4);
            companyDao.deleteById(company5);
        } catch (Exception e) {
            //do nothing
        }

    }
}
