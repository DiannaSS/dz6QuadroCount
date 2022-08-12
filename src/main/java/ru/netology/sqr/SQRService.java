package ru.netology.sqr;

public class SQRService {

    public int CountQuadroService(int start, int finish) {
        for (int i = 11; i < 99; i++) {
            int num = i * i;
            int CountQuadro = 0;
            if (num >= start) {
                if (num <= finish) {
                    CountQuadro++;
                }
            }
            System.out.println(CountQuadro);
            return CountQuadro;
        }
            }

