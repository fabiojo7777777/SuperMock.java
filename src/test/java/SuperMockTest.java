import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSequentialList;
import java.util.AbstractSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatedexecution.AutomatedExecution;
import mockingassignableclasses.Class1;
import mockingassignableclasses.Class2;
import mockingassignableclasses.Class3;
import mockingmethod.SampleObject1;
import mockingnotallowed.FinalClass;
import mockingobjects.SampleEnum1;
import mockingobjects.SampleObject2;
import supermock.SuperMock;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SuperMockTest
{
    private SuperMock SUPER_MOCK;

    @Before
    public void antesDeCadaTeste()
    {
        SUPER_MOCK = new SuperMock();
    }

    @Test
    public void mockingPrimitivesAndWrappers()
    {
        Assert.assertNotNull(SUPER_MOCK.getMock(SampleEnum1.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(Boolean.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(boolean.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(Character.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(char.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(String.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(byte.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(short.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(int.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(long.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(float.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(double.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(Byte.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(Short.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(Integer.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(Long.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(Float.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(Double.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(BigDecimal.class));
        Assert.assertNotNull(SUPER_MOCK.getMock(BigInteger.class));

        Assert.assertEquals(SampleEnum1.FIRST_VALUE, SUPER_MOCK.getMock(SampleEnum1.class));
        Assert.assertEquals(Boolean.FALSE, SUPER_MOCK.getMock(Boolean.class));
        Assert.assertEquals(Boolean.FALSE, SUPER_MOCK.getMock(boolean.class));
        Assert.assertEquals(Character.valueOf(' '), SUPER_MOCK.getMock(Character.class));
        Assert.assertEquals(Character.valueOf(' '), SUPER_MOCK.getMock(char.class));
        Assert.assertEquals("", SUPER_MOCK.getMock(String.class));
        Assert.assertEquals(Byte.valueOf((byte) 0), SUPER_MOCK.getMock(byte.class));
        Assert.assertEquals(Short.valueOf((short) 0), SUPER_MOCK.getMock(short.class));
        Assert.assertEquals(Integer.valueOf((int) 0), SUPER_MOCK.getMock(int.class));
        Assert.assertEquals(Long.valueOf((long) 0), SUPER_MOCK.getMock(long.class));
        Assert.assertEquals(Float.valueOf(0f), SUPER_MOCK.getMock(float.class));
        Assert.assertEquals(Double.valueOf(0d), SUPER_MOCK.getMock(double.class));
        Assert.assertEquals(Byte.valueOf((byte) 0), SUPER_MOCK.getMock(Byte.class));
        Assert.assertEquals(Short.valueOf((short) 0), SUPER_MOCK.getMock(Short.class));
        Assert.assertEquals(Integer.valueOf((int) 0), SUPER_MOCK.getMock(Integer.class));
        Assert.assertEquals(Long.valueOf((long) 0), SUPER_MOCK.getMock(Long.class));
        Assert.assertEquals(Float.valueOf(0f), SUPER_MOCK.getMock(Float.class));
        Assert.assertEquals(Double.valueOf(0d), SUPER_MOCK.getMock(Double.class));
        Assert.assertEquals(BigDecimal.valueOf(0d), SUPER_MOCK.getMock(BigDecimal.class));
        Assert.assertEquals(BigInteger.valueOf(0), SUPER_MOCK.getMock(BigInteger.class));
    }

    @Test
    public void mockingCollections()
    {
        final List<Class<?>> collectionAbstractions = new ArrayList<Class<?>>();
        collectionAbstractions.add(Collection.class);
        collectionAbstractions.add(Set.class);
        collectionAbstractions.add(List.class);
        collectionAbstractions.add(Queue.class);
        collectionAbstractions.add(Deque.class);
        collectionAbstractions.add(Map.class);
        collectionAbstractions.add(SortedSet.class);
        collectionAbstractions.add(SortedMap.class);
        collectionAbstractions.add(NavigableSet.class);
        collectionAbstractions.add(NavigableMap.class);
        collectionAbstractions.add(BlockingQueue.class);
        collectionAbstractions.add(BlockingDeque.class);
        collectionAbstractions.add(ConcurrentMap.class);
        collectionAbstractions.add(ConcurrentNavigableMap.class);
        collectionAbstractions.add(EnumSet.class);
        collectionAbstractions.add(AbstractCollection.class);
        collectionAbstractions.add(AbstractSet.class);
        collectionAbstractions.add(AbstractList.class);
        collectionAbstractions.add(AbstractSequentialList.class);
        collectionAbstractions.add(AbstractQueue.class);
        collectionAbstractions.add(AbstractMap.class);
        collectionAbstractions.add(Iterator.class);
        collectionAbstractions.add(ListIterator.class);
        collectionAbstractions.add(Comparable.class);
        collectionAbstractions.add(Comparator.class);
        collectionAbstractions.add(RandomAccess.class);

        final List<Class<?>> collectionImplementations = new ArrayList<Class<?>>();
        collectionImplementations.add(HashSet.class);
        collectionImplementations.add(TreeSet.class);
        collectionImplementations.add(LinkedHashSet.class);
        collectionImplementations.add(ArrayList.class);
        collectionImplementations.add(ArrayDeque.class);
        collectionImplementations.add(LinkedList.class);
        collectionImplementations.add(PriorityQueue.class);
        collectionImplementations.add(HashMap.class);
        collectionImplementations.add(TreeMap.class);
        collectionImplementations.add(LinkedHashMap.class);
        collectionImplementations.add(Vector.class);
        collectionImplementations.add(Hashtable.class);
        collectionImplementations.add(WeakHashMap.class);
        collectionImplementations.add(IdentityHashMap.class);
        collectionImplementations.add(CopyOnWriteArrayList.class);
        collectionImplementations.add(CopyOnWriteArraySet.class);
        collectionImplementations.add(EnumMap.class);
        collectionImplementations.add(ConcurrentLinkedQueue.class);
        collectionImplementations.add(LinkedBlockingQueue.class);
        collectionImplementations.add(ArrayBlockingQueue.class);
        collectionImplementations.add(PriorityBlockingQueue.class);
        collectionImplementations.add(DelayQueue.class);
        collectionImplementations.add(SynchronousQueue.class);
        collectionImplementations.add(LinkedBlockingDeque.class);
        collectionImplementations.add(ConcurrentHashMap.class);
        collectionImplementations.add(ConcurrentSkipListSet.class);
        collectionImplementations.add(ConcurrentSkipListMap.class);

        for (Class<?> implementation : collectionImplementations)
        {
            testMockedCollection(implementation);
        }

        for (Class<?> abstraction : collectionAbstractions)
        {
            if (abstraction == ListIterator.class ||
                    abstraction == Comparator.class ||
                    abstraction == RandomAccess.class)
            {
                Assert.assertNull(SUPER_MOCK.getMock(abstraction));
            }
            else
            {
                testMockedCollection(abstraction);
            }
        }
    }

    private void testMockedCollection(Class<?> collectionClazz)
    {
        Object mock = SUPER_MOCK.getMock(collectionClazz);
        Assert.assertNotNull(mock);
        Assert.assertTrue(collectionClazz.isAssignableFrom(mock.getClass()));
        if (collectionClazz != Comparable.class)
        {
            Assert.assertTrue(mock.getClass().getCanonicalName().startsWith("java"));
            testCollectionSize(mock);
        }
    }

    private void testCollectionSize(Object mock)
    {
        if (mock instanceof SynchronousQueue)
        {
            Assert.assertEquals(0, ((Collection<?>) mock).size());
        }
        else if (mock instanceof EnumMap)
        {
            Assert.assertEquals(10, ((Map<?, ?>) mock).size());
        }
        else if (mock instanceof EnumSet)
        {
            Assert.assertEquals(10, ((Collection<?>) mock).size());
        }
        else if (mock instanceof Collection)
        {
            Assert.assertEquals(10, ((Collection<?>) mock).size());
        }
        else if (mock instanceof Map)
        {
            Assert.assertEquals(10, ((Map<?, ?>) mock).size());
        }
        else if (mock instanceof Iterator)
        {
            for (int i = 0; i < 10; i++)
            {
                Assert.assertNotNull(((Iterator<?>) mock).next());
            }
        }
        else
        {
            throw new IllegalStateException("Collection não prevista no teste");
        }
    }

    @Test
    public void mockingNestedObjectAndList()
    {
        mockingobjects.SampleObject1 sampleObject1 = SUPER_MOCK.getMock(mockingobjects.SampleObject1.class);
        Assert.assertEquals(Boolean.FALSE, sampleObject1.BooleanField);
        Assert.assertEquals(false, sampleObject1.booleanField);
        Assert.assertEquals(Character.valueOf(' '), sampleObject1.CharacterField);
        Assert.assertEquals(' ', sampleObject1.charField);
        Assert.assertEquals("", sampleObject1.StringField);
        Assert.assertEquals((byte) 0, sampleObject1.byteField);
        Assert.assertEquals((short) 0, sampleObject1.shortField);
        Assert.assertEquals((int) 0, sampleObject1.intField);
        Assert.assertEquals((long) 0, sampleObject1.longField);
        Assert.assertEquals(0f, sampleObject1.floatField, 0f);
        Assert.assertEquals(0d, sampleObject1.doubleField, 0d);
        Assert.assertEquals(Byte.valueOf((byte) 0), sampleObject1.ByteField);
        Assert.assertEquals(Short.valueOf((short) 0), sampleObject1.ShortField);
        Assert.assertEquals(Integer.valueOf((int) 0), sampleObject1.IntegerField);
        Assert.assertEquals(Long.valueOf((long) 0), sampleObject1.LongField);
        Assert.assertEquals(Float.valueOf(0f), sampleObject1.FloatField);
        Assert.assertEquals(Double.valueOf(0d), sampleObject1.DoubleField);
        Assert.assertEquals(BigDecimal.valueOf(0d), sampleObject1.BigDecimalField);
        Assert.assertEquals(BigInteger.valueOf(0), sampleObject1.BigIntegerField);

        Assert.assertNotNull(sampleObject1.sampleObject2);

        Assert.assertNotNull(sampleObject1.sampleObjects2);
        Assert.assertEquals(10, sampleObject1.sampleObjects2.size());
        Assert.assertNotNull(sampleObject1.sampleObjects2.get(0));
        Assert.assertNotNull(sampleObject1.sampleObjects3);
        Assert.assertEquals(10, sampleObject1.sampleObjects3.length);
        Assert.assertNotNull(sampleObject1.sampleObjects3[0]);
    }

    @Test
    public void mockingFields()
            throws Throwable
    {
        SampleObject2 sampleObject2 = new SampleObject2();
        SUPER_MOCK.setFieldMock("mockingobjects.SampleObject1.sampleObject2", sampleObject2);
        // mocking a superclass field
        SUPER_MOCK.setFieldMock("mockingobjects.SampleObject3.field", 8989);

        mockingobjects.SampleObject1 sampleObject1 = SUPER_MOCK.getRealInstanceWithNullFieldsMocked(mockingobjects.SampleObject1.class);
        Assert.assertEquals(sampleObject1.sampleObject2, sampleObject2);
        Assert.assertEquals(sampleObject1.getField(), 8989);
    }

    @Test
    public void mockingTypes()
    {
        List<SampleObject2> mockedList2   = new Vector<SampleObject2>();
        SampleObject2       mockedSample2 = new SampleObject2();
        SUPER_MOCK.setMock(SampleEnum1.class, SampleEnum1.THIRD_VALUE);
        SUPER_MOCK.setMock("java.util.List", mockedList2);
        SUPER_MOCK.setMock(SampleObject2.class, mockedSample2);
        SUPER_MOCK.setBooleanMock(true);
        SUPER_MOCK.setCharacterMock('a');
        SUPER_MOCK.setStringMock("b");
        SUPER_MOCK.setNumericMock(123);

        mockingobjects.SampleObject1 sampleObject1 = SUPER_MOCK.getMock(mockingobjects.SampleObject1.class);
        Assert.assertEquals(SampleEnum1.THIRD_VALUE, sampleObject1.sampleEnum1);
        Assert.assertEquals(Boolean.TRUE, sampleObject1.BooleanField);
        Assert.assertEquals(true, sampleObject1.booleanField);
        Assert.assertEquals(Character.valueOf('a'), sampleObject1.CharacterField);
        Assert.assertEquals('a', sampleObject1.charField);
        Assert.assertEquals("b", sampleObject1.StringField);
        Assert.assertEquals((byte) 123, sampleObject1.byteField);
        Assert.assertEquals((short) 123, sampleObject1.shortField);
        Assert.assertEquals((int) 123, sampleObject1.intField);
        Assert.assertEquals((long) 123, sampleObject1.longField);
        Assert.assertEquals(123f, sampleObject1.floatField, 0f);
        Assert.assertEquals(123d, sampleObject1.doubleField, 0d);
        Assert.assertEquals(Byte.valueOf((byte) 123), sampleObject1.ByteField);
        Assert.assertEquals(Short.valueOf((short) 123), sampleObject1.ShortField);
        Assert.assertEquals(Integer.valueOf((int) 123), sampleObject1.IntegerField);
        Assert.assertEquals(Long.valueOf((long) 123), sampleObject1.LongField);
        Assert.assertEquals(Float.valueOf(123f), sampleObject1.FloatField);
        Assert.assertEquals(Double.valueOf(123d), sampleObject1.DoubleField);
        Assert.assertEquals(BigDecimal.valueOf(123d), sampleObject1.BigDecimalField);
        Assert.assertEquals(BigInteger.valueOf(123), sampleObject1.BigIntegerField);

        Assert.assertEquals(mockedSample2, sampleObject1.sampleObject2);
        Assert.assertEquals(mockedList2, sampleObject1.sampleObjects2);
    }

    @Test
    public void mockingAssignableTypes1()
    {
        Class1 class1 = new Class1();
        SUPER_MOCK.setMock(Class1.class, class1);
        Assert.assertEquals(class1, SUPER_MOCK.getMock(Class1.class));
        Assert.assertEquals(class1, SUPER_MOCK.getMock(Class2.class));
        Assert.assertEquals(class1, SUPER_MOCK.getMock(Class3.class));
    }

    @Test
    public void mockingAssignableTypes2()
    {
        // a new configuration
        SUPER_MOCK = new SuperMock();
        Class1 class1A = new Class1();
        Class2 class2A = new Class2();
        SUPER_MOCK.setMock(Class2.class, class2A);
        SUPER_MOCK.setMock(Class1.class, class1A);
        Assert.assertEquals(class1A, SUPER_MOCK.getMock(Class1.class));
        Assert.assertEquals(class2A, SUPER_MOCK.getMock(Class2.class));
        Assert.assertEquals(class2A, SUPER_MOCK.getMock(Class3.class));

        // a new configuration
        SUPER_MOCK = new SuperMock();
        Class1 class1B = new Class1();
        Class2 class2B = new Class2();
        // setting mocks in reverse order than the previous test
        SUPER_MOCK.setMock(Class1.class, class1B);
        SUPER_MOCK.setMock(Class2.class, class2B);
        Assert.assertEquals(class1B, SUPER_MOCK.getMock(Class1.class));
        Assert.assertEquals(class2B, SUPER_MOCK.getMock(Class2.class));
        Assert.assertEquals(class2B, SUPER_MOCK.getMock(Class3.class));
    }

    @Test
    public void mockingNestedObjectAndListLooping()
    {
        nestedinstantiatingfields.SampleObject1 sampleObject1 = SUPER_MOCK.getMock(nestedinstantiatingfields.SampleObject1.class);
        // nested looping fields with null
        Assert.assertNotNull(sampleObject1.sampleObjects1);
        Assert.assertNotNull(sampleObject1.sampleObjects2);
        Assert.assertNull(sampleObject1.sampleObject1);
        Assert.assertNull(sampleObject1.sampleObject2.sampleObject1);
        Assert.assertNull(sampleObject1.sampleObject2.sampleObject2);
        Assert.assertNotNull(sampleObject1.sampleObject2.sampleObjects1);
        Assert.assertNull(sampleObject1.sampleObject2.sampleObjects1.get(0));
        Assert.assertNotNull(sampleObject1.sampleObject2.sampleObjects2);
        Assert.assertNull(sampleObject1.sampleObject2.sampleObjects2.get(0));

        Assert.assertNull(sampleObject1.sampleObjects1.get(0));
        Assert.assertNull(sampleObject1.sampleObjects2.get(0).sampleObject1);
    }

    @Test
    public void mockingObjectWithParameterizedMethodReturn1()
    {
        parameterizedmethodreturn1.ExecutorImpl prm = SUPER_MOCK.getMock(parameterizedmethodreturn1.ExecutorImpl.class);
        prm.execute(new parameterizedmethodreturn1.In());
        Assert.assertNotNull(prm.getIn());
        Assert.assertTrue(prm.getIn() instanceof parameterizedmethodreturn1.In);
        Assert.assertNotNull(prm.getOut());
        Assert.assertTrue(prm.getOut() instanceof parameterizedmethodreturn1.Out);
    }

    @Test
    public void mockingObjectWithParameterizedMethodReturn2()
    {
        parameterizedmethodreturn2.ExecutorImpl prm = SUPER_MOCK.getMock(parameterizedmethodreturn2.ExecutorImpl.class);
        Assert.assertNotNull(prm.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class));
        Assert.assertTrue(prm.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class) instanceof parameterizedmethodreturn2.Out);
    }

    @Test
    public void mockingObjectWithParameterizedMethodReturnCache1()
    {
        parameterizedmethodreturn1.ExecutorImpl prm1 = SUPER_MOCK.getMock(parameterizedmethodreturn1.ExecutorImpl.class);
        parameterizedmethodreturn1.ExecutorImpl prm2 = SUPER_MOCK.getMock(parameterizedmethodreturn1.ExecutorImpl.class);
        Assert.assertEquals(prm1.getIn(), prm1.getIn());
        Assert.assertEquals(prm1.getOut(), prm1.getOut());

        Assert.assertEquals(prm2.getIn(), prm2.getIn());
        Assert.assertEquals(prm2.getOut(), prm2.getOut());

        Assert.assertNotEquals(prm1.getIn(), prm2.getIn());
        Assert.assertNotEquals(prm1.getOut(), prm2.getOut());
    }

    @Test
    public void mockingObjectWithParameterizedMethodReturnCache2()
    {
        parameterizedmethodreturn2.ExecutorImpl prm1        = SUPER_MOCK.getMock(parameterizedmethodreturn2.ExecutorImpl.class);
        parameterizedmethodreturn2.ExecutorImpl prm2        = SUPER_MOCK.getMock(parameterizedmethodreturn2.ExecutorImpl.class);

        parameterizedmethodreturn2.Out          prm1GetOut1 = prm1.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);
        parameterizedmethodreturn2.Out          prm1GetOut2 = prm1.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);
        Assert.assertEquals(prm1GetOut1, prm1GetOut2);

        parameterizedmethodreturn2.Out prm2GetOut1 = prm2.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);
        parameterizedmethodreturn2.Out prm2GetOut2 = prm2.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);
        Assert.assertEquals(prm2GetOut1, prm2GetOut2);
    }

    @Test
    public void mockingMethodReturnWithSimpleMethodSignature1()
    {
        mockingmethod.SampleObject1 sampleMethodReturn = new mockingmethod.SampleObject1();
        SUPER_MOCK.setMethodReturnMock("mockingmethod.SampleObject1.getSampleObject1", sampleMethodReturn);
        mockingmethod.SampleObject1 sampleObject1 = SUPER_MOCK.getMock(mockingmethod.SampleObject1.class);
        Assert.assertEquals(sampleMethodReturn, sampleObject1.getSampleObject1(0, null));
    }

    @Test
    public void mockingMethodReturnWithSimpleMethodSignature2()
    {
        mockingmethod.SampleObject1 sampleMethodReturn1 = new mockingmethod.SampleObject1();
        mockingmethod.SampleObject1 sampleMethodReturn2 = new mockingmethod.SampleObject1();
        SUPER_MOCK.setMethodReturnMocks("mockingmethod.SampleObject1.getSampleObject1", new Object[] { sampleMethodReturn1, sampleMethodReturn2 });
        mockingmethod.SampleObject1 sampleObject1 = SUPER_MOCK.getMock(mockingmethod.SampleObject1.class);
        Assert.assertEquals(sampleMethodReturn1, sampleObject1.getSampleObject1(0, null));
        Assert.assertEquals(sampleMethodReturn2, sampleObject1.getSampleObject1(0, null));
        Assert.assertEquals(sampleMethodReturn2, sampleObject1.getSampleObject1(0, null));
    }

    @Test
    public void mockingMethodReturnWithCompleteMethodSignature1()
    {
        mockingmethod.SampleObject1 sampleMethodReturn = new mockingmethod.SampleObject1();
        SUPER_MOCK.setMethodReturnMock("mockingmethod.SampleObject1.getSampleObject1(int, java.lang.String)", sampleMethodReturn);
        mockingmethod.SampleObject1 sampleObject1 = SUPER_MOCK.getMock(mockingmethod.SampleObject1.class);
        Assert.assertEquals(sampleMethodReturn, sampleObject1.getSampleObject1(0, null));
    }

    @Test
    public void mockingMethodReturnWithCompleteMethodSignature2()
    {
        mockingmethod.SampleObject1 sampleMethodReturn1 = new mockingmethod.SampleObject1();
        mockingmethod.SampleObject1 sampleMethodReturn2 = new mockingmethod.SampleObject1();
        SUPER_MOCK.setMethodReturnMocks("mockingmethod.SampleObject1.getSampleObject1(int, java.lang.String)", new Object[] { sampleMethodReturn1, sampleMethodReturn2 });
        mockingmethod.SampleObject1 sampleObject1 = SUPER_MOCK.getMock(mockingmethod.SampleObject1.class);
        Assert.assertEquals(sampleMethodReturn1, sampleObject1.getSampleObject1(0, null));
        Assert.assertEquals(sampleMethodReturn2, sampleObject1.getSampleObject1(0, null));
        Assert.assertEquals(sampleMethodReturn2, sampleObject1.getSampleObject1(0, null));
    }

    @Test
    public void mockingExceptionWithSimpleMethodSignature1()
    {
        Throwable mockedException    = new NullPointerException();
        Throwable generatedException = null;
        SUPER_MOCK.setMethodExceptionOnMockExecution("parameterizedmethodreturn2.ExecutorImpl.execute", mockedException);
        parameterizedmethodreturn2.ExecutorImpl prm = SUPER_MOCK.getMock(parameterizedmethodreturn2.ExecutorImpl.class);
        try
        {
            prm.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);
        }
        catch (Throwable e)
        {
            generatedException = e;
        }
        Assert.assertEquals(mockedException, generatedException);
    }

    @Test
    public void mockingExceptionWithSimpleMethodSignature2()
    {
        Throwable                      mockedException     = new NullPointerException();
        Throwable                      generatedException  = null;
        Object                         mockedReturn1       = null;
        Object                         mockedReturn2       = null;
        parameterizedmethodreturn2.Out sampleMethodReturn1 = new parameterizedmethodreturn2.Out();
        parameterizedmethodreturn2.Out sampleMethodReturn2 = new parameterizedmethodreturn2.Out();
        SUPER_MOCK.setMethodExceptionOnMockExecution("parameterizedmethodreturn2.ExecutorImpl.execute", new Throwable[] { null, mockedException, null });
        SUPER_MOCK.setMethodReturnMocks("parameterizedmethodreturn2.ExecutorImpl.execute", new Object[] { sampleMethodReturn1, null, sampleMethodReturn2 });
        parameterizedmethodreturn2.ExecutorImpl prm = SUPER_MOCK.getMock(parameterizedmethodreturn2.ExecutorImpl.class);
        // here not thrown exception
        mockedReturn1 = prm.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);
        try
        {
            prm.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);
        }
        catch (Throwable e)
        {
            generatedException = e;
        }
        // here not thrown exception
        mockedReturn2 = prm.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);
        Assert.assertEquals(mockedException, generatedException);
        Assert.assertEquals(sampleMethodReturn1, mockedReturn1);
        Assert.assertEquals(sampleMethodReturn2, mockedReturn2);
    }

    @Test
    public void mockingExceptionWithCompleteMethodSignature1()
    {
        Throwable mockedException    = new NullPointerException();
        Throwable generatedException = null;
        SUPER_MOCK.setMethodExceptionOnMockExecution("parameterizedmethodreturn2.ExecutorImpl.execute(java.lang.Class, java.lang.Class)", mockedException);
        parameterizedmethodreturn2.ExecutorImpl prm = SUPER_MOCK.getMock(parameterizedmethodreturn2.ExecutorImpl.class);
        try
        {
            prm.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);
        }
        catch (Throwable e)
        {
            generatedException = e;
        }
        Assert.assertEquals(mockedException, generatedException);
    }

    @Test
    public void mockingExceptionWithCompleteMethodSignature2()
            throws Throwable
    {
        Throwable                      mockedException     = new NullPointerException();
        Throwable                      generatedException  = null;
        Object                         mockedReturn1       = null;
        Object                         mockedReturn2       = null;
        parameterizedmethodreturn2.Out sampleMethodReturn1 = new parameterizedmethodreturn2.Out();
        parameterizedmethodreturn2.Out sampleMethodReturn2 = new parameterizedmethodreturn2.Out();
        SUPER_MOCK.setMethodExceptionOnMockExecution("parameterizedmethodreturn2.ExecutorImpl.execute(java.lang.Class, java.lang.Class)", new Throwable[] { null, mockedException, null });
        SUPER_MOCK.setMethodReturnMocks("parameterizedmethodreturn2.ExecutorImpl.execute", new Object[] { sampleMethodReturn1, null, sampleMethodReturn2 });
        parameterizedmethodreturn2.ExecutorImpl prm = SUPER_MOCK.getMock(parameterizedmethodreturn2.ExecutorImpl.class);
        // here not thrown exception
        mockedReturn1 = prm.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);
        try
        {
            prm.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);
        }
        catch (Throwable e)
        {
            generatedException = e;
        }
        // here not thrown exception
        mockedReturn2 = prm.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);
        Assert.assertEquals(mockedException, generatedException);
        Assert.assertEquals(sampleMethodReturn1, mockedReturn1);
        Assert.assertEquals(sampleMethodReturn2, mockedReturn2);
    }

    @Test
    public void mockingExceptionWithCompleteMethodSignature3()
            throws Throwable
    {
        Throwable mockedException         = new NullPointerException();

        Object    mockedReturn1_firstCall = null;
        Object    mockedReturn1_thirdCall = null;
        Throwable generatedException1     = null;
        Throwable generatedException2     = null;
        Object    mockedReturn2_firstCall = null;
        Object    mockedReturn2_thirdCall = null;

        SUPER_MOCK.setMethodExceptionOnMockExecution("parameterizedmethodreturn2.ExecutorImpl.execute(java.lang.Class, java.lang.Class)", new Throwable[] { null, mockedException, null });

        parameterizedmethodreturn2.ExecutorImpl prm = SUPER_MOCK.getMock(parameterizedmethodreturn2.ExecutorImpl.class);

        // here not thrown exception
        mockedReturn1_firstCall = prm.execute(parameterizedmethodreturn1.In.class, parameterizedmethodreturn1.Out.class);

        // observe that the type of the parameterized param differ from last statement
        mockedReturn2_firstCall = prm.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);

        try
        {
            prm.execute(parameterizedmethodreturn1.In.class, parameterizedmethodreturn1.Out.class);
        }
        catch (Throwable e)
        {
            generatedException1 = e;
        }

        try
        {
            prm.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);
        }
        catch (Throwable e)
        {
            generatedException2 = e;
        }

        // here not thrown exception
        mockedReturn1_thirdCall = prm.execute(parameterizedmethodreturn1.In.class, parameterizedmethodreturn1.Out.class);
        mockedReturn2_thirdCall = prm.execute(parameterizedmethodreturn2.In.class, parameterizedmethodreturn2.Out.class);

        Assert.assertEquals(mockedException, generatedException1);
        Assert.assertEquals(mockedException, generatedException2);

        Assert.assertNotNull(mockedReturn1_firstCall);
        Assert.assertNotNull(mockedReturn1_thirdCall);
        Assert.assertTrue(mockedReturn1_firstCall instanceof parameterizedmethodreturn1.Out);
        Assert.assertTrue(mockedReturn1_thirdCall instanceof parameterizedmethodreturn1.Out);

        Assert.assertNotNull(mockedReturn2_firstCall);
        Assert.assertNotNull(mockedReturn2_thirdCall);
        Assert.assertTrue(mockedReturn2_firstCall instanceof parameterizedmethodreturn2.Out);
        Assert.assertTrue(mockedReturn2_thirdCall instanceof parameterizedmethodreturn2.Out);
    }

    @Test
    public void automatedExecution1()
            throws Throwable
    {
        SUPER_MOCK.setNumericMock(1);
        AutomatedExecution result = SUPER_MOCK.executeClass(AutomatedExecution.class);
        Assert.assertEquals(3, result.getCounter());
    }

    @Test
    public void automatedExecution2()
            throws Throwable
    {
        SUPER_MOCK.setNumericMock(1);
        SUPER_MOCK.setMethodNotToExecute("automatedexecution.AutomatedExecution.add1(int)");
        AutomatedExecution result = SUPER_MOCK.executeClass(AutomatedExecution.class);
        Assert.assertEquals(2, result.getCounter());
    }

    @Test
    public void automatedExecution3()
            throws Throwable
    {
        SUPER_MOCK.setNumericMock(1);
        SUPER_MOCK.setMethodNotToExecute("automatedexecution.AutomatedExecution.add2(int)");
        AutomatedExecution result = SUPER_MOCK.executeClass(AutomatedExecution.class);
        Assert.assertEquals(1, result.getCounter());
    }

    @Test
    public void automatedExecution4()
            throws Throwable
    {
        SUPER_MOCK.setNumericMock(1);
        SUPER_MOCK.setMethodNotToExecute("automatedexecution.AutomatedExecution.add1");
        SUPER_MOCK.setMethodNotToExecute("automatedexecution.AutomatedExecution.add2");
        AutomatedExecution result = SUPER_MOCK.executeClass(AutomatedExecution.class);
        Assert.assertEquals(0, result.getCounter());
    }

    @Test
    public void automatedExecution5()
            throws Throwable
    {
        SUPER_MOCK.setMockedParametersOnMethodExecution("automatedexecution.AutomatedExecution.add1", new Object[] { 2 });
        SUPER_MOCK.setMockedParametersOnMethodExecution("automatedexecution.AutomatedExecution.add2", new Object[] { 3 });
        AutomatedExecution result = SUPER_MOCK.executeClass(AutomatedExecution.class);
        Assert.assertEquals(8, result.getCounter());
    }

    @Test
    public void automatedExecution6()
            throws Throwable
    {
        SUPER_MOCK.setMethodNotToExecute("automatedexecution.AutomatedExecution.add1");
        SUPER_MOCK.setMockedParametersOnMethodExecution("automatedexecution.AutomatedExecution.add1(int)", new Object[] { 2 });
        SUPER_MOCK.setMockedParametersOnMethodExecution("automatedexecution.AutomatedExecution.add2(int)", new Object[] { 3 });
        AutomatedExecution result = SUPER_MOCK.executeClass(AutomatedExecution.class);
        Assert.assertEquals(6, result.getCounter());
    }

    @Test
    public void automatedExecution7()
            throws Throwable
    {
        SUPER_MOCK.setMethodNotToExecute("automatedexecution.AutomatedExecution.add2");
        SUPER_MOCK.setMockedParametersOnMethodExecution("automatedexecution.AutomatedExecution.add1(int)", new Object[] { 2 });
        SUPER_MOCK.setMockedParametersOnMethodExecution("automatedexecution.AutomatedExecution.add2(int)", new Object[] { 3 });
        AutomatedExecution result = SUPER_MOCK.executeClass(AutomatedExecution.class);
        Assert.assertEquals(2, result.getCounter());
    }

    @Test
    public void mockingNotAllowedRules()
    {
        SampleObject1 ANONIMOUS_CLASS = new SampleObject1()
        {
        };
        // mocking final class
        Assert.assertNull(SUPER_MOCK.getMock(FinalClass.class));
        // mocking anonimous class
        Assert.assertNull(SUPER_MOCK.getMock(ANONIMOUS_CLASS.getClass()));
        // mocking java package class
        Assert.assertNull(SUPER_MOCK.getMock(AtomicBoolean.class));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void configurationAfterGetMockNotAllowedRules()
    {
        SUPER_MOCK = new SuperMock();
        Throwable resetMockException                                      = null;
        Throwable setValorMockStringException                             = null;
        Throwable setValorMockCaracterException                           = null;
        Throwable setValorMockBooleanException                            = null;
        Throwable setValorMockNumericoException                           = null;
        Throwable setValorMockNumerico2Exception                          = null;
        Throwable setValorMockTimestampOuDateException                    = null;
        Throwable setValorMockTimestampOuDate2Exception                   = null;
        Throwable setValorMockObjetoException                             = null;
        Throwable setValorMockObjeto2Exception                            = null;
        Throwable setQuantidadeMaximaAninhamentoInstanciacaoMockException = null;
        Throwable setQuantidadeMaximaExecucaoPorMetodoNoObjetoException   = null;
        Throwable setQuantidadeElementosMockArrayException                = null;
        Throwable setValorMockAtributoClasseException                     = null;
        Throwable setValorRetornoMetodoMockException                      = null;
        Throwable setValoresRetornosMetodoMockException                   = null;
        Throwable setExcecaoAoExecutarMetodoMockException                 = null;
        Throwable setExcecoesAoExecutarMetodoMockException                = null;
        Throwable setValorEntradaMetodoException                          = null;
        Throwable addNomeMetodoNaoExecutarException                       = null;
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.resetMock();
        }
        catch (Throwable e)
        {
            resetMockException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setStringMock("");
        }
        catch (Throwable e)
        {
            setValorMockStringException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setCharacterMock(' ');
        }
        catch (Throwable e)
        {
            setValorMockCaracterException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setBooleanMock(false);
        }
        catch (Throwable e)
        {
            setValorMockBooleanException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setNumericMock(Double.valueOf(0d));
        }
        catch (Throwable e)
        {
            setValorMockNumericoException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setNumericMock(Integer.valueOf(0));
        }
        catch (Throwable e)
        {
            setValorMockNumerico2Exception = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setTimestampAndDateMock(new Date());
        }
        catch (Throwable e)
        {
            setValorMockTimestampOuDateException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setTimestampAndDateMock(System.currentTimeMillis());
        }
        catch (Throwable e)
        {
            setValorMockTimestampOuDate2Exception = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setMock("java.lang.Integer", null);
        }
        catch (Throwable e)
        {
            setValorMockObjetoException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setMock(java.lang.Integer.class, null);
        }
        catch (Throwable e)
        {
            setValorMockObjeto2Exception = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setMaximumNestedMockInstantiation(1);
        }
        catch (Throwable e)
        {
            setQuantidadeMaximaAninhamentoInstanciacaoMockException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setMaximumExecutionNumberOnMethod(2);
        }
        catch (Throwable e)
        {
            setQuantidadeMaximaExecucaoPorMetodoNoObjetoException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setCollectionItemsMocked(3);
        }
        catch (Throwable e)
        {
            setQuantidadeElementosMockArrayException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setFieldMock("mockingobjects.SampleObject1.sampleObject2", null);
        }
        catch (Throwable e)
        {
            setValorMockAtributoClasseException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setMethodReturnMock("mockingmethod.SampleObject1.getSampleObject1", null);
        }
        catch (Throwable e)
        {
            setValorRetornoMetodoMockException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setMethodReturnMocks("mockingmethod.SampleObject1.getSampleObject1", new Object[] { null });
        }
        catch (Throwable e)
        {
            setValoresRetornosMetodoMockException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setMethodExceptionOnMockExecution("mockingmethod.SampleObject1.getSampleObject1", new NullPointerException());
        }
        catch (Throwable e)
        {
            setExcecaoAoExecutarMetodoMockException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setMethodExceptionOnMockExecution("mockingmethod.SampleObject1.getSampleObject1", new Throwable[] { new NullPointerException() });
        }
        catch (Throwable e)
        {
            setExcecoesAoExecutarMetodoMockException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setMockedParametersOnMethodExecution("mockingmethod.SampleObject1.getSampleObject1", new Object());
        }
        catch (Throwable e)
        {
            setValorEntradaMetodoException = e;
        }
        try
        {
            SuperMock superMock = new SuperMock();
            superMock.getMock(int.class);
            superMock.setMethodNotToExecute("mockingmethod.SampleObject1.getSampleObject1");
        }
        catch (Throwable e)
        {
            addNomeMetodoNaoExecutarException = e;
        }

        Assert.assertNotNull(resetMockException);
        Assert.assertNotNull(setValorMockStringException);
        Assert.assertNotNull(setValorMockCaracterException);
        Assert.assertNotNull(setValorMockBooleanException);
        Assert.assertNotNull(setValorMockNumericoException);
        Assert.assertNotNull(setValorMockNumerico2Exception);
        Assert.assertNotNull(setValorMockTimestampOuDateException);
        Assert.assertNotNull(setValorMockTimestampOuDate2Exception);
        Assert.assertNotNull(setValorMockObjetoException);
        Assert.assertNotNull(setValorMockObjeto2Exception);
        Assert.assertNotNull(setQuantidadeMaximaAninhamentoInstanciacaoMockException);
        Assert.assertNotNull(setQuantidadeMaximaExecucaoPorMetodoNoObjetoException);
        Assert.assertNotNull(setQuantidadeElementosMockArrayException);
        Assert.assertNotNull(setValorMockAtributoClasseException);
        Assert.assertNotNull(setValorRetornoMetodoMockException);
        Assert.assertNotNull(setValoresRetornosMetodoMockException);
        Assert.assertNotNull(setExcecaoAoExecutarMetodoMockException);
        Assert.assertNotNull(setExcecoesAoExecutarMetodoMockException);
        Assert.assertNotNull(setValorEntradaMetodoException);
        Assert.assertNotNull(addNomeMetodoNaoExecutarException);
    }

    @Test
    public void automatedExecution8()
            throws Throwable
    {
        SUPER_MOCK.setNumericMock(1);
        AutomatedExecution result = SUPER_MOCK.executeClass(AutomatedExecution.class);
        Assert.assertEquals(3, result.getCounter());
    }

    @Test
    public void automatedExecution9()
            throws Throwable
    {
        SUPER_MOCK.setNumericMock(1);
        Object[] result = SUPER_MOCK.executeClasses(AutomatedExecution.class, AutomatedExecution.class);
        Assert.assertEquals(3, ((AutomatedExecution) result[0]).getCounter());
        Assert.assertEquals(3, ((AutomatedExecution) result[1]).getCounter());
    }

    @Test
    public void automatedExecution10()
            throws Throwable
    {
        SUPER_MOCK.setNumericMock(1);

        List<Class<?>> classes = new ArrayList<Class<?>>();
        classes.add(AutomatedExecution.class);
        classes.add(AutomatedExecution.class);

        List<Object> result = SUPER_MOCK.executeClasses(classes);
        Assert.assertEquals(3, ((AutomatedExecution) result.get(0)).getCounter());
        Assert.assertEquals(3, ((AutomatedExecution) result.get(1)).getCounter());
    }

    @Test
    public void automatedExecution11()
            throws Throwable
    {
        SUPER_MOCK.setNumericMock(1);
        AutomatedExecution exec = new AutomatedExecution();
        SUPER_MOCK.executeObject(exec);
        Assert.assertEquals(3, exec.getCounter());
    }

    @Test
    public void automatedExecution12()
            throws Throwable
    {
        SUPER_MOCK.setNumericMock(1);
        AutomatedExecution exec1 = new AutomatedExecution();
        AutomatedExecution exec2 = new AutomatedExecution();
        SUPER_MOCK.executeObjects(exec1, exec2);
        Assert.assertEquals(3, exec1.getCounter());
        Assert.assertEquals(3, exec2.getCounter());
    }

    @Test
    public void automatedExecution13()
            throws Throwable
    {
        SUPER_MOCK.setNumericMock(1);

        List<Object>       objects = new ArrayList<Object>();
        AutomatedExecution exec1   = new AutomatedExecution();
        AutomatedExecution exec2   = new AutomatedExecution();
        objects.add(exec1);
        objects.add(exec2);

        SUPER_MOCK.executeObjects(objects);

        Assert.assertEquals(3, exec1.getCounter());
        Assert.assertEquals(3, exec2.getCounter());
    }

}
