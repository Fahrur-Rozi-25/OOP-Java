package Programs.util;

import Programs.Anotation.NotBlank;
import Programs.Error.RunTimeException;
import Programs.Error.ValidationException;
import Programs.data.LoginRequest;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate (LoginRequest loginRequest) throws ValidationException , NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username Tidak Boleh Null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username Tidak Boleh Kosong");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password Tidak Boleh Null");
    } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password Tidak Boleh Kosong");
    }
    }
    public static void ValidationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for (var Field : fields){
            Field.setAccessible(true);

            if (Field.getAnnotation(NotBlank.class) != null) {
                try {
                    String value = (String) Field.get(object);
                    if (value == null || value.isBlank()){
                        throw new RunTimeException("Field "+Field.getName()+" Is Blank");

                    }
                } catch (IllegalAccessException e) {
                    System.out.println("Tidak Bisa Mengakses Field" +Field.getName());
                }
            }
        }
    }
}
