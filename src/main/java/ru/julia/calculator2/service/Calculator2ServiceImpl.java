package ru.julia.calculator2.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator2ServiceImpl implements Calculator2Service {
    @Override
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(int num1, int num2) {
        return Integer.toString(num1) + " + " + Integer.toString(num2) + " = " + Integer.toString(num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return Integer.toString(num1) + " - " + Integer.toString(num2) + " = " + Integer.toString(num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return Integer.toString(num1) + " * " + Integer.toString(num2) + " = " + Integer.toString(num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Делить на ноль нельзя");
        }
        return Integer.toString(num1) + " / " + Integer.toString(num2) + " = " + Integer.toString(num1 / num2);
    }
}
