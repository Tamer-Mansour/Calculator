package com.example.calculator;

import java.util.ArrayList;

public class Calculator2 {
    private ArrayList<Double> number = new ArrayList<Double>();
    private ArrayList<String> mathSign = new ArrayList<String>();
    private double final_result = 0;

    public void performOperation(double num) {
        number.add(num);
    }

    public void performOperation(String mS) {
        double first_result = 0;

        if (mS != "=") {
            this.mathSign.add(mS);
        } else {
            int i = 0;
            while (this.mathSign.contains("*") || this.mathSign.contains("/")) {
                if (this.mathSign.get(i) == "*") {
                    first_result = this.number.get(i) * this.number.get(i+1);

                    this.number.set(i, first_result);
                    this.number.remove(i + 1);
                    this.mathSign.remove(i);

                    i = i - 1;
                } else if (this.mathSign.get(i) == "/") {
                    first_result = this.number.get(i) / this.number.get(i+1);
                    this.number.set(i, first_result);
                    this.number.remove(i + 1);
                    this.mathSign.remove(i);

                    i = i - 1;
                }
                i++;
            }
            this.final_result = this.number.get(0);

            for (i = 0; i < this.mathSign.size(); i++) {
                if (this.mathSign.get(i) == "+") {
                    this.final_result += this.number.get(i + 1);
                } else if (this.mathSign.get(i) == "-") {
                    first_result -= this.number.get(i + 1);
                }
            }
        }
    }

    public String getResults() {
        return String.valueOf(this.final_result);
    }


}
