package com.bhlesson03.class02;
/**自定义异常
 * 自定义异常通常都是通过继承一个异常类来实现的
 * 1、Throwable
 * 2、Exception
 * 3、RuntimeException
 *
 * 自定义异常的实现，提供构造方法
 * 异常对象本身是没有实际功能，只是一个有意义的标识
 *
 * 受检异常: Exception
 *          在编译期检测，在调用抛出这个异常的方法时，必须显示的使用try...catch...
 * 定义方法时必须声明所有可能会抛出的exception;在调用这个方法时，必须捕获它的
 * checked exception,不然就得把它的exception传递下去; exception是从
 * java.lang. Exception类衍生出来的。例如: lOException， SQL Exception就属于Exception
 * 非受检异常: RuntimeException
 *          在运行期检测，在调用抛出这个异常的方法时，可以不用显示的使用try...catch...
 * 在定义方法时不需要声明会抛出runtime exception;在调用这个方法时不需要捕获这个
 * runtime exception; runtime exception是从java.lang.RuntimeException或jva.lang.Error类
 * 衍生出来的。例如: NullPointException, IndexOutOfBoundsException就 属于runtime exception
 *
 * 在使用自定义异常时，根据实际的业务要求，来决定使用哪个作为父类
 **/

//使用Exception受检异常来作为父类
public class MyException extends Exception{
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
