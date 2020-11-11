/*
 * Copyright (c) 2020 SuperMock contributors
 * This program is made available under the terms of the MIT License.
 */
package br.com.supermock.nestedinstantiatingfields;

import java.util.List;

public class SampleObject1
{
    public SampleObject1       sampleObject1;
    public List<SampleObject1> sampleObjects1;
    public SampleObject2       sampleObject2;
    public List<SampleObject2> sampleObjects2;
}
