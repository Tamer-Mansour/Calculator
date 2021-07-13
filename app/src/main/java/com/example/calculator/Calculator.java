package com.example.calculator;

public class Calculator {
    private double OperandOne ,OperandTwo;
    private char Operation;

    public Calculator(double operandOne, double operandTwo, char operation) {
        OperandOne = operandOne;
        OperandTwo = operandTwo;
        Operation = operation;
    }

    public double getOperandOne() {
        return OperandOne;
    }

    public void setOperandOne(double operandOne) {
        OperandOne =operandOne;
    }

    public double getOperandTwo() {
        return OperandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        OperandTwo = operandTwo;
    }

    public char getOperation() {
        return Operation;
    }

    public void setOperation(char operation) {
        Operation = operation;
    }

    public double performOperation() {

        if(this.getOperation() == '+') {
            return this.getOperandOne() + this.OperandTwo;
        }
        else if(this.getOperation() == '-') {
            return this.getOperandOne() - this.OperandTwo;
        }
        else {
            return 0;
        }
    }


    public String getResults() {
        return String.format(String.valueOf(this.OperandOne), this.OperandTwo ,this.performOperation());

    }


}

