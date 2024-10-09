package com.example.task03;

public class ComplexNumber
{
    private double real;
    private double image;
    public ComplexNumber(double real, double image)
    {
        this.real = real;
        this.image = image;
    }

    public double getReal()
    {
        return real;
    }

    public void setReal(double real)
    {
        this.real = real;
    }

    public double getImag()
    {
        return image;
    }

    public void setImag(double image)
    {
        this.image = image;
    }

    public ComplexNumber add(ComplexNumber complexNum)
    {
        double newReal = this.real + complexNum.getReal();
        double newImag = this.image + complexNum.getImag();

        return new ComplexNumber(newReal, newImag);
    }

    public ComplexNumber multiply(ComplexNumber complexNum)
    {
        double newReal = real * complexNum.getReal() - image * complexNum.getImag();
        double newImag = real * complexNum.getImag() + image * complexNum.getReal();

        return new ComplexNumber(newReal, newImag);
    }

    public String toString()
    {
        return real + " + " + image + "i";
    }
}