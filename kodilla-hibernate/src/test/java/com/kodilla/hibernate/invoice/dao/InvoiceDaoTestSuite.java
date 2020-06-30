package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product apple = new Product("APPLE");
        Product orange = new Product("ORANGE");
        Product banana = new Product("BANANA");

        Item item1 = new Item(apple,new BigDecimal(5),2);
        Item item2 = new Item(apple,new BigDecimal(7),5);
        Item item3 = new Item(orange, new BigDecimal(1),5);
        Item item4 = new Item(banana,new BigDecimal(6),8);

        apple.getItems().add(item1);
        apple.getItems().add(item2);
        orange.getItems().add(item3);
        banana.getItems().add(item4);
        item1.setProduct(apple);
        item2.setProduct(apple);
        item3.setProduct(orange);
        item4.setProduct(banana);

        Invoice invoice = new Invoice("1");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0,id);

        //CleanUp
        try{
            invoiceDao.deleteById(id);
        } catch (Exception e) {

        }
    }
}
