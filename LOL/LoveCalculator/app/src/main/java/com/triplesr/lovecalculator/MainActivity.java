package com.triplesr.lovecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText, editText2;
    Button button;
    TextView textView, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edittext);
        editText2 = (EditText) findViewById(R.id.edittext2);
        button = (Button) findViewById(R.id.btn);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String boy = editText.getText().toString();
                String girl = editText2.getText().toString();

                if(boy.toString().equals("") && girl.toString().equals("")){
                    textView2.setText("এরোই তুই হোলা মাইয়ার নাম না দিয়া গুতাস কেন? গুতাইতে ভাল্লাগে ?");
                    textView.setText("");
                }
                else if(boy.toString().equals("")){
                    textView2.setText("তুই হোলার নাম না দিয়া গুতা দিলি কেন? ");
                    textView.setText("");
                }
                else if (girl.toString().equals("")){

                    textView2.setText("তুই মাইয়ার নাম না দিয়া গুতা দিলি কেন?  ");
                    textView.setText("");
                }
                else {
                    display();
                }

            }
        });

    }

    public void display(){

        int number1 = 0, number2 = 0;

        String boy = editText.getText().toString();
        String girl = editText2.getText().toString();

        for (int ii = 0; ii < boy.length(); ii++) {

            switch (boy.charAt(ii)) {

                case 'a':
                case 'A':
                    number1 = number1 + 1;
                    break;
                case 'b':
                case 'B':
                    number1 = number1 + 2;
                    break;
                case 'c':
                case 'C':
                    number1 = number1 + 3;
                    break;
                case 'd':
                case 'D':
                    number1 = number1 + 4;
                    break;
                case 'e':
                case 'E':
                    number1 = number1 + 5;
                    break;
                case 'f':
                case 'F':
                    number1 = number1 + 6;
                    break;
                case 'g':
                case 'G':
                    number1 = number1 + 7;
                    break;
                case 'h':
                case 'H':
                    number1 = number1 + 8;
                    break;
                case 'i':
                case 'I':
                    number1 = number1 + 9;
                    break;
                case 'j':
                case 'J':
                    number1 = number1 + 10;
                    break;
                case 'k':
                case 'K':
                    number1 = number1 + 11;
                    break;
                case 'l':
                case 'L':
                    number1 = number1 + 12;
                    break;
                case 'm':
                case 'M':
                    number1 = number1 + 13;
                    break;
                case 'n':
                case 'N':
                    number1 = number1 + 14;
                    break;
                case 'o':
                case 'O':
                    number1 = number1 + 15;
                    break;
                case 'p':
                case 'P':
                    number1 = number1 + 16;
                    break;
                case 'q':
                case 'Q':
                    number1 = number1 + 17;
                    break;
                case 'r':
                case 'R':
                    number1 = number1 + 18;
                    break;
                case 's':
                case 'S':
                    number1 = number1 + 19;
                    break;
                case 't':
                case 'T':
                    number1 = number1 + 20;
                    break;
                case 'u':
                case 'U':
                    number1 = number1 + 21;
                    break;
                case 'v':
                case 'V':
                    number1 = number1 + 22;
                    break;
                case 'w':
                case 'W':
                    number1 = number1 + 23;
                    break;
                case 'x':
                case 'X':
                    number1 = number1 + 24;
                    break;
                case 'y':
                case 'Y':
                    number1 = number1 + 25;
                    break;
                case 'z':
                case 'Z':
                    number1 = number1 + 26;
                    break;
            }
        }

        for (int ii = 0; ii < girl.length(); ii++) {

            switch (girl.charAt(ii)) {

                case 'a':
                case 'A':
                    number2 = number2 + 1;
                    break;
                case 'b':
                case 'B':
                    number2 = number2 + 2;
                    break;
                case 'c':
                case 'C':
                    number2 = number2 + 3;
                    break;
                case 'd':
                case 'D':
                    number2 = number2 + 4;
                    break;
                case 'e':
                case 'E':
                    number2 = number2 + 5;
                    break;
                case 'f':
                case 'F':
                    number2 = number2 + 6;
                    break;
                case 'g':
                case 'G':
                    number2 = number2 + 7;
                    break;
                case 'h':
                case 'H':
                    number2 = number2 + 8;
                    break;
                case 'i':
                case 'I':
                    number2 = number2 + 9;
                    break;
                case 'j':
                case 'J':
                    number2 = number2 + 10;
                    break;
                case 'k':
                case 'K':
                    number2 = number2 + 11;
                    break;
                case 'l':
                case 'L':
                    number2 = number2 + 12;
                    break;
                case 'm':
                case 'M':
                    number2 = number2 + 13;
                    break;
                case 'n':
                case 'N':
                    number2 = number2 + 14;
                    break;
                case 'o':
                case 'O':
                    number2 = number2 + 15;
                    break;
                case 'p':
                case 'P':
                    number2 = number2 + 16;
                    break;
                case 'q':
                case 'Q':
                    number2 = number2 + 17;
                    break;
                case 'r':
                case 'R':
                    number2 = number2 + 18;
                    break;
                case 's':
                case 'S':
                    number2 = number2 + 19;
                    break;
                case 't':
                case 'T':
                    number2 = number2 + 20;
                    break;
                case 'u':
                case 'U':
                    number2 = number2 + 21;
                    break;
                case 'v':
                case 'V':
                    number2 = number2 + 22;
                    break;
                case 'w':
                case 'W':
                    number2 = number2 + 23;
                    break;
                case 'x':
                case 'X':
                    number2 = number2 + 24;
                    break;
                case 'y':
                case 'Y':
                    number2 = number2 + 25;
                    break;
                case 'z':
                case 'Z':
                    number2 = number2 + 26;
                    break;
            }
        }

        int temp, temp2, sum = 0, sum2 = 0;

        while (true) {
            temp = number1 % 10;
            sum = sum + temp;
            number1 = number1 / 10;
            if (number1 < 10) {
                sum = sum + number1;
                if (sum > 10) {
                    number1 = sum;
                    sum = 0;
                } else {
                    break;
                }
            }
        }

        while (true) {
            temp2 = number2 % 10;
            sum2 = sum2 + temp2;
            number2 = number2 / 10;
            if (number2 < 10) {
                sum2 = sum2 + number2;
                if (sum2 > 10) {
                    number2 = sum2;
                    sum2 = 0;
                } else {
                    break;
                }

            }
        }

        double love;
        double lol = (double) sum;
        double lol2 = (double) sum2;

        if (lol2 < lol) {
            love = ( lol2 / lol ) * 100.0;
        } else {
            love = (lol / lol2) * 100.0;
        }
        textView.setText(Math.round(love*100)/100.0+" %");

        if(love < 20){
            textView2.setText("তোগো কোয়ালে হিছা মার ! তোগোরে দি পিরিত অইতনো -_-");
        }
        else if(love <35){
            textView2.setText("হানিত্তে ডুবি মরি যা। নইলে কচু গাছের লগে হাশি দি মরি যা");
        }
        else if(love <50){
            textView2.setText("বিষ খাইয়া মইরা যা। হাফ সেঞ্চুরিও মারত্তে হারসনো তোরা");
        }
        else if(love <60){
            textView2.setText("হাফ সেঞ্চুরি মারি দিছ মামা। অন সেঞ্চুরি মাইত্তে হইব ");
        }
        else if(love <75){
            textView2.setText("বালা বালা সামনে আগাই যা। না আগাইতে হাইল্লে ভালবাসার Boost খাইস। কলিকাতা হারবালে পাওয়া যায় :D");
        }
        else if(love <85){
            textView2.setText("ও মারে মা। হেতে আর হিতি দেখি ইকবাল-সোহা রে হারাই দিছে");
        }
        else if(love <99){
            textView2.setText("অনের পিরিতি কইচ্ছস অন তোরা বিয়া কইরা হালা, সংসার কর :)");
        }
        else if (love == 100){
            textView2.setText("সেঞ্চুরি মাইরা দিছ অন ছেকা খাইয়া তাজমহল বানাই অমর হইয়া থাক :D");
        }


    }
}