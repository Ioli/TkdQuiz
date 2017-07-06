/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.tkdquiz;
 */
package com.example.android.tkdquiz;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.text.Editable;
        import android.util.Log;
        import android.view.View;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.text.NumberFormat;

/**
 * This app displays a quiz to love the sport of Taekwondo
 */
public class MainActivity extends AppCompatActivity {

    int correct = 5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the confirm button is clicked.
     */
    public void confirm(View view) {
        //get the answer of the first question
        EditText editAnswer = (EditText) findViewById(R.id.edit_answer) ;
        String isWrittenAnswer = editAnswer.getText().toString() ;
        //get the preference for second question
        CheckBox a21 = (CheckBox) findViewById(R.id.a21) ;
        Boolean hasAnswered21 = a21.isChecked() ;

        CheckBox a22 = (CheckBox) findViewById(R.id.a22) ;
        Boolean hasAnswered22 = a22.isChecked() ;

        CheckBox a23 = (CheckBox) findViewById(R.id.a23) ;
        Boolean hasAnswered23 = a23.isChecked() ;

        CheckBox a24 = (CheckBox) findViewById(R.id.a24) ;
        Boolean hasAnswered24 = a24.isChecked() ;

        CheckBox a25 = (CheckBox) findViewById(R.id.a25) ;
        Boolean hasAnswered25 = a25.isChecked() ;

        CheckBox a26 = (CheckBox) findViewById(R.id.a26) ;
        Boolean hasAnswered26 = a26.isChecked() ;

        CheckBox a27 = (CheckBox) findViewById(R.id.a27) ;
        Boolean hasAnswered27 = a27.isChecked() ;

        //get the preference for third question
        RadioButton a31 = (RadioButton) findViewById(R.id.a31);
        Boolean hasAnswered31 = a31.isChecked() ;

        RadioButton a32 = (RadioButton) findViewById(R.id.a32);
        Boolean hasAnswered32 = a32.isChecked() ;

        RadioButton a33 = (RadioButton) findViewById(R.id.a33);
        Boolean hasAnswered33 = a33.isChecked() ;

        RadioButton a34 = (RadioButton) findViewById(R.id.a34);
        Boolean hasAnswered34 = a34.isChecked() ;

        RadioButton a35 = (RadioButton) findViewById(R.id.a35);
        Boolean hasAnswered35 = a35.isChecked() ;

        //get the preference for fourth question
        RadioButton a41 = (RadioButton) findViewById(R.id.a41);
        Boolean hasAnswered41 = a41.isChecked() ;

        RadioButton a42 = (RadioButton) findViewById(R.id.a42);
        Boolean hasAnswered42 = a42.isChecked() ;

        RadioButton a43 = (RadioButton) findViewById(R.id.a43);
        Boolean hasAnswered43 = a43.isChecked() ;



        //get the preference for fifth question
        CheckBox a51 = (CheckBox) findViewById(R.id.a51) ;
        Boolean hasAnswered51 = a51.isChecked() ;

        CheckBox a52 = (CheckBox) findViewById(R.id.a52) ;
        Boolean hasAnswered52 = a52.isChecked() ;

        CheckBox a53 = (CheckBox) findViewById(R.id.a53) ;
        Boolean hasAnswered53 = a53.isChecked() ;

        CheckBox a54 = (CheckBox) findViewById(R.id.a54) ;
        Boolean hasAnswered54 = a54.isChecked() ;

        CheckBox a55 = (CheckBox) findViewById(R.id.a55) ;
        Boolean hasAnswered55 = a55.isChecked() ;

        //check the wrong answers
        checkFirstAnswer(isWrittenAnswer);
        checkSecondAnswer(hasAnswered21, hasAnswered22, hasAnswered23, hasAnswered24, hasAnswered25, hasAnswered26, hasAnswered27);
        checkThirdAnswer( hasAnswered32);
        checkFourthAnswer( hasAnswered42);
        checkFifthAnswer(hasAnswered51, hasAnswered52, hasAnswered53, hasAnswered54, hasAnswered55);
        //display a Toast message
        displayToast(correct);


    }


    /**
     * Check the first answer
     *@param firstA11  the text of the first question
     *
     */
    private int checkFirstAnswer(String firstA11) {

        if((firstA11.equalsIgnoreCase("Y"))||(firstA11.equalsIgnoreCase("Ν"))){
            return correct;
        }

        return correct -= 1 ;
    }

    /**
     * Check the second answer
     *@param a21  the situation of the first answer
     *@param a22  the situation of the second answer
     *@param a23  the situation of the third answer
     *@param a24  the situation of the fourth answer
     *@param a25  the situation of the fifth answer
     *@param a26  the situation of the sixth answer
     *@param a27  the situation of the seventh answer
     */
    private int checkSecondAnswer(boolean a21, boolean a22, boolean a23, boolean a24, boolean a25, boolean a26, boolean a27) {
        if (((a23 == true) || (a26 == true)) || ((a21 == false) || (a22 == false) || (a24 == false) || (a25 == false) || (a27 == false))){
            return correct -= 1;
        }
        return correct;
    }
    /**
     * Check the third answer
     *@param a32  the situation of the second answer
     *
     */
    private int checkThirdAnswer( boolean a32) {
        if (a32 != true){
            return correct -= 1;
        }
        return correct;
    }
    /**
     * Check the fourth answer
     *@param a42  the situation of the second answer
     *
     */
    private int checkFourthAnswer( boolean a42) {
        if (a42 != true){
            return correct -= 1;
        }else
        {return correct;}
    }
    /**
     * Check the second answer
     *@param a51  the situation of the first answer
     *@param a52  the situation of the second answer
     *@param a53  the situation of the third answer
     *@param a54  the situation of the fourth answer
     *@param a55  the situation of the fifth answer
     *
     */
    private int checkFifthAnswer(boolean a51, boolean a52, boolean a53, boolean a54, boolean a55) {
        if (((a52 == true) || (a54 == true)) || ((a51 == false) || (a53 == false) || (a55 == false))){
            return correct -= 1;
        }
        return correct;
    }
/**
 * Display the toast message
 *@param correct  to check the correction of all answers
 */
    private void displayToast(int correct){
        if (correct == 5){
            Toast toast = Toast.makeText(getApplicationContext(), R.string.bravo, Toast.LENGTH_SHORT);
            toast.show();
        }if(correct < 5){
            Toast toast0 = Toast.makeText(getApplicationContext(), "Your points:" + correct, Toast.LENGTH_LONG);
            toast0.show();
            Toast toast = Toast.makeText(getApplicationContext(), R.string.message, Toast.LENGTH_LONG);
            toast.show();
            Toast toast1 = Toast.makeText(getApplicationContext(), R.string.message1, Toast.LENGTH_LONG);
            toast1.show();
            Toast toast2 = Toast.makeText(getApplicationContext(), R.string.message2, Toast.LENGTH_LONG);
            toast2.show();
            Toast toast3 = Toast.makeText(getApplicationContext(), R.string.message3, Toast.LENGTH_LONG);
            toast3.show();
            Toast toast4 = Toast.makeText(getApplicationContext(), R.string.message4, Toast.LENGTH_LONG);
            toast4.show();
            Toast toast5 = Toast.makeText(getApplicationContext(), R.string.message5, Toast.LENGTH_LONG /*Tick duration*/);
            toast5.show();

        }
    }}
