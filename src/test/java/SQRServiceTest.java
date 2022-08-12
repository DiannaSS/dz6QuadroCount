package ru.netology.javaqa.javaqamvn.services;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @test
    public void SQRServiceTest() {
        SQRService service = new SQRService();
        int actual = service.CountQuadroService(200, 300);
        int expected = 3;

        //assertEquals(expected, actual);
        Assertions(expected, actual);


    }
};

