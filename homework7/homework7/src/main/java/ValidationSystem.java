import Validators.NumbersValidator;
import Validators.StringValidator;
import Validators.Validator;

import java.util.HashMap;
import java.util.Map;

public final class ValidationSystem {
    public static final Map<Class, Validator> validatorMap = new HashMap<>() {{
        put(String.class, new StringValidator());
        put(Integer.class, new NumbersValidator());
    }};

    public static <T> boolean validate(T value) {
        return validatorMap.get(value.getClass()).isValid(value);
    }
}
