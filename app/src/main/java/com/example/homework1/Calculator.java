package com.example.homework1;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.math.BigDecimal;

public class Calculator extends AppCompatActivity {
    private String oldNumber = "";
    private String operation = "+";
    private boolean newOperation = true;
    private EditText screen;
    //    private Button ac, plusMinus, div, mul, sub, add, equal, one, two, three, four, five, six, seven, eight, nine, zero;
//    private String input, answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        screen = findViewById(R.id.screen);

//        ac= findViewById(R.id.clear);
//        plusMinus= findViewById(R.id.plusMinus);
//        div= findViewById(R.id.division);
//        mul= findViewById(R.id.multiplication);
//        sub= findViewById(R.id.minus);
//        add= findViewById(R.id.plus);
//        equal= findViewById(R.id.equal);
//        one= findViewById(R.id.one);
//        two= findViewById(R.id.two);
//        three= findViewById(R.id.three);
//        four= findViewById(R.id.four);
//        five= findViewById(R.id.five);
//        six= findViewById(R.id.six);
//        seven= findViewById(R.id.seven);
//        eight= findViewById(R.id.eight);
//        nine= findViewById(R.id.nine);
//        zero= findViewById(R.id.zero);
//
//
//
//
//
//
//    }
//
//    public void ButtonClick (View view){
//        Button button= (Button) view;
//        String data= button.getText().toString();
//        switch (data){
//            case "ac":
//                input=" ";
//                break;
//            case "answer":
//                input+=answer;
//                break;
//            case "x":
//                input+="*";
//                break;
//            case "/":
//                input+="/";
//                break;
//            case "=":
//                Solve();
//                answer=input;
//                break;
//            case "-":
//                input+="-";
//                break;
//            case "+":
//                input+="+";
//                break;
//        }
//
//
//
//    }
//
//    private void Solve() {
//        if (input.split("\\*").length==2){
//            String num[]= input.split("\\*");
//            double mul=Double.parseDouble(num[0])*Double.parseDouble(num[1]);
//            input+=mul;
//
//
//        }
//        if (input.split("/").length==2){
//            String num[]= input.split("");
//            double div=Double.parseDouble(num[0])/Double.parseDouble(num[1]);
//            input=div+ "";
//
//
//        }
//        if (input.split("\\+").length==2){
//            String num[]= input.split("\\+");
//            double add=Double.parseDouble(num[0])+Double.parseDouble(num[1]);
//            input=add+"";
//
//
//        }
//        if (input.split("-").length==2){
//            String num[]= input.split("-");
//            double sub=Double.parseDouble(num[0])-Double.parseDouble(num[1]);
//            input=sub+"";
//        }
//        String n []= input.split("\\.");
//        if (n.length>1){
//            if (n[1].equals("0")){
//                input=n[0];
//            }
//        }
//        screen.setText(input);
//
//    }
//

    }

    public void ButtonClick(View view) {
        if (newOperation)
            screen.setText("");
        newOperation=false;

        String numbers = screen.getText().toString();
        switch (view.getId()) {
            case R.id.zero:
                numbers += "0";
                break;
            case R.id.one:
                numbers += "1";
                break;
            case R.id.two:
                numbers += "2";
                break;
            case R.id.three:
                numbers += "3";
                break;
            case R.id.four:
                numbers += "4";
                break;
            case R.id.five:
                numbers += "5";
                break;
            case R.id.six:
                numbers += "6";
                break;
            case R.id.seven:
                numbers += "7";
                break;
            case R.id.eight:
                numbers += "8";
                break;
            case R.id.nine:
                numbers += "9";
                break;
            case R.id.plusMinus:
                numbers = "-" + numbers;
                break;


        }
        screen.setText(numbers);

    }

    public void operations(View view) {

        newOperation=true;
        oldNumber=screen.getText().toString();

switch (view.getId()){
    case R.id.plus: operation="+"; break;
    case R.id.minus: operation="-"; break;
    case R.id.division: operation="/"; break;
    case R.id.multiplication: operation="*"; break;
}screen.setText(operation);

    }
    public void equal(View view) {
        String newNumber=screen.getText().toString();
        BigDecimal a= new BigDecimal(oldNumber);
        BigDecimal b= new BigDecimal(newNumber);
        BigDecimal result= new BigDecimal("0");
//        double result= 0.0;
        switch (operation){
            case"+":
                result=a.add(b);
//                result= Double.parseDouble(oldNumber)+Double.parseDouble(newNumber);
                break;
            case"-":
                result=a.subtract(b);
//                result= Double.parseDouble(oldNumber)-Double.parseDouble(newNumber);
                break;
            case"/":
                result=a.divide(b);
//                result= Double.parseDouble(oldNumber)/Double.parseDouble(newNumber);
                break;
            case"*":
                result=a.multiply(b);
//                result= Double.parseDouble(oldNumber)*Double.parseDouble(newNumber);
                break;
        }
        screen.setText( result+"");



    }


    public void clear(View view) {

        screen.setText("0");
        newOperation=true;
    }


    public void percent(View view) {
        double d= Double.parseDouble(screen.getText().toString())/100;
        screen.setText(d + "");
        newOperation= true;

    }

}








































