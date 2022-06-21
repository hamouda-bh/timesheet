package tn.esprit.spring.services;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Employe;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceImplTest {

    @Autowired
    private IEmployeService employeService;

    @Test
    public void testGetAllEmployes(){
        List<Employe> employees = employeService.getAllEmployes();
        Assertions.assertThat(employees.size()).isEqualTo(0);
    }

}
