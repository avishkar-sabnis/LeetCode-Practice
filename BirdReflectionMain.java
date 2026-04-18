import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BirdReflectionMain {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        Class<BirdReflection> birdieReflection = BirdReflection.class;
        Method[] method = birdieReflection.getMethods();

        System.out.println(method.getClass());
        System.out.println(birdieReflection.getName());

        Object eagleObject = birdieReflection.getDeclaredConstructor()
                .newInstance();
        Method flyMethod = eagleObject.getClass().getMethod("birdName");
        String result = String.valueOf(flyMethod.invoke(eagleObject));
        System.out.println(result);

        Field[] fields = birdieReflection.getDeclaredFields();
        for(Field fieldsToPrint: fields){
            System.out.println(fieldsToPrint);
        }

        Constructor<BirdReflection> constructor =
                birdieReflection.getDeclaredConstructor();

        constructor.trySetAccessible();

        BirdReflection bird = constructor.newInstance();

        System.out.println("Object created: " + bird);


    }
}