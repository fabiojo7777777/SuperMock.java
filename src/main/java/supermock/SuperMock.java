package supermock;

import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
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
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.GregorianCalendar;
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
import java.util.Locale;
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

import org.mockito.Mockito;
import org.mockito.internal.util.reflection.GenericMetadataSupport;
import org.mockito.invocation.InvocationOnMock;

public class SuperMock
{
    private final Delegate DELEGATE;

    public SuperMock()
    {
        DELEGATE = new Delegate();
    }

    @Deprecated
    public void resetMock()
    {
        DELEGATE.resetMocks();
    }

    public void setStringMock(String valorMockString)
    {
        DELEGATE.setStringMock(valorMockString);
    }

    public void setCharacterMock(Character valorMockCaracter)
    {
        DELEGATE.setCharacterMock(valorMockCaracter);
    }

    public void setBooleanMock(Boolean valorMockBoolean)
    {
        DELEGATE.setBooleanMock(valorMockBoolean);
    }

    public void setNumericMock(Double valorMockNumerico)
    {
        DELEGATE.setNumericMock(valorMockNumerico);
    }

    public void setNumericMock(Integer valorMockNumerico)
    {
        DELEGATE.setNumericMock(valorMockNumerico);
    }

    public void setTimestampAndDateMock(Date valorMockTimestampOuDate)
    {
        DELEGATE.setTimestampAndDateMock(valorMockTimestampOuDate);
    }

    public void setTimestampAndDateMock(Long valorMockTimestampOuDate)
    {
        DELEGATE.setTimestampAndDateMock(valorMockTimestampOuDate);
    }

    public void setMock(String nomeClasse, Object valorInstanciado)
    {
        DELEGATE.setMock(nomeClasse, valorInstanciado);
    }

    public <T> void setMock(Class<T> classe, T valorInstanciado)
    {
        DELEGATE.setMock(classe, valorInstanciado);
    }

    public void setMaximumNestedMockInstantiation(int quantidadeMaximaAninhamentoInstanciacaoMock)
    {
        DELEGATE.setMaximumNestedMockInstantiation(quantidadeMaximaAninhamentoInstanciacaoMock);
    }

    public void setMaximumExecutionNumberOnMethod(int quantidadeMaximaExecucaoPorMetodoNoObjeto)
    {
        DELEGATE.setMaximumExecutionNumberOnMethod(quantidadeMaximaExecucaoPorMetodoNoObjeto);
    }

    public void setCollectionItemsMocked(int quantidadeElementosMockArray)
    {
        DELEGATE.setCollectionItemsMocked(quantidadeElementosMockArray);
    }

    public void setFieldMock(String nomeAtributo, Object valorAtributo)
    {
        DELEGATE.setFieldMock(nomeAtributo, valorAtributo);
    }

    public void setMethodReturnMock(String nomeMetodo, Object valorRetorno)
    {
        DELEGATE.setMethodReturnMock(nomeMetodo, valorRetorno);
    }

    public void setMethodReturnMocks(String nomeMetodo, Object[] valorRetorno)
    {
        DELEGATE.setMethodReturnMocks(nomeMetodo, valorRetorno);
    }

    public void setMethodExceptionOnMockExecution(String nomeMetodo, Throwable excecao)
    {
        DELEGATE.setMethodExceptionOnMockExecution(nomeMetodo, excecao);
    }

    public void setMethodExceptionOnMockExecution(String nomeMetodo, Throwable[] excecao)
    {
        DELEGATE.setMethodExceptionOnMockExecution(nomeMetodo, excecao);
    }

    public <T> T getMock(Class<T> classe)
    {
        return DELEGATE.getMock(classe);
    }

    public <T> T getRealInstanceWithNullFieldsMocked(Class<T> classe)
            throws Throwable
    {
        return DELEGATE.getRealInstanceWithNullFieldsMocked(classe);
    }

    public void setMockedParametersOnMethodExecution(String methodSignature, Object... parameterValues)
    {
        DELEGATE.setMockedParametersOnMethodExecution(methodSignature, parameterValues);
    }

    public void setMethodNotToExecute(String nomeClasseMetodoNaoExecutar)
    {
        DELEGATE.setMethodNotToExecute(nomeClasseMetodoNaoExecutar);
    }

    public <T> T executeClass(Class<T> classe)
            throws Throwable
    {
        return DELEGATE.executeClass(classe);
    }

    public Object[] executeClasses(Class<?>... listaClasse)
            throws Throwable
    {
        return DELEGATE.executeClasses(listaClasse);
    }

    public List<Object> executeClasses(List<Class<?>> listaClasse)
            throws Throwable
    {
        return DELEGATE.executeClasses(listaClasse);
    }

    public void executeObject(Object objeto)
            throws Throwable
    {
        DELEGATE.executeObject(objeto);
    }

    public void executeObjects(Object... listaObjeto)
            throws Throwable
    {
        DELEGATE.executeObjects(listaObjeto);
    }

    public void executeObjects(List<Object> listaObjeto)
            throws Throwable
    {
        DELEGATE.executeObjects((List<Object>) listaObjeto);
    }

    private static class Delegate
    {
        private static final String                  RUNTIME_EXCEPTION_ABSTRACT_IN_COLLECTION_IMPLEMENTATION     = "Implamentação de coleções devem ser classes instanciáveis. Classe com problema: %s";
        private static final String                  RUNTIME_EXCEPTION_CONFIGURATION_AFTER_FIRST_MOCK            = "Não é possível configurar a execução / mockagem de novos campos após obter o primeiro mock com getMock(). Crie uma nova instância para configurar novos mocks.";
        private static final String                  RUNTIME_EXCEPTION_INVALID_FIELD_SIGNATURE                   = "Informe a assinatura completa do campo a ser mockado, incluindo o package e o nome da classe e o nome do campo a ser mockado separados por ponto.";
        private static final String                  RUNTIME_EXCEPTION_INVALID_MOCK_TYPE_FOR_FIELD               = "O tipo do dado mockado manualmente para o campo \"%s\" não é compatível com o campo da classe.\nDescrição do problema: \"%s\" não pode ser convertido para o tipo \"%s\"";
        private static final String                  RUNTIME_EXCEPTION_FIELD_NOT_FOUND                           = "Campo \"%s\" não encontrado na classe \"%s\".\nDescrição do problema: %s";
        private static final String                  RUNTIME_EXCEPTION_CLASS_NOT_FOUND_ON_FIELD_MOCKING          = "Classe \"%s\" não encontrada ao mockar o campo \"%s\".\nDescrição do problema: %s";
        private static final String                  RUNTIME_EXCEPTION_ERROR_ON_FIELD_MOCKING                    = "Erro ao acessar o campo \"%s\" durante mockagem.\nDescrição do problema: %s";
        private static final String                  RUNTIME_EXCEPTION_ERROR_MOCKING_TYPE                        = "Erro ao criar mock para tipo \"%s\".\nDescrição do problema: %s";
        private static final String                  RUNTIME_EXCEPTION_INVALID_MOCK_TYPE_FOR_TYPE                = "O tipo do dado mockado manualmente para a classe \"%s\" não é compatível com o tipo desta classe.\nDescrição do problema: \"%s\" não pode ser convertido para o tipo \"%s\"";
        private static final String                  RUNTIME_EXCEPTION_MISSING_MOCKING_CLASS                     = "Informe a classe a ser mockada.";
        private static final String                  RUNTIME_EXCEPTION_CONSTRUCTOR_NOT_FOUND_INSTANTIATING_TYPE  = "Não foi possível instanciar a classe \"%s\". Não foram encontrados construtores para gerar uma nova instância desta classe.";
        private static final String                  RUNTIME_EXCEPTION_MOCKING_LOOPING                           = "Existe um provável looping de instanciação pois um aninhamento de instanciação de mocks de um objeto que superou a quantidade de %s. Para aumentar a quantidade de aninhamentos, execute o método setMaximumNestedMockInstantiation()";
        private static final String                  RUNTIME_EXCEPTION_INVALID_MOCK_TYPE_FOR_METHOD_RETURN       = "O tipo do dado mockado manualmente para o retorno do método \"%s\" não é compatível com o retorno do método.\nDescrição do problema: \"%s\" não pode ser convertido para o tipo \"%s\"";
        private static final String                  RUNTIME_EXCEPTION_INVALID_MOCKING_TYPE_FOR_METHOD_PARAMETER = "O mapeamento \"%s\" informado com os valores \"%s\" não possui o mesmo tipo de dados do método a ser executado.";
        private static final String                  RUNTIME_EXCEPTION_LOGIC_LOOPING_ON_METHOD_EXECUTION         = "O método '%s' foi executado %s vezes em um mesmo objeto durante este teste e foi finalizado pela possibilidade de looping na lógica de execução do programa. Para aumentar a quantidade máxima de execuções, execute o método setMaximumExecutionNumberOnMethod";

        private static final String                  ERROR_MSG_INSTANTIATION_EXCEPTION                           = "<<ERRO>>: Não foi possível instanciar a classe \"%s\"\nDescrição do erro: %s";
        private static final String                  WARN_MSG_DEFAULT_COLLECTION_NOT_MOCKED                      = "<<AVISO>>: Este tipo de collection não possui um mock por padrão. Será usado nulo para efeito de testes. Classe com tentativa de mockagem: \"%s\". Se quiser mockar esta classe, execute o método setMock.";
        private static final String                  WARN_MSG_DEFAULT_ANONIMOUS_CLASSES_NOT_MOCKED               = "<<AVISO>>: Por motivos de segurança nos testes, classes anônimas não são mockadas por padrão. Será usado nulo para efeito de testes. Classe com tentativa de mockagem: \"%s\". Se quiser mockar esta classe, execute o método setMock.";
        private static final String                  WARN_MSG_DEFAULT_FINAL_CLASSES_NOT_MOCKED                   = "<<AVISO>>: Por motivos de segurança nos testes, classes com modificador final não são mockadas por padrão. Será usado nulo para efeito de testes. Classe com tentativa de mockagem: \"%s\". Se quiser mockar esta classe, execute o método setMock.";
        private static final String                  WARN_MSG_DEFAULT_JAVA_PACKAGE_NOT_MOCKED                    = "<<AVISO>>: Por motivos de segurança nos testes, classes com prefixo java não abstratas não são mockadas por padrão. Será usado nulo para efeito de testes. Classe com tentativa de mockagem: \"%s\". Se quiser mockar esta classe, execute o método setMock.";
        private static final String                  WARN_MSG_ENUM_NOT_MOCKED                                    = "<<AVISO>>: Não foi possível mockar o enum \"%s\". Será usado nulo para efeito de teste.\nDescrição do problema: %s";
        private static final String                  WARN_MSG_ARRAY_NOT_MOCKED                                   = "<<AVISO>>: Não foi possível mockar um array do tipo \"%s\". Será usado nulo para efeito de teste.\nDescrição do problema: %s";
        private static final String                  WARN_MSG_ARRAY_ITEM_NOT_MOCKED                              = "<<AVISO>>: Não foi possível mockar um ou mais itens de um array do tipo \"%s\".\nDescrição do problema: %s";
        private static final String                  WARN_MSG_COLLECTION_NOT_MOCKED                              = "<<AVISO>>: Não foi possível mockar a collection \"%s\". Será usado nulo para efeito de teste.\nDescrição do problema: %s";
        private static final String                  WARN_MSG_COLLECTION_ITEM_NOT_MOCKED                         = "<<AVISO>>: Não foi possível mockar um ou mais itens da collection \"%s\".\nDescrição do problema: %s";
        private static final String                  WARN_MSG_MAP_NOT_MOCKED                                     = "<<AVISO>>: Não foi possível mockar o mapa \"%s\". Será usado nulo para efeito de testes.\nDescrição do problema: %s";
        private static final String                  WARN_MSG_MAP_ITEM_NOT_MOCKED                                = "<<AVISO>>: Não foi possível mockar um ou mais itens do mapa \"%s\". Descrição do problema: %s";
        private static final String                  WARN_MSG_MOCKITO_MOCKING_NOT_MOCKED                         = "<<AVISO>>: Não foi possível mockar a classe \"%s\". Será usado nulo para efeito de teste.\nDescrição do problema: %s";
        private static final String                  WARN_MSG_ON_FIELD_MOCKING                                   = "<<AVISO>>: Não foi possível alterar o valor do atributo \"%s\". Este atributo ficará com o valor original para efeito de teste.\nDescrição do problema: %s";
        private static final String                  WARN_MSG_MOCKING_INSTANTIATING_FIELDS_LOOP                  = "<<AVISO>>: Foi detectado um looping ao mockar a classe \"%s\". A classe mais interna do tipo \"%s\" ficará com valor original para efeito de testes. Cadeia de mockagem com problema: %s";
        private static final String                  WARN_MSG_ERROR_EXECUTING_METHOD                             = "<<AVISO>>: Erro ao executar o método: \"%s\". Verifique se este comportamento está correto.\n\tDescrição do erro: %s";
        @SuppressWarnings("unused")
        private static final String                  MSG_EXECUTING_METHOD                                        = "Executando o método: %s";

        private static final Map<Class<?>, Class<?>> BOXED_TYPES_MAP                                             = new HashMap<Class<?>, Class<?>>();
        private static final List<Class<?>>          PRIMITIVES_AND_WRAPPERS                                     = new ArrayList<Class<?>>();
        private static final List<Class<?>>          COLLECTION_ABSTRACTIONS                                     = new ArrayList<Class<?>>();
        private static final List<Class<?>>          COLLECTION_IMPLEMENTATIONS                                  = new ArrayList<Class<?>>();

        private static enum SampleEnum
        {
            MOCKED_ENUM_VALUE_1,
            MOCKED_ENUM_VALUE_2,
            MOCKED_ENUM_VALUE_3,
            MOCKED_ENUM_VALUE_4,
            MOCKED_ENUM_VALUE_5,
            MOCKED_ENUM_VALUE_6,
            MOCKED_ENUM_VALUE_7,
            MOCKED_ENUM_VALUE_8,
            MOCKED_ENUM_VALUE_9,
            MOCKED_ENUM_VALUE_10;
        }

        private int                                      comparableSequence                   = 0;
        private final Map<Class<?>, Object>              temporaryDefaultMocks                = new LinkedHashMap<Class<?>, Object>();
        private Map<Class<?>, Object>                    DEFAULT_PRIMITIVE_AND_WRAPPER_MOCKS  = null;
        private Map<Class<?>, Object>                    DEFAULT_OBJECT_MOCKS                 = null;
        private final Map<String, Object[]>              DEFAULT_METHOD_RETURN_MOCKS          = new HashMap<String, Object[]>();
        private final Map<String, Object[]>              DEFAULT_METHOD_EXECUTIONS_PARAMETERS = new HashMap<String, Object[]>();
        private final Map<String, Throwable[]>           DEFAULT_METHOD_EXECUTIONS_THROWABLES = new HashMap<String, Throwable[]>();
        private final Map<String, Object>                DEFAULT_FIELD_MOCKS                  = new HashMap<String, Object>();
        private final List<String>                       METHODS_NOT_TO_RUN                   = new ArrayList<String>();

        private int                                      collectionItemsMocked;

        private int                                      maximumExecutionNumberOnMethod;
        private int                                      maximumNestedMockInstantiation;
        private static ThreadLocal<Integer>              nestedMockInstantiation              = new ThreadLocal<Integer>()
                                                                                              {
                                                                                                  public Integer initialValue()
                                                                                                  {
                                                                                                      return 0;
                                                                                                  }
                                                                                              };

        private static ThreadLocal<LinkedList<Class<?>>> mockStack                            = new ThreadLocal<LinkedList<Class<?>>>()
                                                                                              {
                                                                                                  public LinkedList<Class<?>> initialValue()
                                                                                                  {
                                                                                                      return new LinkedList<Class<?>>();
                                                                                                  }
                                                                                              };

        static
        {
            BOXED_TYPES_MAP.put(boolean.class, Boolean.class);
            BOXED_TYPES_MAP.put(char.class, Character.class);
            BOXED_TYPES_MAP.put(byte.class, Byte.class);
            BOXED_TYPES_MAP.put(short.class, Short.class);
            BOXED_TYPES_MAP.put(int.class, Integer.class);
            BOXED_TYPES_MAP.put(long.class, Long.class);
            BOXED_TYPES_MAP.put(float.class, Float.class);
            BOXED_TYPES_MAP.put(double.class, Double.class);

            PRIMITIVES_AND_WRAPPERS.add(Boolean.class);
            PRIMITIVES_AND_WRAPPERS.add(boolean.class);
            PRIMITIVES_AND_WRAPPERS.add(Character.class);
            PRIMITIVES_AND_WRAPPERS.add(char.class);
            PRIMITIVES_AND_WRAPPERS.add(String.class);
            PRIMITIVES_AND_WRAPPERS.add(byte.class);
            PRIMITIVES_AND_WRAPPERS.add(short.class);
            PRIMITIVES_AND_WRAPPERS.add(int.class);
            PRIMITIVES_AND_WRAPPERS.add(long.class);
            PRIMITIVES_AND_WRAPPERS.add(float.class);
            PRIMITIVES_AND_WRAPPERS.add(double.class);
            PRIMITIVES_AND_WRAPPERS.add(Byte.class);
            PRIMITIVES_AND_WRAPPERS.add(Short.class);
            PRIMITIVES_AND_WRAPPERS.add(Integer.class);
            PRIMITIVES_AND_WRAPPERS.add(Long.class);
            PRIMITIVES_AND_WRAPPERS.add(Float.class);
            PRIMITIVES_AND_WRAPPERS.add(Double.class);
            PRIMITIVES_AND_WRAPPERS.add(BigDecimal.class);
            PRIMITIVES_AND_WRAPPERS.add(BigInteger.class);
            sortFromGenericClassToEspecificClass(PRIMITIVES_AND_WRAPPERS);

            COLLECTION_IMPLEMENTATIONS.add(HashSet.class);
            COLLECTION_IMPLEMENTATIONS.add(TreeSet.class);
            COLLECTION_IMPLEMENTATIONS.add(LinkedHashSet.class);
            COLLECTION_IMPLEMENTATIONS.add(ArrayList.class);
            COLLECTION_IMPLEMENTATIONS.add(ArrayDeque.class);
            COLLECTION_IMPLEMENTATIONS.add(LinkedList.class);
            COLLECTION_IMPLEMENTATIONS.add(PriorityQueue.class);
            COLLECTION_IMPLEMENTATIONS.add(HashMap.class);
            COLLECTION_IMPLEMENTATIONS.add(TreeMap.class);
            COLLECTION_IMPLEMENTATIONS.add(LinkedHashMap.class);
            COLLECTION_IMPLEMENTATIONS.add(Vector.class);
            COLLECTION_IMPLEMENTATIONS.add(Hashtable.class);
            COLLECTION_IMPLEMENTATIONS.add(WeakHashMap.class);
            COLLECTION_IMPLEMENTATIONS.add(IdentityHashMap.class);
            COLLECTION_IMPLEMENTATIONS.add(CopyOnWriteArrayList.class);
            COLLECTION_IMPLEMENTATIONS.add(CopyOnWriteArraySet.class);
            COLLECTION_IMPLEMENTATIONS.add(EnumMap.class);
            COLLECTION_IMPLEMENTATIONS.add(ConcurrentLinkedQueue.class);
            COLLECTION_IMPLEMENTATIONS.add(LinkedBlockingQueue.class);
            COLLECTION_IMPLEMENTATIONS.add(ArrayBlockingQueue.class);
            COLLECTION_IMPLEMENTATIONS.add(PriorityBlockingQueue.class);
            COLLECTION_IMPLEMENTATIONS.add(DelayQueue.class);
            COLLECTION_IMPLEMENTATIONS.add(SynchronousQueue.class);
            COLLECTION_IMPLEMENTATIONS.add(LinkedBlockingDeque.class);
            COLLECTION_IMPLEMENTATIONS.add(ConcurrentHashMap.class);
            COLLECTION_IMPLEMENTATIONS.add(ConcurrentSkipListSet.class);
            COLLECTION_IMPLEMENTATIONS.add(ConcurrentSkipListMap.class);
            sortFromGenericClassToEspecificClass(COLLECTION_IMPLEMENTATIONS);
            validateCollectionImplementations();

            COLLECTION_ABSTRACTIONS.add(Collection.class);
            COLLECTION_ABSTRACTIONS.add(Set.class);
            COLLECTION_ABSTRACTIONS.add(List.class);
            COLLECTION_ABSTRACTIONS.add(Queue.class);
            COLLECTION_ABSTRACTIONS.add(Deque.class);
            COLLECTION_ABSTRACTIONS.add(Map.class);
            COLLECTION_ABSTRACTIONS.add(SortedSet.class);
            COLLECTION_ABSTRACTIONS.add(SortedMap.class);
            COLLECTION_ABSTRACTIONS.add(NavigableSet.class);
            COLLECTION_ABSTRACTIONS.add(NavigableMap.class);
            COLLECTION_ABSTRACTIONS.add(BlockingQueue.class);
            COLLECTION_ABSTRACTIONS.add(BlockingDeque.class);
            COLLECTION_ABSTRACTIONS.add(ConcurrentMap.class);
            COLLECTION_ABSTRACTIONS.add(ConcurrentNavigableMap.class);
            COLLECTION_ABSTRACTIONS.add(EnumSet.class);
            COLLECTION_ABSTRACTIONS.add(AbstractCollection.class);
            COLLECTION_ABSTRACTIONS.add(AbstractSet.class);
            COLLECTION_ABSTRACTIONS.add(AbstractList.class);
            COLLECTION_ABSTRACTIONS.add(AbstractSequentialList.class);
            COLLECTION_ABSTRACTIONS.add(AbstractQueue.class);
            COLLECTION_ABSTRACTIONS.add(AbstractMap.class);
            COLLECTION_ABSTRACTIONS.add(Iterator.class);
            COLLECTION_ABSTRACTIONS.add(ListIterator.class);
            COLLECTION_ABSTRACTIONS.add(Comparable.class);
            COLLECTION_ABSTRACTIONS.add(Comparator.class);
            COLLECTION_ABSTRACTIONS.add(RandomAccess.class);
            sortFromGenericClassToEspecificClass(COLLECTION_ABSTRACTIONS);
        }

        private static void sortFromGenericClassToEspecificClass(List<Class<?>> classes)
        {
            Collections.sort(classes, new FromGenericClassToEspecificClassSort());
        }

        private static void validateCollectionImplementations()
        {
            for (Class<?> implementation : COLLECTION_IMPLEMENTATIONS)
            {
                if (Modifier.isAbstract(implementation.getModifiers()) ||
                        Modifier.isInterface(implementation.getModifiers()))
                {
                    throw new RuntimeException(String.format(RUNTIME_EXCEPTION_ABSTRACT_IN_COLLECTION_IMPLEMENTATION, implementation.getCanonicalName()));
                }
            }
        }

        public Delegate()
        {
            resetMocks();
        }

        private void resetMocks()
        {
            setBooleanMock(Boolean.FALSE);
            setCharacterMock(' ');
            setStringMock("");
            setNumericMock(Double.valueOf(0));
            setTimestampAndDateMock(System.currentTimeMillis());

            setMock(void.class, null);
            setMock(Void.class, null);
            setMock(Color.class, Color.BLACK);
            setMock(InputStream.class, new ByteArrayInputStream(new byte[0]));
            setMock(OutputStream.class, new ByteArrayOutputStream());
            setMock(Object.class, new Object());
            setMock(Class.class, Object.class);
            setMock(Locale.class, Locale.getDefault());

            setCollectionItemsMocked(10);

            setMaximumExecutionNumberOnMethod(500);
            setMaximumNestedMockInstantiation(20);
        }

        public void setMethodReturnMock(String methodSignature, Object returnValue)
        {
            setMethodReturnMocks(methodSignature, new Object[] { returnValue });
        }

        public void setMethodReturnMocks(String methodSignature, Object[] returnValues)
        {
            validateMockingNotInitialized();
            if (returnValues == null || returnValues.length == 0)
            {
                return;
            }
            DEFAULT_METHOD_RETURN_MOCKS.put(methodSignature, returnValues);
        }

        public void setMethodExceptionOnMockExecution(String methodSignature, Throwable throwable)
        {
            setMethodExceptionOnMockExecution(methodSignature, new Throwable[] { throwable });
        }

        public void setMethodExceptionOnMockExecution(String methodSignature, Throwable[] throwables)
        {
            validateMockingNotInitialized();
            if (throwables == null || throwables.length == 0)
            {
                return;
            }
            DEFAULT_METHOD_EXECUTIONS_THROWABLES.put(methodSignature, throwables);
        }

        public void setMockedParametersOnMethodExecution(String methodSignature, Object... parameterValues)
        {
            validateMockingNotInitialized();
            if (parameterValues == null)
            {
                parameterValues = new Object[] { null };
            }
            DEFAULT_METHOD_EXECUTIONS_PARAMETERS.put(methodSignature, parameterValues);
        }

        public void setMethodNotToExecute(String methodSignature)
        {
            validateMockingNotInitialized();
            METHODS_NOT_TO_RUN.add(methodSignature);
        }

        public void setFieldMock(String fieldSignature, Object mock)
        {
            validateMockingNotInitialized();
            validateFieldMock(fieldSignature, mock);
            DEFAULT_FIELD_MOCKS.put(fieldSignature, mock);
        }

        private void validateMockingNotInitialized()
        {
            if (DEFAULT_PRIMITIVE_AND_WRAPPER_MOCKS != null)
            {
                throw new RuntimeException(String.format(RUNTIME_EXCEPTION_CONFIGURATION_AFTER_FIRST_MOCK));
            }
        }

        private static void validateFieldMock(String fieldSignature, Object mock)
        {
            int index = fieldSignature.lastIndexOf('.');
            if (index == -1)
            {
                throw new RuntimeException(RUNTIME_EXCEPTION_INVALID_FIELD_SIGNATURE);
            }
            if (mock != null)
            {
                String className = fieldSignature.substring(0, index);
                String fieldName = fieldSignature.substring(index + 1);
                try
                {
                    Field field = getClassOrInnerClass(className).getDeclaredField(fieldName);
                    field.setAccessible(true);
                    Class<?> fieldClass = field.getType();
                    Class<?> mockClazz  = mock.getClass();
                    if (!boxedType(fieldClass).isAssignableFrom(boxedType(mockClazz)))
                    {
                        throw new ClassCastException(String.format(RUNTIME_EXCEPTION_INVALID_MOCK_TYPE_FOR_FIELD, fieldSignature, mockClazz.getName(), fieldClass.getName()));
                    }
                }
                catch (NoSuchFieldException e)
                {
                    throw new RuntimeException(String.format(RUNTIME_EXCEPTION_FIELD_NOT_FOUND, fieldName, className, formatStacktrace(e)));
                }
                catch (ClassNotFoundException e)
                {
                    throw new RuntimeException(String.format(RUNTIME_EXCEPTION_CLASS_NOT_FOUND_ON_FIELD_MOCKING, className, fieldSignature, formatStacktrace(e)));
                }
                catch (ClassCastException e)
                {
                    throw e;
                }
                catch (Throwable e)
                {
                    throw new RuntimeException(String.format(RUNTIME_EXCEPTION_ERROR_ON_FIELD_MOCKING, fieldSignature, formatStacktrace(e)));
                }
            }
        }

        private static Class<?> getClassOrInnerClass(String className)
                throws Throwable
        {
            try
            {
                return Class.forName(className);
            }
            catch (Throwable e1)
            {
                try
                {
                    // search for the inner class
                    return Class.forName(getInnerClassName(className));
                }
                catch (Throwable e2)
                {
                    throw e1;
                }
            }
        }

        private static String getInnerClassName(String className)
        {
            boolean      previousWasUpperCase = false;
            StringBuffer sb                   = new StringBuffer(className);
            for (int i = 0, size = sb.length(); i < size; i++)
            {
                char ch = sb.charAt(i);
                if (previousWasUpperCase && ch == '.')
                {
                    sb.setCharAt(i, '$');
                    previousWasUpperCase = false;
                }
                if (!previousWasUpperCase)
                {
                    previousWasUpperCase = (ch == Character.toUpperCase(ch));
                }
            }
            return sb.toString();
        }

        public void setCollectionItemsMocked(int number)
        {
            validateMockingNotInitialized();
            this.collectionItemsMocked = number;
        }

        public void setBooleanMock(Boolean bool)
        {
            setMock(Boolean.class, bool);
            setMock(boolean.class, (bool == null ? false : bool.booleanValue()));
        }

        public void setCharacterMock(Character character)
        {
            setMock(Character.class, character);
            setMock(char.class, (character == null ? ' ' : character.charValue()));
        }

        public void setStringMock(String string)
        {
            setMock(String.class, string);
        }

        public void setNumericMock(Integer number)
        {
            if (number == null)
            {
                setNumericMock((Double) null);
            }
            else
            {
                setNumericMock(Double.valueOf(number.intValue()));
            }
        }

        public void setNumericMock(Double number)
        {
            setMock(byte.class, number == null ? (byte) 0 : number.byteValue());
            setMock(short.class, number == null ? (short) 0 : number.shortValue());
            setMock(int.class, number == null ? (int) 0 : number.intValue());
            setMock(long.class, number == null ? (long) 0 : number.longValue());
            setMock(float.class, number == null ? (float) 0 : number.floatValue());
            setMock(double.class, number == null ? (double) 0 : number.doubleValue());

            setMock(Byte.class, number == null ? null : Byte.valueOf(number.byteValue()));
            setMock(Short.class, number == null ? null : Short.valueOf(number.shortValue()));
            setMock(Integer.class, number == null ? null : Integer.valueOf(number.intValue()));
            setMock(Long.class, number == null ? null : Long.valueOf(number.longValue()));
            setMock(Float.class, number == null ? null : Float.valueOf(number.floatValue()));
            setMock(Double.class, number == null ? null : Double.valueOf(number.doubleValue()));

            setMock(BigDecimal.class, number == null ? null : BigDecimal.valueOf(number));
            setMock(BigInteger.class, number == null ? null : BigInteger.valueOf(number.longValue()));
        }

        public void setTimestampAndDateMock(Date date)
        {
            if (date == null)
            {
                setTimestampAndDateMock((Long) null);
            }
            else
            {
                setTimestampAndDateMock(date.getTime());
            }
        }

        public void setTimestampAndDateMock(Long time)
        {
            setMock(java.util.Date.class, (time == null ? null : new Date(time)));
            setMock(java.sql.Timestamp.class, (time == null ? null : new java.sql.Timestamp(time)));
            setMock(java.sql.Date.class, (time == null ? null : new java.sql.Date(time)));
            if (time != null)
            {
                GregorianCalendar gc = new GregorianCalendar();
                gc.setTimeInMillis(time);
                setMock(GregorianCalendar.class, gc);
            }
            else
            {
                setMock(GregorianCalendar.class, null);
            }
        }

        public void setMock(String className, Object mock)
        {
            Class<Object> mockClazz = null;
            try
            {
                @SuppressWarnings("unchecked")
                Class<Object> clazz = (Class<Object>) getClassOrInnerClass(className);
                mockClazz = clazz;
            }
            catch (Throwable e)
            {
                throw new RuntimeException(String.format(RUNTIME_EXCEPTION_ERROR_MOCKING_TYPE, className, formatStacktrace(e)));
            }
            setMock(mockClazz, mock);
        }

        public <T> void setMock(Class<T> clazz, T object)
        {
            validateMockingNotInitialized();
            if (clazz != null)
            {
                if (object != null)
                {
                    if (!boxedType(clazz).isAssignableFrom(boxedType(object.getClass())))
                    {
                        throw new ClassCastException(String.format(RUNTIME_EXCEPTION_INVALID_MOCK_TYPE_FOR_TYPE, clazz.getCanonicalName(), object.getClass().getName(), clazz.getName()));
                    }
                }
                temporaryDefaultMocks.put(clazz, object);
            }
            else
            {
                throw new RuntimeException(RUNTIME_EXCEPTION_MISSING_MOCKING_CLASS);
            }
        }

        public <T> T getMock(Class<T> clazz)
        {
            return getMock(clazz, null);
        }

        public <T> T getRealInstanceWithNullFieldsMocked(Class<T> clazz)
                throws Throwable
        {
            T object = newInstance(clazz);
            instanciateFields(clazz, object, false);
            return object;
        }

        private <T> T newInstance(Class<T> clazz)
                throws Throwable
        {
            try
            {
                Constructor<T> construtor = clazz.getConstructor();
                construtor.setAccessible(true);
                return construtor.newInstance();
            }
            catch (Throwable e)
            {
                Throwable errorOrCause = null;
                if (!(e instanceof NoSuchMethodException))
                {
                    if (e.getCause() != null)
                    {
                        errorOrCause = e.getCause();
                    }
                    else
                    {
                        errorOrCause = e;
                    }
                }
                Constructor<?>[] constructors = clazz.getConstructors();
                for (Constructor<?> constructor : constructors)
                {
                    try
                    {
                        if (!constructor.isSynthetic())
                        {
                            constructor.setAccessible(true);
                            @SuppressWarnings("unchecked")
                            T object = (T) constructor.newInstance(getParametersMocked(constructor.getParameterTypes(), constructor.getGenericParameterTypes()));
                            return object;
                        }
                    }
                    catch (Throwable e1)
                    {
                        if (errorOrCause == null)
                        {
                            if (e1.getCause() != null)
                            {
                                errorOrCause = e1.getCause();
                            }
                            else
                            {
                                errorOrCause = e1;
                            }
                        }
                    }
                }
                if (errorOrCause != null)
                {
                    System.err.println(String.format(ERROR_MSG_INSTANTIATION_EXCEPTION, clazz.getCanonicalName(), formatStacktrace(errorOrCause)));
                    throw errorOrCause;
                }
            }
            throw new RuntimeException(String.format(RUNTIME_EXCEPTION_CONSTRUCTOR_NOT_FOUND_INSTANTIATING_TYPE, clazz.getCanonicalName()));
        }

        public void setMaximumExecutionNumberOnMethod(int maximumExecutionNumberOnMethod)
        {
            validateMockingNotInitialized();
            this.maximumExecutionNumberOnMethod = maximumExecutionNumberOnMethod;
        }

        public void setMaximumNestedMockInstantiation(int maximumNestedMockInstantiation)
        {
            validateMockingNotInitialized();
            this.maximumNestedMockInstantiation = maximumNestedMockInstantiation;
        }

        @SuppressWarnings("unchecked")
        private <T> T getMock(Class<T> clazz, Type genericClazz)
        {
            compileMocks();
            try
            {
                mockStack.get().push(clazz);
                nestedMockInstantiation.set(nestedMockInstantiation.get() + 1);
                if (nestedMockInstantiation.get() > maximumNestedMockInstantiation)
                {
                    throw new RuntimeException(String.format(RUNTIME_EXCEPTION_MOCKING_LOOPING, Integer.toString(maximumNestedMockInstantiation)));
                }

                // static mocks
                if (DEFAULT_PRIMITIVE_AND_WRAPPER_MOCKS.containsKey(clazz))
                {
                    return (T) DEFAULT_PRIMITIVE_AND_WRAPPER_MOCKS.get(clazz);
                }

                // static mocks
                if (DEFAULT_OBJECT_MOCKS.containsKey(clazz))
                {
                    return (T) DEFAULT_OBJECT_MOCKS.get(clazz);
                }

                // dynamic mocks
                // Comparable rule exception: NO superclass or interface class match
                if (clazz == Comparable.class)
                {
                    return (T) getMockedComparable();
                }

                // static mocks: superclass or interface class match
                for (Class<?> defaultMockClass : DEFAULT_OBJECT_MOCKS.keySet())
                {
                    if (clazz.isAssignableFrom(defaultMockClass))
                    {
                        return (T) DEFAULT_OBJECT_MOCKS.get(defaultMockClass);
                    }
                }

                // dynamic mocks
                if (clazz.isEnum())
                {
                    return (T) getMockedEnum(clazz, genericClazz);
                }

                // dynamic mocks
                if (clazz.isArray())
                {
                    return (T) getMockedArray(clazz, genericClazz);
                }

                // dynamic mocks
                if (Collection.class.isAssignableFrom(clazz))
                {
                    // superclass or interface class match
                    for (Class<?> implementationClass : COLLECTION_IMPLEMENTATIONS)
                    {
                        if (clazz.isAssignableFrom(implementationClass))
                        {
                            return (T) getMockedCollection(clazz, genericClazz, implementationClass);
                        }
                    }
                }

                // dynamic mocks
                if (Map.class.isAssignableFrom(clazz))
                {
                    // superclass or interface class match
                    for (Class<?> implementationClass : COLLECTION_IMPLEMENTATIONS)
                    {
                        if (clazz.isAssignableFrom(implementationClass))
                        {
                            return (T) getMockedMap(clazz, genericClazz, implementationClass);
                        }
                    }
                }

                // static mocks
                if (clazz.isAssignableFrom(EnumSet.class))
                {
                    return (T) EnumSet.allOf(SampleEnum.class);
                }

                // dynamic mocks
                if (clazz.isAssignableFrom(Iterator.class))
                {
                    return (T) getMock(ArrayList.class, null).iterator();
                }

                // collection with no default mock
                if (COLLECTION_ABSTRACTIONS.contains(clazz))
                {
                    System.out.println(String.format(WARN_MSG_DEFAULT_COLLECTION_NOT_MOCKED, clazz.getCanonicalName()));
                    return null;
                }

                // NO anonimous classes mocking verification
                if (clazz.getCanonicalName() == null || clazz.isAnonymousClass())
                {
                    System.out.println(String.format(WARN_MSG_DEFAULT_ANONIMOUS_CLASSES_NOT_MOCKED, clazz.getName()));
                    return null;
                }

                // NO final classes mocking verification
                if (Modifier.isFinal(clazz.getModifiers()))
                {
                    System.out.println(String.format(WARN_MSG_DEFAULT_FINAL_CLASSES_NOT_MOCKED, clazz.getCanonicalName()));
                    return null;
                }

                // NO java package mocking verification
                if (clazz.getCanonicalName().startsWith("java") &&
                        !clazz.getCanonicalName().startsWith("javax"))
                {
                    if (!Modifier.isInterface(clazz.getModifiers()) && !Modifier.isAbstract(clazz.getModifiers()))
                    {
                        System.out.println(String.format(WARN_MSG_DEFAULT_JAVA_PACKAGE_NOT_MOCKED, clazz.getCanonicalName()));
                        return null;
                    }
                }

                // dynamic mocks
                Class<?> lastClass = mockStack.get().pop();
                try
                {
                    return getMockitoMock(clazz);
                }
                finally
                {
                    mockStack.get().push(lastClass);
                }
            }
            finally
            {
                mockStack.get().pop();
                nestedMockInstantiation.set(nestedMockInstantiation.get() - 1);
            }
        }

        private static class MockedComparable
                implements Comparable<Object>
        {
            private int sequence;

            public MockedComparable(int sequence)
            {
                this.sequence = sequence;
            }

            @Override
            public int compareTo(Object o)
            {
                if (o instanceof MockedComparable)
                {
                    return sequence - ((MockedComparable) o).sequence;
                }
                else
                {
                    return -1;
                }
            }

            public String toString()
            {
                return "Mock for java.lang.Comparable, hashCode: " + hashCode() + ", sequence: " + sequence;
            }
        };

        private Comparable<?> getMockedComparable()
        {
            return new MockedComparable(comparableSequence++);
        }

        private static Object getMockedEnum(Class<?> clazz, Type genericClazz)
        {
            try
            {
                Method   enumValuesMethod = clazz.getMethod("values", new Class[0]);
                Object[] enumValues       = (Object[]) enumValuesMethod.invoke(null, new Object[0]);
                if (enumValues.length > 0)
                {
                    return enumValues[0];
                }
                else
                {
                    return null;
                }
            }
            catch (Throwable e)
            {
                System.out.println(String.format(WARN_MSG_ENUM_NOT_MOCKED, clazz.getCanonicalName(), formatStacktrace(e)));
                return null;
            }
        }

        private Object getMockedArray(Class<?> arrayClazz, Type genericArrayClass)
        {
            try
            {
                Class<?> itemClass = arrayClazz.getComponentType();
                Object   array     = Array.newInstance(itemClass, collectionItemsMocked);
                mockArrayItems(arrayClazz, genericArrayClass, array);
                return array;
            }
            catch (Throwable e)
            {
                System.out.println(String.format(WARN_MSG_ARRAY_NOT_MOCKED, arrayClazz.getCanonicalName(), formatStacktrace(e)));
                return null;
            }
        }

        private void mockArrayItems(Class<?> arrayClass, Type genericArrayClass, Object array)
        {
            try
            {
                Class<?> itemClass        = arrayClass.getComponentType();
                Type     genericItemClass = getFirstGeneric(genericArrayClass);
                if (Object.class.equals(itemClass))
                {
                    itemClass = Comparable.class;
                }
                for (int i = 0; i < collectionItemsMocked; i++)
                {
                    Object item = getMock(itemClass, genericItemClass);
                    Array.set(array, i, item);
                }
            }
            catch (Throwable e)
            {
                System.out.println(String.format(WARN_MSG_ARRAY_ITEM_NOT_MOCKED, arrayClass.getCanonicalName(), formatStacktrace(e)));
            }
        }

        @SuppressWarnings("unchecked")
        private Collection<Object> getMockedCollection(Class<?> clazz, Type genericClass, Class<?> implementationClass)
        {
            try
            {
                Collection<Object> collection;
                if (implementationClass == ArrayBlockingQueue.class)
                {
                    collection = new ArrayBlockingQueue<Object>(collectionItemsMocked);
                }
                else
                {
                    collection = (Collection<Object>) implementationClass.getConstructor().newInstance();
                }
                mockCollectionItems(clazz, genericClass, collection);
                return collection;
            }
            catch (Throwable e)
            {
                System.out.println(String.format(WARN_MSG_COLLECTION_NOT_MOCKED, clazz.getCanonicalName(), formatStacktrace(e)));
                return null;
            }
        }

        private void mockCollectionItems(Class<?> collectionClass, Type collectionGenericClazz, Collection<Object> collection)
        {
            try
            {
                Type     genericItemClass = getFirstGeneric(collectionGenericClazz);
                Class<?> itemClass        = getRawType(genericItemClass);
                if (Object.class.equals(itemClass))
                {
                    for (Method m : collectionClass.getMethods())
                    {
                        if (!m.isSynthetic() && "add".equals(m.getName()) && m.getParameterTypes().length == 1)
                        {
                            itemClass = m.getParameterTypes()[0];
                            break;
                        }

                    }
                }
                if (Object.class.equals(itemClass))
                {
                    itemClass = Comparable.class;
                }
                for (int i = 0; i < collectionItemsMocked; i++)
                {
                    Object item = getMock(itemClass, genericItemClass);
                    collection.add(item);
                }
            }
            catch (Throwable e)
            {
                System.out.println(String.format(WARN_MSG_COLLECTION_ITEM_NOT_MOCKED, collectionClass.getCanonicalName(), formatStacktrace(e)));
            }
        }

        @SuppressWarnings({ "unchecked", "rawtypes" })
        private Map<Object, Object> getMockedMap(Class<?> clazz, Type genericClazz, Class<?> implementationClass)
        {
            try
            {
                if (implementationClass == EnumMap.class)
                {
                    Map mock = (Map) new EnumMap<SampleEnum, String>(SampleEnum.class);
                    mock.put(SampleEnum.MOCKED_ENUM_VALUE_1, "MOCKED_ENUM_VALUE_1");
                    mock.put(SampleEnum.MOCKED_ENUM_VALUE_2, "MOCKED_ENUM_VALUE_2");
                    mock.put(SampleEnum.MOCKED_ENUM_VALUE_3, "MOCKED_ENUM_VALUE_3");
                    mock.put(SampleEnum.MOCKED_ENUM_VALUE_4, "MOCKED_ENUM_VALUE_4");
                    mock.put(SampleEnum.MOCKED_ENUM_VALUE_5, "MOCKED_ENUM_VALUE_5 ");
                    mock.put(SampleEnum.MOCKED_ENUM_VALUE_6, "MOCKED_ENUM_VALUE_6");
                    mock.put(SampleEnum.MOCKED_ENUM_VALUE_7, "MOCKED_ENUM_VALUE_7");
                    mock.put(SampleEnum.MOCKED_ENUM_VALUE_8, "MOCKED_ENUM_VALUE_8");
                    mock.put(SampleEnum.MOCKED_ENUM_VALUE_9, "MOCKED_ENUM_VALUE_9");
                    mock.put(SampleEnum.MOCKED_ENUM_VALUE_10, "MOCKED_ENUM_VALUE_10");
                    return mock;
                }
                else
                {
                    Map<Object, Object> map = (Map<Object, Object>) implementationClass.getConstructor().newInstance();
                    mockMapEntries(clazz, genericClazz, map);
                    return map;
                }
            }
            catch (Throwable e)
            {
                System.out.println(String.format(WARN_MSG_MAP_NOT_MOCKED, clazz.getCanonicalName(), formatStacktrace(e)));
                return null;
            }
        }

        private void mockMapEntries(Class<?> mapClass, Type mapGenericClazz, Map<Object, Object> map)
        {
            try
            {
                Type     genericKeyClass   = getFirstGeneric(mapGenericClazz);
                Class<?> keyClass          = getRawType(genericKeyClass);
                Type     genericValueClass = getSecondGeneric(mapGenericClazz);
                Class<?> valueClass        = getRawType(genericValueClass);
                if (Object.class.equals(keyClass) && Object.class.equals(valueClass))
                {
                    for (Method m : mapClass.getMethods())
                    {
                        if (!m.isSynthetic() && "put".equals(m.getName()) && m.getParameterTypes().length == 2)
                        {
                            keyClass   = m.getParameterTypes()[0];
                            valueClass = m.getParameterTypes()[1];
                            break;
                        }

                    }
                }
                if (Object.class.equals(keyClass))
                {
                    keyClass = Comparable.class;
                }
                if (Object.class.equals(valueClass))
                {
                    valueClass = Comparable.class;
                }
                for (int i = 0; i < collectionItemsMocked; i++)
                {
                    Object key   = getMock(keyClass, genericKeyClass);
                    Object value = getMock(valueClass, genericValueClass);
                    map.put(key, value);
                }
            }
            catch (Throwable e)
            {
                System.out.println(String.format(WARN_MSG_MAP_ITEM_NOT_MOCKED, mapClass.getCanonicalName(), formatStacktrace(e)));
            }
        }

        private <T> T getMockitoMock(Class<T> clazz)
        {
            try
            {
                T       mock                       = Mockito.mock(clazz, new Answer<T>(clazz));
                boolean loopingInstantiatingFields = instanciateFields(clazz, mock, true);
                if (loopingInstantiatingFields)
                {
                    return null;
                }
                else
                {
                    return mock;
                }
            }
            catch (Throwable e)
            {
                System.out.println(String.format(WARN_MSG_MOCKITO_MOCKING_NOT_MOCKED, clazz.getCanonicalName(), formatStacktrace(e)));
                return null;
            }
        }

        private class Answer<T>
                implements org.mockito.stubbing.Answer<T>
        {
            private Class<T>                          clazz;
            private Map<String, Integer>              executionNumberOnMethod = new HashMap<String, Integer>();
            private Map<MethodReturnCacheKey, Object> mockedMethodReturnCache = new HashMap<MethodReturnCacheKey, Object>();

            public Answer(Class<T> clazz)
            {
                this.clazz = clazz;
            }

            @Override
            public T answer(InvocationOnMock invocation)
                    throws Throwable
            {
                synchronized (mockedMethodReturnCache)
                {
                    Object   mockObject               = invocation.getMock();
                    Method   method                   = invocation.getMethod();
                    Class<?> methodDeclaringClass     = method.getDeclaringClass();
                    Object[] parameterValues          = invocation.getArguments();
                    Class<?> returnType               = getReturnType(method, parameterValues);
                    Type     genericReturnType        = method.getGenericReturnType();
                    String   methodExecutionSignature = getMethodExecutionSignature(method, returnType);
                    int      executionNumber          = getExecutionNumber(methodExecutionSignature);

                    String   simpleMethodSignature    = getSimpleMethodSignature(methodDeclaringClass, method);
                    String   completeMethodSignature  = getCompleteMethodSignature(methodDeclaringClass, method);

                    throwExceptionIfMocked(executionNumber, simpleMethodSignature);
                    throwExceptionIfMocked(executionNumber, completeMethodSignature);

                    if (DEFAULT_METHOD_RETURN_MOCKS.containsKey(simpleMethodSignature))
                    {
                        @SuppressWarnings("unchecked")
                        T returnMock = (T) getReturMethodMock(executionNumber, simpleMethodSignature);
                        validateReturnedValueType(simpleMethodSignature, returnMock, returnType);
                        return returnMock;
                    }

                    if (DEFAULT_METHOD_RETURN_MOCKS.containsKey(completeMethodSignature))
                    {
                        @SuppressWarnings("unchecked")
                        T returnMock = (T) getReturMethodMock(executionNumber, completeMethodSignature);
                        validateReturnedValueType(completeMethodSignature, returnMock, returnType);
                        return returnMock;
                    }

                    // returns a generic toString
                    if ("toString".equals(method.getName()) && method.getParameterTypes().length == 0)
                    {
                        @SuppressWarnings("unchecked")
                        T toString = (T) (mockObject.getClass().getName() + "@" + Integer.toHexString(hashCode()));
                        return toString;
                    }

                    return mockedMethodReturnCache(mockObject, completeMethodSignature, returnType, genericReturnType);
                }
            }

            private Class<?> getReturnType(Method method, Object[] parameters)
            {
                if (method.getReturnType() == Object.class)
                {
                    Type   parameterizedReturnType = method.getGenericReturnType();
                    Type[] parameterizedParameters = method.getGenericParameterTypes();
                    for (int i = 0, size = parameterizedParameters.length; i < size; i++)
                    {
                        try
                        {
                            if (parameters[i] instanceof Class &&
                                    parameterizedParameters[i] instanceof ParameterizedType)
                            {
                                ParameterizedType parameterizedType     = (ParameterizedType) parameterizedParameters[i];
                                Type              parameterConcreteType = parameterizedType.getActualTypeArguments()[0];
                                if (parameterConcreteType == parameterizedReturnType)
                                {
                                    return (Class<?>) parameters[i];
                                }
                            }
                        }
                        catch (Throwable e)
                        {
                        }
                    }
                    try
                    {
                        return GenericMetadataSupport.inferFrom(clazz).resolveGenericReturnType(method).rawType();
                    }
                    catch (Throwable e)
                    {
                    }
                }
                return method.getReturnType();
            }

            private void throwExceptionIfMocked(int executionNumber, String methodSignature)
                    throws Throwable
            {
                Throwable exception1 = getMethodExceptionThrowable(executionNumber, methodSignature);
                if (exception1 != null)
                {
                    throwException(exception1);
                }
            }

            private Throwable getMethodExceptionThrowable(int executionNumber, String methodSignature)
            {
                Throwable[] methodExecutionThrowables = DEFAULT_METHOD_EXECUTIONS_THROWABLES.get(methodSignature);
                if (methodExecutionThrowables != null && methodExecutionThrowables.length > 0)
                {
                    if (executionNumber >= 0 && executionNumber < methodExecutionThrowables.length)
                    {
                        return methodExecutionThrowables[executionNumber];
                    }
                    else
                    {
                        return methodExecutionThrowables[methodExecutionThrowables.length - 1];
                    }
                }
                else
                {
                    return null;
                }
            }

            private void throwException(Throwable exception)
                    throws Throwable
            {
                StackTraceElement[] sampleStackTrace = new Exception().getStackTrace();
                if (sampleStackTrace.length > 0)
                {
                    StackTraceElement stackTrace = sampleStackTrace[0];
                    sampleStackTrace[0] = new StackTraceElement(this.getClass().getName(), stackTrace.getMethodName(), stackTrace.getFileName(), stackTrace.getLineNumber() + 7);
                }
                exception.setStackTrace(sampleStackTrace);
                throw exception;
            }

            private T mockedMethodReturnCache(Object mockObject, String completeMethodSignature, Class<?> actualReturnType, Type genericReturnType)
            {
                MethodReturnCacheKey cacheKey = new MethodReturnCacheKey(mockObject, completeMethodSignature, actualReturnType);
                if (mockedMethodReturnCache.containsKey(cacheKey))
                {
                    // returns a cached mock if exists
                    @SuppressWarnings("unchecked")
                    T cachedMock = (T) mockedMethodReturnCache.get(cacheKey);
                    return cachedMock;
                }
                else
                {
                    // create a new mock and caches it
                    @SuppressWarnings("unchecked")
                    T newMock = (T) getMock(actualReturnType, genericReturnType);
                    mockedMethodReturnCache.put(cacheKey, newMock);
                    return newMock;
                }
            }

            private String getMethodExecutionSignature(Method method, Class<?> returnType)
            {
                return getCompleteMethodSignature(method.getDeclaringClass(), method) + "_" + returnType.getCanonicalName();
            }

            private int getExecutionNumber(String methodExecutionSignature)
            {
                Integer executionNumber = executionNumberOnMethod.get(methodExecutionSignature);
                if (executionNumber == null)
                {
                    executionNumber = 0;
                }
                executionNumberOnMethod.put(methodExecutionSignature, executionNumber + 1);
                if (executionNumber + 1 > maximumExecutionNumberOnMethod)
                {
                    throw new RuntimeException(String.format(RUNTIME_EXCEPTION_LOGIC_LOOPING_ON_METHOD_EXECUTION, methodExecutionSignature,
                            Integer.toString(maximumExecutionNumberOnMethod)));
                }
                return executionNumber;
            }

            private Object getReturMethodMock(int executionNumber, String completeMethodSignature)
            {
                Object[] returns = DEFAULT_METHOD_RETURN_MOCKS.get(completeMethodSignature);
                if (returns != null && returns.length > 0)
                {
                    if (executionNumber >= 0 && executionNumber < returns.length)
                    {
                        return returns[executionNumber];
                    }
                    else
                    {
                        return returns[returns.length - 1];
                    }
                }
                else
                {
                    return null;
                }
            }
        }

        private static class MethodReturnCacheKey
        {
            private Object   mockObject;
            private String   completeMethodSignature;
            private Class<?> actualReturnType;

            public MethodReturnCacheKey(Object mockObject, String completeMethodSignature, Class<?> actualReturnType)
            {
                super();
                this.mockObject              = mockObject;
                this.completeMethodSignature = completeMethodSignature;
                this.actualReturnType        = actualReturnType;
            }

            @Override
            public int hashCode()
            {
                final int prime  = 31;
                int       result = 1;
                result = prime * result + ((actualReturnType == null) ? 0 : actualReturnType.hashCode());
                result = prime * result + ((completeMethodSignature == null) ? 0 : completeMethodSignature.hashCode());
                result = prime * result + ((mockObject == null) ? 0 : mockObject.hashCode());
                return result;
            }

            @Override
            public boolean equals(Object obj)
            {
                if (this == obj)
                {
                    return true;
                }
                if (obj == null)
                {
                    return false;
                }
                if (getClass() != obj.getClass())
                {
                    return false;
                }
                MethodReturnCacheKey other = (MethodReturnCacheKey) obj;
                if (actualReturnType == null)
                {
                    if (other.actualReturnType != null)
                    {
                        return false;
                    }
                }
                else if (!actualReturnType.equals(other.actualReturnType))
                {
                    return false;
                }
                if (completeMethodSignature == null)
                {
                    if (other.completeMethodSignature != null)
                    {
                        return false;
                    }
                }
                else if (!completeMethodSignature.equals(other.completeMethodSignature))
                {
                    return false;
                }
                if (mockObject == null)
                {
                    if (other.mockObject != null)
                    {
                        return false;
                    }
                }
                else if (!mockObject.equals(other.mockObject))
                {
                    return false;
                }
                return true;
            }

        }

        private String getCompleteMethodSignature(Class<?> methodDeclaringClass, Method method)
        {
            return methodDeclaringClass.getCanonicalName() + "." + method.getName() + "(" + toString(method.getParameterTypes()) + ")";
        }

        private void validateReturnedValueType(String methodSignature, Object object, Class<?> clazz)
        {
            if (object != null && clazz != null)
            {
                if (!boxedType(clazz).isAssignableFrom(boxedType(object.getClass())))
                {
                    throw new ClassCastException(String.format(RUNTIME_EXCEPTION_INVALID_MOCK_TYPE_FOR_METHOD_RETURN, methodSignature, object.getClass().getName(), clazz.getName()));
                }
            }
        }

        private static Class<?> boxedType(Class<?> clazz)
        {
            Class<?> boxedType = BOXED_TYPES_MAP.get(clazz);
            if (boxedType != null)
            {
                return boxedType;
            }
            else
            {
                return clazz;
            }
        }

        private String toStringMockStack()
        {
            List<Class<?>> stack       = mockStack.get();
            StringBuffer   sb          = new StringBuffer();
            int            collections = 0;
            for (int i = stack.size() - 1; i >= 0; i--)
            {
                if (sb.length() != 0 && collections == 0)
                {
                    sb.append(" => ");
                }
                Class<?> clazz = stack.get(i);
                if (COLLECTION_ABSTRACTIONS.contains(clazz) ||
                        COLLECTION_IMPLEMENTATIONS.contains(clazz))
                {
                    sb.append(clazz.getSimpleName());
                    sb.append("<");
                    collections++;
                }
                else
                {
                    sb.append(clazz.getCanonicalName());
                    for (int j = 0; j < collections; j++)
                    {
                        sb.append(">");
                    }
                    collections = 0;
                }
            }
            return sb.toString();
        }

        private String toString(Class<?>[] classes)
        {
            StringBuffer sb = new StringBuffer();
            for (Class<?> clazz : classes)
            {
                if (sb.length() != 0)
                {
                    sb.append(", ");
                }
                sb.append(clazz.getCanonicalName());
            }
            return sb.toString();
        }

        private String toString(Object[] parameters)
        {
            StringBuffer txt = new StringBuffer();
            if (parameters != null)
            {
                for (Object parameter : parameters)
                {
                    if (txt.length() != 0)
                    {
                        txt.append(", ");
                    }
                    if (parameter == null)
                    {
                        txt.append("null");
                    }
                    else
                    {
                        if (parameter instanceof String)
                        {
                            txt.append('\"');
                            txt.append(parameter.toString());
                            txt.append('\"');
                        }
                        else if (parameter.getClass().isArray())
                        {
                            Method arrayToStringMethod = null;
                            try
                            {
                                arrayToStringMethod = Arrays.class.getMethod("toString", parameter.getClass());
                                txt.append(arrayToStringMethod.invoke(null, parameter));
                            }
                            catch (Throwable e)
                            {
                                if (parameter instanceof Object[])
                                {
                                    txt.append(Arrays.toString((Object[]) parameter));
                                }
                                else
                                {
                                    txt.append(parameter.toString());
                                }
                            }
                        }
                        else
                        {
                            txt.append(parameter.toString());
                        }
                    }
                }
            }
            if (txt.length() > 0)
            {
                txt.insert(0, '(');
            }
            else
            {
                txt.append('(');
            }
            txt.append(')');
            return txt.toString();
        }

        private String getSimpleMethodSignature(Class<?> methodDeclaringClass, Method method)
        {
            return methodDeclaringClass.getCanonicalName() + "." + method.getName();
        }

        private boolean instanciateFields(Class<?> clazz, Object object, boolean mockedInstance)
        {
            if (object != null)
            {
                try
                {
                    if (mockStack.get().contains(clazz))
                    {
                        mockStack.get().push(clazz);
                        System.out.println(String.format(WARN_MSG_MOCKING_INSTANTIATING_FIELDS_LOOP, clazz.getCanonicalName(), clazz.getCanonicalName(), toStringMockStack()));
                        return true;
                    }
                    else
                    {
                        mockStack.get().push(clazz);
                        List<Class<?>> superclasses = getSuperclasses(clazz);
                        for (Class<?> superclass : superclasses)
                        {
                            instanciateSuperClassFields(superclass, object, mockedInstance);
                        }
                        return false;
                    }
                }
                finally
                {
                    mockStack.get().pop();
                }
            }
            else
            {
                return false;
            }
        }

        private static List<Class<?>> getSuperclasses(Class<?> clazz)
        {
            List<Class<?>> superclasses = new ArrayList<Class<?>>();
            Class<?>       superclass   = clazz;
            while (superclass != null &&
                    superclass != Object.class &&
                    !superclass.getCanonicalName().startsWith("org.jboss.logging") &&
                    !superclass.getCanonicalName().startsWith("java.util.logging") &&
                    !superclass.getCanonicalName().startsWith("org.apache.log4j"))
            {
                superclasses.add(superclass);
                superclass = superclass.getSuperclass();
            }
            return superclasses;
        }

        private void instanciateSuperClassFields(Class<?> superclass, Object object, boolean mockedInstance)
        {
            Field[] fields = superclass.getDeclaredFields();
            for (Field field : fields)
            {
                if (!field.isSynthetic())
                {
                    String fieldSignature = null;
                    try
                    {
                        field.setAccessible(true);
                        fieldSignature = getFieldSignature(superclass, field);
                        if (!field.getName().startsWith("$") && !Modifier.isFinal(field.getModifiers()))
                        {
                            if (DEFAULT_FIELD_MOCKS.containsKey(fieldSignature))
                            {
                                Object fieldValue = DEFAULT_FIELD_MOCKS.get(fieldSignature);
                                field.set(object, fieldValue);
                            }
                            else
                            {
                                // rules:
                                // 1. if a mocked instance (made by Mockito.mock), instantiate and override all
                                // origin fields with mocked values
                                // 2. if a real instance, mock only null fields
                                if (mockedInstance || field.get(object) == null)
                                {
                                    Object fieldValue = getMock(field.getType(), field.getGenericType());
                                    field.set(object, fieldValue);
                                }
                            }
                        }
                    }
                    catch (Throwable e)
                    {
                        System.out.println(String.format(WARN_MSG_ON_FIELD_MOCKING, fieldSignature, formatStacktrace(e)));
                    }
                }
            }
        }

        private String getFieldSignature(Class<?> clazz, Field field)
        {
            return clazz.getCanonicalName() + "." + field.getName();
        }

        private static Type getFirstGeneric(Type generic)
        {
            try
            {
                ParameterizedType tipoParametrizado = (ParameterizedType) generic;
                return tipoParametrizado.getActualTypeArguments()[0];
            }
            catch (Throwable e)
            {
                try
                {
                    GenericArrayType parameterizedType = (GenericArrayType) generic;
                    return parameterizedType.getGenericComponentType();
                }
                catch (Throwable e1)
                {
                    return Object.class;
                }
            }
        }

        private static Type getSecondGeneric(Type generic)
        {
            try
            {
                ParameterizedType tipoParametrizado = (ParameterizedType) generic;
                return tipoParametrizado.getActualTypeArguments()[1];
            }
            catch (Throwable e)
            {
                return Object.class;
            }
        }

        private static Class<?> getRawType(Type generic)
        {
            if (generic instanceof ParameterizedType)
            {
                return (Class<?>) ((ParameterizedType) generic).getRawType();
            }
            else if (generic instanceof Class)
            {
                return (Class<?>) generic;
            }
            else
            {
                return Object.class;
            }
        }

        private void compileMocks()
        {
            if (DEFAULT_PRIMITIVE_AND_WRAPPER_MOCKS == null)
            {
                DEFAULT_PRIMITIVE_AND_WRAPPER_MOCKS = new LinkedHashMap<Class<?>, Object>();
                DEFAULT_OBJECT_MOCKS                = new LinkedHashMap<Class<?>, Object>();

                List<Class<?>> classes = new ArrayList<Class<?>>(temporaryDefaultMocks.keySet());
                sortFromGenericClassToEspecificClass(classes);
                for (Class<?> clazz : classes)
                {
                    if (PRIMITIVES_AND_WRAPPERS.contains(clazz))
                    {
                        DEFAULT_PRIMITIVE_AND_WRAPPER_MOCKS.put(clazz, temporaryDefaultMocks.get(clazz));
                    }
                    else
                    {
                        DEFAULT_OBJECT_MOCKS.put(clazz, temporaryDefaultMocks.get(clazz));
                    }
                }
            }
        }

        private static class FromGenericClassToEspecificClassSort
                implements Comparator<Class<?>>
        {

            @Override
            public int compare(Class<?> clazz1, Class<?> clazz2)
            {
                if (clazz1.isAssignableFrom(clazz2))
                {
                    return -1;
                }
                else if (clazz2.isAssignableFrom(clazz1))
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }

        }

        private static String formatStacktrace(Throwable e)
        {
            StringBuffer sb      = new StringBuffer();
            String       message = "";
            if (e.getMessage() != null)
            {
                message = e.getMessage();
            }
            String description = e.getClass().getCanonicalName() + ": " + message;
            formatStacktrace(sb, description, e);
            return sb.toString();
        }

        private static void formatStacktrace(StringBuffer sb, String description, Throwable e)
        {
            sb.append(description);
            sb.append('\n');
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stack : stackTrace)
            {
                sb.append("\tat ");
                sb.append(stack.getClassName());
                sb.append('.');
                sb.append(stack.getMethodName());
                sb.append('(');
                sb.append(stack.getFileName());
                sb.append(':');
                sb.append(stack.getLineNumber());
                sb.append(')');
                sb.append('\n');
            }
            if (e.getCause() != null)
            {
                String cause = "Caused by: " + e.getClass().getCanonicalName();
                formatStacktrace(sb, cause, e.getCause());
            }
        }

        public Object[] executeClasses(Class<?>... classes)
                throws Throwable
        {
            if (classes != null)
            {
                return executeClasses(Arrays.asList(classes)).toArray();
            }
            else
            {
                return null;
            }
        }

        public List<Object> executeClasses(List<Class<?>> classes)
                throws Throwable
        {
            if (classes != null)
            {
                List<Object> executedObjects = new ArrayList<Object>();
                for (Class<?> clazz : classes)
                {
                    executedObjects.add(executeClass(clazz));
                }
                return executedObjects;
            }
            else
            {
                return null;
            }
        }

        public <T> T executeClass(Class<T> clazz)
                throws Throwable
        {
            T        object  = getRealInstanceWithNullFieldsMocked(clazz);
            Method[] methods = clazz.getDeclaredMethods();
            executeMethods(object, clazz, methods);
            return object;
        }

        public void executeObjects(Object... objects)
                throws Throwable
        {
            if (objects != null)
            {
                executeObjects(Arrays.asList(objects));
            }
        }

        public void executeObjects(List<Object> objects)
                throws Throwable
        {
            if (objects != null)
            {
                for (Object object : objects)
                {
                    executeObject(object);
                }
            }
        }

        public void executeObject(Object object)
                throws Throwable
        {
            if (object != null)
            {
                @SuppressWarnings("unchecked")
                Class<Object> clazz   = (Class<Object>) object.getClass();
                Method[]      methods = clazz.getDeclaredMethods();
                executeMethods(object, clazz, methods);
            }
        }

        private <T> void executeMethods(T object, Class<T> clazz, Method[] methods)
                throws Throwable
        {
            sortMethodsAlphabetically(methods);
            Throwable errorOrCause = null;
            for (Method method : methods)
            {
                if (!method.isSynthetic()
                        && !Modifier.isPrivate(method.getModifiers())
                        && !Modifier.isAbstract(method.getModifiers())
                        && !method.getDeclaringClass().getCanonicalName().startsWith("java.lang."))
                {
                    method.setAccessible(true);
                    String simpleMethodSignature   = getSimpleMethodSignature(clazz, method);
                    String completeMethodSignature = getCompleteMethodSignature(clazz, method);
                    if (!METHODS_NOT_TO_RUN.contains(simpleMethodSignature) && !METHODS_NOT_TO_RUN.contains(completeMethodSignature))
                    {
                        String filledCompleteMethodSignatureParameters = completeMethodSignature;
                        // System.out.print(String.format(MSG_EXECUTING_METHOD, simpleMethodSignature));
                        try
                        {
                            Object[] parameters = null;
                            if (compatibleParameterTypesFromCompleteMethodSignature(clazz, method))
                            {
                                parameters = DEFAULT_METHOD_EXECUTIONS_PARAMETERS.get(completeMethodSignature);
                            }
                            else if (compatibleParameterTypesFromSimpleMethodSignature(clazz, method))
                            {
                                parameters = DEFAULT_METHOD_EXECUTIONS_PARAMETERS.get(simpleMethodSignature);
                            }
                            else
                            {
                                parameters = getParametersMocked(method.getParameterTypes(), method.getGenericParameterTypes());
                            }
                            filledCompleteMethodSignatureParameters = simpleMethodSignature + toString(parameters);
                            // System.out.println(toString(parameters));
                            method.invoke(object, parameters);
                        }
                        catch (Throwable e)
                        {
                            if (errorOrCause == null)
                            {
                                if (e.getCause() != null)
                                {
                                    errorOrCause = e.getCause();
                                }
                                else
                                {
                                    errorOrCause = e;
                                }
                            }
                            if (e.getCause() != null)
                            {
                                System.out.println(String.format(WARN_MSG_ERROR_EXECUTING_METHOD, filledCompleteMethodSignatureParameters, formatStacktrace(e.getCause()).replace("\t", "\t\t")));
                            }
                            else
                            {
                                System.out.println(String.format(WARN_MSG_ERROR_EXECUTING_METHOD, filledCompleteMethodSignatureParameters, formatStacktrace(e).replace("\t", "\t\t")));
                            }
                        }
                    }
                }
            }
            if (errorOrCause != null)
            {
                throw errorOrCause;
            }
        }

        private boolean compatibleParameterTypesFromCompleteMethodSignature(Class<?> clazz, Method method)
        {
            String   completeMethodSignature = getCompleteMethodSignature(clazz, method);
            Object[] parameterValues         = DEFAULT_METHOD_EXECUTIONS_PARAMETERS.get(completeMethodSignature);
            if (parameterValues != null)
            {
                if (!parameterTypesOk(clazz, method, completeMethodSignature))
                {
                    throw new RuntimeException(String.format(RUNTIME_EXCEPTION_INVALID_MOCKING_TYPE_FOR_METHOD_PARAMETER, completeMethodSignature, Arrays.toString(parameterValues)));
                }
                else
                {
                    return true;
                }
            }
            else
            {
                return false;
            }
        }

        private boolean compatibleParameterTypesFromSimpleMethodSignature(Class<?> clazz, Method method)
        {
            String simpleMethodSignature = getSimpleMethodSignature(clazz, method);
            return parameterTypesOk(clazz, method, simpleMethodSignature);
        }

        private boolean parameterTypesOk(Class<?> clazz, Method method, String methodSignature)
        {
            Object[] parameterValues = DEFAULT_METHOD_EXECUTIONS_PARAMETERS.get(methodSignature);
            if (parameterValues != null)
            {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterValues.length == parameterTypes.length)
                {
                    for (int i = 0, size = parameterTypes.length; i < size; i++)
                    {
                        if (parameterValues[i] == null)
                        {
                            if (parameterTypes[i].isPrimitive())
                            {
                                return false;
                            }
                        }
                        else
                        {
                            if (!boxedType(parameterTypes[i]).isAssignableFrom(boxedType(parameterValues[i].getClass())))
                            {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        private Object[] getParametersMocked(Class<?>[] parameterClasses, Type[] genericParameterTypes)
        {
            Object[] parameterValues = new Object[parameterClasses.length];
            for (int i = 0, size = parameterClasses.length; i < size; i++)
            {
                Type generic = null;
                if (genericParameterTypes != null && i < genericParameterTypes.length)
                {
                    generic = genericParameterTypes[i];
                }
                parameterValues[i] = getMock(parameterClasses[i], generic);
            }
            return parameterValues;
        }

        private void sortMethodsAlphabetically(Method[] methods)
        {
            Arrays.sort(methods, new Comparator<Method>()
            {
                @Override
                public int compare(Method method1, Method method2)
                {
                    String signature1 = getCompleteMethodSignature(method1.getDeclaringClass(), method1);
                    String signature2 = getCompleteMethodSignature(method2.getDeclaringClass(), method2);
                    return signature1.compareTo(signature2);
                }
            });
        }
    }

}
