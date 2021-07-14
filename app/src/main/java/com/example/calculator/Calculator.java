package com.example.calculator;

public class Calculator {
    private double OperandOne ,OperandTwo;
    private String Operation;
    public Calculator(){

    }
    public Calculator(double operandOne, double operandTwo, String operation) {
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


    public void setOperandTwo(double operandTwo) {
        OperandTwo = operandTwo;
    }

    public String getOperation() {
        return Operation;
    }

    public void setOperation(String operation) {
        Operation = operation;
    }

    public double performOperation() {

        if(this.getOperation() == "+") {
            return this.getOperandOne() + this.OperandTwo;
        }
        else if(this.getOperation() == "-") {
            return this.getOperandOne() - this.OperandTwo;
        }
        else {
            return 0;
        }
    }

    public String getResults() {
        return String.valueOf(this.OperandOne)+ this.OperandTwo +this.performOperation();

    }


}

