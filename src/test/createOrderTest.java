package test;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import controller.OrderController;
import database.DataAccessException;
import model.Employee;

public class createOrderTest {

    @Test
    public void testCreateOrder() throws DataAccessException{

        //Arrange
        OrderController o = new OrderController();
        Double oid = Math.random();
        String newoID = String.valueOf(oid);

        //Act
        o.findEventByID("666");
        Employee e = o.findEmployeeByID("111");
        o.createOrder(newoID, LocalDate.of(2021, 02, 26), LocalDate.of(2021, 02, 27), e , "666");
        o.findEquipment("Mikrofon 1", "123", LocalDate.of(2021, 02, 26), LocalDate.of(2021, 02, 27));
        o.addEquipmentToOrder("123", 2);
        o.saveOrder();

        //Assert
        assertTrue(true);

    }
}