/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

class SimpleMath {
    private Double num_1;
    private Double num_2;

    public SimpleMath(String num_1, String num_2) {
        this.num_1 = Double.parseDouble(num_1);
        this.num_2 = Double.parseDouble(num_2);
    }

    public Double add() {
        return this.num_1 + this.num_2;
    }

    public Double subtract() {
        return this.num_1 - this.num_2;
    }

    public Double multiply() {
        return this.num_1 * this.num_2;
    }

    public Double divide() {
        return this.num_1 / this.num_2;
    }
}
