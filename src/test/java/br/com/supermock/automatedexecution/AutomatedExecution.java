/*
 * Copyright (c) 2020 SuperMock contributors
 * This program is made available under the terms of the MIT License.
 */
package br.com.supermock.automatedexecution;

public class AutomatedExecution
{
    private int counter;

    public void add1(int value)
    {
        counter += value;
    }

    public void add2(int value)
    {
        counter += (value * 2);
    }

    public int getCounter()
    {
        return counter;
    }
}
