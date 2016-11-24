class TextInput {
    protected String value = "";
    public void add(char c){
        value = value + c;
    }
    public String getValue(){
        return value;
    }
}

class NumericInput extends TextInput{
    public void add(char c){
        if(Character.isDigit(c)){
           value = value + c;
        }
    }
}

public class UserInput {
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
