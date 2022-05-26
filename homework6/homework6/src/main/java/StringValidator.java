import Resources.TestResources;

public class StringValidator {
    public boolean validate(String text){
        for(char c:TestResources.NUMBERS_ARRAY){
            if(text.contains(Character.toString(c))){
                return false;
            }
        }

        return true;
    }
}
