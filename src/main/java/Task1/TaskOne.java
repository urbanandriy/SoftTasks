package Task1;

import InputClases.InputClass;

public class TaskOne {

    public static void main(String[] args) throws Exception {
        FirstValidation firstValidation = new FirstValidation();
        InputClass inputClass = new InputClass();
        ProgramLogic programLogic = new ProgramLogic();
        System.out.println("Hello, Please enter size of square");
        int num1 = firstValidation.validation(inputClass.inputInt());
        int num2 = firstValidation.validation(inputClass.inputInt());
        System.out.println(programLogic.method(num1, num2));
    }
}


